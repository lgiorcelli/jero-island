package com.jeroIsland.model.old;

import java.util.ArrayList;
import java.util.List;

import com.jeroIsland.model.Controllable;
import com.jeroIsland.model.ExecutionController;
import com.jeroIsland.model.signal.ISignal;
import com.jeroIsland.model.signal.Signal;

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
	
	public ISignal play() {
		System.out.println("playing " + recorded.size());
		for (ISignal signal : recorded) {
			System.out.println(signal.asText());
		}
		return null;
	}
}
