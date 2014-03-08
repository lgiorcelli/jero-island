package com.jeroIsland.model;

import java.util.ArrayList;
import java.util.List;

public class Recorder implements Controllable{
	private ExecutionController controller;
	private SoundSource soundSource;
	private List<Signal> recorded = new ArrayList<Signal>();
	
	public Recorder() {
		controller = new ExecutionController(this);
	}
	
	public void addSource(SoundSource source) {
		this.soundSource = source;
	}
	
	@Override
	public void run() {
		this.recorded.add(soundSource.emit());
	}
	
	public void rec() {
		controller.start();
	}
	
	public void stop() {
		System.out.println("Stopping...");
		controller.end();
	}
	
	public Signal play() {
		System.out.println("playing " + recorded.size());
		for (Signal signal : recorded) {
			System.out.println(signal.asText());
		}
		return null;
	}
}
