package cs.csharp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {
	
	@Test
	void openBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(1000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
		Thread.sleep(1000);
		//inventory_item_price
		String s=driver.findElement(By.className("inventory_item_price")).getText();
		Thread.sleep(1000);
		System.out.println(s);
		driver.findElement(By.className("shopping_cart_link")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(1000);
		//
		driver.findElement(By.id("first-name")).sendKeys("Vamsee");
		Thread.sleep(1000);
		driver.findElement(By.id("last-name")).sendKeys("Vinjavarapu");
		Thread.sleep(1000);
		//
		driver.findElement(By.id("postal-code")).sendKeys("500018");
		Thread.sleep(1000);
		//continue
		driver.findElement(By.id("continue")).click();	
		Thread.sleep(1000);
		String s1=driver.findElement(By.className("summary_total_label")).getText();
		Thread.sleep(1000);
		System.out.println(s1);
		//Assert.assertEquals(s1, s);
		driver.findElement(By.id("finish")).click();
		Thread.sleep(1000);
	}

}
