package aut.tests.functionaltests;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.excel.Xls_Reader;
import com.google.common.io.Resources;

import aut.bluestrata.pages.HomePage;
import aut.bluestrata.pages.LoginPage;
import aut.bluestrata.pages.PhysicianPortal;

import dweb.test.templates.TestTemplate;
import dweb.test.templates.TestTemplateMethodLevelInit;

public class PhysicianPortalTestCases extends TestTemplateMethodLevelInit {
	
	@Test(priority=1)
	public void QA07_ResidentOrders(ITestContext testContext) throws URISyntaxException
	{
		PhysicianPortal physicianPortal=new PhysicianPortal(threadLocalWebDriver.get(), TestTemplate.testReport);
		HomePage homepage = new HomePage(threadLocalWebDriver.get(), TestTemplate.testReport);
		LoginPage login = new LoginPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		
		URL urlFilePath = Resources.getResource("testdata/WebAutomationTest.xlsx");
		String filePath = Paths.get(urlFilePath.toURI()).toFile().getAbsolutePath();
		Xls_Reader xlsReader = new Xls_Reader(filePath);
		
		String userName = this.getTestParameter(testContext, "userName");
		String password = this.getTestParameter(testContext, "password");
		String key = this.getTestParameter(testContext, "key");
		
		login.login(userName, password, key);
		
		homepage.NavigateToPhysicianPortal();
		
		physicianPortal.PhysicianPortalHeaderVerfication();
		physicianPortal.VerifyPhysicianPortalDrropdown();
		physicianPortal.VerifyResidentPageHeaderHeading();
		physicianPortal.VerifytheFieldsDisplayDownToMessage();
		physicianPortal.CounttheNoOfResidentInAPage();
		physicianPortal.AssendingOrderUsingFirstName();
		physicianPortal.AssendingOrderUsingLastName();
		physicianPortal.AssendingOrderUsingMr();
		physicianPortal.ClickOnExistingResident("201332147");		
		physicianPortal.VerifyPreviousOrders();
		physicianPortal.VerifyButtonInResidentOrders();
		physicianPortal.FullOrderPageVerification();
		
		login.Logout();
		
	}
	
	@Test(enabled = false)
	public void QA08_ResidentOrders_CreateAnOrder(ITestContext testContext)
	{
		String userName = this.getTestParameter(testContext, "userName");
		String password = this.getTestParameter(testContext, "password");
		String key = this.getTestParameter(testContext, "key");
		
		PhysicianPortal physicianPortal=new PhysicianPortal(threadLocalWebDriver.get(), TestTemplate.testReport);
		HomePage homepage = new HomePage(threadLocalWebDriver.get(), TestTemplate.testReport);
		LoginPage login = new LoginPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		
		login.login(userName, password, key);
		
		TestTemplate.testReport.logSuccess("Click to Physician Portal From Menu Bar");
		homepage.NavigateToPhysicianPortal();
		
		TestTemplate.testReport.logSuccess("Navigate to Residents Order From Physician Portal");
		physicianPortal.ClickOnPhysicianPortal();	
		
		TestTemplate.testReport.logSuccess("Click On existing Resident");
		physicianPortal.ClickOnExistingResident("201332171");
		
		physicianPortal.ResidentFullOrderDetailsWithoutMedication(type,libraryText,createdType);
		physicianPortal.ResidentFullOrderDetails(type ,nullDiagonisis ,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType, ReceivedByType,ReceivedOrderType,routes,WrittenDate,NoOfRefillis,WhenToFill);
		
		login.Logout();
		
		login.login(userName, password, key);
		
		TestTemplate.testReport.logSuccess("Click to Physician Portal From Menu Bar");
		homepage.NavigateToPhysicianPortal();
		
		TestTemplate.testReport.logSuccess("Navigate to Residents Order From Physician Portal");
		physicianPortal.ClickOnPhysicianPortal();	
		
		TestTemplate.testReport.logSuccess("Click On existing Resident");
		physicianPortal.ClickOnExistingResident("201332171");
		
		physicianPortal.ResidentFullOrderDetailsWithoutMedication(type,libraryText,createdType);
		physicianPortal.ResidentFullOrderDetails(type ,nullDiagonisis ,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType, ReceivedByType,ReceivedOrderType,routes,WrittenDate,NoOfRefillis,WhenToFill);
		
		login.Logout();
		
		login.login(userName, password, key);
		
		TestTemplate.testReport.logSuccess("Click to Physician Portal From Menu Bar");
		homepage.NavigateToPhysicianPortal();
		
		TestTemplate.testReport.logSuccess("Navigate to Residents Order From Physician Portal");
		physicianPortal.ClickOnPhysicianPortal();	
		
		TestTemplate.testReport.logSuccess("Click On existing Resident");
		physicianPortal.ClickOnExistingResident("201332171");
		
		physicianPortal.ResidentFullOrderDetailsWithoutMedication(type,libraryText,createdType);
		physicianPortal.ResidentFullOrderDetails(type ,nullDiagonisis ,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType, ReceivedByType,ReceivedOrderType,routes,WrittenDate,NoOfRefillis,WhenToFill);
		
		login.Logout();
		
		login.login(userName, password, key);
		
		TestTemplate.testReport.logSuccess("Click to Physician Portal From Menu Bar");
		homepage.NavigateToPhysicianPortal();
		
		TestTemplate.testReport.logSuccess("Navigate to Residents Order From Physician Portal");
		physicianPortal.ClickOnPhysicianPortal();	
		
		TestTemplate.testReport.logSuccess("Click On existing Resident");
		physicianPortal.ClickOnExistingResident("201332171");
		
		physicianPortal.ResidentFullOrderDetailsWithoutMedication(type,libraryText,createdType);
		physicianPortal.ResidentFullOrderDetails(type ,nullDiagonisis ,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType, ReceivedByType,ReceivedOrderType,routes,WrittenDate,NoOfRefillis,WhenToFill);
		
		login.Logout();
		
		login.login(userName, password, key);
		
		TestTemplate.testReport.logSuccess("Click to Physician Portal From Menu Bar");
		homepage.NavigateToPhysicianPortal();
		
		TestTemplate.testReport.logSuccess("Navigate to Residents Order From Physician Portal");
		physicianPortal.ClickOnPhysicianPortal();	
		
		TestTemplate.testReport.logSuccess("Click On existing Resident");
		physicianPortal.ClickOnExistingResident("201332171");
		
		physicianPortal.ResidentFullOrderDetailsWithoutMedication(type,libraryText,createdType);
		physicianPortal.ResidentFullOrderDetails(type ,nullDiagonisis ,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType, ReceivedByType,ReceivedOrderType,routes,WrittenDate,NoOfRefillis,WhenToFill);
		
		login.Logout();
		
		login.login(userName, password, key);
		
		TestTemplate.testReport.logSuccess("Click to Physician Portal From Menu Bar");
		homepage.NavigateToPhysicianPortal();
		
		TestTemplate.testReport.logSuccess("Navigate to Residents Order From Physician Portal");
		physicianPortal.ClickOnPhysicianPortal();	
		
		TestTemplate.testReport.logSuccess("Click On existing Resident");
		physicianPortal.ClickOnExistingResident("201332171");
		
		physicianPortal.ResidentFullOrderDetailsWithoutMedication(type,libraryText,createdType);
		physicianPortal.ResidentFullOrderDetails(type ,nullDiagonisis ,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType, ReceivedByType,ReceivedOrderType,routes,WrittenDate,NoOfRefillis,WhenToFill);
		
		login.Logout();
		
		login.login(userName, password, key);
		
		TestTemplate.testReport.logSuccess("Click to Physician Portal From Menu Bar");
		homepage.NavigateToPhysicianPortal();
		
		TestTemplate.testReport.logSuccess("Navigate to Residents Order From Physician Portal");
		physicianPortal.ClickOnPhysicianPortal();	
		
		TestTemplate.testReport.logSuccess("Click On existing Resident");
		physicianPortal.ClickOnExistingResident("201332171");
		
		physicianPortal.ResidentFullOrderDetailsWithoutMedication(type,libraryText,createdType);
		physicianPortal.ResidentFullOrderDetails(type ,nullDiagonisis ,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType, ReceivedByType,ReceivedOrderType,routes,WrittenDate,NoOfRefillis,WhenToFill);
		
		login.Logout();
		
		
	}
	
	
}
