package collation.Individual;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import collation.Defender.BaseClassSetup;
import collation.Defender.locators.Individual.Organizations;

public class OrganizationsTest extends BaseClassSetup{

	Organizations org;
	
	public OrganizationsTest() {
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
	public void Organizationscreate() throws InterruptedException {
		org=new Organizations();
		org.Organizationslocators();
			
	}  
}
