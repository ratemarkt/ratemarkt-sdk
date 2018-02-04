package com.ratemarkt;

import com.ratemarkt.models.BookRateQuery;
import com.ratemarkt.models.BookRateResult;
import com.ratemarkt.models.CancelBookingQuery;
import com.ratemarkt.models.CancelBookingResult;
import com.ratemarkt.models.CheckBookingQuery;
import com.ratemarkt.models.CheckBookingResult;
import com.ratemarkt.models.CheckBookingsQuery;
import com.ratemarkt.models.CheckBookingsResult;
import com.ratemarkt.models.CheckHotelQuery;
import com.ratemarkt.models.CheckHotelResult;
import com.ratemarkt.models.CheckHotelsQuery;
import com.ratemarkt.models.CheckHotelsResult;
import com.ratemarkt.models.CheckRateQuery;
import com.ratemarkt.models.CheckRateResult;

public interface Connector {

	CheckHotelsResult checkHotels(ConnectorContext context, CheckHotelsQuery query);

	CheckHotelResult checkHotel(ConnectorContext context, CheckHotelQuery query);

	CheckRateResult checkRate(ConnectorContext context, CheckRateQuery query);

	BookRateResult bookRate(ConnectorContext context, BookRateQuery query);

	CheckBookingResult checkBooking(ConnectorContext context, CheckBookingQuery query);

	CheckBookingsResult checkBookings(ConnectorContext context, CheckBookingsQuery query);

	CancelBookingResult cancelBooking(ConnectorContext context, CancelBookingQuery query);

}