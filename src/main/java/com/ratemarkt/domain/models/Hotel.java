package com.ratemarkt.domain.models;

import java.util.List;

import org.immutables.gson.Gson;
import org.immutables.value.Value;

@Gson.TypeAdapters
@Value.Immutable
public interface Hotel {

	String getHotelCode();

	List<Rate> getRates();
}
