package base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	//Browser/driver setup
	
	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static FileReader fr ;
	
	@BeforeTest
	public void setUp() throws IOException {
		if (driver==null) {
			FileReader fr = new FileReader("C:\\Users\\krish\\eclipse-workspace\\SeleniumFrameWork\\TestAutomation-Framework\\src\\test\\resources\\configFiles\\config.properties");
			
			prop.load(fr);
		}
		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();//base
			driver = new ChromeDriver();//base
			driver.get(prop.getProperty("testurl"));
		}
		else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get(prop.getProperty("testurl"));
		}
		
		
	}
	
	@AfterTest
	public void tearDown() {
		
		driver.close();
		System.out.println("TearDown successful");
	}

}
