package Utilities.DynamicQuery;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import collation.Defender.BaseClassSetup;
import collation.Defender.DropDown;
import collation.Defender.DynamicSelectDropdown;
import collation.Defender.locator.Event.LoginPage;

public class QueryNextentity extends BaseClassSetup{

	LoginPage log;
	DropDown eve;
	DynamicSelectDropdown dndropdown;
	

	private By menu=By.xpath("//li[@id=\"menus\"]/a/span");	
	private By Utilities=By.xpath("//span[normalize-space()='Utilities']");
	private By DynamicQuery=By.xpath("//span[normalize-space()='Dynamic Query']");
	private By rule=By.xpath("//button[@class='btn btn-sm raised_button']");
	private By execute=By.xpath("//span[normalize-space()='Execute Query']");
	private By selectall=By.xpath("//kendo-panelbar[@role=\"tree\"]//input[@aria-label=\"Select All Rows\"]");
	private By forward=By.xpath("//button[@title='Click to go forward']");
	private By export=By.xpath("//span[normalize-space()='Export']");
	private By exportdb=By.xpath("//div[@title='Export Current Datasheet']");
	private By hiredb=By.xpath("//div[@title='Export to Hierarchical Display']");
	private By exporthirerep=By.xpath("//button[normalize-space()='Export Excel']");
	private By closehiredb=By.xpath("//kendo-window-titlebar/button/span[@role=\"presentation\"]");
	private By eventime=By.xpath("//div[@title='Export to Event Timeline']");
	private By evendb=By.xpath("//div[@title='Export to Event Dashboard']");
	private By gplot=By.xpath("//div[@title='Graphical plot']");
	private By exppdf=By.xpath("//span[normalize-space()='Export PDF']");
	private By closegp=By.xpath(".//button[span[contains(@class, 'k-i-x')]]");
	private By mac=By.xpath("//div[@title='Export in MAC format']");
	private By okbutton=By.xpath("//button[normalize-space()='OK']");
	private By map=By.xpath("//div[@title='Show on Map']");
	private By entityloc=By.xpath("//location-plot-entity-dialog/kendo-dialog/div/div/div/div/div/div/input[@value=\"entitylocations\"]");
	private By tellocation=By.xpath("//location-plot-entity-dialog/kendo-dialog/div/div/div/div/div/div/input[@value=\"telecomlocations\"]");
	private By otherlocation=By.xpath("//location-plot-entity-dialog/kendo-dialog/div/div/div/div/div/div/input[@value=\"otherlocations\"]");
	private By plot=By.xpath("//button[normalize-space()='Plot']");
	
	
	
	
	
	public QueryNextentity() {
		PageFactory.initElements(driver, this);
	}
	
	public void QueryNextentitylocators() throws InterruptedException, IOException, CsvValidationException {
		log=new LoginPage();
		eve=new DropDown();
		dndropdown=new DynamicSelectDropdown();			
		
		
		log.signin(prop.getProperty("username"), prop.getProperty("password"));
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement menus = wait.until(ExpectedConditions.visibilityOfElementLocated(menu));
	    menus.click();
	    WebElement collations = wait.until(ExpectedConditions.visibilityOfElementLocated(Utilities));
	    collations.click();
	    WebElement Indivisuals = wait.until(ExpectedConditions.visibilityOfElementLocated(DynamicQuery));
	    Indivisuals.click();   
	    eve.kendodropdownlist("title", "Organization");
	    WebElement rulebutton = wait.until(ExpectedConditions.visibilityOfElementLocated(rule));
	    rulebutton.click();
	    eve.kendodropdownlist("name", "Group");
	    
	    
	    
	    WebElement executebutton = wait.until(ExpectedConditions.visibilityOfElementLocated(execute));
	    executebutton.click();
	    Thread.sleep(20000);
	    WebElement checkboxbutton = wait.until(ExpectedConditions.visibilityOfElementLocated(selectall));
	    checkboxbutton.click();
	    WebElement forwardbutton = wait.until(ExpectedConditions.visibilityOfElementLocated(forward));
	    forwardbutton.click();
	    eve.kendodropdownlist("title", "Individual");
	    WebElement checkboxbutton1 = wait.until(ExpectedConditions.visibilityOfElementLocated(selectall));
	    checkboxbutton1.click();
	    WebElement forwardbutton1 = wait.until(ExpectedConditions.visibilityOfElementLocated(forward));
	    forwardbutton1.click();
	    eve.kendodropdownlist("title", "Event");
	    WebElement checkboxbutton2 = wait.until(ExpectedConditions.visibilityOfElementLocated(selectall));
	    checkboxbutton2.click();
	    WebElement exportbutton = wait.until(ExpectedConditions.visibilityOfElementLocated(export));
	    exportbutton.click();
	    WebElement exportdbbutton = wait.until(ExpectedConditions.visibilityOfElementLocated(exportdb));
	    exportdbbutton.click();
//	    driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
//	    Thread.sleep(5000);
//	    GetDownloadedFilePath();  
	    WebElement exportbutton1 = wait.until(ExpectedConditions.visibilityOfElementLocated(export));
	    exportbutton1.click();
	    WebElement hiredbbutton = wait.until(ExpectedConditions.visibilityOfElementLocated(hiredb));
	    hiredbbutton.click();
	    WebElement exporthirerepbutton = wait.until(ExpectedConditions.visibilityOfElementLocated(exporthirerep));
	    exporthirerepbutton.click();
	    WebElement closehiredbbutton = wait.until(ExpectedConditions.visibilityOfElementLocated(closehiredb));
	    closehiredbbutton.click();
	    WebElement exportbutton2 = wait.until(ExpectedConditions.visibilityOfElementLocated(export));
	    exportbutton2.click();
	    WebElement eventimebutton = wait.until(ExpectedConditions.visibilityOfElementLocated(eventime));
	    eventimebutton.click();
	    WebElement closehiredbeventimebutton = wait.until(ExpectedConditions.visibilityOfElementLocated(closehiredb));
	    closehiredbeventimebutton.click();
	    WebElement exportbutton3 = wait.until(ExpectedConditions.visibilityOfElementLocated(export));
	    exportbutton3.click();
	    WebElement evendbbutton = wait.until(ExpectedConditions.visibilityOfElementLocated(evendb));
	    evendbbutton.click();
	    WebElement closehiredbevendbbutton = wait.until(ExpectedConditions.visibilityOfElementLocated(closehiredb));
	    closehiredbevendbbutton.click();
	    WebElement exportbutton4 = wait.until(ExpectedConditions.visibilityOfElementLocated(export));
	    exportbutton4.click();
	    WebElement gplotbutton = wait.until(ExpectedConditions.visibilityOfElementLocated(gplot));
	    gplotbutton.click();
	    WebElement exppdfbutton = wait.until(ExpectedConditions.visibilityOfElementLocated(exppdf));
	    exppdfbutton.click();
	    WebElement closegpbutton = wait.until(ExpectedConditions.visibilityOfElementLocated(closegp));
	    closegpbutton.click();
	    WebElement exportbutton5 = wait.until(ExpectedConditions.visibilityOfElementLocated(export));
	    exportbutton5.click();
	    WebElement macbutton = wait.until(ExpectedConditions.visibilityOfElementLocated(mac));
	    macbutton.click();
	    WebElement okbuttons = wait.until(ExpectedConditions.visibilityOfElementLocated(okbutton));
	    okbuttons.click();
	    WebElement exportbutton6 = wait.until(ExpectedConditions.visibilityOfElementLocated(export));
	    exportbutton6.click();
	    WebElement mapbuttons = wait.until(ExpectedConditions.visibilityOfElementLocated(map));
	    mapbuttons.click();
	    WebElement entitylocbuttons = wait.until(ExpectedConditions.visibilityOfElementLocated(entityloc));
	    entitylocbuttons.click();
	    WebElement tellocationbuttons = wait.until(ExpectedConditions.visibilityOfElementLocated(tellocation));
	    tellocationbuttons.click();
	    WebElement otherlocationbuttons = wait.until(ExpectedConditions.visibilityOfElementLocated(otherlocation));
	    otherlocationbuttons.click();
	    WebElement plotbuttons = wait.until(ExpectedConditions.visibilityOfElementLocated(plot));
	    plotbuttons.click();
	    WebElement closemapbuttons = wait.until(ExpectedConditions.visibilityOfElementLocated(closehiredb));
	    closemapbuttons.click();
	    
	    
	    

}
	public static void GetDownloadedFilePath() throws CsvValidationException {
	    
	        // Define the download directory
	        String downloadDirectory = "C:\\Users\\user\\Downloads";
	        String fileName = "";
	        System.out.println("GetDownloadedFilePath Called");

	        // Create a File object for the directory
	        File dir = new File(downloadDirectory);

	        // Get the list of all files in the directory
	        File[] files = dir.listFiles();

	        if (files != null && files.length > 0) {
	            for (File file : files) {
	                // Print the absolute path of each file
	                System.out.println("Downloaded file: " + file.getAbsolutePath());
	                if(file.getName().startsWith("Export_")) {
	                	fileName = file.getAbsolutePath();
	                }
	            }
	        } else {
	            System.out.println("No files found in the download directory.");
	        }
	        System.out.println("File Name = "+ fileName);
	        
	        
//	        try (FileInputStream fis = new FileInputStream(fileName);
//	                XWPFDocument document = new XWPFDocument(fis)) {
//
//	               // Loop through paragraphs and print the text
//	               for (XWPFParagraph paragraph : document.getParagraphs()) {
//	                   System.out.println(paragraph.getText());
//	               }
//
//	           } catch (IOException e) {
//	               System.err.println("Error reading the Word file: " + e.getMessage());
//	               e.printStackTrace();
//	           }
	       
	        
	        
	        
	        try (CSVReader reader = new CSVReader(new FileReader(fileName))) {
	            // Read all rows
	            int rowCount = 0;
	            while (reader.readNext() != null) {
	                rowCount++;
	            }

	            // Print the number of rows
	            System.out.println("Number of rows in the CSV file: " + rowCount);

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	
	        File deletFile = new File(fileName);

	        if (deletFile.exists()) {
	            if (deletFile.delete()) {
	                System.out.println("File deleted successfully: " + fileName);
	            } else {
	                System.out.println("Failed to delete the file: " + fileName);
	            }
	        } else {
	            System.out.println("File not found: " + fileName);
	        }
	    }
	}

