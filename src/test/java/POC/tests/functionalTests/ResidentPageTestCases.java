package POC.tests.functionalTests;

import java.awt.AWTException;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import POC.pages.POC_HomePage;
import POC.pages.POC_ResidentPage;
import dweb.test.templates.TestTemplate;
import dweb.test.templates.TestTemplateMethodLevelInit;

public class ResidentPageTestCases extends TestTemplateMethodLevelInit {
	
	@Test()
	public void POC_QA271_New_And_Manage_Data_For_The_Care_Areas(ITestContext testContext)
	{
		POC_HomePage pocHome = new POC_HomePage(threadLocalWebDriver.get(), TestTemplate.testReport);
		POC_ResidentPage pocResident = new POC_ResidentPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		
		String PassCode = this.getTestParameter(testContext, "passCode");

		pocHome.ClickOnIcon("Setup user's fingerprint");
		pocHome.SelectUserAndVerifyCalculator("jen.martin");
		pocHome.EnterPasscode(PassCode);
		pocResident.VerifyResidentDashBoard();
		pocResident.SelectUserByName("Linda Allen");
		pocResident.VerifyResidentDetails();
		pocResident.VerifyCarePlansInResidentPage();
		pocResident.BigLogoutFromApplication();
		pocHome.ShutDownTheApplication();
	}
	
	//@Test()
	public void POC_QA272_Activity_Of_Daily_Livings_ADLs_First_Screen(ITestContext testContext) throws AWTException
	{
		POC_HomePage pocHome = new POC_HomePage(threadLocalWebDriver.get(), TestTemplate.testReport);
		POC_ResidentPage pocResident = new POC_ResidentPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		
		String PassCode = this.getTestParameter(testContext, "passCode");
		pocHome.ClickOnIcon("Setup user's fingerprint");
		pocHome.SelectUserAndVerifyCalculator("jen.martin");
		pocHome.EnterPasscode(PassCode);
		pocResident.VerifyResidentDashBoard();
		pocResident.SelectUserByName("Linda Allen");
		pocResident.SelectActivityOptionFromMatrix("ADLs");
		pocResident.EditingAndRemovingADLsRecords();
		pocResident.VerifyADLsSelfPerformentAndSupport();		
		pocResident.AddADLsActivities("Independent","Independent");
		pocResident.VerifyADLResidentKioskNotes();
		pocResident.EditADLEntryForShifts();
		pocResident.BigLogoutFromApplication();
		pocHome.ShutDownTheApplication();
	}
	
	//@Test()
	public void POC_QA273_User_Able_To_Record_An_ADLs_Activity_Of_Daily_Livings_ADLs_for_BedMobility(ITestContext testContext)
	{
		POC_HomePage pocHome = new POC_HomePage(threadLocalWebDriver.get(), TestTemplate.testReport);
		POC_ResidentPage pocResident = new POC_ResidentPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		
		String PassCode = this.getTestParameter(testContext, "passCode");
		pocHome.ClickOnIcon("Setup user's fingerprint");
		pocHome.SelectUserAndVerifyCalculator("jen.martin");
		pocHome.EnterPasscode(PassCode);
		pocResident.VerifyResidentDashBoard();
		pocResident.SelectUserByName("Martha Allison");
		pocResident.SelectActivityOptionFromMatrix("Bed Mobility");
		pocResident.EditingAndRemovingADLsRecords();
		pocResident.VerifyColourBeforeSelectingOptions("Bed Mobility");
		pocResident.VerifyActivityCapabilities("Bed Mobility");
		pocResident.VerifyActivitySelfPerformanceAndSupport("Independent","Independent");
		pocResident.VerifyColourAfterSelectingOptions("Bed Mobility");
		pocResident.VerifySelectedButtonInResultsTab("Bed Mobility","Total Care","One Person");
		pocResident.BigLogoutFromApplication();
		pocHome.ShutDownTheApplication();
	}
	
	//@Test()
	public void POC_QA274_User_Able_To_Record_An_ADLs_Activity_Of_Daily_Livings_ADLs_for_Transfer(ITestContext testContext)
	{
		POC_HomePage pocHome = new POC_HomePage(threadLocalWebDriver.get(), TestTemplate.testReport);
		POC_ResidentPage pocResident = new POC_ResidentPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		
		String PassCode = this.getTestParameter(testContext, "passCode");
		pocHome.ClickOnIcon("Setup user's fingerprint");
		pocHome.SelectUserAndVerifyCalculator("jen.martin");
		pocHome.EnterPasscode(PassCode);
		pocResident.VerifyResidentDashBoard();
		pocResident.SelectUserByName("Martha Allison");
		pocResident.SelectActivityOptionFromMatrix("Transfer");
		pocResident.EditingAndRemovingADLsRecords();
		pocResident.VerifyColourBeforeSelectingOptions("Transfer");
		pocResident.VerifyActivityCapabilities("Transfer");
		pocResident.VerifyActivitySelfPerformanceAndSupport("Independent","Independent");
		pocResident.VerifyColourAfterSelectingOptions("Transfer");
		pocResident.VerifySelectedButtonInResultsTab("Transfer","Independent","Independent");
		pocResident.BigLogoutFromApplication();
		pocHome.ShutDownTheApplication();
	}
	
	
	//@Test()
	public void POC_QA275_User_Able_To_Record_An_ADLs_Activity_Of_Daily_Livings_ADLs_for_WalkInRoom(ITestContext testContext)
	{
		POC_HomePage pocHome = new POC_HomePage(threadLocalWebDriver.get(), TestTemplate.testReport);
		POC_ResidentPage pocResident = new POC_ResidentPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		
		String PassCode = this.getTestParameter(testContext, "passCode");
		pocHome.ClickOnIcon("Setup user's fingerprint");
		pocHome.SelectUserAndVerifyCalculator("jen.martin");
		pocHome.EnterPasscode(PassCode);
		pocResident.VerifyResidentDashBoard();
		pocResident.SelectUserByName("Martha Allison");
		pocResident.SelectActivityOptionFromMatrix("Walk In Room");
		pocResident.EditingAndRemovingADLsRecords();
		pocResident.VerifyColourBeforeSelectingOptions("Walk In Room");
		pocResident.VerifyActivityCapabilities("Walk In Room");
		pocResident.VerifyActivitySelfPerformanceAndSupport("Independent","Independent");
		pocResident.VerifyColourAfterSelectingOptions("Walk In Room");
		pocResident.VerifySelectedButtonInResultsTab("Walk In Room","Independent","Independent");
		pocResident.BigLogoutFromApplication();
		pocHome.ShutDownTheApplication();
	}
	
	//@Test()
	public void POC_QA276_User_Able_To_Record_An_ADLs_Activity_Of_Daily_Livings_ADLs_for_WalkInCorridor(ITestContext testContext)
	{
		POC_HomePage pocHome = new POC_HomePage(threadLocalWebDriver.get(), TestTemplate.testReport);
		POC_ResidentPage pocResident = new POC_ResidentPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		
		String PassCode = this.getTestParameter(testContext, "passCode");
		pocHome.ClickOnIcon("Setup user's fingerprint");
		pocHome.SelectUserAndVerifyCalculator("jen.martin");
		pocHome.EnterPasscode(PassCode);
		pocResident.VerifyResidentDashBoard();
		pocResident.SelectUserByName("Martha Allison");
		pocResident.SelectActivityOptionFromMatrix("Walk In Corridor");
		pocResident.EditingAndRemovingADLsRecords();
		pocResident.VerifyColourBeforeSelectingOptions("Walk In Corridor");
		pocResident.VerifyActivityCapabilities("Walk In Corridor");
		pocResident.VerifyActivitySelfPerformanceAndSupport("Independent","Independent");
		pocResident.VerifyColourAfterSelectingOptions("Walk In Corridor");
		pocResident.VerifySelectedButtonInResultsTab("Walk In Corridor","Independent","Independent");
		pocResident.BigLogoutFromApplication();
		pocHome.ShutDownTheApplication();
	}

}
