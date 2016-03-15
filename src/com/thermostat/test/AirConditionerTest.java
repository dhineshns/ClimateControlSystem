package com.thermostat.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.thermostat.code.AirConditioner;

public class AirConditionerTest {

	AirConditioner ac;
	@Before
	public void setup(){
		ac = new AirConditioner();
	}
	@Test
	public void testAirConditionerTurnOn() {
		Assert.assertTrue(ac.turnOn(true));
	}
	@Test
	public void testAirConditionerTurnOff() {
		Assert.assertFalse(ac.turnOn(false));
	}
	@Test
	public void testAirConditionerIsOn(){
		ac.turnOn(true);
		Assert.assertTrue(ac.isOn());
	}
	@Test
	public void testAirConditionerIsOff(){
		ac.turnOn(false);
		Assert.assertFalse(ac.isOn());
	}
}
