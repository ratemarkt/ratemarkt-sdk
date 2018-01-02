package com.ratemarkt.models;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

import javax.annotation.Nullable;

import org.immutables.gson.Gson;
import org.immutables.value.Value;

@Gson.TypeAdapters
@Value.Immutable
public interface CancellationPolicy {

	BigDecimal getAmount();

	OffsetDateTime getFromDate();

	@Nullable
	@Gson.Ignore
	CancellationPolicy getSource();
}
