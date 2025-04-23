package collation.Event;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import collation.Defender.BaseClassSetup;
import collation.Defender.locator.Event.EventMaster;

public class EvenMasterTest extends BaseClassSetup {
	
	EventMaster event;
	
	public EvenMasterTest() {
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
		event=new EventMaster();
		event.evenlocators();
		Thread.sleep(3000);
		
		
		
	}  
} 
