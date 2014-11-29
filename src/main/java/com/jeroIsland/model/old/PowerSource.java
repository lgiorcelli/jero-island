package com.jeroIsland.model.old;

import java.util.HashSet;
import java.util.Set;


public class PowerSource {
	private Set<OldPlug> plugs = new HashSet<OldPlug>();
	public static final Integer VOLTAGE = 10;
	private int voltage;

	public void on() {
		this.voltage = VOLTAGE;
		for (OldPlug plug : plugs) {
			plug.send(voltage);
		}
	}

	public void connect(OldPlug plug) {
		this.plugs.add(plug);
	}
}
