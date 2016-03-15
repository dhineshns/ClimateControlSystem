package com.thermostat.test;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import com.thermostat.code.Thermometer;
import com.thermostat.code.Thermostat;


public class ThermostatTest {

	@Test
	public void testSetUserTempHeater() {
		Thermostat stat = new Thermostat();
		Thermometer meter = Mockito.mock(Thermometer.class);
		Mockito.when(meter.currentTemp()).thenReturn(60.0f);
		stat.setUserTemperature(72.0f, meter);
		Assert.assertTrue(stat.getHeater().isOn());
	}
	@Test
	public void testSetUserTempAc() {
		Thermostat stat = new Thermostat();
		Thermometer meter = Mockito.mock(Thermometer.class);
		Mockito.when(meter.currentTemp()).thenReturn(80.0f);
		stat.setUserTemperature(72.0f, meter);
		Assert.assertTrue(stat.getAc().isOn());
	}

	@Test
	public void testSetUserTempHeaterHeater() {
		Thermostat stat = new Thermostat();
		Thermometer meter = Mockito.mock(Thermometer.class);
		Mockito.when(meter.currentTemp()).thenReturn(-60.0f);
		stat.setUserTemperature(72.0f, meter);
		Assert.assertTrue(stat.getHeater().isOn());
	}
	
	@Test
	public void testSetUserTempEqual() {
		Thermostat stat = new Thermostat();
		Thermometer meter = Mockito.mock(Thermometer.class);
		Mockito.when(meter.currentTemp()).thenReturn(72.3f);
		stat.setUserTemperature(72.3f, meter);
		Assert.assertFalse(stat.getHeater().isOn());
		Assert.assertFalse(stat.getAc().isOn());

	}
}
