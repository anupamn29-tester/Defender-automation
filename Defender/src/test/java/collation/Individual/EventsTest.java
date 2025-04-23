package collation.Individual;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import collation.Defender.BaseClassSetup;
import collation.Defender.locators.Individual.Events;

public class EventsTest extends BaseClassSetup{

	Events eve;
	
	public EventsTest() {
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
	public void Eventscreate() throws InterruptedException {
		eve=new Events();
		eve.Eventslocators();
		
	}
}
