package com.ratemarkt.models;

import org.immutables.gson.Gson;
import org.immutables.value.Value;

@Gson.TypeAdapters
@Value.Immutable
public interface CreditCard {

	String getCvv();

	String getMonth();

	String getYear();

	String getFirstName();

	String getLastName();

	String getNumber();
}
