package collation.Defender.locators.Asset;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import collation.Defender.BaseClassSetup;
import collation.Defender.DropDown;
import collation.Defender.DynamicSelectDropdown;
import collation.Defender.locator.Event.LoginPage;

public class AssetReferences extends BaseClassSetup{
	
	LoginPage log;
	DropDown eve;
	DynamicSelectDropdown dndropdown;
	

	private By menu=By.xpath("//li[@id=\"menus\"]/a/span");	
	private By collation=By.xpath("//span[normalize-space()='Collation']");
	private By assetmaster=By.xpath("//span[normalize-space()='Asset Master']");
	private By inputsearch=By.xpath("//kendo-textbox[@placeholder=\"Search in selected column...\"]/input");
	private By editselect=By.xpath("//i[@class='far fa-edit']");
	private By refno=By.xpath("//input[@id='entityreference']");
	private By save=By.xpath("//button[@class='btn btn-theme form_button ms-3 ng-star-inserted']");
	
	public AssetReferences() {
		PageFactory.initElements(driver, this);
	}
	
	public void AssetReferenceslocators() throws InterruptedException {
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
	    eve.kendodropdownlist("displayName", "Asset Name");
	    WebElement inputsearchs = wait.until(ExpectedConditions.visibilityOfElementLocated(inputsearch));
		inputsearchs.click();
		inputsearchs.sendKeys("Bullet Proof Car");
		Thread.sleep(3000);
		WebElement editorg = wait.until(ExpectedConditions.visibilityOfElementLocated(editselect));
		editorg.click();
		Thread.sleep(1000);
		eve.kendotabstriptab("References");
		dndropdown.kendocombobox("entityreferencetype");
		WebElement refnumber = wait.until(ExpectedConditions.visibilityOfElementLocated(refno));
		refnumber.clear();
		refnumber.sendKeys(eve.random());
		eve.calender("referencedate", "27");
		WebElement saves = wait.until(ExpectedConditions.visibilityOfElementLocated(save));
	    saves.click();
		

}
}
