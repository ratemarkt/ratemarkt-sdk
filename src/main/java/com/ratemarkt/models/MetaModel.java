package com.ratemarkt.models;

import java.util.Map;

import javax.annotation.Nullable;

public interface MetaModel {

	@Nullable
	Map<String, Object> getMeta();
}
