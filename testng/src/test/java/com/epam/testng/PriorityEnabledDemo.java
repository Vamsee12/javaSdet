package com.epam.testng;

import org.testng.annotations.Test;

public class PriorityEnabledDemo {

	@Test(priority = 0)
	void testOne() {
		System.out.println("Test1");
	}

	@Test(priority = 1)
	void testTwo() {
		System.out.println("Test2");
	}

	@Test(priority = 2)
	void testThree() {
		System.out.println("Test3");
	}

	@Test(priority = 3, enabled = false)
	void testFour() {
		System.out.println("Test4");
	}
}
