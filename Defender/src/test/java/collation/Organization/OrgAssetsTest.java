package collation.Organization;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import collation.Defender.BaseClassSetup;
import collation.Defender.locators.Organization.OrgAssets;

public class OrgAssetsTest extends BaseClassSetup{
	
	OrgAssets ast;
	
	public OrgAssetsTest() {
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
	public void Mediacreate() throws InterruptedException, IOException {
		ast=new OrgAssets();
		ast.OrgAssetslocators();
	}

}
