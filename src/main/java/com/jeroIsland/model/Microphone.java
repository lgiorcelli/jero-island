package com.jeroIsland.model;

import java.util.HashSet;
import java.util.Set;

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
	public void receive(Signal signal) {
		//convert signal?
		this.output.transmit(signal);
	}

}
