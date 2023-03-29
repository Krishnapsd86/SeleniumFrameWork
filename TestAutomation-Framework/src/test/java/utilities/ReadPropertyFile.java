package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//set fileReader
		FileReader fr = new FileReader("C:\\Users\\krish\\eclipse-workspace\\SeleniumFrameWork\\TestAutomation-Framework\\src\\test\\resources\\configFiles\\config.properties");
		
		//set properties
		Properties p = new Properties();
		p.load(fr);
		
		System.out.println(p.getProperty("browser"));
		System.out.println(p.getProperty("testurl"));

	}

}
