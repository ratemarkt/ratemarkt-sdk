package com.ratemarkt.connectors.ratemarkt;

import java.io.IOException;
import java.util.ServiceLoader;

import com.fatboyindustrial.gsonjavatime.Converters;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.bind.TypeAdapters;
import com.ratemarkt.ConfigurableConnector;
import com.ratemarkt.ConnectorContext;
import com.ratemarkt.errors.CommunicationError;
import com.ratemarkt.errors.RemoteError;
import com.ratemarkt.models.BookRateQuery;
import com.ratemarkt.models.BookRateResult;
import com.ratemarkt.models.CancelBookingQuery;
import com.ratemarkt.models.CancelBookingResult;
import com.ratemarkt.models.CheckBookingQuery;
import com.ratemarkt.models.CheckBookingResult;
import com.ratemarkt.models.CheckHotelQuery;
import com.ratemarkt.models.CheckHotelResult;
import com.ratemarkt.models.CheckHotelsQuery;
import com.ratemarkt.models.CheckHotelsResult;
import com.ratemarkt.models.CheckRateQuery;
import com.ratemarkt.models.CheckRateResult;
import com.ratemarkt.models.ErrorObj;
import com.ratemarkt.models.ImmutableBookRateResult;
import com.ratemarkt.models.ImmutableCancelBookingResult;
import com.ratemarkt.models.ImmutableCheckBookingResult;
import com.ratemarkt.models.ImmutableCheckHotelResult;
import com.ratemarkt.models.ImmutableCheckHotelsResult;
import com.ratemarkt.models.ImmutableCheckRateResult;
import com.ratemarkt.models.ImmutableErrorObj;
import com.ratemarkt.models.Query;

import io.gsonfire.GsonFireBuilder;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class RatemarktConnector extends ConfigurableConnector<RatemarktConfig> {

	private final static String CHECK_HOTELS_ENDPOINT = "checkhotels";
	private final static String CHECK_HOTEL_ENDPOINT = "checkhotel";
	private final static String CHECK_RATE_ENDPOINT = "checkrate";
	private final static String BOOK_RATE_ENDPOINT = "bookrate";
	private final static String CHECK_BOOKING_ENDPOINT = "checkbooking";
	private final static String CANCEL_BOOKING_ENDPOINT = "cancelbooking";

	private OkHttpClient client;
	private HttpUrl.Builder baseUrlBuilder;
	private Gson gson;

	public RatemarktConnector(RatemarktConfig config) {
		super(config);
		client = new OkHttpClient.Builder().addInterceptor(new Interceptor() {
			@Override
			public Response intercept(Chain chain) throws IOException {
				Request.Builder requestBuilder = chain.request().newBuilder();
				requestBuilder.addHeader("Authorization", String.format("Bearer %s", config.getApiKey()));
				return chain.proceed(requestBuilder.build());
			}

		}).build();

		baseUrlBuilder = HttpUrl.parse(config.getBaseUrl()).newBuilder();
		gson = populateGsonBuilder().create();
	}

	private GsonBuilder populateGsonBuilder() {
		GsonBuilder gsonBuilder = new GsonFireBuilder().enableExposeMethodResult().createGsonBuilder();
		Converters.registerLocalDate(gsonBuilder);
		Converters.registerOffsetDateTime(gsonBuilder);
		gsonBuilder.registerTypeAdapterFactory(TypeAdapters.CURRENCY_FACTORY);
		gsonBuilder.setPrettyPrinting();
		gsonBuilder.serializeNulls();

		for (TypeAdapterFactory factory : ServiceLoader.load(TypeAdapterFactory.class)) {
			gsonBuilder.registerTypeAdapterFactory(factory);
		}
		return gsonBuilder;
	}

	private Request.Builder populateBaseRequest(String path) {
		return new Request.Builder().url(baseUrlBuilder.addPathSegment(path).build());
	}

	private <T> T callEndPoint(ConnectorContext context, Query query, String endpoint, Class<T> returnType) {
		String json = gson.toJson(query);
		System.out.println(json);
		RequestBody body = RequestBody.create(MediaType.parse("application/json"), json);

		Request.Builder requestBuilder = populateBaseRequest(CHECK_HOTELS_ENDPOINT).post(body);

		Response response = null;
		try {
			response = client.newCall(requestBuilder.build()).execute();
		} catch (IOException e) {
			throw new CommunicationError("Could not contact with server", e);
		}

		if (response.code() >= 200 && response.code() < 300) {
			return gson.fromJson(response.body().charStream(), returnType);
		} else {
			ErrorObj errorObj = gson.fromJson(response.body().charStream(), ImmutableErrorObj.class);
			throw new RemoteError(response.code(), errorObj);
		}
	}

	@Override
	public CheckHotelsResult checkHotels(ConnectorContext context, CheckHotelsQuery query) {
		return callEndPoint(context, query, CHECK_HOTELS_ENDPOINT, ImmutableCheckHotelsResult.class);
	}

	@Override
	public CheckHotelResult checkHotel(ConnectorContext context, CheckHotelQuery query) {
		return callEndPoint(context, query, CHECK_HOTEL_ENDPOINT, ImmutableCheckHotelResult.class);
	}

	@Override
	public CheckRateResult checkRate(ConnectorContext context, CheckRateQuery query) {
		return callEndPoint(context, query, CHECK_RATE_ENDPOINT, ImmutableCheckRateResult.class);
	}

	@Override
	public BookRateResult bookRate(ConnectorContext context, BookRateQuery query) {
		return callEndPoint(context, query, BOOK_RATE_ENDPOINT, ImmutableBookRateResult.class);
	}

	@Override
	public CheckBookingResult checkBooking(ConnectorContext context, CheckBookingQuery query) {
		return callEndPoint(context, query, CHECK_BOOKING_ENDPOINT, ImmutableCheckBookingResult.class);
	}

	@Override
	public CancelBookingResult cancelBooking(ConnectorContext context, CancelBookingQuery query) {
		return callEndPoint(context, query, CANCEL_BOOKING_ENDPOINT, ImmutableCancelBookingResult.class);
	}

}
