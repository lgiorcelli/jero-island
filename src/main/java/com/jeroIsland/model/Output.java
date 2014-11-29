package com.jeroIsland.model;

import com.jeroIsland.model.old.Wire;
import com.jeroIsland.model.signal.ISignal;

public class Output {
	private Wire wire;
	
	public void connect(Wire wire) {
		this.wire = wire;
	}

	public void transmit(ISignal signal) {
		this.wire.transmit(signal);
	}

}
