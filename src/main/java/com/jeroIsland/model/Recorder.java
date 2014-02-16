package com.jeroIsland.model;

public class Recorder {
	private ExecutionController controller;
	private SoundSource soundSource;
	
	public Recorder() {
		controller = new ExecutionController("Recorder");
	}
	
	public void rec() {
		controller.start();
		while(controller.alive()) {
			soundSource.emit();
		}
	}
	
	public void stop() {
		System.out.println("Stopping...");
		controller.end();
	}
	
	public Signal play() {
		return null;
	}
}
