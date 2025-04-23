package collation.Organization;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import collation.Defender.BaseClassSetup;
import collation.Defender.locators.Organization.Organization;

public class OrganizationTest extends BaseClassSetup{

	Organization org;
	
	public OrganizationTest() {
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
	public void Organizationcreate() throws InterruptedException, IOException {
		org=new Organization();
		org.Organizationlocators();
	}
}
