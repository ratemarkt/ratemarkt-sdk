package com.ratemarkt.models;

import org.immutables.gson.Gson;
import org.immutables.value.Value;

@Gson.TypeAdapters
@Value.Immutable
public interface CreditCard {

	String getCvv();

	Integer getMonth();

	Integer getYear();

	String getFirstName();

	String getLastName();

	String getNumber();
}
