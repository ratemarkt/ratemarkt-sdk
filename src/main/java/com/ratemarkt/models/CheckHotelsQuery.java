package com.ratemarkt.models;

import java.util.List;

import javax.annotation.Nullable;

import org.immutables.gson.Gson;
import org.immutables.value.Value;

@Gson.TypeAdapters
@Value.Immutable
public interface CheckHotelsQuery extends AvailabilityQuery {

	@Nullable
	String getDestinationCode();

	@Nullable
	List<String> getHotelCodes();
}
