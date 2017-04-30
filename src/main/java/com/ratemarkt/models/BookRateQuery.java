package com.ratemarkt.models;

import java.util.List;

import javax.annotation.Nullable;

import org.immutables.gson.Gson;
import org.immutables.value.Value;

@Gson.TypeAdapters
@Value.Immutable
public interface BookRateQuery extends Query {

	String getRateKey();

	String getClientRef();

	Holder getHolder();

	List<Occupancy> getOccupancy();

	@Nullable
	CreditCard getCreditCard();

	@Nullable
	String getSpecialRequest();
}
