package base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	//Browser/driver setup
	
	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static Properties loc = new Properties();
	public static FileReader fr ;
	public static FileReader fr1 ;
	
	@BeforeMethod
	public void setUp() throws IOException {
		if (driver==null) {
			//System.out.println("the user path is : "+System.getProperty("user.dir"));
			 fr = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configFiles\\config.properties");
			 fr1 = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configFiles\\locators.properties");
			
			prop.load(fr);
			loc.load(fr1);
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
	
	@AfterMethod
	public void tearDown() {
		
		driver.close();
		System.out.println("TearDown successful");
	}

}
