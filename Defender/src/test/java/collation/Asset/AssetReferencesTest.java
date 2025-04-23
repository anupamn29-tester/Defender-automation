package collation.Asset;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import collation.Defender.BaseClassSetup;
import collation.Defender.locators.Asset.AssetReferences;

public class AssetReferencesTest extends BaseClassSetup{

	AssetReferences arf;
	
	
	public AssetReferencesTest() {
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
	public void AssetCreateExecution() throws InterruptedException {

		arf=new AssetReferences();
		arf.AssetReferenceslocators();
	}

}
