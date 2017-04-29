package com.ratemarkt.domain.models;

import java.time.LocalDate;
import java.util.Currency;
import java.util.List;

public interface AvailabilityQuery extends Query {

	LocalDate getCheckin();

	LocalDate getCheckout();

	Currency getCurrency();

	String getNationality();

	List<Pax> getPaxes();

}