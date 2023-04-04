package testCase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.ReadXLSdata;

public class TestCase1Fw extends BaseTest {

	@Test(dataProviderClass = ReadXLSdata.class,dataProvider = "testdata")
	public static void LoginTest(String username, String password) throws InterruptedException {

		Thread.sleep(5000);
		driver.findElement(By.cssSelector(loc.getProperty("User_name"))).sendKeys(username);
		driver.findElement(By.cssSelector(loc.getProperty("Pass_word"))).sendKeys(password);
		driver.findElement(By.cssSelector(loc.getProperty("Login_Button"))).click();
	}

}
