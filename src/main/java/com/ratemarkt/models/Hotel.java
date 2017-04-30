package com.ratemarkt.models;

import java.util.List;

import javax.annotation.Nullable;

import org.immutables.gson.Gson;
import org.immutables.value.Value;

@Gson.TypeAdapters
@Value.Immutable
public interface Hotel {

	String getHotelCode();

	@Nullable
	String getDestinationCode();

	List<Rate> getRates();
}
