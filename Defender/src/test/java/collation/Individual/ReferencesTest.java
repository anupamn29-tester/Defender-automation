package collation.Individual;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import collation.Defender.BaseClassSetup;
import collation.Defender.locators.Individual.References;

public class ReferencesTest extends BaseClassSetup{
	References ref;
	
	public ReferencesTest() {
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
	public void Referencescreate() throws InterruptedException {
		ref=new References();
		ref.Referenceslocators();		
}
}
