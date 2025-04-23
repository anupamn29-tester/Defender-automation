package Utilities.Defender.Query;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utilities.DynamicQuery.OrganizationQuery;
import collation.Defender.BaseClassSetup;

public class OrganizationQueryTest extends BaseClassSetup  {
	
	OrganizationQuery orgquery;
	
	public OrganizationQueryTest() {
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

		orgquery=new OrganizationQuery();
		orgquery.Appearancelocators();
	}
}
