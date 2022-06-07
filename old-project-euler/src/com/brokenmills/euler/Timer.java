package com.brokenmills.euler;

public class Timer implements TimerInterface {

	public static TimerInterface getTimer() {
		return new Timer();
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public long pause() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long stop() {
		// TODO Auto-generated method stub
		return 0;
	}

}
