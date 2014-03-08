package com.jeroIsland.model;

public class ExecutionController extends Thread {
	private boolean alive;
	private Controllable controllable;
	private static final int PERIOD = 100;

	public ExecutionController(Controllable controllable) {
		this.controllable = controllable;
	}

	public void end() {
		alive = false;
	}

	public boolean alive() {
		return alive;
	}

	@Override
	public void run() {
		alive = true;
		while (alive) {
			controllable.run();
			try {
				sleep(PERIOD);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
