package collation.Defender.locator.Event;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import collation.Defender.BaseClassSetup;
import collation.Defender.DropDown;

public class EventMaster extends BaseClassSetup {
	
	LoginPage log;
	DropDown eve;
	
	private By menu=By.xpath("//li[@id=\"menus\"]/a/span");	
	private By collation=By.xpath("//span[normalize-space()='Collation']");
	private By evenmaster=By.xpath("//a[@href='/collation/eventlist']//span[contains(text(),'Event')]");
	private By create=By.xpath("//a[normalize-space()='Create New']");
	private By location=By.xpath("//button[@title=\"Select Location\"]");
	private By accpet=By.xpath("//button[@title=\"Click to Select Record\"]");
	private By action=By.xpath("//kendo-textarea[@data-cy=\"actiontaken\"]");
	private By actiontext=By.xpath("//kendo-textarea[@data-cy=\"actiontaken\"]/textarea");
	private By save=By.xpath("//div[@class=\"ng-star-inserted\"]/button[@type=\"submit\"]");
	private By backbutton=By.xpath("//button[@title=\"Click to Go Back to List\"]/i");
	private By removegrading=By.xpath("//*[@data-cy=\"gradingtype\"]/span");
	private By arearemove=By.xpath("//*[@data-cy=\"areatype\"]/span");

public EventMaster() {
	PageFactory.initElements(driver, this);
}



public void evenlocators() throws InterruptedException {
	
	log=new LoginPage();
	eve=new DropDown();
	log.signin(prop.getProperty("username"), prop.getProperty("password"));
	Thread.sleep(1000);
	driver.findElement(menu).click();
	Thread.sleep(1000);
	driver.findElement(collation).click();
	Thread.sleep(1000);
	driver.findElement(evenmaster).click();
	Thread.sleep(1000);
	driver.findElement(create).click();
	Thread.sleep(1000);
	eve.kendosearchbar("areatype", "Jammu");
	Thread.sleep(2000); 
	eve.kendosearchbar("categorytype", "Thuraya Activities");
	Thread.sleep(1000);
	eve.kendosearchbar("eventsubcategoryid", "Extortion");
	Thread.sleep(1000);
	eve.kendosearchbar("eventnameid", "Arms deal in Mumbai");
	Thread.sleep(1000);	
	WebDriverWait wait = new WebDriverWait(driver, 30);
	WebElement field = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"eventdate\"]/button")));
	field.click();
	WebElement today = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//kendo-calendar-header/span/span[text()=' Today ']")));
	today.click();
	WebElement now = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//kendo-timeselector/div/button[@title=\"Select now\"]")));
	now.click();
	WebElement set = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/button[@title=\"Set\"]")));
	set.click();
	Thread.sleep(1000);
	driver.findElement(location).click();
	Thread.sleep(1000);
	eve.kendotextbox("Search...", "China");
	Thread.sleep(5000);
	driver.findElement(accpet).click();
	Thread.sleep(1000);
	eve.calender("reportdate", "28");
	Thread.sleep(1000);
	eve.kendosearchbar("reportingagencyid", "AP");
	Thread.sleep(1000);
	eve.kendosearchbar("gradingtype", "A1");
	Thread.sleep(1000);
	eve.kendosearchbar("hotindex", "Hot");
	Thread.sleep(1000);
	driver.findElement(action).click();
	driver.findElement(actiontext).sendKeys("TestCase1");
	Thread.sleep(1000);
	driver.findElement(save).click();
	Thread.sleep(3000);	
	eve.validate();
	Thread.sleep(3000);
	driver.findElement(backbutton).click();	
	Thread.sleep(1000);
	eve.kendodropdownlist("displayName", "Name");
	Thread.sleep(1000);
	eve.kendotextbox1("Search in selected column...", "Arms deal in Mumbai",1);
	Thread.sleep(1000);
	driver.findElement(removegrading).click();
	Thread.sleep(1000);
	eve.kendosearchbar("gradingtype", "A4");
	Thread.sleep(1000);
	driver.findElement(arearemove).click();
	Thread.sleep(3000);
	eve.kendosearchbar("areatype", "ROI");
	driver.findElement(save).click();
	eve.validate();
	
	
}
}