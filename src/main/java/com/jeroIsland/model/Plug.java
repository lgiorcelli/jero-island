package com.jeroIsland.model;

public class Plug {
	private Integer voltage;
	private Signal signal;
	private Wire wire;
	
	public Plug(Wire wire) {
		this.wire = wire;
	}
	
	public Signal getSignal() {
		return signal;
	}
	
	public Integer getVoltage() {
		return voltage;
	}

	public void send(Integer voltage) {
		this.wire.transmit(voltage, this);
	}
	
	public void receive(Integer voltage) {
		this.voltage = voltage;
	}
}
