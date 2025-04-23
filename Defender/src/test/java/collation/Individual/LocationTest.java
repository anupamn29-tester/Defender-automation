package collation.Individual;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import collation.Defender.BaseClassSetup;
import collation.Defender.locators.Individual.Locations;

public class LocationTest extends BaseClassSetup{

	Locations loc;
	public LocationTest() {
		super();
	}
	@BeforeTest
	public void lunchchrome() throws InterruptedException {
		lunch();
	}
	
	@AfterMethod
	public void exit() {
		driver.quit();
	}
	@Test
	public void Locationcreate() throws InterruptedException {
		loc=new Locations();
		loc.locationlocators();
		
		
		
		
	}  

}
