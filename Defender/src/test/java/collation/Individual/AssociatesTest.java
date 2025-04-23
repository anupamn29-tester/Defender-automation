package collation.Individual;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import collation.Defender.BaseClassSetup;
import collation.Defender.locators.Individual.Associates;

public class AssociatesTest extends BaseClassSetup{
	Associates Aso;
	
	public AssociatesTest() {
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
	public void Associatescreate() throws InterruptedException {
		Aso=new Associates();
		Aso.Associateslocators();
		
		
}
}
