package collation.Individual;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import collation.Defender.BaseClassSetup;
import collation.Defender.locators.Individual.Finance;

public class FinanceTest extends BaseClassSetup{
	
	Finance fin;
	
	public FinanceTest() {
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
	public void Financecreate() throws InterruptedException {
		fin=new Finance();
		fin.Financelocators();
		
		
}
}
