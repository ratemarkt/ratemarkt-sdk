package com.ratemarkt;

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

public interface Plugin extends Connector {

	@Override
	default BookRateResult bookRate(ConnectorContext context, BookRateQuery query) {
		return getTarget().bookRate(context, query);
	}

	@Override
	default CancelBookingResult cancelBooking(ConnectorContext context, CancelBookingQuery query) {
		return getTarget().cancelBooking(context, query);
	}

	@Override
	default CheckHotelsResult checkHotels(ConnectorContext context, CheckHotelsQuery query) {
		return getTarget().checkHotels(context, query);
	}

	@Override
	default CheckBookingResult checkBooking(ConnectorContext context, CheckBookingQuery query) {
		return getTarget().checkBooking(context, query);
	}

	@Override
	default CheckHotelResult checkHotel(ConnectorContext context, CheckHotelQuery checkHotelQuery) {
		return getTarget().checkHotel(context, checkHotelQuery);
	}

	@Override
	default CheckRateResult checkRate(ConnectorContext context, CheckRateQuery checkRateQuery) {
		return getTarget().checkRate(context, checkRateQuery);
	}

	Connector getTarget();

	void setTarget(Connector target);
}
