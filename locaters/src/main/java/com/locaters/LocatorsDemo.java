package com.locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String args[]) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		// driver.findElement(By.className("desktop-searchBar")).sendKeys("pants");
		WebElement search = driver.findElement(By.className("desktop-searchBar"));
		search.sendKeys("shirts");

		driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/a/span")).click();
		// driver.findElement(By.className("myntraweb-sprite desktop-iconSearch
		// sprites-search")).click();
		driver.findElement(By.linkText("Campus Sutra Men Navy Blue & Grey Standard Fit Colourblocked Casual Shirt"))
				.click();

	}
}