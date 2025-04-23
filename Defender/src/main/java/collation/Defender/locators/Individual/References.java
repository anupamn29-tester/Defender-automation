package collation.Defender.locators.Individual;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import collation.Defender.BaseClassSetup;
import collation.Defender.DropDown;
import collation.Defender.DynamicSelectDropdown;
import collation.Defender.locator.Event.LoginPage;

public class References extends BaseClassSetup{
	LoginPage log;
	DropDown eve;
	DynamicSelectDropdown dndropdown;
	
	private By menu=By.xpath("//li[@id=\"menus\"]/a/span");	
	private By collation=By.xpath("//span[normalize-space()='Collation']");
	private By Individual=By.xpath("//span[normalize-space()='Individual Master']");
	private By inputsearch=By.xpath("//kendo-textbox[@placeholder=\"Search in selected column...\"]/input");
	private By edit=By.xpath("//button[@title=\"Edit Record\"]");
	private By refno=By.xpath("//input[@data-cy=\"entityreference\"]");
	private By save=By.xpath("//button[@class='btn btn-theme form_button ms-3 ng-star-inserted']");
	private By clearptype=By.xpath("//span[@title=\"clear\"]");
	
	private By back=By.xpath("//button[@title=\"Click to Go Back to List\"]");
	
	public References() {
		PageFactory.initElements(driver, this);
	}
	
	public void Referenceslocators() throws InterruptedException {
		log=new LoginPage();
		eve=new DropDown();
		dndropdown=new DynamicSelectDropdown();
		//log.signin(prop.getProperty("username"), prop.getProperty("password"));
		WebDriverWait wait = new WebDriverWait(driver, 30);
//		wait.until(ExpectedConditions.presenceOfElementLocated(menu));
//        WebElement menus = wait.until(ExpectedConditions.visibilityOfElementLocated(menu));
//        menus.click();
//        WebElement collations = wait.until(ExpectedConditions.visibilityOfElementLocated(collation));
//        collations.click();
//        WebElement Indivisuals = wait.until(ExpectedConditions.visibilityOfElementLocated(Individual));
//        Indivisuals.click();       
//        eve.kendodropdownlist("displayName", "Name & Alias");   
//		WebElement inputsearchs = wait.until(ExpectedConditions.visibilityOfElementLocated(inputsearch));
//		inputsearchs.click();
//		inputsearchs.sendKeys("p");
		
		//Extra added
				WebElement backbuttons = wait.until(ExpectedConditions.visibilityOfElementLocated(back));
				backbuttons.click();
		//End here
		
		WebElement edits = wait.until(ExpectedConditions.visibilityOfElementLocated(edit));
		edits.click();
		eve.kendotabstriptab("References");
		dndropdown.kendocombobox("entityreferencetype");
		WebElement refnoField = wait.until(ExpectedConditions.visibilityOfElementLocated(refno));
		refnoField.sendKeys(eve.random());
		eve.calender("referencedate", "15");
		WebElement savebutton = wait.until(ExpectedConditions.visibilityOfElementLocated(save));
		savebutton.click();
		Thread.sleep(500);
//		eve.validate();
		dndropdown.autoselecttable(driver, "presentation", 3);
		WebElement cleararea = wait.until(ExpectedConditions.visibilityOfElementLocated(clearptype));
		cleararea.click();
		dndropdown.kendocombobox("entityreferencetype");
		WebElement refnoagain = wait.until(ExpectedConditions.visibilityOfElementLocated(refno));
		refnoagain.clear();
		refnoagain.sendKeys(eve.random());
		WebElement savebutton1 = wait.until(ExpectedConditions.visibilityOfElementLocated(save));
		savebutton1.click();
		//eve.validate();
	}
	}
