package collation.Organization;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import collation.Defender.BaseClassSetup;
import collation.Defender.locators.Organization.OrgArtifacts;
import collation.Defender.locators.Organization.OrgAssets;
import collation.Defender.locators.Organization.OrgAssociateOrganizations;
import collation.Defender.locators.Organization.OrgAssociates;
import collation.Defender.locators.Organization.OrgEvents;
import collation.Defender.locators.Organization.OrgFinance;
import collation.Defender.locators.Organization.OrgLocations;
import collation.Defender.locators.Organization.OrgMedia;
import collation.Defender.locators.Organization.OrgReferences;
import collation.Defender.locators.Organization.OrgSocialMedia;
import collation.Defender.locators.Organization.OrgTelecom;
import collation.Defender.locators.Organization.Organization;

public class CRUDOPERATION extends BaseClassSetup{

	Organization org;
	OrgLocations loc;
	OrgTelecom tec;
	OrgSocialMedia social;
	OrgArtifacts art;
	OrgReferences ref;
	OrgFinance orgf;
	OrgAssociates Aso;
	OrgAssociateOrganizations orgas;
	OrgEvents eve;
	OrgMedia orgm;
	OrgAssets ast;
	
	public CRUDOPERATION() {
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
	public void CRUDOPERATIONcreate() throws InterruptedException, IOException {
		org=new Organization();
		loc=new OrgLocations();
		tec=new OrgTelecom();
		social=new OrgSocialMedia();
		art=new OrgArtifacts();
		ref=new OrgReferences();
		orgf=new OrgFinance();
		Aso=new OrgAssociates();
		orgas=new OrgAssociateOrganizations();
		eve=new OrgEvents();
		orgm=new OrgMedia();
		ast=new OrgAssets();

		org.Organizationlocators();
		loc.Orglocationlocators();
		tec.OrgTelecomLocators();
		social.OrgSocialMedialocators();
		art.OrgArtifactslocators();
		ref.OrgReferenceslocators();
		orgf.OrgFinancelocators();
		Aso.OrgAssociateslocators();
		orgas.OrgAssociateOrganizationslocators();
		eve.OrgEventslocators();
		orgm.OrgMedialocators();
		ast.OrgAssetslocators();
	}
}
