package com.thermostat.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	AirConditionerTest.class,
	HeaterTest.class,
	ThermometerTest.class,
	ThermostatTest.class
})
public class CCSTestSuite {

}
