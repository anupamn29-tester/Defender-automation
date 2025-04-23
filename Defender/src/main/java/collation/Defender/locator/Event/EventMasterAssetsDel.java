package collation.Defender.locator.Event;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import collation.Defender.BaseClassSetup;
import collation.Defender.DropDown;

public class EventMasterAssetsDel extends BaseClassSetup {
	
	DropDown eve;
	
	private By presentorg=By.xpath("(//tbody/tr)[1]");
	private By Dissasso=By.xpath("//kendo-switch[@data-cy=\"disassociate\"]");
	private By save=By.xpath("//div[@class=\"ng-star-inserted\"]/button[@type=\"submit\"]");
	
	public EventMasterAssetsDel() {
		PageFactory.initElements(driver, this);
	}
	
	public void Disassociate() throws InterruptedException {
		eve=new DropDown();
		driver.findElement(presentorg).click();
		Thread.sleep(3000);
		driver.findElement(Dissasso).click();
		Thread.sleep(1000);
		driver.findElement(save).click();
		eve.validate();
		Thread.sleep(3000);
		
	}

}
