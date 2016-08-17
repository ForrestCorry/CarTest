package com.test;

public class Car extends Vehicle{

	protected int windows = 0;
	protected int doors = 0;
	protected int wheels = 0;
	protected boolean isMoving = false;
	protected boolean isStopped = true;
	
	
	public boolean carIsAccelerating(boolean isMoving){
		
		
		return isMoving;
		
	}
	
	public boolean stopped(boolean isStopped){
		return isStopped;
		
		
	}
	
	
	
	
	
	
	
	@Override
	public boolean StartCar() {
		return false;
	}

	@Override
	public boolean turnOff() {
		return false;
	}
	
	

}
