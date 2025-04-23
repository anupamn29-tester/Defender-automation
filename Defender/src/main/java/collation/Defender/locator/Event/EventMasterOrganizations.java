package collation.Defender.locator.Event;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import collation.Defender.BaseClassSetup;
import collation.Defender.DropDown;

public class EventMasterOrganizations extends BaseClassSetup{
	
//	LoginPage log;
	DropDown eve;
	
	private By menu=By.xpath("//li[@id=\"menus\"]/a/span");	
	private By collation=By.xpath("//span[normalize-space()='Collation']");
	private By evenmaster=By.xpath("//a[@href='/collation/eventlist']//span[contains(text(),'Event')]");
	private By Organizationssearchbutton=By.xpath("//button[@title=\"Select Exisitng Organization\"]");
	private By presentorg=By.xpath("(//tbody/tr)[1]");
	private By removeasso=By.xpath("//*[@data-cy=\"entityrelationtype\"]/span");
	private By save=By.xpath("//div[@class=\"ng-star-inserted\"]/button[@type=\"submit\"]");
	
	public EventMasterOrganizations() {
		PageFactory.initElements(driver, this);
	}
	
	public void organizationlocators() throws InterruptedException {
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
		eve.kendotabstriptab("Organizations");
		Thread.sleep(1000);
		driver.findElement(Organizationssearchbutton).click();
		Thread.sleep(1000);
		eve.kendodropdownlist("displayName", "Type");
		Thread.sleep(1000);
		eve.kendotextbox2("Search in selected column...", "Terrorist");
		Thread.sleep(1000);
		eve.calender("linkdate", "22");
		Thread.sleep(1000);
		eve.kendosearchbar("entityrelationtype", "Intellige");
		Thread.sleep(1000);
		driver.findElement(save).click();
		eve.validate();
		Thread.sleep(1000);
		driver.findElement(presentorg).click();
		Thread.sleep(1000);
		driver.findElement(removeasso).click();
		Thread.sleep(1000);
		eve.kendosearchbar("entityrelationtype", "Fin");
		Thread.sleep(1000);
		driver.findElement(save).click();
		eve.validate();
		
		
	}

}
