package collation.Organization;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import collation.Defender.BaseClassSetup;
import collation.Defender.locators.Organization.OrgArtifacts;

public class OrgArtifactsTest extends BaseClassSetup{

	OrgArtifacts art;
	
	public OrgArtifactsTest() {
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
	public void Artifactscreate() throws InterruptedException, IOException {
		art=new OrgArtifacts();
		art.OrgArtifactslocators();
	}
}
