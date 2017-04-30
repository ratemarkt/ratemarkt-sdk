package com.ratemarkt.models;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Currency;
import java.util.List;

import javax.annotation.Nullable;

import org.immutables.gson.Gson;
import org.immutables.value.Value;

@Gson.TypeAdapters
@Value.Immutable
public interface Booking {

	BigDecimal getBalance();

	String getBookingRef();

	LocalDate getCheckin();

	String getClientRef();

	String getBoardName();

	@Nullable
	BigDecimal getCommission();

	OffsetDateTime getCreationDate();

	Currency getCurrency();

	LocalDate getCheckout();

	Holder getHolder();

	String getHotelCode();

	@Nullable
	Currency getHotelCurrency();

	@Nullable
	BigDecimal getHotelRate();

	@Nullable
	String getNationality();

	Boolean getNonrefundable();

	List<Occupancy> getOccupancy();

	@Nullable
	String getRateKey();

	RateType getRateType();

	@Nullable
	String getSpecialRequest();

	BookingStatus getStatus();

	BigDecimal getTotal();

	@Nullable
	BigDecimal getCancellationCost();

	List<CancellationPolicy> getCancellationPolicies();

	@Nullable
	String getRemarks();

}
