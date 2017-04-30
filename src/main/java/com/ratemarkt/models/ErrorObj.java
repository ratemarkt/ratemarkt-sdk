package com.ratemarkt.models;

import javax.annotation.Nullable;

import org.immutables.gson.Gson;
import org.immutables.value.Value;

@Gson.TypeAdapters
@Value.Immutable
public interface ErrorObj {

	Integer getErrorCode();

	String getMessage();

	@Nullable
	String getDetail();
}
