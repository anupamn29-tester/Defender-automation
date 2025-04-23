package collation.Asset;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import collation.Defender.BaseClassSetup;
import collation.Defender.locators.Asset.AssetCreate;

public class AssetCreateTest extends BaseClassSetup{
	
	AssetCreate apc;
	
	public AssetCreateTest() {
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

		apc=new AssetCreate();
		apc.AssetCreatelocators();
	}

}
