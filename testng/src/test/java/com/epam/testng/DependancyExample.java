package com.epam.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependancyExample {

//dependsOnMethods means its functionality depends on other methods.
//alwaysRun is used to execute method forcefully even its denpendent method is failed.
	@Test
	void startCar() {
		System.out.println("Car Started");
		Assert.fail();
	}

	@Test(dependsOnMethods = { "startCar" })
	void driveCar() {
		System.out.println("Car Driven");
		// Assert.fail();
	}

	@Test(dependsOnMethods = { "startCar" })
	void stopCar() {
		System.out.println("Car Stopped");
	}

	@Test(dependsOnMethods = { "startCar", "stopCar" }, alwaysRun = true)
	void parkCar() {
		System.out.println("Car parked");
	}

}
