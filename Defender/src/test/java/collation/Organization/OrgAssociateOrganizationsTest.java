package collation.Organization;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import collation.Defender.BaseClassSetup;
import collation.Defender.locators.Organization.OrgAssociateOrganizations;

public class OrgAssociateOrganizationsTest extends BaseClassSetup{
	
	OrgAssociateOrganizations orgas;
	
	public OrgAssociateOrganizationsTest() {
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
		orgas=new OrgAssociateOrganizations();
		orgas.OrgAssociateOrganizationslocators();
			
	}  

}
