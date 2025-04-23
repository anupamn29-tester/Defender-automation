package collation.Defender;

import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TreeSelection extends BaseClassSetup{
	
	
	public void treestructure(int x) throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement dropdownbutton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='k-button-icon k-icon k-i-caret-alt-down'])["+x+"]")));
	dropdownbutton.click();		 
	List<WebElement> formvalue=driver.findElements(By.xpath("//kendo-treeview[@role=\"tree\"]/ul/li/div/span"));
	System.out.println("Fromvalue:"+formvalue.size());
    Random range=new Random();
    int anys=range.nextInt(formvalue.size());
    System.out.println("Num"+anys);
    String xpath=" //li[@data-treeindex="+anys+"]//span[contains(@class, 'k-i-caret-alt-right')]";
    if(driver.findElements(By.xpath(xpath)).size()<=0) {   	
    	Thread.sleep(500);
    	formvalue.get(anys).click();
    }
    else
    {
    	funct(xpath," //li[@data-treeindex="+anys+"]");
    	
    }
	}
	
	
    public String lastDataTreeIndex(String xpath) {
        String pattern = "data-treeindex\\s*=\\s*['\"]?(\\d+)['\"]?";
        
        // Compile the regex pattern
        Pattern regex = Pattern.compile(pattern);
        
        // Match the pattern in the given string
        Matcher matcher = regex.matcher(xpath);
        
        String lastDataTreeIndex = null;

        // Iterate through all matches
        while (matcher.find()) {
            lastDataTreeIndex = matcher.group(1); // Update with the current match
        }

        if (lastDataTreeIndex != null) {
            return lastDataTreeIndex;
        } else {
            return "";
        }
    }
	
	public void funct(String xpath,String lixpath) throws InterruptedException {
		   
    	String ulxpath=lixpath+"//li";
    	
		driver.findElement(By.xpath(xpath)).click();
		Thread.sleep(100);
		List<WebElement> dropvalue=driver.findElements(By.xpath(ulxpath));
		System.out.println("Dropvalue"+dropvalue.size());
	    Random rng=new Random();
	    int valuedn=rng.nextInt(dropvalue.size()+1);
	    System.out.println("valuesize"+valuedn);
	    if(valuedn==dropvalue.size()) {
	    	Thread.sleep(500);
	    	driver.findElement(By.xpath(lixpath+"//span[contains(@class, 'k-treeview-leaf-text')]")).click();
	    	
	    	return;
	    }
	    String dataterrindex=lastDataTreeIndex(lixpath)+"_"+valuedn;
	    String childlixpath="//li[@data-treeindex=\""+dataterrindex+"\"]//span[contains(@class, 'k-i-caret-alt-right')]";
        try {
        	
        	if(driver.findElements(By.xpath(childlixpath)).size()>0) {
        		funct(childlixpath,"//li[@data-treeindex=\""+dataterrindex+"\"]");
        	}else {
        		driver.findElement(By.xpath("//li[@data-treeindex=\""+dataterrindex+"\"]//span[contains(@class, 'k-treeview-leaf-text')]")).click();
    	    	return;
        	}
        }catch(Exception e) {
	    	driver.findElement(By.xpath("//li[@data-treeindex=\""+dataterrindex+"\"]//span[contains(@class, 'k-treeview-leaf-text')]")).click();
	    	return;
        }
    
	}
}
