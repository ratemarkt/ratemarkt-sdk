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
public interface Booking extends MetaModel {

	public static final String META_SUPPLIER_REF = "supplierRef";

	String getBookingRef();

	BookingStatus getStatus();

	String getHotelCode();

	LocalDate getCheckin();

	LocalDate getCheckout();

	BigDecimal getTotal();

	Currency getCurrency();

	Holder getHolder();

	OffsetDateTime getCreationDate();

	@Nullable
	List<CancellationPolicy> getCancellationPolicies();

	@Nullable
	Boolean getNonrefundable();

	@Nullable
	String getClientRef();

	@Nullable
	RateType getRateType();

	@Nullable
	List<Occupancy> getOccupancies();

	@Nullable
	BigDecimal getBalance();

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
