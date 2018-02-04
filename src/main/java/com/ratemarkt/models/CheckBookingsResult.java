package com.ratemarkt.models;

import java.util.List;

import org.immutables.gson.Gson;
import org.immutables.value.Value;

@Gson.TypeAdapters
@Value.Immutable
public interface CheckBookingsResult extends Result<CheckBookingsQuery> {

	List<Booking> getBookings();
}
