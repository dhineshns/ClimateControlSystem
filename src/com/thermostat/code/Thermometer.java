package com.thermostat.code;

import java.util.*;

public class Thermometer {
	public float currentTemp(){
		float rand = 50 + new Random().nextFloat()*40;
		System.out.println("Temperature inside car : " + rand);
		return rand;
	}
}
