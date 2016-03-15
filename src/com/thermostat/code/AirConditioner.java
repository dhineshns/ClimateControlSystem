package com.thermostat.code;

public class AirConditioner {
	
	private boolean isOn = false;
	
	// a method to turn the AC on or off.
	public boolean turnOn(boolean flag){
		isOn = flag;
		System.out.println("AC is On!");
		return isOn;
	}
	
	// is the AC turned on.
	public boolean isOn(){
		return isOn;
	}
}
