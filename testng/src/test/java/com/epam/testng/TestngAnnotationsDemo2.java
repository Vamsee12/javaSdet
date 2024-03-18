package com.epam.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngAnnotationsDemo2 {
	@Test
	void test3() {
		System.out.println("This is test three");
	}

	@Test
	void test4() {
		System.out.println("This is test four");
	}

	@BeforeMethod
	void beforeMethod() {
		System.out.println("before Method");

	}

	@AfterMethod
	void AfterMethod() {
		System.out.println("After Method");

	}

	@BeforeClass
	void beforeClass() {
		System.out.println("Before class");
	}

	@AfterClass
	void afterClass() {
		System.out.println("After class");
	}

	@BeforeTest
	void beforeTest() {
		System.out.println("Before test");
	}

	@AfterTest
	void afterTest() {
		System.out.println("After test");
	}
}
