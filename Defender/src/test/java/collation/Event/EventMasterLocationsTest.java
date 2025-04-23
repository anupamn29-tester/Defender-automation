package collation.Event;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import collation.Defender.BaseClassSetup;
import collation.Defender.locator.Event.EventMasterLocations;

public class EventMasterLocationsTest extends BaseClassSetup{
	
	EventMasterLocations location;
	
	public EventMasterLocationsTest() {
		super();
	}
	@BeforeMethod
	public void lunchchrome() throws InterruptedException {
		lunch();
	}
	@AfterMethod
	public void exit() {
		driver.quit();
	}
	@Test
	public void EventMasterLocation() throws InterruptedException {
		location=new EventMasterLocations();
		location.locdetails();
	}

}
