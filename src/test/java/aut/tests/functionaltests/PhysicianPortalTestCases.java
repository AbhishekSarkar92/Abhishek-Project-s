package aut.tests.functionaltests;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.excel.Xls_Reader;

import aut.bluestrata.pages.HomePage;
import aut.bluestrata.pages.PhysicianPortal;

import dweb.test.templates.TestTemplate;
import dweb.test.templates.TestTemplateMethodLevelInit;

public class PhysicianPortalTestCases extends TestTemplateMethodLevelInit {
	
	@Test()
	public void QA07_ResidentOrders()
	{
		PhysicianPortal physicianPortal=new PhysicianPortal(threadLocalWebDriver.get(), TestTemplate.testReport);
		HomePage homepage = new HomePage(threadLocalWebDriver.get(), TestTemplate.testReport);
		
		physicianPortal.PhysicianPortalHeaderVerfication();
		
		
		
	}
	
	@Test()
	public void QA08_ResidentOrders()
	{
		PhysicianPortal physicianPortal=new PhysicianPortal(threadLocalWebDriver.get(), TestTemplate.testReport);
		HomePage homepage = new HomePage(threadLocalWebDriver.get(), TestTemplate.testReport);
		
		physicianPortal.PhysicianPortalHeaderVerfication();
		
		
		
	}
	
	
}
