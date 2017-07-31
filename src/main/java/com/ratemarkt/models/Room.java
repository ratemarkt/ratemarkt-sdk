package com.ratemarkt.models;

import java.util.List;

import javax.annotation.Nullable;

import org.immutables.gson.Gson;
import org.immutables.value.Value;

@Gson.TypeAdapters
@Value.Immutable
public interface Room {

	@Nullable
	Integer getNumberOfAdults();

	@Nullable
	List<Integer> getChildrenAges();

	@Nullable
	String getRoomDescription();

	@Value.Default
	default Integer getSequence() {
		return 1;
	}
}
