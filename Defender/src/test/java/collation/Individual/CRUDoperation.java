package collation.Individual;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import collation.Defender.BaseClassSetup;
import collation.Defender.locators.Individual.Appearance;
import collation.Defender.locators.Individual.Artifacts;
import collation.Defender.locators.Individual.Assets;
import collation.Defender.locators.Individual.Associates;
import collation.Defender.locators.Individual.Events;
import collation.Defender.locators.Individual.Finance;
import collation.Defender.locators.Individual.Individual;
import collation.Defender.locators.Individual.Locations;
import collation.Defender.locators.Individual.Media;
import collation.Defender.locators.Individual.Organizations;
import collation.Defender.locators.Individual.References;
import collation.Defender.locators.Individual.SocialMedia;
import collation.Defender.locators.Individual.Telecom;

public class CRUDoperation extends BaseClassSetup{
	
	Individual ind;
	Appearance apc;
	Locations loc;
	Telecom tec;
	SocialMedia social;
	Artifacts art;
	References ref;
	Finance fin;
	Associates Aso;
	Organizations org;
	Events eve;
	Media med;
	Assets ast;
	
	public CRUDoperation() {
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
	public void CRUDoperations() throws InterruptedException {
		ind=new Individual();
		apc=new Appearance();
		loc=new Locations();
		tec=new Telecom();
		social=new SocialMedia();
		art=new Artifacts();
		ref=new References();
		fin=new Finance();
		Aso=new Associates();
		org=new Organizations();
		eve=new Events();
		med=new Media();
		ast=new Assets();
		ind.Individuallocators();
		apc.Appearancelocators();
		loc.locationlocators();
		tec.Telecomlocators();
		social.SocialMedialocators();
		art.Artifactslocators();
		ref.Referenceslocators();
		fin.Financelocators();
		Aso.Associateslocators();
		org.Organizationslocators();
		eve.Eventslocators();
		med.Medialocators();
		ast.Assetslocators();
		
}
}
