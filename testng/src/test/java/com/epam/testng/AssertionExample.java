package com.epam.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertionExample {
	WebDriver driver;

	@BeforeClass
	void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
	}

	@Test
	void logoTest() {
		WebElement logo = driver.findElement(By.xpath("//*[@id=\"cb-logo-main-menu\"]"));
		Assert.assertTrue(logo.isDisplayed(), "webelement is not displayed");
	}

	@Test
	void homepageTitle() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Cricbuzz.com");

	}

	@Test
	void searchTest() {
		WebElement search = driver
				.findElement(By.xpath("//*[@id=\"main-menu_search\"]/div/form/div[1]/div/div[1]/span[1]"));
		Assert.assertFalse(search.isDisplayed(), "webelement displayed123");
	}

	@AfterClass
	void tearDown() {
		driver.quit();
	}
}
