package collation.Defender.locators.Asset;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import collation.Defender.BaseClassSetup;
import collation.Defender.DropDown;
import collation.Defender.DynamicSelectDropdown;
import collation.Defender.TreeSelection;
import collation.Defender.locator.Event.LoginPage;

public class AssetCreate extends BaseClassSetup{
	
	
	LoginPage log;
	DropDown eve;
	DynamicSelectDropdown dndropdown;
	TreeSelection tree;
	
	String assetname;
	
	private By menu=By.xpath("//li[@id=\"menus\"]/a/span");	
	private By collation=By.xpath("//span[normalize-space()='Collation']");
	private By assetmaster=By.xpath("//span[normalize-space()='Asset Master']");
	private By create=By.xpath("//a[normalize-space()='Create New']");
	private By assetnames=By.xpath("//input[@id='assetname']");
	private By save=By.xpath("//button[@class='btn btn-theme form_button ms-3 ng-star-inserted']");
	private By back=By.xpath("//button[@title=\"Click to Go Back to List\"]");
	private By inputsearch=By.xpath("//kendo-textbox[@placeholder=\"Search in selected column...\"]/input");
	private By editselect=By.xpath("//i[@class='far fa-edit']");
	
	public AssetCreate() {
		PageFactory.initElements(driver, this);
	}
	
	public void AssetCreatelocators() throws InterruptedException {
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
	    WebElement Indivisuals = wait.until(ExpectedConditions.visibilityOfElementLocated(assetmaster));
	    Indivisuals.click();   
	    WebElement createind = wait.until(ExpectedConditions.visibilityOfElementLocated(create));
	    createind.click(); 
	    dndropdown.kendocombobox("assettype");
	    
	    tree.treestructure(2);
	    this.assetname=DynamicSelectDropdown.name();
	    System.out.println(assetname);
	    WebElement assetnam = wait.until(ExpectedConditions.visibilityOfElementLocated(assetnames));
	    assetnam.sendKeys(assetname);
	    WebElement saves = wait.until(ExpectedConditions.visibilityOfElementLocated(save));
	    saves.click();
	    WebElement backbutton = wait.until(ExpectedConditions.visibilityOfElementLocated(back));
		backbutton.click();
		Thread.sleep(1000);
		eve.kendodropdownlist("displayName", "Asset Name");
		WebElement inputsearchs = wait.until(ExpectedConditions.visibilityOfElementLocated(inputsearch));
		inputsearchs.click();
		inputsearchs.sendKeys(assetname);
		Thread.sleep(3000);
		WebElement editorg = wait.until(ExpectedConditions.visibilityOfElementLocated(editselect));
		editorg.click();
	    
	}
	
}
