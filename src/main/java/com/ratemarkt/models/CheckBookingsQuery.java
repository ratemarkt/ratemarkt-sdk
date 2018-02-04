package com.ratemarkt.models;

import java.time.LocalDate;

import javax.annotation.Nullable;

import org.immutables.gson.Gson;
import org.immutables.value.Value;

@Gson.TypeAdapters
@Value.Immutable
public interface CheckBookingsQuery extends Query {

	LocalDate getFromDate();

	LocalDate getToDate();

	@Nullable
	BookingStatus getStatus();
}
