package collation.Defender.locators.Individual;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import collation.Defender.BaseClassSetup;
import collation.Defender.DropDown;
import collation.Defender.DynamicSelectDropdown;
import collation.Defender.locator.Event.LoginPage;

public class SocialMedia extends BaseClassSetup{


	LoginPage log;
	DropDown eve;
	DynamicSelectDropdown dndropdown;
	
	private By menu=By.xpath("//li[@id=\"menus\"]/a/span");	
	private By collation=By.xpath("//span[normalize-space()='Collation']");
	private By Individual=By.xpath("//span[normalize-space()='Individual Master']");
	private By inputsearch=By.xpath("//kendo-textbox[@placeholder=\"Search in selected column...\"]/input");
	private By edit=By.xpath("//button[@title=\"Edit Record\"]");
	private By uname=By.xpath("//input[@data-cy=\"mediauser\"]");
	private By pass=By.xpath("//kendo-textbox[@data-cy=\"mediapassword\"]/input");
	private By medialink=By.xpath("//input[@id='medialink']");
	private By save=By.xpath("(//button[@class='btn btn-theme form_button ms-3 ng-star-inserted'])[1]");
	private By clearptype=By.xpath("//span[@title=\"clear\"]");
	private By Note=By.xpath("//kendo-textarea[@data-cy=\"note\"]/textarea");
	
	
	private By back=By.xpath("//button[@title=\"Click to Go Back to List\"]");
	
	public SocialMedia() {
		PageFactory.initElements(driver, this);
	}
	
	public void SocialMedialocators() throws InterruptedException {
		log=new LoginPage();
		eve=new DropDown();
		dndropdown=new DynamicSelectDropdown();
		//log.signin(prop.getProperty("username"), prop.getProperty("password"));
		WebDriverWait wait = new WebDriverWait(driver, 30);
		//WebElement menus = wait.until(ExpectedConditions.visibilityOfElementLocated(menu));
	    //menus.click();
	    //WebElement collations = wait.until(ExpectedConditions.visibilityOfElementLocated(collation));
	    //collations.click();
	    //WebElement Indivisuals = wait.until(ExpectedConditions.visibilityOfElementLocated(Individual));
	    //Indivisuals.click();   
		//eve.kendodropdownlist("displayName", "Name & Alias");
		//WebElement searchinput = wait.until(ExpectedConditions.visibilityOfElementLocated(inputsearch));
		//searchinput.click();
		//searchinput.sendKeys("p");
		
		//Extra added
				WebElement backbuttons = wait.until(ExpectedConditions.visibilityOfElementLocated(back));
				backbuttons.click();
		//End here
		
		WebElement edits = wait.until(ExpectedConditions.visibilityOfElementLocated(edit));
		edits.click();
		eve.kendotabstriptab("Social Media");
		dndropdown.kendocombobox("mediatype");
		String username=DynamicSelectDropdown.name();
		String password=DynamicSelectDropdown.name();
		System.out.println(username);
		System.out.println(password);
		
		WebElement usern = wait.until(ExpectedConditions.visibilityOfElementLocated(uname));
		usern.clear();
		usern.sendKeys(username);
		WebElement passw = wait.until(ExpectedConditions.visibilityOfElementLocated(pass));
		passw.clear();
		passw.sendKeys(password);
		WebElement mid = wait.until(ExpectedConditions.visibilityOfElementLocated(medialink));
		mid.clear();
		mid.sendKeys(generateRandomURL());
		WebElement saved = wait.until(ExpectedConditions.visibilityOfElementLocated(save));
		saved.click();
		Thread.sleep(500);
//		eve.validate();
	
		dndropdown.autoselecttable(driver, "presentation", 3);
		WebElement typeclear = wait.until(ExpectedConditions.visibilityOfElementLocated(clearptype));
		typeclear.click();
		dndropdown.kendocombobox("mediatype");
		WebElement Noted = wait.until(ExpectedConditions.visibilityOfElementLocated(Note));
		Noted.clear();
		Noted.sendKeys("Test");
		WebElement saveddata = wait.until(ExpectedConditions.visibilityOfElementLocated(save));
		saveddata.click();
		//eve.validate();	
}
	public static String generateRandomURL() {
        String[] domains = { "com", "net", "org", "io", "tech", "dev" };
        String[] protocols = { "http", "https" };
        String[] words = { "example", "test", "random", "website", "demo", "sample", "web", "portal" };

        Random random = new Random();

        // Generate random parts of the URL
        String protocol = protocols[random.nextInt(protocols.length)];
        String subdomain = words[random.nextInt(words.length)];
        String domain = words[random.nextInt(words.length)];
        String extension = domains[random.nextInt(domains.length)];

        // Generate a random path
        String path = "/page" + (random.nextInt(100) + 1);

        return protocol + "://" + subdomain + "." + domain + "." + extension + path;
    }
}