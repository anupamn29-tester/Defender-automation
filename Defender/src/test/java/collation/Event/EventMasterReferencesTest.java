package collation.Event;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import collation.Defender.BaseClassSetup;
import collation.Defender.locator.Event.EventMasterReferences;

public class EventMasterReferencesTest extends BaseClassSetup {
	EventMasterReferences ref;
	
	public EventMasterReferencesTest(){
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
	public void ReferencesTest() throws InterruptedException {
		ref =new EventMasterReferences();
		ref.Referenceslocators();
		
		
	}
}
