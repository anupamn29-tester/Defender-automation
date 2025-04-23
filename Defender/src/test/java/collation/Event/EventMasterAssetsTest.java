package collation.Event;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import collation.Defender.BaseClassSetup;
import collation.Defender.locator.Event.EventMasterAssets;

public class EventMasterAssetsTest extends BaseClassSetup {
	EventMasterAssets eveassets;
	
	
	public EventMasterAssetsTest() {
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
	public void AssetsTest() throws InterruptedException {
		eveassets=new EventMasterAssets();
		eveassets.Assetslocators();
	}
}
