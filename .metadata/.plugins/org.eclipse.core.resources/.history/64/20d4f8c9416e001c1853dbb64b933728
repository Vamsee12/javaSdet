package com.locaters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownsDemo {
	
	
	@Test
	public void dropDowns() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
	driver.manage().window().maximize();
	
	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"));
	//dropdown.click();
	//Select select = new Select();
	Select select = new Select(dropdown);
	
	select.selectByIndex(7);
	Thread.sleep(3000);
	
	select.selectByValue("IND");
	Thread.sleep(3000);
	
	select.selectByVisibleText("Luxembourg");
	Thread.sleep(3000);
	
	//selects all the options in dropdown
	List<WebElement> allOptions = select.getOptions();
	for(WebElement options : allOptions) {
		
		System.out.println(options.getText());
	}
	
	}

}
