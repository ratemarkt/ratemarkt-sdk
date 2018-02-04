package com.ratemarkt;

import java.util.Hashtable;
import java.util.Map;

import com.ratemarkt.errors.NotAvailableError;
import com.ratemarkt.models.CheckBookingsQuery;
import com.ratemarkt.models.CheckBookingsResult;
import com.ratemarkt.models.CheckHotelQuery;
import com.ratemarkt.models.CheckHotelResult;
import com.ratemarkt.models.CheckHotelsQuery;
import com.ratemarkt.models.CheckHotelsResult;
import com.ratemarkt.models.Hotel;
import com.ratemarkt.models.ImmutableCheckHotelResult;
import com.ratemarkt.models.ImmutableCheckHotelsQuery;
import com.ratemarkt.models.Pax;

public abstract class AbstractSupplierConnector<T> extends ConfigurableConnector<T> {

	public enum QuerySupport {
		DESTINATION_CODE, MULTI_HOTEL_CODE, BOTH, HYBRID
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

	public int getMaxRoomLimit() {
		return 5;
	}

	public int getMaxHotelQueryLimit() {
		return 200;
	}

	public QuerySupport getQuerySupport() {
		return QuerySupport.MULTI_HOTEL_CODE;
	}

	public MultiRoomSupport getMultiRoomSupport() {
		return MultiRoomSupport.NONE;
	}

	protected Pax getMostInclusivePax(CheckHotelsQuery query) {
		// We here justify and align the paxes to the most inclusive one
		Map<Integer, Pax> scoreToPax = new Hashtable<Integer, Pax>();
		Integer bestScore = 0;
		for (int i = 0; i < query.getPaxes().size(); i++) {

			Pax pax = query.getPaxes().get(i);
			Integer score = (pax.getNumberOfAdults() * 30)
					+ (pax.getChildrenAges().size() * pax.getChildrenAges().stream().max(Integer::max).orElse(0));
			if (!scoreToPax.containsKey(score)) {
				scoreToPax.put(score, pax);
			}
			if (score > bestScore) {
				bestScore = score;
			}
		}
		Pax bestPax = scoreToPax.get(bestScore);
		return bestPax;
	}

	@Override
	public CheckBookingsResult checkBookings(ConnectorContext context, CheckBookingsQuery query) {
		throw new UnsupportedOperationException();
	}
}
