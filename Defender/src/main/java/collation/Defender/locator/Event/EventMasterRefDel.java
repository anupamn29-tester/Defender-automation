package collation.Defender.locator.Event;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import collation.Defender.BaseClassSetup;
import collation.Defender.DropDown;

public class EventMasterRefDel extends BaseClassSetup {
	
	DropDown eve;
	
	
	private By menu=By.xpath("//li[@id=\"menus\"]/a/span");	
	private By evenmaster=By.xpath("//a[@href='/collation/eventlist']//span[contains(text(),'Event')]");
	
	private By presentorg=By.xpath("(//tbody/tr)[1]");
	private By Dissasso=By.xpath("//kendo-switch[@data-cy=\"disassociate\"]");
	private By save=By.xpath("//div[@class=\"ng-star-inserted\"]/button[@type=\"submit\"]");
	
	public EventMasterRefDel() {
		PageFactory.initElements(driver, this);
	}
	
	public void RefDisassociate() throws InterruptedException {
		eve=new DropDown();
		driver.findElement(menu).click();
		driver.findElement(evenmaster).click();
		Thread.sleep(5000);
		eve.kendodropdownlist("displayName", "Name");
		Thread.sleep(1000);
		eve.kendotextbox1("Search in selected column...", "Arms deal in Mumbai",1);
		Thread.sleep(1000);
		eve.kendotabstriptab("References");
		Thread.sleep(1000);
		driver.findElement(presentorg).click();
		Thread.sleep(3000);
		driver.findElement(Dissasso).click();
		Thread.sleep(1000);
		driver.findElement(save).click();
		eve.validate();
		Thread.sleep(3000);

}
}
