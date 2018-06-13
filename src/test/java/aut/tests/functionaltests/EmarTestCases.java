package aut.tests.functionaltests;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.excel.Xls_Reader;

import aut.bluestrata.pages.EmarPage;
import aut.bluestrata.pages.HomePage;
import aut.bluestrata.pages.LoginPage;
import dweb.aut.pages.templates.TestTemplateMethodLevelInit;
import dweb.test.templates.TestTemplate;

public class EmarTestCases extends TestTemplateMethodLevelInit {
	
	Xls_Reader xlsReader = new Xls_Reader("C:\\Bluestrata\\Abhishek-Project-s\\src\\test\\resources\\testdata\\BluestrataTestData.xlsx");
	final String SheetName = "emarPortal";
		
	
	@Test(enabled = false)
	public void QA116_LoginTo_EmarApplication(ITestContext testContext) throws Throwable
	{
		LoginPage login = new LoginPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		HomePage homepage = new HomePage(threadLocalWebDriver.get(), TestTemplate.testReport);
		EmarPage emar = new EmarPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		String userName = this.getTestParameter(testContext, "userName");
		String password = this.getTestParameter(testContext, "password");
		
		String TestCaseName = "QA116";
		
		HashMap<String , String> testData = xlsReader.GetValue(SheetName, TestCaseName);
			
		String parentWindow = homepage.NavigateToEmarWindow(testData.get("EmarURL"));
		login.login(userName, password);		
		emar.LogoutFromEmar();
		emar.ClosingEmarURL();
		emar.SwitchToHomePage(parentWindow);
		login.Logout();
		
	}
	
	
	@Test(enabled = false)
	public void QA117_UserNamePreferences_TopRightOf_ResidentDahsboard_Or_HomePage(ITestContext testContext) throws Throwable
	{
		LoginPage login = new LoginPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		HomePage homepage = new HomePage(threadLocalWebDriver.get(), TestTemplate.testReport);
		EmarPage emar = new EmarPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		String userName = this.getTestParameter(testContext, "userName");
		String password = this.getTestParameter(testContext, "password");
			
		String parentWindow = homepage.NavigateToEmarWindow("https://devapp.bluestrataemr.com/emar/dashboard");
		login.login(userName, password);		
		
		
		
		
		
		
		emar.LogoutFromEmar();
		emar.ClosingEmarURL();
		emar.SwitchToHomePage(parentWindow);
		login.Logout();
		
	}
	
	
	
	@Test(enabled = false)
	public void QA118_HelpMenuWith_HelpSiteAbout(ITestContext testContext) throws Throwable
	{
		LoginPage login = new LoginPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		HomePage homepage = new HomePage(threadLocalWebDriver.get(), TestTemplate.testReport);
		EmarPage emar = new EmarPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		String userName = this.getTestParameter(testContext, "userName");
		String password = this.getTestParameter(testContext, "password");
		
		String TestCaseName = "QA118";
		
		HashMap<String , String> testData = xlsReader.GetValue(SheetName, TestCaseName);
			
		String parentWindow = homepage.NavigateToEmarWindow(testData.get("EmarURL"));
		login.login(userName, password);
		emar.HelpButtonvalidation();	
		String ParentparentWindow = emar.HelpSiteValidation(testData.get("HelpSiteURL"));
		emar.ClosingEmarURL();
		emar.SwitchToHomePage(ParentparentWindow);
		
		emar.LogoutFromEmar();
		emar.ClosingEmarURL();
		emar.SwitchToHomePage(parentWindow);
		login.Logout();
		
	}
	
	
	@Test()
	public void QA119_ChangeAppWindowThrough_ApplicationMenuButton (ITestContext testContext) throws Throwable
	{
		LoginPage login = new LoginPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		HomePage homepage = new HomePage(threadLocalWebDriver.get(), TestTemplate.testReport);
		EmarPage emar = new EmarPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		String userName = this.getTestParameter(testContext, "userName");
		String password = this.getTestParameter(testContext, "password");
		
		String TestCaseName = "QA119";
		
		HashMap<String , String> testData = xlsReader.GetValue(SheetName, TestCaseName);
		
		homepage.VerifyAllapps();	
		String parentWindow = homepage.NavigateToEmarWindow(testData.get("EmarURL"));
		login.login(userName, password);
		emar.LogoutFromEmar();
		emar.ClosingEmarURL();
		emar.SwitchToHomePage(parentWindow);
		login.Logout();
		
	}
	
	
	@Test(enabled = false)
	public void QA120_ExploreEmar_DashboardPageUsing_eMARapp (ITestContext testContext) throws Throwable
	{
		LoginPage login = new LoginPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		HomePage homepage = new HomePage(threadLocalWebDriver.get(), TestTemplate.testReport);
		EmarPage emar = new EmarPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		String userName = this.getTestParameter(testContext, "userName");
		String password = this.getTestParameter(testContext, "password");
		
		String TestCaseName = "QA120";
		
		HashMap<String , String> testData = xlsReader.GetValue(SheetName, TestCaseName);
		
		homepage.VerifyAllapps();	
		String parentWindow = homepage.NavigateToEmarWindow(testData.get("EmarURL"));
		login.login(userName, password);
		emar.BlueStrataLogoValidation();
		emar.EmarPageHeaderValidation();
		emar.EmarPageButtonsVerification();
		emar.VerifyMessageButton();	
		emar.VerifyHomeAndDashBoard();
		emar.LogoutFromEmar();
		emar.ClosingEmarURL();
		emar.SwitchToHomePage(parentWindow);
		login.Logout();
		
	}
	
	
	@Test()
	public void QA121_LaunchPage_ViewOrderStatus_OneMARDashboard (ITestContext testContext) throws Throwable
	{
		LoginPage login = new LoginPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		HomePage homepage = new HomePage(threadLocalWebDriver.get(), TestTemplate.testReport);
		EmarPage emar = new EmarPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		String userName = this.getTestParameter(testContext, "userName");
		String password = this.getTestParameter(testContext, "password");
		
		String TestCaseName = "QA121";
		
		HashMap<String , String> testData = xlsReader.GetValue(SheetName, TestCaseName);
		
		homepage.VerifyAllapps();	
		String parentWindow = homepage.NavigateToEmarWindow(testData.get("EmarURL"));
		login.login(userName, password);		
		emar.EmarPageButtonsVerification();
		
		emar.LogoutFromEmar();
		emar.ClosingEmarURL();
		emar.SwitchToHomePage(parentWindow);
		login.Logout();
		
	}

}
