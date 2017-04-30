package com.ratemarkt.models;

import org.immutables.value.Value;

import com.google.gson.annotations.SerializedName;

public interface Query {

	@Value.Default
	@SerializedName("debug")
	default boolean isDebug() {
		return false;
	}
}