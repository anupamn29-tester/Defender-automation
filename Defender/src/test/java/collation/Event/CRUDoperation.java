package collation.Event;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import collation.Defender.BaseClassSetup;
import collation.Defender.locator.Event.EventMaster;
import collation.Defender.locator.Event.EventMasterAssets;
import collation.Defender.locator.Event.EventMasterAssetsDel;
import collation.Defender.locator.Event.EventMasterAssociates;
import collation.Defender.locator.Event.EventMasterLocations;
import collation.Defender.locator.Event.EventMasterOrganizations;
import collation.Defender.locator.Event.EventMasterRefDel;
import collation.Defender.locator.Event.EventMasterReferences;
import collation.Defender.locator.Event.EventMasterRelatedEvents;

public class CRUDoperation extends BaseClassSetup {
	
	EventMaster event;
	EventMasterReferences ref;
	EventMasterLocations location;
	EventMasterAssociates evenmaster;
	EventMasterOrganizations eveorga;
	EventMasterRelatedEvents relevent;
	EventMasterAssets eveassets;
	EventMasterAssetsDel assetdel;
	EventMasterRefDel refdel;
	
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
	public void Eventmastercreate() throws InterruptedException {
		event=new EventMaster();
		ref =new EventMasterReferences();
		location=new EventMasterLocations();
		evenmaster=new EventMasterAssociates();
		eveorga=new EventMasterOrganizations();
		relevent=new EventMasterRelatedEvents();
		eveassets=new EventMasterAssets();
		assetdel=new EventMasterAssetsDel();
		refdel=new EventMasterRefDel();
		event.evenlocators();
		Thread.sleep(3000);
		ref.Referenceslocators();
		Thread.sleep(3000);
		location.locdetails();
		Thread.sleep(3000);
		evenmaster.evenmasterlocator();
		Thread.sleep(3000);
		eveorga.organizationlocators();
		Thread.sleep(3000);
		relevent.RelatedEventslocators();
		Thread.sleep(3000);
		eveassets.Assetslocators();
		Thread.sleep(3000);
		assetdel.Disassociate();
		Thread.sleep(3000);
		refdel.RefDisassociate();
		Thread.sleep(3000);
	}  
	

}
