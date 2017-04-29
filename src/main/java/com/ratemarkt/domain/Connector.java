package com.ratemarkt.domain;

import com.ratemarkt.domain.models.BookRateQuery;
import com.ratemarkt.domain.models.BookRateResult;
import com.ratemarkt.domain.models.CancelBookingQuery;
import com.ratemarkt.domain.models.CancelBookingResult;
import com.ratemarkt.domain.models.CheckBookingQuery;
import com.ratemarkt.domain.models.CheckBookingResult;
import com.ratemarkt.domain.models.CheckHotelQuery;
import com.ratemarkt.domain.models.CheckHotelResult;
import com.ratemarkt.domain.models.CheckHotelsQuery;
import com.ratemarkt.domain.models.CheckHotelsResult;
import com.ratemarkt.domain.models.CheckRateQuery;
import com.ratemarkt.domain.models.CheckRateResult;

public interface Connector {

	CheckHotelsResult checkHotels(ConnectorContext context, CheckHotelsQuery query);

	CheckHotelResult checkHotel(ConnectorContext context, CheckHotelQuery query);

	CheckRateResult checkRate(ConnectorContext context, CheckRateQuery query);

	BookRateResult bookRate(ConnectorContext context, BookRateQuery query);

	CheckBookingResult checkBooking(ConnectorContext context, CheckBookingQuery query);

	CancelBookingResult cancelBooking(ConnectorContext context, CancelBookingQuery query);

}