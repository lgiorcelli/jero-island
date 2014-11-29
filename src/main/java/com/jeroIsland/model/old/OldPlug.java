package com.jeroIsland.model.old;

import com.jeroIsland.model.signal.ISignal;

public class OldPlug {
	private Integer voltage;
	private ISignal signal;
	private Wire wire;
	
	public OldPlug(Wire wire) {
		this.wire = wire;
	}
	
	public ISignal getSignal() {
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
