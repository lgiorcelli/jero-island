package com.jeroIsland.model;

import com.jeroIsland.model.old.SoundSource;
import com.jeroIsland.model.signal.EmptySignal;
import com.jeroIsland.model.signal.ISignal;
import com.jeroIsland.model.signal.Signal;

public class BasicMicrophone implements SoundSource, Controllable {

	private ExecutionController controller;
	private Plug output;
	
	public BasicMicrophone() {
		this.controller = new ExecutionController(this);
	}
	
	public void on() {
		controller.start();
	}
	
	public void off() {
		controller.end();
	}
	
	@Override
	public Signal emit() {
		return new Signal("Hola ke ase");
	}


	@Override
	public void run() {
		getOutput().send(this.capture());
	}

	public Plug getOutput() {
		return output;
	}

	private ISignal capture() {
		return new EmptySignal();
	}

}
