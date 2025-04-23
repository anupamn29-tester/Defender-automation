package collation.Defender.locator.Event;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import collation.Defender.BaseClassSetup;
import collation.Defender.DropDown;

public class LoginPage extends BaseClassSetup {
	
	DropDown eve;
	Dashboardlocators hom;
	
	private By usname=By.xpath("//*[@id=\"userName\"]");
	private By pass=By.xpath("//*[@type=\"password\"]");
	private By eyebutton=By.xpath("//*[@role=\"button\"]");
	private By submit=By.xpath("//*[@type=\"submit\"]");
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public void signin(String un, String ps) throws InterruptedException {
		hom=new Dashboardlocators();
		hom.locatorshome();
		eve=new DropDown();
		Thread.sleep(10000);
		driver.findElement(usname).sendKeys(un);
		Thread.sleep(1000);
		driver.findElement(pass).sendKeys(ps);
		Thread.sleep(1000);
		driver.findElement(eyebutton).click();
		Thread.sleep(1000);
		eve.kendosearchbar("tenantid","APT");
		Thread.sleep(1000);
		driver.findElement(submit).click();
		
	}  
	
}