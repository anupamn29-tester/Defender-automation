package collation.Individual;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import collation.Defender.BaseClassSetup;
import collation.Defender.locators.Individual.Artifacts;

public class ArtifactsTest extends BaseClassSetup{
	
	Artifacts art;
	
	public ArtifactsTest() {
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
	public void Artifactscreate() throws InterruptedException {
		art=new Artifacts();
		art.Artifactslocators();
		
		
}

}
