package collation.Organization;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import collation.Defender.BaseClassSetup;
import collation.Defender.locators.Organization.OrgAssociates;

public class OrgAssociatesTest extends BaseClassSetup{
	
	OrgAssociates Aso;
	
	public OrgAssociatesTest() {
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
	public void Associatescreate() throws InterruptedException, IOException {
		Aso=new OrgAssociates();
		Aso.OrgAssociateslocators();
		
		
}

}
