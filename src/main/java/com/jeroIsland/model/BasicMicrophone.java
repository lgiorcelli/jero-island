package com.jeroIsland.model;

public class BasicMicrophone implements SoundSource {

	@Override
	public Signal emit() {
		return new Signal("Hola ke ase");
	}

}
