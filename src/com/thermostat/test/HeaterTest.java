package com.thermostat.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.thermostat.code.Heater;

public class HeaterTest {

	Heater heater;
	@Before
	public void setup(){
		heater = new Heater();
	}
	@Test
	public void testHeaterTurnOn() {
		Assert.assertTrue(heater.turnOn(true));
	}
	@Test
	public void testHeaterTurnOff() {
		Assert.assertFalse(heater.turnOn(false));
	}
	@Test
	public void testHeaterIsOn(){
		heater.turnOn(true);
		Assert.assertTrue(heater.isOn());
	}
	@Test
	public void testHeaterIsOff(){
		heater.turnOn(false);
		Assert.assertFalse(heater.isOn());
	}
}
