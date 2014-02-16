package com.jeroIsland.model;

public class ExecutionController extends Thread {
	private boolean alive;
	private static final int PERIOD = 30;
	
	public ExecutionController() {
		this("Anonymous");
	}
	
	public ExecutionController(String name) {
		super(name);
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
			System.out.println(getName());
			try {
				sleep(PERIOD);
			} catch (InterruptedException e) {
			}
		}
	}
}
