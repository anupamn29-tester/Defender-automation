package collation.Defender;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class DropDown extends BaseClassSetup {
	
	
	public DropDown() {
		PageFactory.initElements(driver, this);
	}
	
	public void kendosearchbar(String xpath, String value) throws InterruptedException {
		
	String path="//*[@data-cy='"+xpath+"']";
	String xpath1="//*[@data-cy='"+xpath+"']/kendo-searchbar/input";
	
	WebDriverWait wait = new WebDriverWait(driver, 30);
	WebElement field = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(path)));
	field.click();	
    WebElement field1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath1)));
    field1.sendKeys(value);
    field1.sendKeys(Keys.ENTER);
   //driver.findElement(By.xpath(path)).click();
//	driver.findElement(By.xpath(xpath1)).sendKeys(value);
//	driver.findElement(By.xpath(xpath1)).sendKeys(Keys.ENTER);
}
	
	public void calender(String xpath,String value) {
		
		String path="//*[@id='"+xpath+"']/button";
		driver.findElement(By.xpath(path)).click();
		List<WebElement> ldate=driver.findElements(By.xpath("//*[@role=\"gridcell\"]"));
		System.out.println(ldate.size());
		for(int i=0;i<=ldate.size();i++) {
			System.out.println(ldate.get(i).getText());
			if(ldate.get(i).getText().equals(value)) {
				ldate.get(i).click();
				break;
			}
		}
	}
	public void kendotextbox(String xpath,String value) {
		
		String path="//input[@placeholder='"+xpath+"']";
		driver.findElement(By.xpath(path)).click();
		driver.findElement(By.xpath(path)).sendKeys(value);
		List<WebElement> lvalue=driver.findElements(By.xpath("//*[@role=\"gridcell\"]"));
		System.out.println(lvalue.size());
		for(int i=0;i<=lvalue.size();i++) {
			System.out.println(lvalue.get(i).getText());
			if(lvalue.get(i).getText().equals(value)) {
				lvalue.get(i).click();
				break;
			}
		}
	}
	public void kendotextbox1(String xpath,String value,int i) throws InterruptedException {
		
		String searcpath="//input[@placeholder='"+xpath+"']";
		int x=i;
		driver.findElement(By.xpath(searcpath)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(searcpath)).sendKeys(value);
		Thread.sleep(1000);
		List<WebElement> lvalue=driver.findElements(By.xpath("//table/tbody//tr"));
		System.out.println(lvalue.size());
		driver.findElement(By.xpath("(//table/tbody/tr)['"+x+"']//button[@title=\"Edit Record\"]")).click();
		
	}
	
	
	public void kendotextbox2(String xpath,String value) throws InterruptedException {
		
		String searcpath="//input[@placeholder='"+xpath+"']";
		driver.findElement(By.xpath(searcpath)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(searcpath)).sendKeys(value);
		Thread.sleep(1000);
		List<WebElement> lvalue=driver.findElements(By.xpath("(//div[@class=\"normal_grid\"]//table)[2]"));
		System.out.println(lvalue.size());
		driver.findElement(By.xpath("((//div[@class=\"normal_grid\"]//table)[2]//tr/td)[1]")).click();
	}
	
	

public void kendodropdownlist(String xpath,String value) throws InterruptedException {
		
		String path="//kendo-dropdownlist[@textfield='"+xpath+"']";
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement menus = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(path)));
	    menus.click();
	    Thread.sleep(1000);
		List<WebElement> lvalue=driver.findElements(By.xpath("//li[@role=\"option\"]"));
		System.out.println(lvalue.size());
		for(int i=0;i<=lvalue.size();i++) {
			System.out.println(lvalue.get(i).getText());
			if(lvalue.get(i).getText().equals(value)) {
				lvalue.get(i).click();
				break;
			}
		}
}
	public void kendotabstriptab(String value) {
		String path="//ul[@role=\"tablist\"]/li";
		List<WebElement> ltabs=driver.findElements(By.xpath(path));
		System.out.println(ltabs.size());
		for(int i=0;i<=ltabs.size();i++) {
			System.out.println(ltabs.get(i).getText());
			if(ltabs.get(i).getText().equals(value)) {
				ltabs.get(i).click();
				break;
			}
	}
	}
	
	public void kendodropdowntree(String xpath,String value ) throws InterruptedException {
		String path="//kendo-dropdowntree[@data-cy='"+xpath+"']/button";
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement menus = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(path)));
	    menus.click();
	    Thread.sleep(3000);
		//driver.findElement(By.xpath(path)).click();
		List<WebElement> lvalue=driver.findElements(By.xpath("//*[@role=\"group\"]/li/div/span/span"));
		System.out.println(lvalue.size());
		
		for(int i=0;i<=lvalue.size();i++) {
			System.out.println(lvalue.get(i).getText());
			if(lvalue.get(i).getText().equals(value)) {
				lvalue.get(i).click();
				break;
			}
		}
	}
	
	
	public String random()
	    {
	        Random randomnum = new Random();
	        int randomNumber = randomnum.nextInt(90) + 10;
	        System.out.println(randomNumber);
			return Integer.toString(randomNumber);
	        
	    }
	
	
	public void validate() {
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//*[@aria-live=\"assertive\"]"))).perform();
		String help=driver.findElement(By.xpath("//div/snack-bar-container/div/div/simple-snack-bar/span[text()=\"Record Saved Sucessfully\"]")).getText();
		Assert.assertTrue(help.contentEquals("Record Saved Sucessfully"),"Record is not saved");
		//Assert.assertEquals(help, "Record Saved Sucessfully", "Record is not saved");
	}
		
	}



