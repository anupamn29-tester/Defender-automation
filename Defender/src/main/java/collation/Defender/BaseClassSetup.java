package collation.Defender;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassSetup {

	public static WebDriver driver;
	public static Properties prop;
	public static String path=System.getProperty("user.dir");
	
public BaseClassSetup() {
		
		try {
			
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\collation\\def\\prop\\conf.property");
			prop.load(ip);
		}
		catch(Exception io) {
			System.out.println("Syntax Error");
		}
		}

public void lunch() {
	
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.get(prop.getProperty("url")); 
}
}
