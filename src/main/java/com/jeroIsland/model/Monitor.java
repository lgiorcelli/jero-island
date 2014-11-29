package com.jeroIsland.model;

import com.jeroIsland.model.signal.ISignal;

public interface Monitor {

	void receive(ISignal createSignal);

}
