package com.locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocators {
	
	
		public static void main(String args[]) {

			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.myntra.com/");
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/");
			
			driver.findElement(By.cssSelector("input.inputtext")).sendKeys("Vamsee");
			//In class name no need to consider text after spaces
			//driver.findElement(null)
			driver.findElement(By.cssSelector("input#email")).sendKeys("mohan");
			//tag and attribute combination
			//driver.findElement(By.cssSelector("input[type=password]")).sendKeys("Vmcmahi@123");
			//tag,class and attribute combination
			driver.findElement(By.cssSelector("input.inputtext[type=password]")).sendKeys("Vmcmahi@123");

}
}
