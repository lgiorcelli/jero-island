package com.jeroIsland.model;

import com.jeroIsland.model.signal.ISignal;

public class Plug {
	private Plug connect;
	public Plug() {
		this.connect = new NoPlug();
	}

	public void connect(Plug plug) {
		this.connect = plug;
	}
	
	public void send(ISignal capture) {
		this.connect.send(capture);
	}

	public class NoPlug extends Plug {
		
	}
}
