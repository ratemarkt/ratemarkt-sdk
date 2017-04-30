package com.ratemarkt.models;

import javax.annotation.Nullable;

import org.immutables.gson.Gson;
import org.immutables.value.Value;

@Gson.TypeAdapters
@Value.Immutable
public interface Occupant {

	OccupantType getOccupantType();

	@Nullable
	Integer getAge();

	@Nullable
	String getFirstName();

	@Nullable
	String getLastName();

}
