package com.epam.testng;

import org.testng.annotations.Test;

public class GroupingExample {
	
	@Test(groups= {"Sanity"})
	void test1() {
		System.out.println("This is test 1...");
	}

	@Test(groups= {"Sanity"})
	void test2() {
		System.out.println("This is test 2...");
	}
	@Test(groups= {"Sanity"})
	void test3() {
		System.out.println("This is test 3...");
	}

	@Test(groups= {"Regression"})
	void test4() {
		System.out.println("This is test 4...");
	}
	@Test(groups= {"Regression"})
	void test5() {
		System.out.println("This is test 5...");
	}

	@Test(groups= {"Sanity","Regression"})
	void test6() {
		System.out.println("This is test 6...");
	}


}
