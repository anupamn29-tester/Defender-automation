package collation.Defender.locator.Event;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import collation.Defender.BaseClassSetup;
import collation.Defender.DropDown;

public class EventMasterAssociates extends BaseClassSetup {
//	LoginPage log;
	DropDown eve;
	
	private By menu=By.xpath("//li[@id=\"menus\"]/a/span");	
	private By collation=By.xpath("//span[normalize-space()='Collation']");
	private By evenmaster=By.xpath("//a[@href='/collation/eventlist']//span[contains(text(),'Event')]");
	private By individualsearchbutton=By.xpath("//button[@title=\"Select Exisitng Individual\"]");
	private By Assosearchbutton=By.xpath("(//table/tbody//tr)[1]");
	private By removeentity=By.xpath("//*[@data-cy=\"entityrelationtype\"]/span");
	private By save=By.xpath("//div[@class=\"ng-star-inserted\"]/button[@type=\"submit\"]");
	
	
	public EventMasterAssociates() {
		PageFactory.initElements(driver, this);
	}
	
	public void evenmasterlocator() throws InterruptedException {
//		log=new LoginPage();
		eve=new DropDown();
//		log.signin(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(1000);
		driver.findElement(menu).click();
//		driver.findElement(collation).click();
		driver.findElement(evenmaster).click();
		Thread.sleep(1000);
		eve.kendodropdownlist("displayName", "Name");
		Thread.sleep(1000);
		eve.kendotextbox1("Search in selected column...", "Arms deal in Mumbai",1);
		Thread.sleep(1000);
		eve.kendotabstriptab("Associates");
		Thread.sleep(1000);
		driver.findElement(individualsearchbutton).click();
		Thread.sleep(1000);
		eve.kendodropdownlist("displayName", "Name & Alias");
		Thread.sleep(1000);
		eve.kendotextbox2("Search in selected column...", "Abdul");
		Thread.sleep(1000);
		eve.calender("linkdate", "29");
		Thread.sleep(1000);
		eve.kendosearchbar("entityrelationtype", "Tele");
		Thread.sleep(1000);
		driver.findElement(save).click();
		eve.validate();
		Thread.sleep(1000);
		driver.findElement(Assosearchbutton).click();
		Thread.sleep(1000);
		driver.findElement(removeentity).click();
		Thread.sleep(1000);
		eve.kendosearchbar("entityrelationtype", "Fina");
		driver.findElement(save).click();
		eve.validate();
		Thread.sleep(1000);
		
		
	}
}
