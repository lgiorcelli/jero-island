package com.jeroIsland.model;

import java.util.HashSet;
import java.util.Set;

import com.jeroIsland.model.old.Monitoreable;
import com.jeroIsland.model.old.Wire;
import com.jeroIsland.model.signal.ISignal;

public class Microphone implements Monitor {

	private Set<Monitoreable> observed = new HashSet<Monitoreable>();
	private Output output = new Output();

	public void connect(Wire wire) {
		this.output.connect(wire);
	}

	public void monitor(Monitoreable monitoreable) {
		monitoreable.addMonitor(this);
		this.observed.add(monitoreable);		
	}

	@Override
	public void receive(ISignal signal) {
		//convert signal?
		this.output.transmit(signal);
	}

}
