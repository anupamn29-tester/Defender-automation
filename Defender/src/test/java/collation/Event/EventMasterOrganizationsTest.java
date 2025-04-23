package collation.Event;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import collation.Defender.BaseClassSetup;
import collation.Defender.locator.Event.EventMasterOrganizations;

public class EventMasterOrganizationsTest extends BaseClassSetup{

	EventMasterOrganizations eveorga;
	
	public EventMasterOrganizationsTest() {
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
	public void Eveorganizations() throws InterruptedException {
		eveorga=new EventMasterOrganizations();
		eveorga.organizationlocators();
		
	}
	
}
