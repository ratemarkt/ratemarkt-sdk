package com.ratemarkt.models;

import java.util.Map;

import javax.annotation.Nullable;

import org.immutables.gson.Gson.Ignore;

public interface Result<T extends Query> {

	@Nullable
	Map<String, Object> getDebugData();

	@Ignore
	@Nullable
	T getQuery();
}