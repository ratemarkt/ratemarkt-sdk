package com.ratemarkt.models;

import javax.annotation.Nullable;

import org.immutables.gson.Gson;
import org.immutables.value.Value;

@Gson.TypeAdapters
@Value.Immutable
public interface Room {

	@Nullable
	Integer getNumberOfAdults();

	@Nullable
	Integer getNumberOfChildren();

	@Nullable
	String getRoomDescription();

	@Value.Default
	default Integer getSequence() {
		return 1;
	}
}
