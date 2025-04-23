package collation.Organization;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import collation.Defender.BaseClassSetup;
import collation.Defender.locators.Organization.OrgReferences;

public class OrgReferencesTest extends BaseClassSetup {

	OrgReferences ref;
	
	public OrgReferencesTest() {
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
	public void Referencescreate() throws InterruptedException, IOException {
		ref=new OrgReferences();
		ref.OrgReferenceslocators();		
}
}
