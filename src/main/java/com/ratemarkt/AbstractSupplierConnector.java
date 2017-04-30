package com.ratemarkt;

import com.ratemarkt.errors.NotAvailableError;
import com.ratemarkt.models.CheckHotelQuery;
import com.ratemarkt.models.CheckHotelResult;
import com.ratemarkt.models.CheckHotelsQuery;
import com.ratemarkt.models.CheckHotelsResult;
import com.ratemarkt.models.Hotel;
import com.ratemarkt.models.ImmutableCheckHotelResult;
import com.ratemarkt.models.ImmutableCheckHotelsQuery;

public abstract class AbstractSupplierConnector<T> extends ConfigurableConnector<T> {

	public enum QuerySupport {
		DESTINATION_CODE, MULTI_HOTEL_CODE, BOTH
	}

	public enum MultiRoomSupport {
		NONE, SEPARATE, SEMI_BUNDLED, BUNDLED
	}

	public AbstractSupplierConnector(T config) {
		super(config);
	}

	@Override
	public CheckHotelResult checkHotel(ConnectorContext context, CheckHotelQuery query) {

		CheckHotelsQuery checkHotelsQuery = ImmutableCheckHotelsQuery.builder().addHotelCodes(query.getHotelCode())
				.checkin(query.getCheckin()).checkout(query.getCheckout()).currency(query.getCurrency())
				.isDebug(query.isDebug()).nationality(query.getNationality()).paxes(query.getPaxes()).build();

		CheckHotelsResult checkHotelsResult = checkHotels(context, checkHotelsQuery);

		if (checkHotelsResult.getHotels().size() > 0) {
			Hotel hotel = checkHotelsResult.getHotels().get(0);
			return ImmutableCheckHotelResult.builder().hotel(hotel).query(query)
					.debugData(checkHotelsResult.getDebugData()).build();
		}

		throw new NotAvailableError();
	}

	public int getMaxHotelQueryLimit() {
		return 1000;
	}

	public QuerySupport getQuerySupport() {
		return QuerySupport.MULTI_HOTEL_CODE;
	}

	public MultiRoomSupport getMultiRoomSupport() {
		return MultiRoomSupport.NONE;
	}
}
