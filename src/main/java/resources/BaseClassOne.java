package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClassOne {
WebDriver driver;
	Properties prop;
	
	public WebDriver intilizingBrowser() throws IOException {
		prop = new Properties();
		String proPath = System.getProperty("user.dir")+ "\\src\\main\\java\\resources\\config.properties ";
		FileInputStream fis = new FileInputStream(proPath);
		prop.load(fis);
		
		 String browserName = prop.getProperty("browser");
		 
		if (browserName.equalsIgnoreCase("chrome")){
			driver= new ChromeDriver();
			}
			else if(browserName.equalsIgnoreCase("firefox")){
				driver = new FirefoxDriver();
			}else {
				System.out.println("browser not opened");
			}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
