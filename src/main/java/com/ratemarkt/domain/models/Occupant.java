package com.ratemarkt.domain.models;

import javax.annotation.Nullable;

import org.immutables.gson.Gson;
import org.immutables.value.Value;

@Gson.TypeAdapters
@Value.Immutable
public interface Occupant {

	@Nullable
	Integer getAge();

	@Nullable
	String getFirstName();

	@Nullable
	String getLastName();

	OccupantType getOccupantType();

}
