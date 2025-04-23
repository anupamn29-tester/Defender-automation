package Utilities.DynamicQuery;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import collation.Defender.BaseClassSetup;
import collation.Defender.DropDown;
import collation.Defender.DynamicSelectDropdown;
import collation.Defender.locator.Event.LoginPage;

public class OrganizationQuery extends BaseClassSetup {
	
	LoginPage log;
	DropDown eve;
	DynamicSelectDropdown dndropdown;

	private By menu=By.xpath("//li[@id=\"menus\"]/a/span");	
	private By Utilities=By.xpath("//span[normalize-space()='Utilities']");
	private By DynamicQuery=By.xpath("//span[normalize-space()='Dynamic Query']");
	private By rule=By.xpath("//button[@class='btn btn-sm raised_button']");
	private By execute=By.xpath("//span[normalize-space()='Execute Query']");
//	private By selectall=By.xpath("//kendo-panelbar[@role=\"tree\"]//input[@id=\"k-grid0-select-all\"]");
	private By and=By.xpath("//label[normalize-space()='AND']");
	
	
	public OrganizationQuery() {
		PageFactory.initElements(driver, this);
	}
	
	public void Appearancelocators() throws InterruptedException {
		log=new LoginPage();
		eve=new DropDown();
		dndropdown=new DynamicSelectDropdown();
		log.signin(prop.getProperty("username"), prop.getProperty("password"));
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement menus = wait.until(ExpectedConditions.visibilityOfElementLocated(menu));
	    menus.click();
	    WebElement collations = wait.until(ExpectedConditions.visibilityOfElementLocated(Utilities));
	    collations.click();
	    WebElement Indivisuals = wait.until(ExpectedConditions.visibilityOfElementLocated(DynamicQuery));
	    Indivisuals.click();   
	    eve.kendodropdownlist("title", "Organization");
	    WebElement rulebutton = wait.until(ExpectedConditions.visibilityOfElementLocated(rule));
	    rulebutton.click();
	    eve.kendodropdownlist("name", "Group");
	    WebElement executebutton = wait.until(ExpectedConditions.visibilityOfElementLocated(execute));
	    executebutton.click();
	    Thread.sleep(20000);
//	    WebElement checkboxbutton = wait.until(ExpectedConditions.visibilityOfElementLocated(selectall));
//	    checkboxbutton.click();
	    WebElement andbutton = wait.until(ExpectedConditions.visibilityOfElementLocated(and));
	    andbutton.click();
	    WebElement rulebutton1 = wait.until(ExpectedConditions.visibilityOfElementLocated(rule));
	    rulebutton1.click();
	   
	    
	    List<WebElement> itemlist=driver.findElements(By.xpath("//div[@class=\"q-tree-container\"]/ul/li/div[@class=\"col-4 mt-auto mb-auto ng-star-inserted\"]"));
	    int count=itemlist.size();
	    itemlist.get(count-1).click();	    
	    Thread.sleep(100);
	    List<WebElement> lvalue=driver.findElements(By.xpath("//kendo-list/div/ul/li[@role=\"option\"]/span"));
		for(int i=0;i<lvalue.size();i++) {		
			if(lvalue.get(i).getText().equals("Type Name")) {
				lvalue.get(i).click();
				break;
			}
		}
		
		List<WebElement> itemlist2=driver.findElements(By.xpath("//div[@class=\"q-tree-container\"]/ul/li/div/input[@type=\"text\"]"));
	    int counts=itemlist2.size();
	    itemlist2.get(counts-1).click();
	    itemlist2.get(counts-1).sendKeys("Terrorist Group");
	    
	    
	    WebElement executebutton1 = wait.until(ExpectedConditions.visibilityOfElementLocated(execute));
	    executebutton1.click();
	    Thread.sleep(5000);
	    
	    
	    
	    WebElement rulebutton2 = wait.until(ExpectedConditions.visibilityOfElementLocated(rule));
	    rulebutton2.click();
	    
	    
	    
	    List<WebElement> item=driver.findElements(By.xpath("//div[@class=\"q-tree-container\"]/ul/li/div[@class=\"col-4 mt-auto mb-auto ng-star-inserted\"]"));
	    int cou=item.size();
	    item.get(cou-1).click();	    
	    Thread.sleep(100);
	    List<WebElement> lval=driver.findElements(By.xpath("//kendo-list/div/ul/li[@role=\"option\"]/span"));
		for(int i=0;i<lval.size();i++) {		
			if(lval.get(i).getText().equals("Formation")) {
				lval.get(i).click();
				break;
			}
		}
		
		List<WebElement> itlist=driver.findElements(By.xpath("//div[@class=\"q-tree-container\"]/ul/li/div/input[@type=\"text\"]"));
	    int coun=itlist.size();
	    itlist.get(coun-1).click();
	    itlist.get(coun-1).sendKeys("Hizbul India");
	    
	    WebElement executebutton2 = wait.until(ExpectedConditions.visibilityOfElementLocated(execute));
	    executebutton2.click();
	    
}
}

