package com.ratemarkt.models;

import java.util.List;

import org.immutables.gson.Gson;
import org.immutables.value.Value;

@Gson.TypeAdapters
@Value.Immutable
public interface CheckHotelsResult extends Result<CheckHotelsQuery> {

	List<Hotel> getHotels();

	default int getTotal() {
		if (getHotels() != null) {
			return getHotels().size();
		}
		return 0;
	}

}
