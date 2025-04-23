package collation.Defender.locator.Event;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import collation.Defender.BaseClassSetup;
import collation.Defender.DropDown;

public class EventMasterReferences extends BaseClassSetup {
//	LoginPage log;
	DropDown eve;
	private By menu=By.xpath("//li[@id=\"menus\"]/a/span");	
	private By collation=By.xpath("//span[normalize-space()='Collation']");
	private By evenmaster=By.xpath("//a[@href='/collation/eventlist']//span[contains(text(),'Event')]");
	private By refnumber=By.xpath("//*[@data-cy=\"entityreference\"]");
	private By Refersearchbutton=By.xpath("(//table/tbody//tr)[1]");
	private By Reftype=By.xpath("//kendo-combobox[@data-cy=\"entityreferencetype\"]/span");
	private By save=By.xpath("//div[@class=\"ng-star-inserted\"]/button[@type=\"submit\"]");
	public EventMasterReferences() {
		PageFactory.initElements(driver, this);
		
	}
	
	public void Referenceslocators() throws InterruptedException {
//		log=new LoginPage();
		eve=new DropDown();
//		log.signin(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(1000);
		driver.findElement(menu).click();
		Thread.sleep(1000);
//		driver.findElement(collation).click();
		Thread.sleep(1000);
		driver.findElement(evenmaster).click();
		Thread.sleep(1000);
		eve.kendodropdownlist("displayName", "Name");
		Thread.sleep(1000);
		eve.kendotextbox1("Search in selected column...", "Arms deal in Mumbai",1);
		Thread.sleep(1000);
		eve.kendotabstriptab("References");
		Thread.sleep(1000);
		eve.kendosearchbar("entityreferencetype", "GD");
		Thread.sleep(1000);
		driver.findElement(refnumber).click();
		driver.findElement(refnumber).sendKeys(eve.random());
		Thread.sleep(1000);
		eve.calender("referencedate", "21");
		Thread.sleep(2000);
		driver.findElement(save).click();
		eve.validate();
		Thread.sleep(3000);
		driver.findElement(Refersearchbutton).click();
		Thread.sleep(3000);
		driver.findElement(Reftype).click();
		eve.kendosearchbar("entityreferencetype", "Case");
		Thread.sleep(3000);
		driver.findElement(refnumber).click();
		driver.findElement(refnumber).clear();
		Thread.sleep(1000);
		driver.findElement(refnumber).sendKeys(eve.random());
		driver.findElement(save).click();
		eve.validate();
	}

}
