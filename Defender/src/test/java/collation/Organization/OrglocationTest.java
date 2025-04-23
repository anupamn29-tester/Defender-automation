package collation.Organization;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import collation.Defender.BaseClassSetup;
import collation.Defender.locators.Organization.OrgLocations;

public class OrglocationTest extends BaseClassSetup{
	
	OrgLocations loc;
	public OrglocationTest() {
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
	public void Locationcreate() throws InterruptedException, IOException {
		loc=new OrgLocations();
		loc.Orglocationlocators();
		
		
		
		
	}  
}
