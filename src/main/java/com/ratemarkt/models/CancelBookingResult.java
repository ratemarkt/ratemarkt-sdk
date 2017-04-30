package com.ratemarkt.models;

import org.immutables.gson.Gson;
import org.immutables.value.Value;

@Gson.TypeAdapters
@Value.Immutable
public interface CancelBookingResult extends Result<CancelBookingQuery> {

	Booking getBooking();
}
