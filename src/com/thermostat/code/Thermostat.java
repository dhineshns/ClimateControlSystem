package com.thermostat.code;

import java.util.Scanner;

public class Thermostat {
	
	private static Heater heater = new Heater();
	private static AirConditioner ac = new AirConditioner();
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your desired temperature? : ");
		
		float userTemp = sc.nextFloat();
		Thermometer meter = new Thermometer();
		setUserTemperature(userTemp, meter);
	}

	public static Heater getHeater() {
		return heater;
	}

	public static AirConditioner getAc() {
		return ac;
	}

	public static void setUserTemperature(float userTemp, Thermometer meter) {
		float currentTemp = meter.currentTemp();
		if(currentTemp > userTemp) ac.turnOn(true);
		else if(currentTemp < userTemp) heater.turnOn(true);
		else if(Math.abs(currentTemp - userTemp) < 0000001) {ac.turnOn(false); heater.turnOn(false);}
	}
}
