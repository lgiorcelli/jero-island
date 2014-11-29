package com.jeroIsland.model.old;

import com.jeroIsland.model.signal.ISignal;

public class Wire {

	private OldPlug male;
	private OldPlug female;
	
	public Wire() {
		this.male = new OldPlug(this);
		this.female = new OldPlug(this);
	}
	
	public void transmit(ISignal signal) {
		// TODO Auto-generated method stub	
	}

	public void transmit(Integer voltage, OldPlug input) {
		OldPlug output = female; 
		if (input.equals(female)) {
			output = male;
		}
		output.receive(voltage);
	}

	public OldPlug getFemale() {
		return female;
	}
	
	public OldPlug getMale() {
		return male;
	}

}
