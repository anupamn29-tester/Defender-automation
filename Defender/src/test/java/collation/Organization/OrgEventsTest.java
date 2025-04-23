package collation.Organization;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import collation.Defender.BaseClassSetup;
import collation.Defender.locators.Organization.OrgEvents;

public class OrgEventsTest extends BaseClassSetup {
	
	OrgEvents eve;
	
	public OrgEventsTest() {
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
	public void Eventscreate() throws InterruptedException, IOException {
		eve=new OrgEvents();
		eve.OrgEventslocators();
		
	}

}
