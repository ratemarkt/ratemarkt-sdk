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

	BookingStatus getStatus();

	String getBookingRef();

	String getClientRef();

	String getHotelCode();

	LocalDate getCheckin();

	LocalDate getCheckout();

	Holder getHolder();

	List<Occupancy> getOccupancies();

	OffsetDateTime getCreationDate();

	RateType getRateType();

	List<CancellationPolicy> getCancellationPolicies();

	BigDecimal getTotal();

	Currency getCurrency();

	BigDecimal getBalance();

	PaymentType getPaymentType();

	@Nullable
	String getBoardType();

	@Nullable
	String getBoardName();

	@Nullable
	String getRateKey();

	@Nullable
	String getHotelName();

	@Nullable
	String getDestinationCode();

	@Nullable
	String getDestinationName();

	@Nullable
	String getCountryCode();

	@Nullable
	Boolean getNonrefundable();

	@Nullable
	BigDecimal getCancellationCost();

	@Nullable
	BigDecimal getCommission();

	@Nullable
	BigDecimal getHotelRate();

	@Nullable
	Currency getHotelCurrency();

	@Nullable
	String getSpecialRequest();

	@Nullable
	String getRemarks();
}
