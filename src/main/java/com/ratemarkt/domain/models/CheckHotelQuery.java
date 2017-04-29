package com.ratemarkt.domain.models;

import org.immutables.gson.Gson;
import org.immutables.value.Value;

@Gson.TypeAdapters
@Value.Immutable
public interface CheckHotelQuery extends AvailabilityQuery {

	String getHotelCode();
}
