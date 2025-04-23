package collation.Event;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import collation.Defender.BaseClassSetup;
import collation.Defender.locator.Event.EventMasterAssociates;

public class EventMasterAssociatesTest extends BaseClassSetup {
	
	EventMasterAssociates evenmaster;
	
	public EventMasterAssociatesTest() {
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
	public void Eventmastercreate() throws InterruptedException {
		evenmaster=new EventMasterAssociates();
		evenmaster.evenmasterlocator();
		
	}  
} 
