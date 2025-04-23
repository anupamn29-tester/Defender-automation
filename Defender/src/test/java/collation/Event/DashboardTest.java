package collation.Event;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import collation.Defender.BaseClassSetup;
import collation.Defender.locator.Event.Dashboardlocators;

public class DashboardTest extends BaseClassSetup {

	Dashboardlocators hom;
	
	@BeforeMethod
	public void lunchchrome() {
		lunch();
		hom=new Dashboardlocators();
	}
	@AfterMethod
	public void exit() {
		driver.quit();
	}
	@Test
	public void testing() throws InterruptedException {
		hom.locatorshome();
		Thread.sleep(10000); 
	}
}
