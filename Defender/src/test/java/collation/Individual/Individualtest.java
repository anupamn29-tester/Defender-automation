package collation.Individual;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import collation.Defender.BaseClassSetup;
import collation.Defender.locators.Individual.Individual;

public class Individualtest extends BaseClassSetup{
	
	Individual ind;

	public Individualtest() {
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
	public void Individualcreate() throws InterruptedException {
		ind=new Individual();
		ind.Individuallocators();
		
		
		
	}  
}
