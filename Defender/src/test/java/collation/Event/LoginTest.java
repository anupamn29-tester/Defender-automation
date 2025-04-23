package collation.Event;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import collation.Defender.BaseClassSetup;
import collation.Defender.locator.Event.LoginPage;

public class LoginTest extends BaseClassSetup {

	LoginPage log;
	
	public LoginTest() {
		super();
	}
	
	
	@BeforeTest
	public void lunchchrome() throws InterruptedException {
		lunch();
		log=new LoginPage();
	}
	
	@AfterMethod
	public void exit() {
		driver.quit(); 
	}
	
	@Test
	public void Loginpage() throws InterruptedException {
		log.signin(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(10000);
		 File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        try {
	            FileUtils.copyFile(screenshot, new File("C:\\projectScreenshots\\homePageScreenshot.png"));
	        } catch (IOException e) { 
	            System.out.println(e.getMessage());
	        }

	}
}
