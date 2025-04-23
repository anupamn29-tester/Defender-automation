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

public class Organizations extends BaseClassSetup{
	LoginPage log;
	DropDown eve;
	DynamicSelectDropdown dndropdown;
	
	private By menu=By.xpath("//li[@id=\"menus\"]/a/span");	
	private By collation=By.xpath("//span[normalize-space()='Collation']");
	private By Individual=By.xpath("//span[normalize-space()='Individual Master']");
	private By inputsearch=By.xpath("//kendo-textbox[@placeholder=\"Search in selected column...\"]/input");
	private By edit=By.xpath("//button[@title=\"Edit Record\"]");
	private By Exisitngbutton=By.xpath("//button[@title='Select Exisitng Organization']");
	private By save=By.xpath("(//button[@class='btn btn-theme form_button ms-3 ng-star-inserted'])[1]");
	private By orgedit=By.xpath("//tbody[@role=\"presentation\"]/tr[2]");
	private By clearasso=By.xpath("//span[@title='clear']");
	
	private By back=By.xpath("//button[@title=\"Click to Go Back to List\"]");
	
	public Organizations() {
		PageFactory.initElements(driver, this);
	}
	
	public void Organizationslocators() throws InterruptedException {
		log=new LoginPage();
		eve=new DropDown();
		dndropdown=new DynamicSelectDropdown();
		//log.signin(prop.getProperty("username"), prop.getProperty("password"));
		WebDriverWait wait = new WebDriverWait(driver, 30);
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
		eve.kendotabstriptab("Organizations");
		WebElement Exisitng = wait.until(ExpectedConditions.visibilityOfElementLocated(Exisitngbutton));
		Exisitng.click();
		Thread.sleep(1000);
		dndropdown.autoselecttable(driver, "presentation", 3);
		eve.calender("linkdate", "16");
		dndropdown.kendocombobox("entityrelationtype");
//		dndropdown.calender();
//		eve.calender("linkdate", "16");
		WebElement saves = wait.until(ExpectedConditions.visibilityOfElementLocated(save));
		saves.click();
//		eve.validate();
		WebElement orgclick = wait.until(ExpectedConditions.visibilityOfElementLocated(orgedit));
		orgclick.click();
		WebElement assoclear = wait.until(ExpectedConditions.visibilityOfElementLocated(clearasso));
		assoclear.click();
		dndropdown.kendocombobox("entityrelationtype");
		WebElement savedata = wait.until(ExpectedConditions.visibilityOfElementLocated(save));
		savedata.click();
		//eve.validate();
		
}
}
