package testCase;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class TestCase1Fw extends BaseTest{
	
	@Test	
	public static void LoginTest() throws InterruptedException {
		
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[placeholder=\"Username\"]")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[placeholder=\"Password\"]")).sendKeys("admin123"); 
		driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
	}

}
