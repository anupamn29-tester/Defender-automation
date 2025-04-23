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

public class Artifacts extends BaseClassSetup{
	LoginPage log;
	DropDown eve;
	DynamicSelectDropdown dndropdown;
	
	private By menu=By.xpath("//li[@id=\"menus\"]/a/span");	
	private By collation=By.xpath("//span[normalize-space()='Collation']");
	private By Individual=By.xpath("//span[normalize-space()='Individual Master']");
	private By inputsearch=By.xpath("//kendo-textbox[@placeholder=\"Search in selected column...\"]/input");
	private By edit=By.xpath("//button[@title=\"Edit Record\"]");
	private By Docname=By.xpath("//input[@data-cy=\"docname\"]");
	private By Docnumber=By.xpath("//input[@data-cy=\"docno\"]");
	private By Note=By.xpath("//kendo-textarea[@data-cy=\"note\"]/textarea");
	private By save=By.xpath("//button[@class='btn btn-theme form_button ms-3 ng-star-inserted']");
	private By clearptype=By.xpath("//span[@title=\"clear\"]");
	
	private By back=By.xpath("//button[@title=\"Click to Go Back to List\"]");
	
	public Artifacts() {
		PageFactory.initElements(driver, this);
	}
	public void Artifactslocators() throws InterruptedException {
		log=new LoginPage();
		eve=new DropDown();
		dndropdown=new DynamicSelectDropdown();
		//log.signin(prop.getProperty("username"), prop.getProperty("password"));
		WebDriverWait wait = new WebDriverWait(driver, 30);
//		WebElement menus = wait.until(ExpectedConditions.visibilityOfElementLocated(menu));
//	    menus.click();
//	    WebElement collations = wait.until(ExpectedConditions.visibilityOfElementLocated(collation));
//	    collations.click();
//	    WebElement Indivisuals = wait.until(ExpectedConditions.visibilityOfElementLocated(Individual));
//	    Indivisuals.click();   
//		eve.kendodropdownlist("displayName", "Name & Alias");
//		WebElement searchinput = wait.until(ExpectedConditions.visibilityOfElementLocated(inputsearch));
//		searchinput.click();
//		searchinput.sendKeys("p");
		
		//Extra added
				WebElement backbuttons = wait.until(ExpectedConditions.visibilityOfElementLocated(back));
				backbuttons.click();
		//End here
		
		WebElement edits = wait.until(ExpectedConditions.visibilityOfElementLocated(edit));
		edits.click();
		eve.kendotabstriptab("Artifacts");
		dndropdown.kendocombobox("doctype");
		String docname=DynamicSelectDropdown.name();
		System.out.println(docname);
		
		WebElement Documentname = wait.until(ExpectedConditions.visibilityOfElementLocated(Docname));
		Documentname.clear();
		Documentname.sendKeys(docname);
		WebElement Docnum = wait.until(ExpectedConditions.visibilityOfElementLocated(Docnumber));
		Docnum.clear();
		Docnum.sendKeys(eve.random());
		dndropdown.calender();
		eve.calender("validtill", "28");
		WebElement Notes = wait.until(ExpectedConditions.visibilityOfElementLocated(Note));
		Notes.clear();
		Notes.sendKeys("Testing");
		WebElement saves = wait.until(ExpectedConditions.visibilityOfElementLocated(save));
		saves.click();
		Thread.sleep(500);
//		eve.validate();
		
		dndropdown.autoselecttable(driver, "presentation", 5);
		WebElement clearpty = wait.until(ExpectedConditions.visibilityOfElementLocated(clearptype));
		clearpty.click();
		dndropdown.kendocombobox("doctype");
		WebElement Docnames = wait.until(ExpectedConditions.visibilityOfElementLocated(Docname));
		Docnames.clear();
		Docnames.sendKeys(docname);
		WebElement savesall = wait.until(ExpectedConditions.visibilityOfElementLocated(save));
		savesall.click();
		//eve.validate();
	}
}
