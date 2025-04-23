package collation.Organization;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import collation.Defender.BaseClassSetup;
import collation.Defender.locators.Organization.OrgFinance;

public class OrgFinanceTest extends BaseClassSetup{

	OrgFinance orgf;
	
	public OrgFinanceTest() {
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
	public void Organizationscreate() throws InterruptedException, IOException {
		orgf=new OrgFinance();
		orgf.OrgFinancelocators();
			
	}  
}
