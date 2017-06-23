package com.ratemarkt.models;

import javax.annotation.Nullable;

import org.immutables.gson.Gson;
import org.immutables.value.Value;

@Gson.TypeAdapters
@Value.Immutable
public interface CreditCard {

	@Nullable
	String getCvv();

	@Nullable
	String getMonth();

	@Nullable
	String getYear();

	@Nullable
	String getFirstName();

	@Nullable
	String getLastName();

	String getNumber();
}
