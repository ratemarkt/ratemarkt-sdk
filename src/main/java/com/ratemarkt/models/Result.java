package com.ratemarkt.models;

import java.util.Map;

import javax.annotation.Nullable;

public interface Result<T extends Query> {

	public static final String META_SUPPLIER_REF = "supplierRef";
	
	
	@Nullable
	T getQuery();

	@Nullable
	Map<String, Object> getDebugData();

	@Nullable
	Map<String, Object> getMeta();

}