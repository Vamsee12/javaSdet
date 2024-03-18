package com.locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo2 {
	//classname and tags are used for finding multiple webelements

		public static void main(String args[]) {

			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.myntra.com/");
			driver.manage().window().maximize();
			//int picscount=driver.findElements(By.className("image-image undefined image-hand")).size();
			//System.out.println(picscount);
			int count=driver.findElements(By.tagName("a")).size();
			System.out.println(count);

}
	}
