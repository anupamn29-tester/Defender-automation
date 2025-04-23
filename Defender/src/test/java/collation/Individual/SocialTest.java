package collation.Individual;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import collation.Defender.BaseClassSetup;
import collation.Defender.locators.Individual.SocialMedia;

public class SocialTest extends BaseClassSetup{
	SocialMedia social;
	
	public SocialTest() {
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
	public void SocialMediacreate() throws InterruptedException {
		social=new SocialMedia();
		social.SocialMedialocators();
		
		
}
}
