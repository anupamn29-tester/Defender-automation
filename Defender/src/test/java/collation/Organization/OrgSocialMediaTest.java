package collation.Organization;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import collation.Defender.BaseClassSetup;
import collation.Defender.locators.Organization.OrgSocialMedia;

public class OrgSocialMediaTest extends BaseClassSetup{

	OrgSocialMedia social;
	
	public OrgSocialMediaTest() {
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
	public void SocialMediacreate() throws InterruptedException, IOException {
		social=new OrgSocialMedia();
		social.OrgSocialMedialocators();
		
		
}
}
