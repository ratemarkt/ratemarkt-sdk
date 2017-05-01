package com.ratemarkt;

public abstract class AbstractPlugin<T> extends ConfigurableConnector<T> implements Plugin {

	private Connector target;

	public AbstractPlugin(T config) {
		super(config);
	}

	@Override
	public Connector getTarget() {
		return target;
	}

	@Override
	public void setTarget(Connector target) {
		this.target = target;
	}
}
