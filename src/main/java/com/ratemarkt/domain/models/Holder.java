package com.ratemarkt.domain.models;

import javax.annotation.Nullable;

import org.immutables.gson.Gson;
import org.immutables.value.Value;

@Gson.TypeAdapters
@Value.Immutable
public interface Holder {

	String getFirstName();

	String getLastName();

	@Nullable
	String getEmail();

	@Nullable
	String getPhone();
}
