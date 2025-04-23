package collation.Defender.locators.Individual;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import collation.Defender.BaseClassSetup;
import collation.Defender.DropDown;
import collation.Defender.DynamicSelectDropdown;
import collation.Defender.locator.Event.LoginPage;

public class Locations extends BaseClassSetup {

	LoginPage log;
	DropDown eve;
	DynamicSelectDropdown dndropdown;
	
	private By menu=By.xpath("//li[@id=\"menus\"]/a/span");	
	private By collation=By.xpath("//span[normalize-space()='Collation']");
	private By Individual=By.xpath("//span[normalize-space()='Individual Master']");
	private By inputsearch=By.xpath("//kendo-textbox[@placeholder=\"Search in selected column...\"]/input");
	private By edit=By.xpath("//button[@title=\"Edit Record\"]");
	private By locationsearchbutton=By.xpath("//button[@title=\"Select Exisitng Location\"]");
	private By accpet=By.xpath("//button[normalize-space()='Accept']");
	private By presentlocation=By.xpath("(//tbody/tr)[3]");
	private By locationremove=By.xpath("//kendo-combobox[@data-cy=\"locationtype\"]/span");
	private By save=By.xpath("(//button[@class='btn btn-theme form_button ms-3 ng-star-inserted'])[1]");
	
	private By back=By.xpath("//button[@title=\"Click to Go Back to List\"]");

	
	public Locations() {
		PageFactory.initElements(driver, this);
	}
	
	public void locationlocators() throws InterruptedException {
		log=new LoginPage();
		eve=new DropDown();
		dndropdown=new DynamicSelectDropdown();
		//log.signin(prop.getProperty("username"), prop.getProperty("password"));
		WebDriverWait wait = new WebDriverWait(driver, 30);
		//WebElement menus = wait.until(ExpectedConditions.visibilityOfElementLocated(menu));
	    //menus.click();
	    //WebElement collations = wait.until(ExpectedConditions.visibilityOfElementLocated(collation));
	    //collations.click();
	    //WebElement Indivisuals = wait.until(ExpectedConditions.visibilityOfElementLocated(Individual));
	    //Indivisuals.click();   
		//eve.kendodropdownlist("displayName", "Name & Alias");
		//WebElement searchinput = wait.until(ExpectedConditions.visibilityOfElementLocated(inputsearch));
		//searchinput.click();
		//searchinput.sendKeys("p");
		
		//Extra added
		WebElement backbuttons = wait.until(ExpectedConditions.visibilityOfElementLocated(back));
		backbuttons.click();
		//End here
		
		WebElement edits = wait.until(ExpectedConditions.visibilityOfElementLocated(edit));
		edits.click();
		eve.kendotabstriptab("Locations");
		dndropdown.kendocombobox("locationtype");	
		eve.calender("lastlocatedon", "15");
		WebElement searchlocation = wait.until(ExpectedConditions.visibilityOfElementLocated(locationsearchbutton));
		searchlocation.click();
		Thread.sleep(1000);
		dndropdown.autoselecttable(driver, "presentation", 5);
		Thread.sleep(1000);
		dndropdown.clickWithRetry(driver, accpet);	
		WebElement savevalue = wait.until(ExpectedConditions.elementToBeClickable(save));
		savevalue.click();
		Thread.sleep(500);
//		eve.validate();	
		WebElement locationpresent = wait.until(ExpectedConditions.visibilityOfElementLocated(presentlocation));
		locationpresent.click();
		WebElement remlocation = wait.until(ExpectedConditions.visibilityOfElementLocated(locationremove));
		remlocation.click();
		dndropdown.kendocombobox("locationtype");
		WebElement savedata = wait.until(ExpectedConditions.visibilityOfElementLocated(save));
		savedata.click();
		//eve.validate();
	}
}
