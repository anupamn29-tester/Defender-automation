package collation.Event;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import collation.Defender.BaseClassSetup;
import collation.Defender.locator.Event.EventMasterRelatedEvents;

public class EventMasterRelatedEventsTest extends BaseClassSetup {
	
	EventMasterRelatedEvents relevent;
	
	public EventMasterRelatedEventsTest() {
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
	public void RelatedEvents() throws InterruptedException {
		relevent=new EventMasterRelatedEvents();
		relevent.RelatedEventslocators();
		
	}

}
