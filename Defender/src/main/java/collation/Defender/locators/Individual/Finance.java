package collation.Defender.locators.Individual;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import collation.Defender.BaseClassSetup;
import collation.Defender.DropDown;
import collation.Defender.DynamicSelectDropdown;
import collation.Defender.locator.Event.LoginPage;

public class Finance extends BaseClassSetup{
	LoginPage log;
	DropDown eve;
	DynamicSelectDropdown dndropdown;
	
	private By menu=By.xpath("//li[@id=\"menus\"]/a/span");	
	private By collation=By.xpath("//span[normalize-space()='Collation']");
	private By Individual=By.xpath("//span[normalize-space()='Individual Master']");
	private By inputsearch=By.xpath("//kendo-textbox[@placeholder=\"Search in selected column...\"]/input");
	private By edit=By.xpath("//button[@title=\"Edit Record\"]");
	private By AcNumber=By.xpath("//input[@id='accountno']");
	private By cusno=By.xpath("//input[@id='consumerno']");
	private By save=By.xpath("(//button[@class='btn btn-theme form_button ms-3 ng-star-inserted'])[1]");
	private By clearptype=By.xpath("//kendo-combobox[@id='banknameid']//span[@class='k-icon k-i-x']");
	private By cleartype1=By.xpath("//kendo-combobox[@id='hotindex']//span[@class='k-icon k-i-x']");
	
	private By back=By.xpath("//button[@title=\"Click to Go Back to List\"]");
	
	public Finance() {
		PageFactory.initElements(driver, this);
	}
	public void Financelocators() throws InterruptedException {
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
		eve.kendotabstriptab("Finance");
		dndropdown.kendocombobox("banknameid");
		dndropdown.kendocombobox("accounttype");
		long randomNumber = (long) (Math.random() * 9_000_000_000L) + 1_000_000_000L;
        Assert.assertTrue(String.valueOf(randomNumber).length() == 10, "Generated number is not a 10-digit number");
        String accnum=String.valueOf(randomNumber);
        String customnum=String.valueOf(randomNumber);
        WebElement accountnum = wait.until(ExpectedConditions.visibilityOfElementLocated(AcNumber));
        accountnum.clear();
        accountnum.sendKeys(accnum);
        WebElement cusnum = wait.until(ExpectedConditions.visibilityOfElementLocated(cusno));
        cusnum.clear();
        cusnum.sendKeys(customnum);
        dndropdown.kendocombobox("hotindex");
        WebElement saveall = wait.until(ExpectedConditions.visibilityOfElementLocated(save));
		saveall.click();
		//eve.validate();
		Thread.sleep(1000);
		dndropdown.autoselecttable(driver, "presentation", 3);
		WebElement cleararea = wait.until(ExpectedConditions.visibilityOfElementLocated(clearptype));
		cleararea.click();
		dndropdown.kendocombobox("banknameid");
		dndropdown.kendocombobox("hotindex");
		WebElement savealls = wait.until(ExpectedConditions.visibilityOfElementLocated(save));
		savealls.click();
		//eve.validate();
}
}
