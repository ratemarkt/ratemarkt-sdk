package com.ratemarkt.models;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.List;

import javax.annotation.Nullable;

import org.immutables.gson.Gson;
import org.immutables.value.Value;

@Gson.TypeAdapters
@Value.Immutable
public interface Rate {

	String getHotelCode();

	RateType getRateType();

	String getRateKey();

	Boolean getNonrefundable();

	String getBoardType();

	String getBoardName();

	BigDecimal getRate();

	Currency getCurrency();

	List<Room> getRooms();

	List<CancellationPolicy> getCancellationPolicies();

	PaymentType getPaymentType();

	@Nullable
	String getRemarks();

	@Nullable
	BigDecimal getCommission();

	@Nullable
	Currency getHotelCurrency();

	@Nullable
	BigDecimal getHotelRate();

	@Nullable
	@Gson.Ignore
	Rate getSource();

}
