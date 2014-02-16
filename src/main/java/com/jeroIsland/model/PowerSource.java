package com.jeroIsland.model;

import java.util.HashSet;
import java.util.Set;

public class PowerSource {
	private Set<Plug> plugs = new HashSet<Plug>();
	public static final Integer VOLTAGE = 10;
	private int voltage;

	public void on() {
		this.voltage = VOLTAGE;
		for (Plug plug : plugs) {
			plug.send(voltage);
		}
	}

	public void connect(Plug plug) {
		this.plugs.add(plug);
	}
}
