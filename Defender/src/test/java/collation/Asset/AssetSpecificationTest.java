package collation.Asset;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import collation.Defender.BaseClassSetup;
import collation.Defender.locators.Asset.AssetSpecification;

public class AssetSpecificationTest extends BaseClassSetup{
	
	AssetSpecification aps;
	
	public AssetSpecificationTest() {
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
	public void AssetSpecificationExecution() throws InterruptedException {

		aps=new AssetSpecification();
		aps.AssetSpecificationlocators();
	}

}
