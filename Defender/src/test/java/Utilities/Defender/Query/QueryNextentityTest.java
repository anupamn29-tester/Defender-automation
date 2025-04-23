package Utilities.Defender.Query;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.opencsv.exceptions.CsvValidationException;

import Utilities.DynamicQuery.QueryNextentity;
import collation.Defender.BaseClassSetup;

public class QueryNextentityTest extends BaseClassSetup{

	QueryNextentity QueryNext;
	
	public QueryNextentityTest() {
		super();
	}
	@BeforeTest
	public void lunchchrome() throws InterruptedException {
		lunch();
	}
	
	@AfterMethod
	public void exit() {
		driver.quit();
	}
	@Test
	public void QueryNextentityExecution() throws InterruptedException, IOException, CsvValidationException {

		QueryNext=new QueryNextentity();
		QueryNext.QueryNextentitylocators();
	}
}
