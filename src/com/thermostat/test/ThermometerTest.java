package com.thermostat.test;

import org.junit.Assert;
import org.junit.Test;

import com.thermostat.code.Thermometer;



public class ThermometerTest {

	@Test
	public void testThermometerWithinRange() {
		Thermometer thermo = new Thermometer();
		float currentTemp = thermo.currentTemp();
		boolean flag = true;
		for(int i = 0 ; i< 100; i++){
			flag = flag && (50 <= currentTemp && currentTemp <= 90);
		}
		
		Assert.assertTrue(flag);
	}

}
