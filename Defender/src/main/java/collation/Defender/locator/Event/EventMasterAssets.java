package collation.Defender.locator.Event;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import collation.Defender.BaseClassSetup;
import collation.Defender.DropDown;

public class EventMasterAssets extends BaseClassSetup{
	
//	LoginPage log;
	DropDown eve; 
	
	private By menu=By.xpath("//li[@id=\"menus\"]/a/span");	
	private By collation=By.xpath("//span[normalize-space()='Collation']");
	private By evenmaster=By.xpath("//a[@href='/collation/eventlist']//span[contains(text(),'Event')]");
	private By save=By.xpath("//div[@class=\"ng-star-inserted\"]/button[@type=\"submit\"]");
	private By clearfield=By.xpath("//*[@data-cy=\"assettype\"]/span");
	private By presentorg=By.xpath("(//tbody/tr)[1]");
	
	public EventMasterAssets() {
		PageFactory.initElements(driver, this);
	}

	public void Assetslocators() throws InterruptedException {
//		log=new LoginPage();
		eve=new DropDown();
//		log.signin(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(1000);
		driver.findElement(menu).click();
//		driver.findElement(collation).click();
		driver.findElement(evenmaster).click();
		Thread.sleep(5000);
		eve.kendodropdownlist("displayName", "Name");
		Thread.sleep(1000);
		eve.kendotextbox1("Search in selected column...", "Arms deal in Mumbai",1);
		Thread.sleep(1000);
		eve.kendotabstriptab("Assets");
		Thread.sleep(1000);
		eve.kendosearchbar("assettype", "Cash");
		Thread.sleep(1000);
		eve.kendodropdowntree("assetcategory", "Cash 2");
		Thread.sleep(1000);
		eve.kendosearchbar("assetid", "Bundle");
		Thread.sleep(1000);
		eve.kendosearchbar("assetstatus", "Order");
		Thread.sleep(1000);
		eve.calender("statusdate", "15");
		Thread.sleep(1000);
		driver.findElement(save).click();
		eve.validate();
		Thread.sleep(4000);
		driver.findElement(presentorg).click();
		Thread.sleep(1000);
		driver.findElement(clearfield).click();
		eve.kendosearchbar("assettype", "Conventional");
		Thread.sleep(1000);
		eve.kendodropdowntree("assetcategory", "Vehicle");
		Thread.sleep(2000);
		eve.kendosearchbar("assetid", "Bullet Proof Car");
		driver.findElement(save).click();
		eve.validate();	
	}
}
