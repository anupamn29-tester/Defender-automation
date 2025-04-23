package collation.Defender.locator.Event;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import collation.Defender.BaseClassSetup;
import collation.Defender.DropDown;

public class EventMasterLocations extends BaseClassSetup {
		
//	LoginPage log;
	DropDown eve;
	private By menu=By.xpath("//li[@id=\"menus\"]/a/span");	
	private By collation=By.xpath("//span[normalize-space()='Collation']");
	private By evenmaster=By.xpath("//a[@href='/collation/eventlist']//span[contains(text(),'Event')]");
	private By locationsearchbutton=By.xpath("//button[@title=\"Select Exisitng Location\"]");
	private By accpet=By.xpath("//button[@title=\"Click to Select Record\"]");
	private By presentlocation=By.xpath("(//tbody/tr)[3]");
	private By locationremove=By.xpath("//kendo-combobox[@data-cy=\"locationtype\"]/span");
	private By save=By.xpath("//div[@class=\"ng-star-inserted\"]/button[@type=\"submit\"]");
	
	public EventMasterLocations() {
		PageFactory.initElements(driver, this);
	}
	
	public void locdetails() throws InterruptedException {
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
		eve.kendotabstriptab("Locations");
		Thread.sleep(1000);
		eve.kendosearchbar("locationtype", "Tele");
		eve.calender("lastlocatedon", "15");
		Thread.sleep(1000);
		driver.findElement(locationsearchbutton).click();
		Thread.sleep(1000);
		eve.kendotextbox("Search...", "China");
		Thread.sleep(5000);
		driver.findElement(accpet).click();
		Thread.sleep(1000);
		driver.findElement(save).click();
		eve.validate();
		Thread.sleep(1000);
		driver.findElement(presentlocation).click();
		Thread.sleep(1000);
		driver.findElement(locationremove).click();
		eve.kendosearchbar("locationtype", "Safe");
		Thread.sleep(1000);
		driver.findElement(save).click();
		eve.validate();
		
		
		
	}

}
