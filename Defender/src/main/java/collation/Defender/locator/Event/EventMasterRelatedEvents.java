package collation.Defender.locator.Event;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import collation.Defender.BaseClassSetup;
import collation.Defender.DropDown;

public class EventMasterRelatedEvents extends BaseClassSetup {
//	LoginPage log;
	DropDown eve;
	private By menu=By.xpath("//li[@id=\"menus\"]/a/span");	
	private By collation=By.xpath("//span[normalize-space()='Collation']");
	private By evenmaster=By.xpath("//a[@href='/collation/eventlist']//span[contains(text(),'Event')]");
	private By eventsearchbutton=By.xpath("//button[@title=\"Select Exisitng Event\"]");
	private By presentlocation=By.xpath("(//tbody/tr)[2]");
	private By removeasso=By.xpath("//*[@data-cy=\"entityrelationtype\"]/span");
	private By save=By.xpath("//div[@class=\"ng-star-inserted\"]/button[@type=\"submit\"]");
	
	public EventMasterRelatedEvents() {
		PageFactory.initElements(driver, this);
	}
	
	public void RelatedEventslocators() throws InterruptedException {
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
		eve.kendotabstriptab("Related Events");
		Thread.sleep(1000);
		driver.findElement(eventsearchbutton).click();
		Thread.sleep(3000);
		eve.kendodropdownlist("displayName", "Name");
		Thread.sleep(3000);
		eve.kendotextbox2("Search in selected column...", "Common");
		eve.calender("linkdate", "15");
		Thread.sleep(1000);
		eve.kendosearchbar("entityrelationtype", "Inte");
		driver.findElement(save).click();
		Thread.sleep(1000);
		eve.validate();
		driver.findElement(presentlocation).click();
		Thread.sleep(1000);
		driver.findElement(removeasso).click();
		Thread.sleep(1000);
		eve.kendosearchbar("entityrelationtype", "Fina");
		Thread.sleep(1000);
		driver.findElement(save).click();
		eve.validate();
		

}
}
