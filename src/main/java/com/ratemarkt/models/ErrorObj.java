package com.ratemarkt.models;

import java.util.Map;

import javax.annotation.Nullable;

import org.immutables.gson.Gson;
import org.immutables.value.Value;

@Gson.TypeAdapters
@Value.Immutable
public interface ErrorObj {

	Integer getErrorCode();

	String getMessage();

	@Nullable
	Map<String, Object> getDebugData();

	@Nullable
	String getDetail();
}
