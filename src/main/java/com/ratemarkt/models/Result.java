package com.ratemarkt.models;

import java.util.Map;

import javax.annotation.Nullable;

public interface Result<T extends Query> {	
	
	@Nullable
	T getQuery();

	@Nullable
	Map<String, Object> getDebugData();

}