package com.jeroIsland.model;

public class Wire {

	private Plug male;
	private Plug female;
	
	public Wire() {
		this.male = new Plug(this);
		this.female = new Plug(this);
	}
	
	public void transmit(Signal signal) {
		// TODO Auto-generated method stub	
	}

	public void transmit(Integer voltage, Plug input) {
		Plug output = female; 
		if (input.equals(female)) {
			output = male;
		}
		output.receive(voltage);
	}

	public Plug getFemale() {
		return female;
	}
	
	public Plug getMale() {
		return male;
	}

}
