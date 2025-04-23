package collation.Organization;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import collation.Defender.BaseClassSetup;
import collation.Defender.locators.Organization.OrgMedia;

public class OrgMediaTest extends BaseClassSetup{
	
	OrgMedia orgm;
	
	public OrgMediaTest() {
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
		orgm=new OrgMedia();
		orgm.OrgMedialocators();
			
	}  

}
