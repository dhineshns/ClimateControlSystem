package com.thermostat.code;

public class Heater {
	private boolean isOn = false;
	
	// a method to turn the heater on or off.
	public boolean turnOn(boolean flag){
		isOn = flag;
		System.out.println("Heater is On!");
		return isOn;
	}
	
	// is the heater turned on.
	public boolean isOn(){
		return isOn;
	}

}
