package collation.Individual;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import collation.Defender.BaseClassSetup;
import collation.Defender.locators.Individual.Telecom;

public class TelecomTest extends BaseClassSetup {
	Telecom tec;
	
	public TelecomTest() {
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
	public void Telecomcreate() throws InterruptedException {
		tec=new Telecom();
		tec.Telecomlocators();
	
		
}
}
