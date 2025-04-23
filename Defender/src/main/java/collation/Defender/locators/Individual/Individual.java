package collation.Defender.locators.Individual;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import collation.Defender.BaseClassSetup;
import collation.Defender.DropDown;
import collation.Defender.DynamicSelectDropdown;
import collation.Defender.locator.Event.LoginPage;

public class Individual extends BaseClassSetup {
	LoginPage log;
	DropDown eve;
	DynamicSelectDropdown dndropdown;
	
	String fna;
	String lna;
	
	private By menu=By.xpath("//li[@id=\"menus\"]/a/span");	
	private By collation=By.xpath("//span[normalize-space()='Collation']");
	private By Individual=By.xpath("//a[@href='/collation/individuallist']//span[contains(text(),'Individual')]");
	private By create=By.xpath("//a[normalize-space()='Create New']");
	private By fname=By.xpath("//kendo-autocomplete[@data-cy=\"firstname\"]/kendo-searchbar/input");
	private By lname=By.xpath("//input[@data-cy=\"lastname\"]");
	private By fathername=By.xpath("(//button[@title='Select Exisitng Individual'])[1]");
	private By org=By.xpath("//button[@title=\"Select Exisitng Organization\"]");
	private By address=By.xpath("(//button[@title='Select Location'])[1]");
	private By accpet=By.xpath("//button[@title=\"Click to Select Record\"]");
	private By tracebil=By.xpath("//button[@title=\"Tracebility Details\"]");
	private By pob=By.xpath("(//button[@title='Select Location'])[2]");
	private By Alias=By.xpath("//button[@title=\"Alias Details\"]");
	private By AddNew=By.xpath("//button[@title=\"Click to Add New Record\"]");
	private By Aliasadd=By.xpath("//tbody/tr[1]/td[1]/input[1]");
	private By Aliasrem=By.xpath("//kendo-textarea[@name=\"remarks\"]/textarea");
	private By Added=By.xpath("//button[@title='Click to Add/Update record']");
	private By ok=By.xpath("//button[normalize-space()='OK']");	
	private By Spouse=By.xpath("(//button[@title='Select Exisitng Individual'])[2]");
	private By Nationality=By.xpath("//input[@id='nationality']");
	private By religion=By.xpath("//input[@id='religion']");
	private By cast=By.xpath("//input[@id='caste']");
	private By save=By.xpath("(//button[@class='btn btn-theme form_button ms-3 ng-star-inserted'])[1]");
	private By back=By.xpath("//button[@title=\"Click to Go Back to List\"]");
	private By inputsearch=By.xpath("//kendo-textbox[@placeholder=\"Search in selected column...\"]/input");
	
	private By edit=By.xpath("//button[@title=\"Edit Record\"]");
	private By indexrem=By.xpath("//span[@aria-hidden=\"true\"]");
	
	
	public Individual() {
		PageFactory.initElements(driver, this);
	}
	
	public void Individuallocators() throws InterruptedException {
		log=new LoginPage();
		eve=new DropDown();
		dndropdown=new DynamicSelectDropdown();
		log.signin(prop.getProperty("username"), prop.getProperty("password"));
		WebDriverWait wait = new WebDriverWait(driver, 30);		
		dndropdown.clickWithRetry(driver, menu);
	    WebElement collations = wait.until(ExpectedConditions.visibilityOfElementLocated(collation));
	    collations.click();
	    WebElement Indivisuals = wait.until(ExpectedConditions.visibilityOfElementLocated(Individual));
	    Indivisuals.click();   
	    WebElement createind = wait.until(ExpectedConditions.visibilityOfElementLocated(create));
	    createind.click(); 
		dndropdown.kendodropdownlist("salutation");
		WebElement firstname = wait.until(ExpectedConditions.visibilityOfElementLocated(fname));
		firstname.click();
		this.fna=DynamicSelectDropdown.name();
		this.lna=DynamicSelectDropdown.name();
		System.out.println(fna);
		System.out.println(lna);
		WebElement firstnamesend = wait.until(ExpectedConditions.visibilityOfElementLocated(fname));
		firstnamesend.sendKeys(fna);
		firstnamesend.sendKeys(Keys.ENTER);
		WebElement lastnamesend = wait.until(ExpectedConditions.visibilityOfElementLocated(lname));
		lastnamesend.sendKeys(lna);
		lastnamesend.sendKeys(Keys.ENTER);
		WebElement parentname = wait.until(ExpectedConditions.visibilityOfElementLocated(fathername));
		parentname.click();
		Thread.sleep(3000);
		dndropdown.autoselecttable(driver, "presentation", 3);
		WebElement organization = wait.until(ExpectedConditions.visibilityOfElementLocated(org));
		organization.click();
		Thread.sleep(3000);
		dndropdown.autoselecttable(driver, "presentation", 3);
		WebElement addr = wait.until(ExpectedConditions.visibilityOfElementLocated(address));
		addr.click();
		Thread.sleep(3000);
		dndropdown.autoselecttable(driver, "presentation", 3);
		WebElement accpeted = wait.until(ExpectedConditions.visibilityOfElementLocated(accpet));
		Thread.sleep(100);
		accpeted.click();
		WebElement traceability = wait.until(ExpectedConditions.visibilityOfElementLocated(tracebil));
		traceability.click();
		dndropdown.Addnewrecords();
		dndropdown.kendocombobox("hotindex");
		dndropdown.calender();
		dndropdown.kendodropdownlist("sex");
		WebElement PlaceofBirth = wait.until(ExpectedConditions.visibilityOfElementLocated(pob));
		PlaceofBirth.click();
		Thread.sleep(3000);
		dndropdown.autoselecttable(driver, "presentation", 3);
		WebElement Accept = wait.until(ExpectedConditions.visibilityOfElementLocated(accpet));
		Accept.click();
		WebElement Aliasadded = wait.until(ExpectedConditions.visibilityOfElementLocated(Alias));
		Aliasadded.click();
		WebElement NewAdd = wait.until(ExpectedConditions.visibilityOfElementLocated(AddNew));
		NewAdd.click();
		WebElement Addalias = wait.until(ExpectedConditions.visibilityOfElementLocated(Aliasadd));
		Addalias.click();
		Addalias.sendKeys(DynamicSelectDropdown.name());
		WebElement remalias = wait.until(ExpectedConditions.visibilityOfElementLocated(Aliasrem));
		remalias.click();
		remalias.sendKeys(DynamicSelectDropdown.name());
		WebElement addnew = wait.until(ExpectedConditions.visibilityOfElementLocated(Added));
		addnew.click();
		WebElement okbutton = wait.until(ExpectedConditions.visibilityOfElementLocated(ok));
		okbutton.click();	
	    dndropdown.kendodropdownlist("maritialstatus");
	    WebElement spouse = wait.until(ExpectedConditions.visibilityOfElementLocated(Spouse));
	    spouse.click();
	    Thread.sleep(3000);
		dndropdown.autoselecttable(driver, "presentation", 3);
		WebElement National = wait.until(ExpectedConditions.visibilityOfElementLocated(Nationality));
		National.click();
		National.sendKeys("Indian");
		WebElement religionadd = wait.until(ExpectedConditions.visibilityOfElementLocated(religion));
		religionadd.click();
		religionadd.sendKeys("Hindu");
		WebElement castadd = wait.until(ExpectedConditions.visibilityOfElementLocated(cast));
		castadd.click();
		castadd.sendKeys("Gen");
		WebElement saveall = wait.until(ExpectedConditions.visibilityOfElementLocated(save));
		saveall.click();
		eve.validate();		
		WebElement backbutton = wait.until(ExpectedConditions.visibilityOfElementLocated(back));
		backbutton.click();
		eve.kendodropdownlist("displayName", "Name & Alias");
		WebElement inputsearchs = wait.until(ExpectedConditions.visibilityOfElementLocated(inputsearch));
		inputsearchs.click();
		inputsearchs.sendKeys(fna);
		Thread.sleep(1000);
		WebElement edits = wait.until(ExpectedConditions.visibilityOfElementLocated(edit));
		edits.click();	
		WebElement remindex = wait.until(ExpectedConditions.visibilityOfElementLocated(indexrem));
		remindex.click();
		dndropdown.kendocombobox("hotindex");
		dndropdown.kendodropdownlist("maritialstatus");
		dndropdown.kendodropdownlist("sex");
		WebElement savesuccess = wait.until(ExpectedConditions.visibilityOfElementLocated(save));
		savesuccess.click();
		eve.validate();
	
		
	}
}
