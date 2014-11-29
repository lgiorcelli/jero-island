package com.jeroIsland.model.signal;


public class Signal implements ISignal {
	private String value;

	public Signal(String value) {
		this.value = value;
	}
	
	@Override
	public String asText() {
		return value;
	}
}
