package collation.Defender.locators.Organization;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import collation.Defender.BaseClassSetup;
import collation.Defender.DropDown;
import collation.Defender.DynamicSelectDropdown;
import collation.Defender.locator.Event.LoginPage;

public class OrgFinance extends BaseClassSetup{

	LoginPage log;
	DropDown eve;
	DynamicSelectDropdown dndropdown;
	
//	private By menu=By.xpath("//li[@id=\"menus\"]/a/span");	
//	private By collation=By.xpath("//span[normalize-space()='Collation']");
//	private By Organization=By.xpath("//span[normalize-space()='Organization Master']");
	private By editselect=By.xpath("//i[@class='far fa-edit']");
//	private By inputsearch=By.xpath("//kendo-textbox[@placeholder=\"Search in selected column...\"]/input");
	private By AcNumber=By.xpath("//input[@id='accountno']");
	private By cusno=By.xpath("//input[@id='consumerno']");
	private By save=By.xpath("//div[@class=\"ng-star-inserted\"]/button[@type=\"submit\"]");
	private By clearptype=By.xpath("//kendo-combobox[@id='banknameid']//span[@class='k-icon k-i-x']");
	private By cleartype1=By.xpath("//kendo-combobox[@id='hotindex']//span[@class='k-icon k-i-x']");
	
	private By back=By.xpath("//button[normalize-space()='Back To List']");
	
	
	public OrgFinance() {
		PageFactory.initElements(driver, this);
	}
	
	public void OrgFinancelocators() throws InterruptedException, IOException {
		
		try {
		log=new LoginPage();
		eve=new DropDown();
		dndropdown=new DynamicSelectDropdown();
//		log.signin(prop.getProperty("username"), prop.getProperty("password"));
		WebDriverWait wait = new WebDriverWait(driver, 30);
//		WebElement menus = wait.until(ExpectedConditions.visibilityOfElementLocated(menu));
//	    menus.click();
//	    WebElement collations = wait.until(ExpectedConditions.visibilityOfElementLocated(collation));
//	    collations.click();
//	    WebElement Organizations = wait.until(ExpectedConditions.visibilityOfElementLocated(Organization));
//	    Organizations.click();  
//	    eve.kendodropdownlist("displayName", "Name & Alias");
//	  	WebElement searchinput = wait.until(ExpectedConditions.visibilityOfElementLocated(inputsearch));
//	  	searchinput.click();
//	  	searchinput.sendKeys("Abdullah Azzam Brigades-Personnel");
		
		//Extra added
		WebElement backbuttons = wait.until(ExpectedConditions.visibilityOfElementLocated(back));
		backbuttons.click();
		//End here
		
	  	WebElement editinput = wait.until(ExpectedConditions.visibilityOfElementLocated(editselect));
	  	editinput.click();
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
        WebElement saveall = wait.until(ExpectedConditions.elementToBeClickable(save));
		saveall.click();
		//eve.validate();
		Thread.sleep(1000);
		dndropdown.autoselecttable(driver, "presentation", 5);
		WebElement cleararea = wait.until(ExpectedConditions.visibilityOfElementLocated(clearptype));
		cleararea.click();
		dndropdown.kendocombobox("banknameid");
		WebElement clearareas = wait.until(ExpectedConditions.visibilityOfElementLocated(cleartype1));
		clearareas.click();
		dndropdown.kendocombobox("hotindex");
		WebElement savealls = wait.until(ExpectedConditions.visibilityOfElementLocated(save));
		savealls.click();
		//eve.validate();
		
	    
		}
			catch (Exception e) {
			    File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			    FileUtils.copyFile(screenshot, new File("screenshots/failure_" + System.currentTimeMillis() + ".png"));
			    e.printStackTrace();
			}
	}
}
