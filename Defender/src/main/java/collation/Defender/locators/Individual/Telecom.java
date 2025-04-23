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

public class Telecom extends BaseClassSetup{

	LoginPage log;
	DropDown eve;
	DynamicSelectDropdown dndropdown;
	
	private By menu=By.xpath("//li[@id=\"menus\"]/a/span");	
	private By collation=By.xpath("//span[normalize-space()='Collation']");
	private By Individual=By.xpath("//span[normalize-space()='Individual Master']");
	private By inputsearch=By.xpath("//kendo-textbox[@placeholder=\"Search in selected column...\"]/input");
	private By edit=By.xpath("//button[@title=\"Edit Record\"]");
	private By phoneno=By.xpath("//input[@id='telecomno']");
	private By Imeino=By.xpath("//input[@id='imeino']");	
	private By Imsi=By.xpath("//input[@id='imsino']");
	private By ccode=By.xpath("//input[@id='countrycode']");
	private By ecode=By.xpath("//input[@id='exitcode']");
	private By save=By.xpath("(//button[@class='btn btn-theme form_button ms-3 ng-star-inserted'])[1]");
	private By clearptype=By.xpath("//span[@title=\"clear\"]");

	private By back=By.xpath("//button[@title=\"Click to Go Back to List\"]");
	
	
	public Telecom() {
		PageFactory.initElements(driver, this);
	}
	
	public void Telecomlocators() throws InterruptedException {
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
		Thread.sleep(500);
		dndropdown.autoselecttable(driver, "presentation", 10);
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
}
