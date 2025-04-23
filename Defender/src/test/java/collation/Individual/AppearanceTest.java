package collation.Individual;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import collation.Defender.BaseClassSetup;
import collation.Defender.locators.Individual.Appearance;

public class AppearanceTest extends BaseClassSetup {
	
	Appearance apc;
	
	public AppearanceTest() {
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
	public void AppearanceExecution() throws InterruptedException {

		apc=new Appearance();
		apc.Appearancelocators();
	}

}
