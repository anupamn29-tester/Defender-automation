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

public class OrgTelecom extends BaseClassSetup{
	LoginPage log;
	DropDown eve;
	DynamicSelectDropdown dndropdown;

//	private By menu=By.xpath("//li[@id=\"menus\"]/a/span");	
//	private By collation=By.xpath("//span[normalize-space()='Collation']");
//	private By Organization=By.xpath("//span[normalize-space()='Organization Master']");
	private By editselect=By.xpath("//i[@class='far fa-edit']");
//	private By inputsearch=By.xpath("//kendo-textbox[@placeholder=\"Search in selected column...\"]/input");
	private By phoneno=By.xpath("//input[@id='telecomno']");
	private By Imeino=By.xpath("//input[@id='imeino']");	
	private By Imsi=By.xpath("//input[@id='imsino']");
	private By ccode=By.xpath("//input[@id='countrycode']");
	private By ecode=By.xpath("//input[@id='exitcode']");
	private By save=By.xpath("//div[@class=\"ng-star-inserted\"]/button[@type=\"submit\"]");
	private By clearptype=By.xpath("//span[@title=\"clear\"]");

	private By back=By.xpath("//button[normalize-space()='Back To List']");
	
	public OrgTelecom() {
		PageFactory.initElements(driver, this);
	}
	
	public void OrgTelecomLocators() throws InterruptedException, IOException {
		
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
	  	eve.kendotabstriptab("Telecom");
	  	dndropdown.kendocombobox("telecomtype");
        long randomNumber = (long) (Math.random() * 9_000_000_000L) + 1_000_000_000L;
        Assert.assertTrue(String.valueOf(randomNumber).length() == 10, "Generated number is not a 10-digit number");
        String Phone=String.valueOf(randomNumber);
        String IMEI=String.valueOf(randomNumber);
        String IMSI=String.valueOf(randomNumber);
		WebElement phone = wait.until(ExpectedConditions.visibilityOfElementLocated(phoneno));
		phone.clear();
		phone.sendKeys(Phone);
		WebElement Imei = wait.until(ExpectedConditions.visibilityOfElementLocated(Imeino));
		Imei.clear();
		Imei.sendKeys(IMEI);
		WebElement Ims = wait.until(ExpectedConditions.visibilityOfElementLocated(Imsi));
		Ims.clear();
		Ims.sendKeys(IMSI);
		WebElement code = wait.until(ExpectedConditions.visibilityOfElementLocated(ccode));
		code.clear();
		code.sendKeys(eve.random());
		WebElement ecod = wait.until(ExpectedConditions.visibilityOfElementLocated(ecode));
		ecod.clear();
		ecod.sendKeys(eve.random());
		WebElement saveall = wait.until(ExpectedConditions.visibilityOfElementLocated(save));
		saveall.click();
		//eve.validate();
		Thread.sleep(1000);
		dndropdown.autoselecttable(driver, "presentation", 5);
		WebElement typeclear = wait.until(ExpectedConditions.visibilityOfElementLocated(clearptype));
		typeclear.click();
		dndropdown.kendocombobox("telecomtype");
		WebElement phno = wait.until(ExpectedConditions.visibilityOfElementLocated(phoneno));
		phno.clear();
		phno.sendKeys(Phone);
		WebElement savedata = wait.until(ExpectedConditions.visibilityOfElementLocated(save));
		savedata.click();
		//eve.validate();
		
	}
	catch (Exception e) {
	    File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(screenshot, new File("screenshots/failure_" + System.currentTimeMillis() + ".png"));
	    e.printStackTrace();
	}
	}
}
