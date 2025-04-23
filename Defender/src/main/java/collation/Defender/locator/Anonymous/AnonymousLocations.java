package collation.Defender.locator.Anonymous;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import collation.Defender.BaseClassSetup;
import collation.Defender.DropDown;
import collation.Defender.DynamicSelectDropdown;
import collation.Defender.locator.Event.LoginPage;

public class AnonymousLocations extends BaseClassSetup {
	
	LoginPage log;
	DropDown eve;
	DynamicSelectDropdown dndropdown;
	
	private By menu=By.xpath("//li[@id=\"menus\"]/a/span");	
	private By collation=By.xpath("//span[normalize-space()='Collation']");
	private By assetmaster=By.xpath("//span[normalize-space()='Anonymous']");
	
	public AnonymousLocations() {
		PageFactory.initElements(driver, this);
	}
	
	public void AnonymousLocationslocators() throws InterruptedException {
		log=new LoginPage();
		eve=new DropDown();
		dndropdown=new DynamicSelectDropdown();
		log.signin(prop.getProperty("username"), prop.getProperty("password"));
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement menus = wait.until(ExpectedConditions.visibilityOfElementLocated(menu));
	    menus.click();
	    WebElement collations = wait.until(ExpectedConditions.visibilityOfElementLocated(collation));
	    collations.click();
	    WebElement Indivisuals = wait.until(ExpectedConditions.visibilityOfElementLocated(assetmaster));
	    Indivisuals.click();   
	    dndropdown.kendocombobox("locationtype");
	    
	    dndropdown.calender();

}
}
