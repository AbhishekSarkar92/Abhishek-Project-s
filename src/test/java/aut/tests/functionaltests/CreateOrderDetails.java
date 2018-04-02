package aut.tests.functionaltests;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.excel.Xls_Reader;

import aut.bluestrata.pages.PhysicianPortal;

import dweb.test.templates.TestTemplate;
import dweb.test.templates.TestTemplateMethodLevelInit;

public class CreateOrderDetails extends TestTemplateMethodLevelInit {
	Xls_Reader xls = new Xls_Reader("C:\\Users\\E002489\\git\\JTAFi18n\\src\\test\\resources\\testdata\\WebAutomationTestData.xlsx");


	@Test
	public void CreateOrderDetailsForResident(ITestContext testContext)
	{
		PhysicianPortal physicianPortal=new PhysicianPortal(threadLocalWebDriver.get(), TestTemplate.testReport);
		physicianPortal.ClickOnPhysicianPortal();
		//physicianPortal.ClickOnExistingResident(xls.getCellData(physicianportal, 0, 1));
		physicianPortal.ClickOnExistingResident("201332147");
		physicianPortal.CreateAnOrderWithOrderDetails("Treatment","New Text","10","5","R29.710 - NIHSS score 10","TestDR, Test","Singh, Vishal","Telephone");
		physicianPortal.CreateOrderFrequency(1,"Routine","No End","Height","Height","LPN","","10","Once a Shift","Daily","1","Comments","Comments");
		physicianPortal.AddOrderFrequency();
		physicianPortal.CreateOrderFrequency(2,"PRN","No End","Height","Height","LPN","10","10","Once a Shift","Daily","1","Comments","Comments");
		physicianPortal.AddOrderFrequency();
		physicianPortal.CreateOrderFrequency(3,"PRN Every (x) Hour(s)","No End","Height","Height","LPN","10","10","Once a Shift","Daily","1","Comments","Comments");
		physicianPortal.SaveOrderFrequency();
}
}

