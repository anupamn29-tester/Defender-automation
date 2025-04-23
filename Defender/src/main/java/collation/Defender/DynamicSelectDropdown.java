package collation.Defender;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.*;
import java.time.Duration;

public class DynamicSelectDropdown extends BaseClassSetup {
	
	DropDown drop;
	
	public DynamicSelectDropdown() {
		PageFactory.initElements(driver, this);
	}
	
	public void kendodropdownlist(String x) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//kendo-dropdownlist[@data-cy='"+x+"']/span")));
		button.click();	
		//driver.findElement(By.xpath("//kendo-dropdownlist[@data-cy='"+x+"']/span")).click();
		List<WebElement> lvalue=driver.findElements(By.xpath("//ul[@role=\"listbox\"]/li"));
		System.out.println(lvalue.size());
		Random ran=new Random();	
		int index=ran.nextInt(lvalue.size());		
		WebElement randomElement = lvalue.get(index);
		System.out.println("Selected text: " + randomElement.getText());
        wait.until(ExpectedConditions.elementToBeClickable(randomElement)).click();
		//lvalue.get(index).click();
		}
	
	public void kendocombobox(String x) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//kendo-combobox[@data-cy='"+x+"']/button")));
		button.click();
		//driver.findElement(By.xpath("//kendo-combobox[@data-cy='"+x+"']/button")).click();
		List<WebElement> lvalues=driver.findElements(By.xpath("//ul[@role=\"listbox\"]/li"));
		System.out.println(lvalues.size());		
		Random rang=new Random();
		int indexes=rang.nextInt(lvalues.size()-1);
		WebElement randomElements = lvalues.get(indexes);
		System.out.println("Selected text: " + randomElements.getText());
		wait.until(ExpectedConditions.elementToBeClickable(randomElements)).click();
		//lvalues.get(indexes).click();
	}
	
	public static String name() {
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    StringBuilder sb = new StringBuilder();
	    Random random = new Random();
	    int length = 5;
	    for(int i = 0; i < length; i++) {
	    	int index = random.nextInt(alphabet.length());
	        char randomChar = alphabet.charAt(index);
	        sb.append(randomChar);
	    }
	    String randomString = sb.toString();
	    return randomString;
	}
	
	
    
	public void autoselecttable(WebDriver driver, String x, int maxRetries) throws InterruptedException {
		
		
			WebDriverWait wait = new WebDriverWait(driver, 30);
		    List<WebElement> lvalues = driver.findElements(By.xpath("//tbody[@role='" + x + "']/tr"));

		    if (lvalues.isEmpty()) {
		        throw new NoSuchElementException("No elements found for the given XPath!");
		    }

		    System.out.println("Total elements: " + lvalues.size());

		    Random random = new Random();
		    int attempt = 0;

		    while (attempt < maxRetries) {
		        try {
		            // Select a random element
		            int index = random.nextInt(lvalues.size());
		            WebElement randomElement = lvalues.get(index);
		            System.out.println("Attempt " + (attempt + 1) + " - Selected text: " + randomElement.getText());

		            // Wait for the element to be clickable
		            WebElement button = wait.until(ExpectedConditions.elementToBeClickable(randomElement));

		            // Click using Actions to avoid intercept issues
		    		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button);
		    		Thread.sleep(1000);
		    		button.click();
		            System.out.println("Click successful!");
		            return; // Exit if successful

		        } catch (ElementClickInterceptedException | StaleElementReferenceException e) {
		            System.out.println("Click failed (Retry " + (attempt + 1) + "). Retrying...");
		            try {
		                Thread.sleep(500); // Short wait before retry
		            } catch (InterruptedException ie) {
		                Thread.currentThread().interrupt();
		            }
		        }
		        attempt++;
		    }

		    throw new RuntimeException("Failed to click the element after " + maxRetries + " attempts");

		
		
		
//		WebDriverWait wait = new WebDriverWait(driver, 30);
//		List<WebElement> lvalues=driver.findElements(By.xpath("//tbody[@role='"+x+"']/tr"));
//		System.out.println(lvalues.size());		
//		Random rang=new Random();
//		int indexes=rang.nextInt(lvalues.size());
//		
//		
//		WebElement randomElements = lvalues.get(indexes);
//		System.out.println("Selected text: " + randomElements.getText());
//		WebElement button = wait.until(ExpectedConditions.elementToBeClickable(randomElements));
//
//
//		Actions actions = new Actions(driver);
//		actions.moveToElement(button).click().perform();
		
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button);
//		Thread.sleep(1000);
//		button.click();
//		
		
		//wait.until(ExpectedConditions.elementToBeClickable(randomElements)).click();	
		//lvalues.get(indexes).click();
	}
	
	
	
	
	public void calender() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement Toggle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title=\"Toggle calendar\"]")));
		Toggle.click();
		WebElement Navigate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@title=\"Navigate to parent view\"]")));
		Navigate.click();
		WebElement Navigate1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@title=\"Navigate to parent view\"]")));
		Navigate1.click();
		WebElement Navigate2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@title=\"Navigate to parent view\"]")));
		Navigate2.click();
		WebElement rowgroup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody[@role=\"rowgroup\"]/tr/td[@title=\"2000\"]")));
		rowgroup.click();
		WebElement rowgroup1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody[@role=\"rowgroup\"]/tr/td[@title=\"2000\"]")));
		rowgroup1.click();
		
		//driver.findElement(By.xpath("//button[@title=\"Toggle calendar\"]")).click();
		//driver.findElement(By.xpath("//span[@title=\"Navigate to parent view\"]")).click();
		//driver.findElement(By.xpath("//span[@title=\"Navigate to parent view\"]")).click();
		//driver.findElement(By.xpath("//span[@title=\"Navigate to parent view\"]")).click();
		//driver.findElement(By.xpath("//tbody[@role=\"rowgroup\"]/tr/td[@title=\"2000\"]")).click();
		//driver.findElement(By.xpath("//tbody[@role=\"rowgroup\"]/tr/td[@title=\"2000\"]")).click();
	
		List<WebElement> years=driver.findElements(By.xpath("//tbody[@role=\"rowgroup\"]/tr/td/span"));
		Random rang=new Random();
		int anymonths=rang.nextInt(years.size());
		
		WebElement randomElements = years.get(anymonths);
		System.out.println("Selected text: " + randomElements.getText());
		wait.until(ExpectedConditions.elementToBeClickable(randomElements)).click();
		
		//years.get(anymonths).click();
		
		
		
		List<WebElement> months=driver.findElements(By.xpath("//tbody[@role=\"rowgroup\"]/tr/td/span"));
		Random rangs=new Random();
		int anydays=rangs.nextInt(months.size());
		
		WebElement randomElementsmon = months.get(anydays);
		System.out.println("Selected text: " + randomElementsmon.getText());
		wait.until(ExpectedConditions.elementToBeClickable(randomElementsmon)).click();
		
		//months.get(anydays).click();
	}
	
	public void Addnewrecords() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title=\"Click to Add New Record\"]")));
		button.click();
		WebElement alt = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='k-button-icon k-icon k-i-caret-alt-down'])[10]")));
		alt.click();
		//driver.findElement(By.xpath("//button[@title=\"Click to Add New Record\"]")).click();
		//driver.findElement(By.xpath("(//span[@class='k-button-icon k-icon k-i-caret-alt-down'])[10]")).click();
		List<WebElement> trace=driver.findElements(By.xpath("//kendo-list[@class=\"k-list-md k-list ng-star-inserted\"]/div/ul/li/span"));
		int value=trace.size()-1;
		Random trcrange=new Random();
		int anytrc=trcrange.nextInt(value);
		
		WebElement randomElementtrace = trace.get(anytrc);
		System.out.println("Selected text: " + randomElementtrace.getText());
		wait.until(ExpectedConditions.elementToBeClickable(randomElementtrace)).click();
		
		
		//trace.get(anytrc).click();
		
		
		WebElement remarks = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//kendo-textarea[@name=\"remarks\"]/textarea")));
		remarks.click();
		remarks.sendKeys(DynamicSelectDropdown.name());
		WebElement calendar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='k-button-icon k-icon k-i-calendar'])[2]")));
		calendar.click();
//		driver.findElement(By.xpath("//kendo-textarea[@name=\"remarks\"]/textarea")).click();
//		driver.findElement(By.xpath("//kendo-textarea[@name=\"remarks\"]/textarea")).sendKeys(DynamicSelectDropdown.name());
//		driver.findElement(By.xpath("(//span[@class='k-button-icon k-icon k-i-calendar'])[2]")).click();
		List<WebElement> days=driver.findElements(By.xpath("//tbody[@role=\"rowgroup\"]/tr/td/span"));
		Random rangs=new Random();
		int anydays=rangs.nextInt(days.size());
		
		
		WebElement randomElementsday = days.get(anydays);
		System.out.println("Selected text: " + randomElementsday.getText());
		wait.until(ExpectedConditions.elementToBeClickable(randomElementsday)).click();
		
		
		//days.get(anydays).click();
		
		
		WebElement Update = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Click to Add/Update record']")));
		Update.click();
		WebElement OK = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='OK']")));
		OK.click();
//		driver.findElement(By.xpath("//button[@title='Click to Add/Update record']")).click();
//		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		
		}
	
	
	public void numberfield() throws InterruptedException {
		
		drop=new DropDown();
		
		List<WebElement> SelectedField_all = driver.findElements(By.xpath("//div[@class='row ng-star-inserted']//input"));
		List<WebElement> SelectedField = SelectedField_all.stream()
                .filter(WebElement::isEnabled)
                .collect(Collectors.toList());
		Random random = new Random();
		int size=SelectedField.size();
        int fieldnum = random.nextInt(4,size+1);
        for(int i=0; i < SelectedField.size(); i++) {
        System.out.println("SelectedField : " + SelectedField.get(i));
        }
        System.out.println(size);
        System.out.println(fieldnum);
        Set<Integer> uniqueNumbers = new HashSet<>();
        while (uniqueNumbers.size() < fieldnum) {
            int num = random.nextInt(size); // Generates a number between 0 and 10 (inclusive)
            uniqueNumbers.add(num);
        }

        System.out.println("Unique random numbers: " + uniqueNumbers + "Size:" + uniqueNumbers.size());
        List<Integer> uniqueNumbersList = new ArrayList<>(uniqueNumbers);
        for(int i=0; i < uniqueNumbersList.size(); i++) {
        	WebElement box = SelectedField.get(uniqueNumbersList.get(i));
            System.out.println("box : " + box);
            Thread.sleep(1000);
            box.clear();
            box.sendKeys("data_"+drop.random());               
        	}
        
 
        	
        
       
        }
	
	public void clickWithRetry(WebDriver driver, By locator) {
	    int attempts = 0;
	    while (attempts < 3) {
	        try {
	            //driver.findElement(locator).click();
	        	WebDriverWait wait = new WebDriverWait(driver, 30);
	            WebElement accp = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	            accp.click();
	            return; 
	        } catch (StaleElementReferenceException e) {
	            System.out.println("Element went stale, retrying... Attempt: " + (attempts + 1));
	        }
	        attempts++;
	    }
	    throw new RuntimeException("Failed to click the element after multiple attempts.");
	}
        
       
   
   	 
    }
		
	
	

