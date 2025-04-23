package collation.Defender.locator.Event;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import collation.Defender.BaseClassSetup;

public class Dashboardlocators extends BaseClassSetup  {		
		private By advance=By.xpath("//*[@id=\"details-button\"]");
		private By mainui=By.xpath("//*[@id=\"proceed-link\"]");
		
		public Dashboardlocators() {
			PageFactory.initElements(driver, this);
		}
		
		public void locatorshome() throws InterruptedException {
			driver.findElement(advance).click();
			Thread.sleep(1000);
			driver.findElement(mainui).click();
//			if(driver.getTitle().contains("Defender in"))
//			System.out.println("Page title OK ");
//			else
//			System.out.println("Page title NOT OK ");
			String ActualTitle = driver.getTitle();
			assertEquals(ActualTitle, "Defender in");
			Thread.sleep(10000);
		}
		
}
