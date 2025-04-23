package collation.Defender.locators.Organization;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import collation.Defender.BaseClassSetup;
import collation.Defender.DropDown;
import collation.Defender.DynamicSelectDropdown;
import collation.Defender.TreeSelection;
import collation.Defender.locator.Event.LoginPage;

public class Organization extends BaseClassSetup{
	LoginPage log;
	DropDown eve;
	DynamicSelectDropdown dndropdown;
	TreeSelection tree;
	
	String nam;
	private By menu=By.xpath("//li[@id=\"menus\"]/a/span");	
	private By collation=By.xpath("//span[normalize-space()='Collation']");
	private By Organization=By.xpath("//a[@href='/collation/organizationlist']//span[contains(text(),'Organization')]");
	private By create=By.xpath("//a[normalize-space()='Create New']");
	private By code=By.xpath("//input[@id='orgcode']");
	private By name=By.xpath("//kendo-autocomplete[@data-cy=\"organizationname\"]/kendo-searchbar/input");
	private By address=By.xpath("(//button[@title='Select Location'])[1]");
	private By save=By.xpath("//div/div/div/button[@type=\"submit\"]");
	private By back=By.xpath("//button[normalize-space()='Back To List']");
	private By inputsearch=By.xpath("//kendo-textbox[@placeholder=\"Search in selected column...\"]/input");
	private By accpet=By.xpath("//button[normalize-space()='Accept']");
	private By editselect=By.xpath("//i[@class='far fa-edit']");
	private By clearvalue=By.xpath("//kendo-combobox[@id='grouptype']//span[@class='k-icon k-i-x']");
	
	
	public Organization() {
		PageFactory.initElements(driver, this);
	}
	

	public void Organizationlocators() throws InterruptedException, IOException {
		try {
		log=new LoginPage();
		eve=new DropDown();
		dndropdown=new DynamicSelectDropdown();
		tree=new TreeSelection();
		log.signin(prop.getProperty("username"), prop.getProperty("password"));
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement menus = wait.until(ExpectedConditions.visibilityOfElementLocated(menu));
	    menus.click();
	    WebElement collations = wait.until(ExpectedConditions.visibilityOfElementLocated(collation));
	    collations.click();
	    WebElement Organizations = wait.until(ExpectedConditions.visibilityOfElementLocated(Organization));
	    Organizations.click();   
	    WebElement createind = wait.until(ExpectedConditions.visibilityOfElementLocated(create));
	    createind.click();	    
		WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//kendo-combobox[@id='grouptype']//span[@class='k-button-icon k-icon k-i-caret-alt-down']")));
		button.click();
		Thread.sleep(1000);
		List<WebElement> lvalue=driver.findElements(By.xpath("//ul[@role=\"listbox\"]/li"));
		System.out.println(lvalue.size());
	    int totalOptions = lvalue.size();
	    if (totalOptions < 6) {
            System.out.println("Not enough options to select from the last 6. Selecting randomly from available options.");
        } else {
            int startIndex = totalOptions - 6; // Calculate start index for the last six options
            Random random = new Random();
            int randomIndex = startIndex + random.nextInt(6); // Generate a random index within the last 6
            WebElement selectedOption = lvalue.get(randomIndex);
            System.out.println("Selected option: " + selectedOption.getText());
            selectedOption.click();
        }  
         WebElement dropdownbut = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//kendo-combobox[@id='groupnameid']//span[@class='k-button-icon k-icon k-i-caret-alt-down']")));
         dropdownbut.click();
         List<WebElement> lvalues=driver.findElements(By.xpath("//ul[@role=\"listbox\"]/li"));
         System.out.println(lvalues.size());
         Random rang=new Random();
 		 int anygrp=rang.nextInt(lvalues.size());
 		 WebElement selectedOptions = lvalues.get(anygrp);
 		 Thread.sleep(500);
 		 System.out.println("Selected option: " + selectedOptions.getText());
 		 lvalues.get(anygrp).click();
 	
 		 tree.treestructure(3);
 		 
 		 
 		 WebElement codes = wait.until(ExpectedConditions.visibilityOfElementLocated(code));
 		 codes.click();
 		 codes.sendKeys(eve.random());
 		 WebElement names = wait.until(ExpectedConditions.visibilityOfElementLocated(name));
 		 names.click();
 		 this.nam=DynamicSelectDropdown.name();
 		 System.out.println(nam);
 		 names.sendKeys(nam);
 		 WebElement addr = wait.until(ExpectedConditions.visibilityOfElementLocated(address));
 		 addr.click();
 		 Thread.sleep(1000);
 		 dndropdown.autoselecttable(driver, "presentation", 5);
 		 WebElement accpeted = wait.until(ExpectedConditions.visibilityOfElementLocated(accpet));
 		 accpeted.click();
 		 Thread.sleep(5000);
 		 WebElement savedata = wait.until(ExpectedConditions.elementToBeClickable(save));
 		 savedata.click();
 		 //eve.validate(); 		 
 		 
 		 WebElement backbutton = wait.until(ExpectedConditions.elementToBeClickable(back));
 		 backbutton.click();
 		 Thread.sleep(3000);
 		 eve.kendodropdownlist("displayName", "Name & Alias");
 		 WebElement inputsearchs = wait.until(ExpectedConditions.visibilityOfElementLocated(inputsearch));
 		 inputsearchs.click();
 		 inputsearchs.sendKeys(nam);
 		 Thread.sleep(5000);
 		 WebElement editorg = wait.until(ExpectedConditions.visibilityOfElementLocated(editselect));
 		 editorg.click();
 		 WebElement cleardata = wait.until(ExpectedConditions.visibilityOfElementLocated(clearvalue));
 		 cleardata.click();
 		 
 		WebElement butt = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//kendo-combobox[@id='grouptype']//span[@class='k-button-icon k-icon k-i-caret-alt-down']")));
 		butt.click();
 		Thread.sleep(1000);
	    List<WebElement> lval=driver.findElements(By.xpath("//ul[@role=\"listbox\"]/li"));
		System.out.println(lval.size());
	    int totalOption = lval.size();
	    if (totalOption < 6) {
            System.out.println("Not enough options to select from the last 6. Selecting randomly from available options.");
        } else {
        	int startIndex = totalOptions - 6; // Calculate start index for the last six options
            Random random = new Random();
            int randomIndex = startIndex + random.nextInt(6); // Generate a random index within the last 6
            System.out.println(randomIndex);
            WebElement selectedOption = lval.get(randomIndex);
            System.out.println("Selection"+selectedOption.getText());
            Thread.sleep(1000);
            selectedOption.click();
        }  
         WebElement dropdownbu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//kendo-combobox[@id='groupnameid']//span[@class='k-button-icon k-icon k-i-caret-alt-down']")));
         dropdownbu.click();
         List<WebElement> lva=driver.findElements(By.xpath("//ul[@role=\"listbox\"]/li"));
         System.out.println(lva.size());
         Random rangw=new Random();
 		 int anygr=rangw.nextInt(lva.size());
 		 WebElement selectedOption = lva.get(anygr);
 		 System.out.println("Selected option: " + selectedOption.getText());
 		 lva.get(anygr).click();
 		 tree.treestructure(3);
 		 WebElement codesch = wait.until(ExpectedConditions.visibilityOfElementLocated(code));
 		 codesch.clear();
 		 codesch.sendKeys(eve.random());
 		 Thread.sleep(5000);
 		 WebElement saveall = wait.until(ExpectedConditions.visibilityOfElementLocated(save));
 		 saveall.click();
		 //eve.validate();
 		 
        
	}
		catch (Exception e) {
		    File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(screenshot, new File("screenshots/failure_" + System.currentTimeMillis() + ".png"));
		    e.printStackTrace();
		}
}
}
	    

