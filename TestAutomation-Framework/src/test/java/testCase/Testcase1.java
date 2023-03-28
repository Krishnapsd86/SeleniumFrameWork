package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[placeholder=\"Username\"]")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[placeholder=\"Password\"]")).sendKeys("admin123");
		driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
		
		
		driver.close();

	}

}