package com.jeroIsland.model;

public class Output {
	private Wire wire;
	
	public void connect(Wire wire) {
		this.wire = wire;
	}

	public void transmit(Signal signal) {
		this.wire.transmit(signal);
	}

}
