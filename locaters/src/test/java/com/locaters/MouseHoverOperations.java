package com.locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHoverOperations {

	@Test
	void mouseHover() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();

		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.id("menu_admin_viewAdminModule")))
				.moveToElement(driver.findElement(By.id("menu_admin_Organization")))
				.moveToElement(driver.findElement(By.id("menu_admin_viewLocations"))).click().perform();

		driver.findElement(By.id("searchLocation_name")).sendKeys("Hyderabad");
		actions.doubleClick(driver.findElement(By.id("searchLocation_name"))).perform();
	}

}
