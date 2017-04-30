package com.ratemarkt;

public abstract class ConfigurableConnector<T> implements Connector {

	T config;

	public ConfigurableConnector(T config) {
		this.config = config;
	}

	public T getConfig() {
		return config;
	}
}
