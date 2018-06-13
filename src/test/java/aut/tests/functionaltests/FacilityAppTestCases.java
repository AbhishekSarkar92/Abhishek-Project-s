package aut.tests.functionaltests;

import java.util.ArrayList;
import java.util.HashMap;

import org.testng.annotations.Test;

import com.excel.Xls_Reader;
import com.utilities.ReusableLibs;

import aut.bluestrata.pages.FacilityPage;
import aut.bluestrata.pages.HomePage;
import aut.bluestrata.pages.LoginPage;
import aut.bluestrata.pages.PhysicianPortalPage;
import dweb.aut.pages.templates.TestTemplateMethodLevelInit;
import dweb.test.templates.TestTemplate;

public class FacilityAppTestCases extends TestTemplateMethodLevelInit {
	
	
	Xls_Reader xlsReader = new Xls_Reader("C:\\Bluestrata\\Abhishek-Project-s\\src\\test\\resources\\testdata\\BluestrataTestData.xlsx");
	 
	final String SheetName = "facilityPortal";
	
	@Test(enabled =false)
	public void QA037_CreateAnOrderSetsviaFacilityAppfor_DetailsType()
	{
		PhysicianPortalPage physicianPortal=new PhysicianPortalPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		HomePage homepage = new HomePage(threadLocalWebDriver.get(), TestTemplate.testReport);
		LoginPage login = new LoginPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		FacilityPage facilityPage = new FacilityPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		
		
		/*String description = xlsReader.getCellData("facilityPortal", 0, 3)+physicianPortal.GenarateRandomNumber();
		String type = xlsReader.getCellData("facilityPortal", 1, 3);
		String routes = xlsReader.getCellData("facilityPortal", 2, 3);
		String libraryText = xlsReader.getCellData("facilityPortal", 3, 3);*/
		final String testCase = "QA037";
		
		HashMap<String ,String> testdata = xlsReader.GetValue(SheetName,testCase);
				
		
		
		homepage.NavigateToFacilityPortal();
		facilityPage.ManageOrdersSets();
		facilityPage.VerifyTheFieldsAfterClickingOnTheCreateOrderSetsButton();
		facilityPage.CreateOrderSetDescription(testdata.get("description")+physicianPortal.GenarateRandomNumber(),testdata.get("type"),testdata.get("routes"),testdata.get("libraryText"));
		facilityPage.VerifyButtonsinVerifyFields();
		login.Logout();
	}
	
	@Test(enabled =false)
	public void QA038_AddingFrequencyInNewlyCreatedOrderSetsViaFacilityAppFor_DetailsType_WithFrequencyType_Routine()
	{
		PhysicianPortalPage physicianPortal=new PhysicianPortalPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		HomePage homepage = new HomePage(threadLocalWebDriver.get(), TestTemplate.testReport);
		LoginPage login = new LoginPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		FacilityPage facilityPage = new FacilityPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		
		/*String description = xlsReader.getCellData("facilityPortal", 0, 6)+physicianPortal.GenarateRandomNumber();
		String type1 = xlsReader.getCellData("facilityPortal", 1, 6);
		String type2 = xlsReader.getCellData("facilityPortal", 2, 6);
		String type3 = xlsReader.getCellData("facilityPortal", 3, 6);
		String type4 = xlsReader.getCellData("facilityPortal", 4, 6);
		String type5 = xlsReader.getCellData("facilityPortal", 5, 6);
		String type6 = xlsReader.getCellData("facilityPortal", 6, 6);
		String type7 = xlsReader.getCellData("facilityPortal", 7, 6);
		String routes = xlsReader.getCellData("facilityPortal", 8, 6);
		String libraryText = xlsReader.getCellData("facilityPortal", 9, 6);
		String num = xlsReader.getCellData("facilityPortal", 10, 6);
		String frequencyType = xlsReader.getCellData("facilityPortal", 11, 6);
		String startDate = xlsReader.getCellData("facilityPortal", 12, 6);  
		String ByDate =startDate;
		String startDateTime = xlsReader.getCellData("facilityPortal", 13, 6);
		String byDateTime =startDateTime ;
		String byDateno = xlsReader.getCellData("facilityPortal", 14, 6);
		String afterNoOfAdminstrationsNo = xlsReader.getCellData("facilityPortal", 15, 6);		
		String endDate = xlsReader.getCellData("facilityPortal", 16, 6);
		String afterNumberOfAdminstrations = xlsReader.getCellData("facilityPortal", 17, 6);
		String requiredActions = xlsReader.getCellData("facilityPortal", 18, 6);
		String othersRequiredActions = xlsReader.getCellData("facilityPortal", 19, 6);
		String requiredActionsPostDropdown = xlsReader.getCellData("facilityPortal", 20, 6);
		String othersRequiredActionsPostDropdown = xlsReader.getCellData("facilityPortal", 21, 6);
		String administeredBy = xlsReader.getCellData("facilityPortal", 22, 6);
		String maxDoesHours = xlsReader.getCellData("facilityPortal", 23, 6);
		String followUpAfterMinutes = xlsReader.getCellData("facilityPortal", 24, 6);
		String slidingScaleMin = xlsReader.getCellData("facilityPortal", 25, 6);
		String slidingScaleMax = xlsReader.getCellData("facilityPortal", 26, 6);
		String slidingScaleUnits = xlsReader.getCellData("facilityPortal", 27, 6);
		String frequency = xlsReader.getCellData("facilityPortal", 28, 6);
		String howOften = xlsReader.getCellData("facilityPortal", 29, 6);
		String everyDay = xlsReader.getCellData("facilityPortal", 30, 6);
		String physicianInstructions = xlsReader.getCellData("facilityPortal", 31, 6);
		String additionalInstruction = physicianInstructions ;
		String endDateType = xlsReader.getCellData("facilityPortal", 32, 6);
		String endDateType1 = xlsReader.getCellData("facilityPortal", 33, 6);
		String endDateType2 = xlsReader.getCellData("facilityPortal", 34, 6);
		String TypeOfMode = xlsReader.getCellData("facilityPortal", 35, 6);
		String howOften1 = xlsReader.getCellData("facilityPortal", 36, 6);
		String howOften2 = xlsReader.getCellData("facilityPortal", 37, 6);
		String howOften3 = xlsReader.getCellData("facilityPortal", 38, 6);
		String DropdownNumber = xlsReader.getCellData("facilityPortal", 39, 6);
		String DropdownDay = xlsReader.getCellData("facilityPortal", 40, 6);
		String TypeOfMode1 = xlsReader.getCellData("facilityPortal", 41, 6);
		String scheduleOnMonth = xlsReader.getCellData("facilityPortal", 42, 6);*/
		
		final String testCase = "QA038";
		HashMap<String ,String> testdata = xlsReader.GetValue(SheetName,testCase);
		

		homepage.NavigateToFacilityPortal();
		facilityPage.ManageOrdersSets();
		facilityPage.CreateOrderSetDescription(testdata.get("description")+physicianPortal.GenarateRandomNumber()+testdata.get("type1"),testdata.get("type1"),testdata.get("routes"),testdata.get("libraryText"));
		physicianPortal.OrderFrequencyType(Integer.parseInt(testdata.get("num")),testdata.get("frequencyType"));		
		physicianPortal.RequireActionRelatedLabel((Integer.parseInt(testdata.get("num"))+1),testdata.get("frequencyType") ,testdata.get("requiredActions"),testdata.get("othersRequiredActions") ,testdata.get("requiredActionsPostDropdown"),testdata.get("othersRequiredActionsPostDropdown"), testdata.get("administeredBy"),testdata.get("maxDoesHours"),testdata.get("followUpAfterMinutes"),testdata.get("slidingScaleMin") , testdata.get("slidingScaleMax"), testdata.get("slidingScaleUnits"));
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(testdata.get("num")),testdata.get("frequency"));
		physicianPortal.HowOftenDailyType(Integer.parseInt(testdata.get("num")),testdata.get("howOften"),testdata.get("everyDay"));
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(testdata.get("num")),testdata.get("physicianInstructions"),testdata.get("physicianInstructions"),testdata.get("type1"));
		facilityPage.VerifyButtonsinVerifyFields();
		physicianPortal.SaveOrderFrequency();
		facilityPage.VerifyManageOrderFromSets(testdata.get("description")+physicianPortal.GenarateRandomNumber()+testdata.get("type1")+testdata.get("type1"));
		
		facilityPage.CreateOrderSet();
		facilityPage.CreateOrderSetDescription(testdata.get("description")+physicianPortal.GenarateRandomNumber()+testdata.get("type2"),testdata.get("type2"),testdata.get("routes"),testdata.get("libraryText"));
		physicianPortal.OrderFrequencyType(Integer.parseInt(testdata.get("num")),testdata.get("frequencyType"));		
		physicianPortal.RequireActionRelatedLabel((Integer.parseInt(testdata.get("num"))+1),testdata.get("frequencyType") ,testdata.get("requiredActions"),testdata.get("othersRequiredActions") ,testdata.get("requiredActionsPostDropdown"),testdata.get("othersRequiredActionsPostDropdown"), testdata.get("administeredBy"),testdata.get("maxDoesHours"),testdata.get("followUpAfterMinutes"),testdata.get("slidingScaleMin") , testdata.get("slidingScaleMax"), testdata.get("slidingScaleUnits"));
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(testdata.get("num")),testdata.get("frequency"));
		physicianPortal.HowOftenDailyType(Integer.parseInt(testdata.get("num")),testdata.get("howOften"),testdata.get("everyDay"));
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(testdata.get("num")),testdata.get("physicianInstructions"),testdata.get("physicianInstructions"),testdata.get("type2"));
		facilityPage.VerifyButtonsinVerifyFields();
		physicianPortal.SaveOrderFrequency();
		facilityPage.VerifyManageOrderFromSets(testdata.get("description")+physicianPortal.GenarateRandomNumber()+testdata.get("type2")+testdata.get("type2"));
		
		facilityPage.CreateOrderSet();
		facilityPage.CreateOrderSetDescription(testdata.get("description")+physicianPortal.GenarateRandomNumber()+testdata.get("type3"),testdata.get("type3"),testdata.get("routes"),testdata.get("libraryText"));
		physicianPortal.OrderFrequencyType(Integer.parseInt(testdata.get("num")),testdata.get("frequencyType"));		
		/*physicianPortal.RequireActionRelatedLabel((Integer.parseInt(testdata.get("num"))+1),testdata.get("frequencyType") ,testdata.get("requiredActions"),testdata.get("othersRequiredActions") ,testdata.get("requiredActionsPostDropdown"),testdata.get("othersRequiredActionsPostDropdown"), testdata.get("administeredBy"),testdata.get("maxDoesHours"),testdata.get("followUpAfterMinutes"),testdata.get("slidingScaleMin") , testdata.get("slidingScaleMax"), testdata.get("slidingScaleUnits"));
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(testdata.get("num")),testdata.get("frequency"));
		physicianPortal.HowOftenDailyType(Integer.parseInt(testdata.get("num")),testdata.get("howOften"),testdata.get("everyDay"));*/
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(testdata.get("num")),testdata.get("physicianInstructions"),testdata.get("physicianInstructions"),testdata.get("type3"));
		facilityPage.VerifyButtonsinVerifyFields();
		physicianPortal.SaveOrderFrequency();
		facilityPage.VerifyManageOrderFromSets(testdata.get("description")+physicianPortal.GenarateRandomNumber()+testdata.get("type3")+testdata.get("type3"));
		
		
		facilityPage.CreateOrderSet();
		facilityPage.CreateOrderSetDescription(testdata.get("description")+physicianPortal.GenarateRandomNumber()+testdata.get("type4"),testdata.get("type4"),testdata.get("routes"),testdata.get("libraryText"));
		physicianPortal.OrderFrequencyType(Integer.parseInt(testdata.get("num")),testdata.get("frequencyType"));		
		physicianPortal.RequireActionRelatedLabel((Integer.parseInt(testdata.get("num"))+1),testdata.get("frequencyType") ,testdata.get("requiredActions"),testdata.get("othersRequiredActions") ,testdata.get("requiredActionsPostDropdown"),testdata.get("othersRequiredActionsPostDropdown"), testdata.get("administeredBy"),testdata.get("maxDoesHours"),testdata.get("followUpAfterMinutes"),testdata.get("slidingScaleMin") , testdata.get("slidingScaleMax"), testdata.get("slidingScaleUnits"));
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(testdata.get("num")),testdata.get("frequency"));
		physicianPortal.HowOftenDailyType(Integer.parseInt(testdata.get("num")),testdata.get("howOften"),testdata.get("everyDay"));
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(testdata.get("num")),testdata.get("physicianInstructions"),testdata.get("physicianInstructions"),testdata.get("type4"));
		facilityPage.VerifyButtonsinVerifyFields();
		physicianPortal.SaveOrderFrequency();
		facilityPage.VerifyManageOrderFromSets(testdata.get("description")+physicianPortal.GenarateRandomNumber()+testdata.get("type4")+testdata.get("type4"));
		
		
		facilityPage.CreateOrderSet();
		facilityPage.CreateOrderSetDescription(testdata.get("description")+physicianPortal.GenarateRandomNumber()+testdata.get("type5"),testdata.get("type5"),testdata.get("routes"),testdata.get("libraryText"));
		physicianPortal.OrderFrequencyType(Integer.parseInt(testdata.get("num")),testdata.get("frequencyType"));		
		physicianPortal.RequireActionRelatedLabel((Integer.parseInt(testdata.get("num"))+1),testdata.get("frequencyType") ,testdata.get("requiredActions"),testdata.get("othersRequiredActions") ,testdata.get("requiredActionsPostDropdown"),testdata.get("othersRequiredActionsPostDropdown"), testdata.get("administeredBy"),testdata.get("maxDoesHours"),testdata.get("followUpAfterMinutes"),testdata.get("slidingScaleMin") , testdata.get("slidingScaleMax"), testdata.get("slidingScaleUnits"));
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(testdata.get("num")),testdata.get("frequency"));
		physicianPortal.HowOftenDailyType(Integer.parseInt(testdata.get("num")),testdata.get("howOften"),testdata.get("everyDay"));
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(testdata.get("num")),testdata.get("physicianInstructions"),testdata.get("physicianInstructions"),testdata.get("type5"));
		facilityPage.VerifyButtonsinVerifyFields();
		physicianPortal.SaveOrderFrequency();
		facilityPage.VerifyManageOrderFromSets(testdata.get("description")+physicianPortal.GenarateRandomNumber()+testdata.get("type5")+testdata.get("type5"));
		
		
		facilityPage.CreateOrderSet();
		facilityPage.CreateOrderSetDescription(testdata.get("description")+physicianPortal.GenarateRandomNumber()+testdata.get("type6"),testdata.get("type6"),testdata.get("routes"),testdata.get("libraryText"));
		physicianPortal.OrderFrequencyType(Integer.parseInt(testdata.get("num")),testdata.get("frequencyType"));		
		physicianPortal.RequireActionRelatedLabel((Integer.parseInt(testdata.get("num"))+1),testdata.get("frequencyType") ,testdata.get("requiredActions"),testdata.get("othersRequiredActions") ,testdata.get("requiredActionsPostDropdown"),testdata.get("othersRequiredActionsPostDropdown"), testdata.get("administeredBy"),testdata.get("maxDoesHours"),testdata.get("followUpAfterMinutes"),testdata.get("slidingScaleMin") , testdata.get("slidingScaleMax"), testdata.get("slidingScaleUnits"));
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(testdata.get("num")),testdata.get("frequency"));
		physicianPortal.HowOftenDailyType(Integer.parseInt(testdata.get("num")),testdata.get("howOften"),testdata.get("everyDay"));
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(testdata.get("num")),testdata.get("physicianInstructions"),testdata.get("physicianInstructions"),testdata.get("type6"));
		facilityPage.VerifyButtonsinVerifyFields();
		physicianPortal.SaveOrderFrequency();
		facilityPage.VerifyManageOrderFromSets(testdata.get("description")+physicianPortal.GenarateRandomNumber()+testdata.get("type6")+testdata.get("type6"));
		
		
		facilityPage.CreateOrderSet();
		facilityPage.CreateOrderSetDescription(testdata.get("description")+physicianPortal.GenarateRandomNumber()+testdata.get("type7"),testdata.get("type7"),testdata.get("routes"),testdata.get("libraryText"));
		physicianPortal.OrderFrequencyType(Integer.parseInt(testdata.get("num")),testdata.get("frequencyType"));		
		physicianPortal.RequireActionRelatedLabel((Integer.parseInt(testdata.get("num"))+1),testdata.get("frequencyType") ,testdata.get("requiredActions"),testdata.get("othersRequiredActions") ,testdata.get("requiredActionsPostDropdown"),testdata.get("othersRequiredActionsPostDropdown"), testdata.get("administeredBy"),testdata.get("maxDoesHours"),testdata.get("followUpAfterMinutes"),testdata.get("slidingScaleMin") , testdata.get("slidingScaleMax"), testdata.get("slidingScaleUnits"));
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(testdata.get("num")),testdata.get("frequency"));
		physicianPortal.HowOftenDailyType(Integer.parseInt(testdata.get("num")),testdata.get("howOften"),testdata.get("everyDay"));
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(testdata.get("num")),testdata.get("physicianInstructions"),testdata.get("physicianInstructions"),testdata.get("type7"));
		facilityPage.VerifyButtonsinVerifyFields();
		physicianPortal.SaveOrderFrequency();
		facilityPage.VerifyManageOrderFromSets(testdata.get("description")+physicianPortal.GenarateRandomNumber()+testdata.get("type7")+testdata.get("type7"));
		
		login.Logout();
		
		
		
	}
	
	
	@Test()
	public void QA039_FrequencyFieldSelection_WithFrequencyType_Routine()
	{
		PhysicianPortalPage physicianPortal=new PhysicianPortalPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		HomePage homepage = new HomePage(threadLocalWebDriver.get(), TestTemplate.testReport);
		LoginPage login = new LoginPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		FacilityPage facilityPage = new FacilityPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		
		/*String description = xlsReader.getCellData("facilityPortal", 0, 9)+physicianPortal.GenarateRandomNumber();
		String type1 = xlsReader.getCellData("facilityPortal", 1, 9);
		String type2 = xlsReader.getCellData("facilityPortal", 2, 9);
		String type3 = xlsReader.getCellData("facilityPortal", 3, 9);
		String type4 = xlsReader.getCellData("facilityPortal", 4, 9);
		String type5 = xlsReader.getCellData("facilityPortal", 5, 9);
		String type6 = xlsReader.getCellData("facilityPortal", 6, 9);
		String type7 = xlsReader.getCellData("facilityPortal", 7, 9);
		String libraryText = xlsReader.getCellData("facilityPortal", 8, 9);			
		String SearchDiogonosisTxt = xlsReader.getCellData("facilityPortal", 9, 9);
		String medicarePriority = xlsReader.getCellData("facilityPortal", 10, 9);
		String diogonosisName = xlsReader.getCellData("facilityPortal", 11, 9);
		String physicianType = xlsReader.getCellData("facilityPortal", 12, 9);
		String ReceivedByType = xlsReader.getCellData("facilityPortal", 13, 9);
		String ReceivedOrderType = xlsReader.getCellData("facilityPortal", 14, 9);		
		String routes = xlsReader.getCellData("facilityPortal", 15, 9);
		String WrittenDate = xlsReader.getCellData("facilityPortal", 16, 9);
		String NoOfRefillis = xlsReader.getCellData("facilityPortal", 17, 9);
		String WhenToFill = xlsReader.getCellData("facilityPortal", 18, 9);
		String num = xlsReader.getCellData("facilityPortal", 19, 9);
		String frequencyType = xlsReader.getCellData("facilityPortal", 20, 9);
		String startDate = xlsReader.getCellData("facilityPortal", 21, 9);  
		String ByDate =startDate;
		String startDateTime = xlsReader.getCellData("facilityPortal", 22, 9);
		String byDateTime =startDateTime ;
		String byDateno = xlsReader.getCellData("facilityPortal", 23, 9);
		String afterNoOfAdminstrationsNo = xlsReader.getCellData("physicianportal", 24, 9);		
		String endDate = xlsReader.getCellData("physicianportal", 25, 9);
		String afterNumberOfAdminstrations = xlsReader.getCellData("facilityPortal", 26, 9);
		String requiredActions = xlsReader.getCellData("facilityPortal", 27, 9);
		String othersRequiredActions = xlsReader.getCellData("facilityPortal", 28, 9);
		String requiredActionsPostDropdown = xlsReader.getCellData("facilityPortal", 29, 9);
		String othersRequiredActionsPostDropdown = xlsReader.getCellData("facilityPortal", 30, 9);
		String administeredBy = xlsReader.getCellData("facilityPortal", 31, 9);
		String maxDoesHours = xlsReader.getCellData("facilityPortal", 32, 9);
		String followUpAfterMinutes = xlsReader.getCellData("facilityPortal", 33, 9);
		String slidingScaleMin = xlsReader.getCellData("facilityPortal", 34, 9);
		String slidingScaleMax = xlsReader.getCellData("facilityPortal", 35, 9);
		String slidingScaleUnits = xlsReader.getCellData("facilityPortal", 36, 9);
		String frequency = xlsReader.getCellData("facilityPortal", 37, 9);
		String howOften = xlsReader.getCellData("facilityPortal", 38, 9);
		String everyDay = xlsReader.getCellData("facilityPortal", 39, 9);
		String physicianInstructions = xlsReader.getCellData("facilityPortal", 40, 9);
		String additionalInstruction = physicianInstructions ;
		String endDateType = xlsReader.getCellData("facilityPortal", 42, 9);
		String frequency2 = xlsReader.getCellData("facilityPortal", 43, 9);
		String frequency3 = xlsReader.getCellData("facilityPortal", 44, 9);
		String frequency4 = xlsReader.getCellData("facilityPortal", 45, 9);
		String frequency5 = xlsReader.getCellData("facilityPortal", 46, 9);
		String frequency6 = xlsReader.getCellData("facilityPortal", 47, 9);
		String frequency7 = xlsReader.getCellData("facilityPortal", 48, 9);
		String frequencyTexttype = xlsReader.getCellData("facilityPortal", 49, 9);
		String frequencyTexttype1 = xlsReader.getCellData("facilityPortal", 50, 9);
		String timeInADayTime = xlsReader.getCellData("facilityPortal", 51, 9);
		String timeInADayShift = xlsReader.getCellData("facilityPortal", 52, 9);
		String frequency8 = xlsReader.getCellData("facilityPortal", 53, 9);
		String frequency9 = xlsReader.getCellData("facilityPortal", 54, 9);
		String frequency10 = xlsReader.getCellData("facilityPortal", 55, 9);
		String frequency11 = xlsReader.getCellData("facilityPortal", 56, 9);
		String frequency12 = xlsReader.getCellData("facilityPortal", 57, 9);
		String frequency13 = xlsReader.getCellData("facilityPortal", 58, 9);
		String frequency14 = xlsReader.getCellData("facilityPortal", 59, 9);
		String frequency15 = xlsReader.getCellData("facilityPortal", 60, 9);
		String timeInADayShiftBedTime = xlsReader.getCellData("facilityPortal", 61, 9);
		String frequency16 = xlsReader.getCellData("facilityPortal", 62, 9);
		String frequency17 = xlsReader.getCellData("facilityPortal", 63, 9);
		String frequency18 = xlsReader.getCellData("facilityPortal", 64, 9);
		String frequency19 = xlsReader.getCellData("facilityPortal", 65, 9);
		String frequency20 = xlsReader.getCellData("facilityPortal", 66, 9);
	    String frequency21 = xlsReader.getCellData("facilityPortal", 67, 9);*/
		
	    final String testCase = "QA039";
		HashMap<String ,String> testdata = xlsReader.GetValue(SheetName,testCase);

		homepage.NavigateToFacilityPortal();
		facilityPage.ManageOrdersSets();
		
		 String[] typeArray= {testdata.get("type1"),testdata.get("type2"),testdata.get("type4"),testdata.get("type5"),testdata.get("type6"),testdata.get("type7")};
		    int numberOfItems = typeArray.length;
		    for (int i=0; i<numberOfItems; i++)
			    		        
			{
			
		    	String type = typeArray[i];
		    	
		    	String Description = testdata.get("description")+physicianPortal.GenarateRandomNumber()+type;
		    	
		    	facilityPage.CreateOrderSetDescription(Description,type,testdata.get("routes"),testdata.get("libraryText"));
				physicianPortal.OrderFrequencyType(Integer.parseInt(testdata.get("num")),testdata.get("frequencyType"));		
				physicianPortal.RequireActionRelatedLabel((Integer.parseInt(testdata.get("num"))+1),testdata.get("frequencyType") ,testdata.get("requiredActions"),testdata.get("othersRequiredActions") ,testdata.get("requiredActionsPostDropdown"),testdata.get("othersRequiredActionsPostDropdown"), testdata.get("administeredBy"),testdata.get("maxDoesHours"),testdata.get("followUpAfterMinutes"),testdata.get("slidingScaleMin") , testdata.get("slidingScaleMax"), testdata.get("slidingScaleUnits"));
				physicianPortal.OnceAShiftFrequency(Integer.parseInt(testdata.get("num")),testdata.get("frequency"));
				physicianPortal.HowOftenDailyType(Integer.parseInt(testdata.get("num")),testdata.get("howOften"),testdata.get("everyDay"));
				physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(testdata.get("num")),testdata.get("physicianInstructions"),testdata.get("physicianInstructions"),type);
		    	
		    	
		    	
		    	
		   	/*facilityPage.CreateOrderSetDescription(description+type,type,routes,libraryText);
		   	physicianPortal.OrderFrequencyType(Integer.parseInt(num),frequencyType);	
			physicianPortal.RequireActionRelatedLabel((Integer.parseInt(num)+1),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
			physicianPortal.OnceAShiftFrequency(Integer.parseInt(num),frequency);
			physicianPortal.HowOftenDailyType(Integer.parseInt(num),howOften,everyDay);
			physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num),physicianInstructions,additionalInstruction,type);*/
			
			physicianPortal.AddOrderFrequency();
			
			
			
			for(int newnum=2;newnum<=21;newnum ++)
			{
		
			physicianPortal.OrderFrequencyType(newnum,testdata.get("frequencyType"));
			physicianPortal.RequireActionRelatedLabel((newnum+1),testdata.get("frequencyType") ,testdata.get("requiredActions"),testdata.get("othersRequiredActions") ,testdata.get("requiredActionsPostDropdown"),testdata.get("othersRequiredActionsPostDropdown"), testdata.get("administeredBy"),testdata.get("maxDoesHours"),testdata.get("followUpAfterMinutes"),testdata.get("slidingScaleMin") , testdata.get("slidingScaleMax"), testdata.get("slidingScaleUnits"));
			switch (newnum)
			{
			case 2:	
				physicianPortal.ShiftFrequency((newnum+1) ,testdata.get("frequency2") );
				break;
			case 3:				
		    	physicianPortal.ShiftFrequency((newnum+1) ,testdata.get("frequency3") );
				break;
			case 4:					
				physicianPortal.ShiftFrequency((newnum+1) ,testdata.get("frequency4") );
				break;
			case 5:				
				physicianPortal.ShiftFrequency((newnum+1) ,testdata.get("frequency5") );
				break;
			case 6:				
				physicianPortal.ShiftFrequency((newnum+1) ,testdata.get("frequency6") );
				break;
			case 7:				
				physicianPortal.ShiftFrequency((newnum+1) ,testdata.get("frequency7") );
				break;
			case 8:		
				physicianPortal.ShiftFrequency((newnum+1) ,testdata.get("frequency8") );
				break;
			case 9:	
				physicianPortal.HourWiseFrequency((newnum+1) ,testdata.get("frequency9") ,testdata.get("timeInADayTime") );
		     	break;		    	
			case 10:
				physicianPortal.HourWiseFrequency((newnum+1) ,testdata.get("frequency10") ,testdata.get("timeInADayTime") );
		     	break;			   
			case 11:	
				physicianPortal.HourWiseFrequency((newnum+1) ,testdata.get("frequency11") ,testdata.get("timeInADayTime") );
		     	break;		    	
			case 12:	
				physicianPortal.HourWiseFrequency((newnum+1) ,testdata.get("frequency12") ,testdata.get("timeInADayTime") );
		     	break;			    
			case 13:
				physicianPortal.HourWiseFrequency((newnum+1) ,testdata.get("frequency13") ,testdata.get("timeInADayTime") );
		     	break;		    	
			case 14:
				physicianPortal.HourWiseFrequency((newnum+1) ,testdata.get("frequency14") ,testdata.get("timeInADayTime") );
		     	break;		    		  	
			case 15:	
				physicianPortal.HourWiseFrequency((newnum+1) ,testdata.get("frequency15") ,testdata.get("timeInADayTime") );
		     	break;				
			case 16:
				physicianPortal.ShiftFrequency((newnum+1) ,testdata.get("frequency16") );
				break;		    	
			case 17:	
				physicianPortal.ShiftFrequency((newnum+1) ,testdata.get("frequency17") );
				break;				
			case 18:
				physicianPortal.ShiftFrequency((newnum+1) ,testdata.get("frequency18") );
				break;				
			case 19:
				physicianPortal.ShiftFrequency((newnum+1) ,testdata.get("frequency19") );
				break;				
			case 20:	
				physicianPortal.ShiftFrequency((newnum+1) ,testdata.get("frequency20") );
				break;				
			case 21:
				physicianPortal.ShiftFrequency((newnum+1) ,testdata.get("frequency21") );
				break;
				
		   
			
			}
			String[] FrequencyNames = {testdata.get("frequency2"),testdata.get("frequency3"),testdata.get("frequency4"),testdata.get("frequency5"),testdata.get("frequency6"),testdata.get("frequency7"),testdata.get("frequency8"),testdata.get("frequency9"),testdata.get("frequency10"),
					testdata.get("frequency11"),testdata.get("frequency12"),testdata.get("frequency13"),testdata.get("frequency14"),testdata.get("frequency15"),testdata.get("frequency16"),testdata.get("frequency17"),testdata.get("frequency18"),testdata.get("frequency19"),testdata.get("frequency20"),testdata.get("frequency21")};
			 
			String FrequencyName = FrequencyNames[newnum-2];
			
			
			
			if(FrequencyName!=testdata.get("frequency21"))
			{
			physicianPortal.HowOftenDailyType(newnum,testdata.get("howOften"),testdata.get("everyDay"));
			}
		
			physicianPortal.CreateOrderFrequencyForRoutine(newnum,testdata.get("physicianInstructions"),testdata.get("physicianInstructions"),type);		
			
			if(FrequencyName!=testdata.get("frequency21"))
			{
				physicianPortal.AddOrderFrequency();
			}
			
			
			}
			physicianPortal.SaveOrderFrequency();
			facilityPage.VerifyManageOrderFromSets(Description);
				
			
			}	
		    
		    
		    
		
		login.Logout();
		
		
		
	}
	
	@Test(enabled =false)
	public void QA040_HowOftenFieldSelection_WithFrequencyType_Routine()
	{
		PhysicianPortalPage physicianPortal=new PhysicianPortalPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		HomePage homepage = new HomePage(threadLocalWebDriver.get(), TestTemplate.testReport);
		LoginPage login = new LoginPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		FacilityPage facilityPage = new FacilityPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		
	//	Long GenerateNumber = physicianPortal.GenarateRandomNumber();
		
		
		/*String description = xlsReader.getCellData("facilityPortal", 0, 12)+physicianPortal.GenarateRandomNumber();
		String type1 = xlsReader.getCellData("facilityPortal", 1, 12);
		String type2 = xlsReader.getCellData("facilityPortal", 2, 12);
		String type3 = xlsReader.getCellData("facilityPortal", 3, 12);
		String type4 = xlsReader.getCellData("facilityPortal", 4, 12);
		String type5 = xlsReader.getCellData("facilityPortal", 5, 12);
		String type6 = xlsReader.getCellData("facilityPortal", 6, 12);
		String type7 = xlsReader.getCellData("facilityPortal", 7, 12);
		String libraryText = xlsReader.getCellData("facilityPortal", 8, 12);			
		String SearchDiogonosisTxt = xlsReader.getCellData("facilityPortal", 9, 12);
		String medicarePriority = xlsReader.getCellData("facilityPortal", 10, 12);
		String diogonosisName = xlsReader.getCellData("facilityPortal", 11, 12);
		String physicianType = xlsReader.getCellData("facilityPortal", 12, 12);
		String ReceivedByType = xlsReader.getCellData("facilityPortal", 13, 12);
		String ReceivedOrderType = xlsReader.getCellData("facilityPortal", 14, 12);		
		String routes = xlsReader.getCellData("facilityPortal", 15, 12);
		String WrittenDate = xlsReader.getCellData("facilityPortal", 16, 12);
		String NoOfRefillis = xlsReader.getCellData("facilityPortal", 17, 12);
		String WhenToFill = xlsReader.getCellData("facilityPortal", 18, 12);
		String num = xlsReader.getCellData("facilityPortal", 19, 12);
		String frequencyType = xlsReader.getCellData("facilityPortal", 20, 12);
		String startDate = xlsReader.getCellData("facilityPortal", 21, 12);  
		String ByDate =startDate;
		String startDateTime = xlsReader.getCellData("facilityPortal", 22, 12);
		String byDateTime =startDateTime ;
		String byDateno = xlsReader.getCellData("facilityPortal", 23, 12);
		String afterNoOfAdminstrationsNo = xlsReader.getCellData("facilityPortal", 24, 12);		
		String endDate = xlsReader.getCellData("facilityPortal", 25, 12);
		String afterNumberOfAdminstrations = xlsReader.getCellData("facilityPortal", 26, 12);
		String requiredActions = xlsReader.getCellData("facilityPortal", 27, 12);
		String othersRequiredActions = xlsReader.getCellData("facilityPortal", 28, 12);
		String requiredActionsPostDropdown = xlsReader.getCellData("facilityPortal", 29, 12);
		String othersRequiredActionsPostDropdown = xlsReader.getCellData("facilityPortal", 30, 12);
		String administeredBy = xlsReader.getCellData("facilityPortal", 31, 12);
		String maxDoesHours = xlsReader.getCellData("facilityPortal", 32, 12);
		String followUpAfterMinutes = xlsReader.getCellData("facilityPortal", 33, 12);
		String slidingScaleMin = xlsReader.getCellData("facilityPortal", 34, 12);
		String slidingScaleMax = xlsReader.getCellData("facilityPortal", 35, 12);
		String slidingScaleUnits = xlsReader.getCellData("facilityPortal", 36, 12);
		String frequency = xlsReader.getCellData("facilityPortal", 37, 12);
		String howOften = xlsReader.getCellData("facilityPortal", 38, 12);
		String everyDay = xlsReader.getCellData("facilityPortal", 39, 12);
		String physicianInstructions = xlsReader.getCellData("facilityPortal", 40, 12);
		String additionalInstruction = physicianInstructions ;
		String endDateType = xlsReader.getCellData("facilityPortal", 42, 12);
		String endDateType1 = xlsReader.getCellData("facilityPortal", 43, 12);
		String endDateType2 = xlsReader.getCellData("facilityPortal", 44, 12);
		String TypeOfMode = xlsReader.getCellData("facilityPortal", 45, 12);
		String howOften1 = xlsReader.getCellData("facilityPortal", 46, 12);
		String howOften2 = xlsReader.getCellData("facilityPortal", 47, 12);
		String howOften3 = xlsReader.getCellData("facilityPortal", 48, 12);
		String DropdownNumber = xlsReader.getCellData("facilityPortal", 49, 12);
		String DropdownDay = xlsReader.getCellData("facilityPortal", 50, 12);
		String TypeOfMode1 = xlsReader.getCellData("facilityPortal", 51, 12);
		String scheduleOnMonth = xlsReader.getCellData("facilityPortal", 52, 12);
		String num1= xlsReader.getCellData("facilityPortal", 53, 12); 
		String num2= xlsReader.getCellData("facilityPortal", 54, 12); 
		String num3= xlsReader.getCellData("facilityPortal", 55, 12); 
		String num4= xlsReader.getCellData("facilityPortal", 56, 12); 
		*/
		homepage.NavigateToFacilityPortal();
		
		
		 final String testCase = "QA040";
			HashMap<String ,String> testdata = xlsReader.GetValue(SheetName,testCase);
		
		
		String[] typeArray = {testdata.get("type1"),testdata.get("type2"),testdata.get("type4"),testdata.get("type5"),testdata.get("type6"),testdata.get("type7")};
		
		int numberOfItems = typeArray.length;
	    for (int i=0; i<numberOfItems; i++)
		    		        
		{
		
	    	String type = typeArray[i];
	    	
	  	facilityPage.ManageOrdersSets();
	  	facilityPage.VerifyButtonsinVerifyFields();
	  	
	  	String Description = testdata.get("description")+physicianPortal.GenarateRandomNumber()+type;
	
		TestTemplate.testReport.logSuccess("Create Order With Treatment Dropdown Option");
		
		facilityPage.CreateOrderSetDescription(Description,type,testdata.get("routes"),testdata.get("libraryText"));	
		physicianPortal.OrderFrequencyType(Integer.parseInt(testdata.get("num")),testdata.get("frequencyType"));
		physicianPortal.RequireActionRelatedLabel((Integer.parseInt(testdata.get("num"))+1),testdata.get("frequencyType") ,testdata.get("requiredActions"),testdata.get("othersRequiredActions") ,testdata.get("requiredActionsPostDropdown"),testdata.get("othersRequiredActionsPostDropdown"), testdata.get("administeredBy"),testdata.get("maxDoesHours"),testdata.get("followUpAfterMinutes"),testdata.get("slidingScaleMin") , testdata.get("slidingScaleMax"), testdata.get("slidingScaleUnits"));
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(testdata.get("num")),testdata.get("frequency"));
		physicianPortal.HowOftenDailyType(Integer.parseInt(testdata.get("num")),testdata.get("howOften"),testdata.get("everyDay"));
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(testdata.get("num")),testdata.get("physicianInstructions"),testdata.get("physicianInstructions"),type);
		

		TestTemplate.testReport.logSuccess("Create Frequency With  Weekly HowOften Dropdown Option");
		physicianPortal.AddOrderFrequency();
		physicianPortal.OrderFrequencyType(Integer.parseInt(testdata.get("num1")),testdata.get("frequencyType"));
		physicianPortal.RequireActionRelatedLabel((Integer.parseInt(testdata.get("num1"))+1),testdata.get("frequencyType") ,testdata.get("requiredActions"),testdata.get("othersRequiredActions") ,testdata.get("requiredActionsPostDropdown"),testdata.get("othersRequiredActionsPostDropdown"), testdata.get("administeredBy"),testdata.get("maxDoesHours"),testdata.get("followUpAfterMinutes"),testdata.get("slidingScaleMin") , testdata.get("slidingScaleMax"), testdata.get("slidingScaleUnits"));
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(testdata.get("num1")),testdata.get("frequency"));
		physicianPortal.HowOftenWeeklytype((Integer.parseInt(testdata.get("num1"))+1),Integer.parseInt(testdata.get("num")),testdata.get("howOften1"),testdata.get("everyDay"));
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(testdata.get("num1")),testdata.get("physicianInstructions"),testdata.get("physicianInstructions"),type);
		
		TestTemplate.testReport.logSuccess("Create Frequency With  Monthly HowOften Dropdown Option");
		physicianPortal.AddOrderFrequency();
		physicianPortal.OrderFrequencyType(Integer.parseInt(testdata.get("num2")),testdata.get("frequencyType"));
		physicianPortal.RequireActionRelatedLabel((Integer.parseInt(testdata.get("num2"))+1),testdata.get("frequencyType") ,testdata.get("requiredActions"),testdata.get("othersRequiredActions") ,testdata.get("requiredActionsPostDropdown"),testdata.get("othersRequiredActionsPostDropdown"), testdata.get("administeredBy"),testdata.get("maxDoesHours"),testdata.get("followUpAfterMinutes"),testdata.get("slidingScaleMin") , testdata.get("slidingScaleMax"), testdata.get("slidingScaleUnits"));
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(testdata.get("num2")),testdata.get("frequency"));
		physicianPortal.HowOftenMonthlytype(testdata.get("TypeOfMode"),Integer.parseInt(testdata.get("num2"))+1,Integer.parseInt(testdata.get("num")),Integer.parseInt(testdata.get("num2")),testdata.get("howOften2"),testdata.get("everyDay"),testdata.get("DropdownNumber"),testdata.get("DropdownDay"));
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(testdata.get("num2")),testdata.get("physicianInstructions"),testdata.get("physicianInstructions"),type);
		
		TestTemplate.testReport.logSuccess("Create Frequency With  Monthly HowOften Dropdown Option");
		physicianPortal.AddOrderFrequency();
		physicianPortal.OrderFrequencyType(Integer.parseInt(testdata.get("num3")),testdata.get("frequencyType"));
		physicianPortal.RequireActionRelatedLabel((Integer.parseInt(testdata.get("num3"))+1),testdata.get("frequencyType") ,testdata.get("requiredActions"),testdata.get("othersRequiredActions") ,testdata.get("requiredActionsPostDropdown"),testdata.get("othersRequiredActionsPostDropdown"), testdata.get("administeredBy"),testdata.get("maxDoesHours"),testdata.get("followUpAfterMinutes"),testdata.get("slidingScaleMin") , testdata.get("slidingScaleMax"), testdata.get("slidingScaleUnits"));
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(testdata.get("num3")),testdata.get("frequency"));
		physicianPortal.HowOftenMonthlytype(testdata.get("TypeOfMode1"),Integer.parseInt(testdata.get("num3"))+1,Integer.parseInt(testdata.get("num")),Integer.parseInt(testdata.get("num3")),testdata.get("howOften2"),testdata.get("everyDay"),testdata.get("DropdownNumber"),testdata.get("DropdownDay"));
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(testdata.get("num3")),testdata.get("physicianInstructions"),testdata.get("physicianInstructions"),type);
		
		TestTemplate.testReport.logSuccess("Create Frequency With Yearly HowOften Dropdown Option");
		physicianPortal.AddOrderFrequency();
		physicianPortal.OrderFrequencyType(Integer.parseInt(testdata.get("num4")),testdata.get("frequencyType"));
		physicianPortal.RequireActionRelatedLabel((Integer.parseInt(testdata.get("num4"))+1),testdata.get("frequencyType") ,testdata.get("requiredActions"),testdata.get("othersRequiredActions") ,testdata.get("requiredActionsPostDropdown"),testdata.get("othersRequiredActionsPostDropdown"), testdata.get("administeredBy"),testdata.get("maxDoesHours"),testdata.get("followUpAfterMinutes"),testdata.get("slidingScaleMin") , testdata.get("slidingScaleMax"), testdata.get("slidingScaleUnits"));
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(testdata.get("num4")),testdata.get("frequency"));
		physicianPortal.HowOftenYearlyType((Integer.parseInt(testdata.get("num4"))+1),Integer.parseInt(testdata.get("num")),testdata.get("howOften3"),testdata.get("scheduleOnMonth"),testdata.get("everyDay"),testdata.get("everyDay"));
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(testdata.get("num4")),testdata.get("physicianInstructions"),testdata.get("physicianInstructions"),type);
		physicianPortal.SaveOrderFrequency();
		
		facilityPage.VerifyManageOrderFromSets(Description);
		
		
		}		
		
		login.Logout();
	
	}	
	
	
	@Test(enabled =false)
	public void QA041_AddingFrequencyInNewCreatedOrderSetsVia_FacilityAppForDetailsType_WithFrequencyType_PNR()
	{
		PhysicianPortalPage physicianPortal=new PhysicianPortalPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		HomePage homepage = new HomePage(threadLocalWebDriver.get(), TestTemplate.testReport);
		LoginPage login = new LoginPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		FacilityPage facilityPage = new FacilityPage(threadLocalWebDriver.get(), TestTemplate.testReport);
			
		
		 final String testCase = "QA041";
			HashMap<String ,String> testdata = xlsReader.GetValue(SheetName,testCase);
		
		
		homepage.NavigateToFacilityPortal();
		
		
		
		String[] typeArray = {testdata.get("type1"),testdata.get("type2"),testdata.get("type4"),testdata.get("type5"),testdata.get("type6"),testdata.get("type7")};	
		int TypeSize = typeArray.length;
		for(int i=0;i<TypeSize;i++)
		
		{
		 String Type = typeArray[i];
		 
		 String Description = testdata.get("description")+physicianPortal.GenarateRandomNumber()+Type;
		 
		facilityPage.ManageOrdersSets();
		facilityPage.VerifyButtonsinVerifyFields();
		 
		facilityPage.CreateOrderSetDescription(Description,Type,testdata.get("routes"),testdata.get("libraryText"));	
		physicianPortal.OrderFrequencyType(Integer.parseInt(testdata.get("num")),testdata.get("frequencyType"));
		physicianPortal.RequireActionRelatedLabel((Integer.parseInt(testdata.get("num"))+1),testdata.get("frequencyType") ,testdata.get("requiredActions"),testdata.get("othersRequiredActions") ,testdata.get("requiredActionsPostDropdown"),testdata.get("othersRequiredActionsPostDropdown"), testdata.get("administeredBy"),testdata.get("maxDoesHours"),testdata.get("followUpAfterMinutes"),testdata.get("slidingScaleMin") , testdata.get("slidingScaleMax"), testdata.get("slidingScaleUnits"));
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(testdata.get("num")),testdata.get("physicianInstructions"),testdata.get("physicianInstructions"),Type);
		physicianPortal.SaveOrderFrequency();
		
		facilityPage.VerifyManageOrderFromSets(Description);
		
		}
		
		
		login.Logout();
	}
	
	
	
	@Test(enabled =false)
	public void QA042_AddingFrequencyInNewCreatedOrderSetsVia_FacilityAppForDetailsType_WithFrequencyType_PNREveryHour()
	{
		PhysicianPortalPage physicianPortal=new PhysicianPortalPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		HomePage homepage = new HomePage(threadLocalWebDriver.get(), TestTemplate.testReport);
		LoginPage login = new LoginPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		FacilityPage facilityPage = new FacilityPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		
		
		final String testCase = "QA042";
		HashMap<String ,String> testdata = xlsReader.GetValue(SheetName,testCase);
		
		
		homepage.NavigateToFacilityPortal();
		
		
		
		String[] typeArray = {testdata.get("type1"),testdata.get("type2"),testdata.get("type4"),testdata.get("type5"),testdata.get("type6"),testdata.get("type7")};	
		
		int TypeSize = typeArray.length;
		for(int i=0;i<TypeSize;i++)
		
		{
		 String Type = typeArray[i];
		 
		 String Description = testdata.get("description")+physicianPortal.GenarateRandomNumber()+Type;
		 
		facilityPage.ManageOrdersSets();
		facilityPage.VerifyButtonsinVerifyFields();
		 
		facilityPage.CreateOrderSetDescription(Description,Type,testdata.get("routes"),testdata.get("libraryText"));	
		physicianPortal.OrderFrequencyType(Integer.parseInt(testdata.get("num")),testdata.get("frequencyType"));
		physicianPortal.RequireActionRelatedLabel((Integer.parseInt(testdata.get("num"))+1),testdata.get("frequencyType") ,testdata.get("requiredActions"),testdata.get("othersRequiredActions") ,testdata.get("requiredActionsPostDropdown"),testdata.get("othersRequiredActionsPostDropdown"), testdata.get("administeredBy"),testdata.get("maxDoesHours"),testdata.get("followUpAfterMinutes"),testdata.get("slidingScaleMin") , testdata.get("slidingScaleMax"), testdata.get("slidingScaleUnits"));
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(testdata.get("num")),testdata.get("physicianInstructions"),testdata.get("physicianInstructions"),Type);
		physicianPortal.SaveOrderFrequency();
		
		facilityPage.VerifyManageOrderFromSets(Description);
		
		}
		
		login.Logout();
		
	}
	
	@Test(enabled =false)
	public void QA043_CreateAnOrderSetsVia_FacilityApp_ForDetailsType_TreatmentWithMedication_And_Medication()
	{
		PhysicianPortalPage physicianPortal=new PhysicianPortalPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		HomePage homepage = new HomePage(threadLocalWebDriver.get(), TestTemplate.testReport);
		LoginPage login = new LoginPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		FacilityPage facilityPage = new FacilityPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		
		final String testCase = "QA043";
		HashMap<String ,String> testdata = xlsReader.GetValue(SheetName,testCase);

		homepage.NavigateToFacilityPortal();
		String[] typeArray = {testdata.get("type1"),testdata.get("type2")};
		int TypeSize = typeArray.length;
		
		facilityPage.ManageOrdersSets();
		for(int i=0;i<TypeSize;i++)
		{
			String Type = typeArray[i];

			String Description = testdata.get("description")+physicianPortal.GenarateRandomNumber()+Type;
			
			facilityPage.CreateOrderSet();
			facilityPage.CreateOrderSetDescription(Description,Type,testdata.get("routes"),testdata.get("libraryText"));
			facilityPage.VerifyButtonsinVerifyFields();
			physicianPortal.CancelOrder();
			

		}
		
		login.Logout();
	}
	
	
	@Test(enabled =false)
	public void QA044_AddingFrequencyIn_NewCreateAnOrderSetsVia_FacilityApp_ForDetailsType_TreatmentWithMedication_And_Medication_WithFrequencyType_Routine()
	{
		PhysicianPortalPage physicianPortal=new PhysicianPortalPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		HomePage homepage = new HomePage(threadLocalWebDriver.get(), TestTemplate.testReport);
		LoginPage login = new LoginPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		FacilityPage facilityPage = new FacilityPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		
	
		
		homepage.NavigateToFacilityPortal();
		
		final String testCase = "QA044";
		HashMap<String ,String> testdata = xlsReader.GetValue(SheetName,testCase);		
		String[] typeArray = {testdata.get("type1"),testdata.get("type2")};
		
				
		int numberOfItems = typeArray.length;
	    for (int i=0; i<numberOfItems; i++)
		    		        
		{
		
	    	String type = typeArray[i];
	    	
	  	facilityPage.ManageOrdersSets();
	  	facilityPage.VerifyButtonsinVerifyFields();
	
	  	String Description = testdata.get("description")+physicianPortal.GenarateRandomNumber()+type;
		
		TestTemplate.testReport.logSuccess("Create Order With Treatment Dropdown Option");
		
		facilityPage.CreateOrderSetDescription(Description,type,testdata.get("routes"),testdata.get("libraryText"));	
		physicianPortal.OrderFrequencyType(Integer.parseInt(testdata.get("num")),testdata.get("frequencyType"));
		physicianPortal.RequireActionRelatedLabel((Integer.parseInt(testdata.get("num"))+1),testdata.get("frequencyType") ,testdata.get("requiredActions"),testdata.get("othersRequiredActions") ,testdata.get("requiredActionsPostDropdown"),testdata.get("othersRequiredActionsPostDropdown"), testdata.get("administeredBy"),testdata.get("maxDoesHours"),testdata.get("followUpAfterMinutes"),testdata.get("slidingScaleMin") , testdata.get("slidingScaleMax"), testdata.get("slidingScaleUnits"));
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(testdata.get("num")),testdata.get("frequency"));
		physicianPortal.HowOftenDailyType(Integer.parseInt(testdata.get("num")),testdata.get("howOften"),testdata.get("everyDay"));
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(testdata.get("num")),testdata.get("physicianInstructions"),testdata.get("physicianInstructions"),type);
		

		TestTemplate.testReport.logSuccess("Create Frequency With  Weekly HowOften Dropdown Option");
		physicianPortal.AddOrderFrequency();
		physicianPortal.OrderFrequencyType(Integer.parseInt(testdata.get("num1")),testdata.get("frequencyType"));
		physicianPortal.RequireActionRelatedLabel((Integer.parseInt(testdata.get("num1"))+1),testdata.get("frequencyType") ,testdata.get("requiredActions"),testdata.get("othersRequiredActions") ,testdata.get("requiredActionsPostDropdown"),testdata.get("othersRequiredActionsPostDropdown"), testdata.get("administeredBy"),testdata.get("maxDoesHours"),testdata.get("followUpAfterMinutes"),testdata.get("slidingScaleMin") , testdata.get("slidingScaleMax"), testdata.get("slidingScaleUnits"));
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(testdata.get("num1")),testdata.get("frequency"));
		physicianPortal.HowOftenWeeklytype((Integer.parseInt(testdata.get("num1"))+1),Integer.parseInt(testdata.get("num")),testdata.get("howOften1"),testdata.get("everyDay"));
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(testdata.get("num1")),testdata.get("physicianInstructions"),testdata.get("physicianInstructions"),type);
		
		TestTemplate.testReport.logSuccess("Create Frequency With  Monthly HowOften Dropdown Option");
		physicianPortal.AddOrderFrequency();
		physicianPortal.OrderFrequencyType(Integer.parseInt(testdata.get("num2")),testdata.get("frequencyType"));
		physicianPortal.RequireActionRelatedLabel((Integer.parseInt(testdata.get("num2"))+1),testdata.get("frequencyType") ,testdata.get("requiredActions"),testdata.get("othersRequiredActions") ,testdata.get("requiredActionsPostDropdown"),testdata.get("othersRequiredActionsPostDropdown"), testdata.get("administeredBy"),testdata.get("maxDoesHours"),testdata.get("followUpAfterMinutes"),testdata.get("slidingScaleMin") , testdata.get("slidingScaleMax"), testdata.get("slidingScaleUnits"));
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(testdata.get("num2")),testdata.get("frequency"));
		physicianPortal.HowOftenMonthlytype(testdata.get("TypeOfMode"),Integer.parseInt(testdata.get("num2"))+1,Integer.parseInt(testdata.get("num")),Integer.parseInt(testdata.get("num2")),testdata.get("howOften2"),testdata.get("everyDay"),testdata.get("DropdownNumber"),testdata.get("DropdownDay"));
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(testdata.get("num2")),testdata.get("physicianInstructions"),testdata.get("physicianInstructions"),type);
		
		TestTemplate.testReport.logSuccess("Create Frequency With  Monthly HowOften Dropdown Option");
		physicianPortal.AddOrderFrequency();
		physicianPortal.OrderFrequencyType(Integer.parseInt(testdata.get("num3")),testdata.get("frequencyType"));
		physicianPortal.RequireActionRelatedLabel((Integer.parseInt(testdata.get("num3"))+1),testdata.get("frequencyType") ,testdata.get("requiredActions"),testdata.get("othersRequiredActions") ,testdata.get("requiredActionsPostDropdown"),testdata.get("othersRequiredActionsPostDropdown"), testdata.get("administeredBy"),testdata.get("maxDoesHours"),testdata.get("followUpAfterMinutes"),testdata.get("slidingScaleMin") , testdata.get("slidingScaleMax"), testdata.get("slidingScaleUnits"));
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(testdata.get("num3")),testdata.get("frequency"));
		physicianPortal.HowOftenMonthlytype(testdata.get("TypeOfMode1"),Integer.parseInt(testdata.get("num3"))+1,Integer.parseInt(testdata.get("num")),Integer.parseInt(testdata.get("num3")),testdata.get("howOften2"),testdata.get("everyDay"),testdata.get("DropdownNumber"),testdata.get("DropdownDay"));
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(testdata.get("num3")),testdata.get("physicianInstructions"),testdata.get("physicianInstructions"),type);
		
		TestTemplate.testReport.logSuccess("Create Frequency With Yearly HowOften Dropdown Option");
		physicianPortal.AddOrderFrequency();
		physicianPortal.OrderFrequencyType(Integer.parseInt(testdata.get("num4")),testdata.get("frequencyType"));
		physicianPortal.RequireActionRelatedLabel((Integer.parseInt(testdata.get("num4"))+1),testdata.get("frequencyType") ,testdata.get("requiredActions"),testdata.get("othersRequiredActions") ,testdata.get("requiredActionsPostDropdown"),testdata.get("othersRequiredActionsPostDropdown"), testdata.get("administeredBy"),testdata.get("maxDoesHours"),testdata.get("followUpAfterMinutes"),testdata.get("slidingScaleMin") , testdata.get("slidingScaleMax"), testdata.get("slidingScaleUnits"));
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(testdata.get("num4")),testdata.get("frequency"));
		physicianPortal.HowOftenYearlyType((Integer.parseInt(testdata.get("num4"))+1),Integer.parseInt(testdata.get("num")),testdata.get("howOften3"),testdata.get("scheduleOnMonth"),testdata.get("everyDay"),testdata.get("everyDay"));
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(testdata.get("num4")),testdata.get("physicianInstructions"),testdata.get("physicianInstructions"),type);
		physicianPortal.SaveOrderFrequency();
		
		facilityPage.VerifyManageOrderFromSets(Description);
		
		
		}		
		
		login.Logout();
	
	}	
	
	@Test(enabled =false)
	public void QA045_AddingFrequencyIn_NewCreateAnOrderSetsVia_FacilityApp_ForDetailsType_TreatmentWithMedication_And_Medication_WithFrequencyType_PNR()
	{
		PhysicianPortalPage physicianPortal=new PhysicianPortalPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		HomePage homepage = new HomePage(threadLocalWebDriver.get(), TestTemplate.testReport);
		LoginPage login = new LoginPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		FacilityPage facilityPage = new FacilityPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		
		
		/*String description = xlsReader.getCellData("facilityPortal", 0, 27)+physicianPortal.GenarateRandomNumber();
		String type1 = xlsReader.getCellData("facilityPortal", 1, 27);
		String type2 = xlsReader.getCellData("facilityPortal", 2, 27);
		String type3 = xlsReader.getCellData("facilityPortal", 3, 27);
		String type4 = xlsReader.getCellData("facilityPortal", 4, 27);
		String type5 = xlsReader.getCellData("facilityPortal", 5, 27);
		String type6 = xlsReader.getCellData("facilityPortal", 6, 27);
		String type7 = xlsReader.getCellData("facilityPortal", 7, 27);
		String libraryText = xlsReader.getCellData("facilityPortal", 8, 27);			
		String SearchDiogonosisTxt = xlsReader.getCellData("facilityPortal", 9, 27);
		String medicarePriority = xlsReader.getCellData("facilityPortal", 10, 27);
		String diogonosisName = xlsReader.getCellData("facilityPortal", 11, 27);
		String physicianType = xlsReader.getCellData("facilityPortal", 12, 27);
		String ReceivedByType = xlsReader.getCellData("facilityPortal", 13, 27);
		String ReceivedOrderType = xlsReader.getCellData("facilityPortal", 14, 27);		
		String routes = xlsReader.getCellData("facilityPortal", 15, 27);
		String WrittenDate = xlsReader.getCellData("facilityPortal", 16, 27);
		String NoOfRefillis = xlsReader.getCellData("facilityPortal", 17, 27);
		String WhenToFill = xlsReader.getCellData("facilityPortal", 18, 27);
		String num = xlsReader.getCellData("facilityPortal", 19, 27);
		String frequencyType = xlsReader.getCellData("facilityPortal", 20, 27);
		String startDate = xlsReader.getCellData("facilityPortal", 21, 27);  
		String ByDate =startDate;
		String startDateTime = xlsReader.getCellData("facilityPortal", 22, 27);
		String byDateTime =startDateTime ;
		String byDateno = xlsReader.getCellData("facilityPortal", 23, 27);
		String afterNoOfAdminstrationsNo = xlsReader.getCellData("facilityPortal", 24, 27);		
		String endDate = xlsReader.getCellData("facilityPortal", 25, 27);
		String afterNumberOfAdminstrations = xlsReader.getCellData("facilityPortal", 26, 27);
		String requiredActions = xlsReader.getCellData("facilityPortal", 27, 27);
		String othersRequiredActions = xlsReader.getCellData("facilityPortal", 28, 27);
		String requiredActionsPostDropdown = xlsReader.getCellData("facilityPortal", 29, 27);
		String othersRequiredActionsPostDropdown = xlsReader.getCellData("facilityPortal", 30, 27);
		String administeredBy = xlsReader.getCellData("facilityPortal", 31, 27);
		String maxDoesHours = xlsReader.getCellData("facilityPortal", 32, 27);
		String followUpAfterMinutes = xlsReader.getCellData("facilityPortal", 33, 27);
		String slidingScaleMin = xlsReader.getCellData("facilityPortal", 34, 27);
		String slidingScaleMax = xlsReader.getCellData("facilityPortal", 35, 27);
		String slidingScaleUnits = xlsReader.getCellData("facilityPortal", 36, 27);
		String frequency = xlsReader.getCellData("physicianportal", 37, 12);
		String howOften = xlsReader.getCellData("physicianportal", 38, 12);
		String everyDay = xlsReader.getCellData("physicianportal", 39, 12);
		String physicianInstructions = xlsReader.getCellData("facilityPortal", 40, 27);
		String additionalInstruction = physicianInstructions ;
		String endDateType = xlsReader.getCellData("facilityPortal", 42, 27);
		String endDateType1 = xlsReader.getCellData("facilityPortal", 43, 27);
		String endDateType2 = xlsReader.getCellData("facilityPortal", 44, 27);*/
		
		
		
		homepage.NavigateToFacilityPortal();
		
		final String testCase = "QA045";
		HashMap<String ,String> testdata = xlsReader.GetValue(SheetName,testCase);		
		String[] typeArray = {testdata.get("type1"),testdata.get("type2")};
		int TypeSize = typeArray.length;
		for(int i=0;i<TypeSize;i++)
		
		{
		 String Type = typeArray[i];
		 
		facilityPage.ManageOrdersSets();
		facilityPage.VerifyButtonsinVerifyFields();
		
		String Description = testdata.get("description")+physicianPortal.GenarateRandomNumber()+Type;
		 
		facilityPage.CreateOrderSetDescription(Description,Type,testdata.get("routes"),testdata.get("libraryText"));	
		physicianPortal.OrderFrequencyType(Integer.parseInt(testdata.get("num")),testdata.get("frequencyType"));
		physicianPortal.RequireActionRelatedLabel((Integer.parseInt(testdata.get("num"))+1),testdata.get("frequencyType") ,testdata.get("requiredActions"),testdata.get("othersRequiredActions") ,testdata.get("requiredActionsPostDropdown"),testdata.get("othersRequiredActionsPostDropdown"), testdata.get("administeredBy"),testdata.get("maxDoesHours"),testdata.get("followUpAfterMinutes"),testdata.get("slidingScaleMin") , testdata.get("slidingScaleMax"), testdata.get("slidingScaleUnits"));
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(testdata.get("num")),testdata.get("physicianInstructions"),testdata.get("physicianInstructions"),Type);
		physicianPortal.SaveOrderFrequency();
		
		facilityPage.VerifyManageOrderFromSets(Description);
		
		}
		
		
		login.Logout();
	}
	
	
	@Test(enabled =false)
	public void QA046_AddingFrequencyIn_NewCreateAnOrderSetsVia_FacilityApp_ForDetailsType_TreatmentWithMedication_And_Medication_WithFrequencyType_PNREveryHour()
	{
		PhysicianPortalPage physicianPortal=new PhysicianPortalPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		HomePage homepage = new HomePage(threadLocalWebDriver.get(), TestTemplate.testReport);
		LoginPage login = new LoginPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		FacilityPage facilityPage = new FacilityPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		
		
		/*String description = xlsReader.getCellData("facilityPortal", 0, 30)+physicianPortal.GenarateRandomNumber();
		String type1 = xlsReader.getCellData("facilityPortal", 1, 30);
		String type2 = xlsReader.getCellData("facilityPortal", 2, 30);
		String type3 = xlsReader.getCellData("facilityPortal", 3, 30);
		String type4 = xlsReader.getCellData("facilityPortal", 4, 30);
		String type5 = xlsReader.getCellData("facilityPortal", 5, 30);
		String type6 = xlsReader.getCellData("facilityPortal", 6, 30);
		String type7 = xlsReader.getCellData("facilityPortal", 7, 30);
		String libraryText = xlsReader.getCellData("facilityPortal", 8, 30);			
		String SearchDiogonosisTxt = xlsReader.getCellData("facilityPortal", 9, 30);
		String medicarePriority = xlsReader.getCellData("facilityPortal", 10, 30);
		String diogonosisName = xlsReader.getCellData("facilityPortal", 11, 30);
		String physicianType = xlsReader.getCellData("facilityPortal", 12, 30);
		String ReceivedByType = xlsReader.getCellData("facilityPortal", 13, 30);
		String ReceivedOrderType = xlsReader.getCellData("facilityPortal", 14, 30);		
		String routes = xlsReader.getCellData("facilityPortal", 15, 30);
		String WrittenDate = xlsReader.getCellData("facilityPortal", 16, 30);
		String NoOfRefillis = xlsReader.getCellData("facilityPortal", 17, 30);
		String WhenToFill = xlsReader.getCellData("facilityPortal", 18, 30);
		String num = xlsReader.getCellData("facilityPortal", 19, 30);
		String frequencyType = xlsReader.getCellData("facilityPortal", 20, 30);
		String startDate = xlsReader.getCellData("facilityPortal", 21, 30);  
		String ByDate =startDate;
		String startDateTime = xlsReader.getCellData("facilityPortal", 22, 30);
		String byDateTime =startDateTime ;
		String byDateno = xlsReader.getCellData("facilityPortal", 23, 30);
		String afterNoOfAdminstrationsNo = xlsReader.getCellData("facilityPortal", 24, 30);		
		String endDate = xlsReader.getCellData("facilityPortal", 25, 30);
		String afterNumberOfAdminstrations = xlsReader.getCellData("facilityPortal", 26, 30);
		String requiredActions = xlsReader.getCellData("facilityPortal", 27, 30);
		String othersRequiredActions = xlsReader.getCellData("facilityPortal", 28, 30);
		String requiredActionsPostDropdown = xlsReader.getCellData("facilityPortal", 29, 30);
		String othersRequiredActionsPostDropdown = xlsReader.getCellData("facilityPortal", 30, 30);
		String administeredBy = xlsReader.getCellData("facilityPortal", 31, 30);
		String maxDoesHours = xlsReader.getCellData("facilityPortal", 32, 30);
		String followUpAfterMinutes = xlsReader.getCellData("facilityPortal", 33, 30);
		String slidingScaleMin = xlsReader.getCellData("facilityPortal", 34, 30);
		String slidingScaleMax = xlsReader.getCellData("facilityPortal", 35, 30);
		String slidingScaleUnits = xlsReader.getCellData("facilityPortal", 36, 30);
		String frequency = xlsReader.getCellData("physicianportal", 37, 12);
		String howOften = xlsReader.getCellData("physicianportal", 38, 12);
		String everyDay = xlsReader.getCellData("physicianportal", 39, 12);
		String physicianInstructions = xlsReader.getCellData("facilityPortal", 40, 30);
		String additionalInstruction = physicianInstructions ;
		String endDateType = xlsReader.getCellData("facilityPortal", 42, 30);
		String endDateType1 = xlsReader.getCellData("facilityPortal", 43, 30);
		String endDateType2 = xlsReader.getCellData("facilityPortal", 44, 30);*/
		
		
		
		homepage.NavigateToFacilityPortal();
		
		
		
		final String testCase = "QA046";
		HashMap<String ,String> testdata = xlsReader.GetValue(SheetName,testCase);		
		String[] typeArray = {testdata.get("type1"),testdata.get("type2")};	
		int TypeSize = typeArray.length;
		for(int i=0;i<TypeSize;i++)
		
		{
		 String Type = typeArray[i];
		 
		facilityPage.ManageOrdersSets();
		facilityPage.VerifyButtonsinVerifyFields();
		
		String Description = testdata.get("description")+physicianPortal.GenarateRandomNumber()+Type;
		 
		facilityPage.CreateOrderSetDescription(Description,Type,testdata.get("routes"),testdata.get("libraryText"));	
		physicianPortal.OrderFrequencyType(Integer.parseInt(testdata.get("num")),testdata.get("frequencyType"));
		physicianPortal.RequireActionRelatedLabel((Integer.parseInt(testdata.get("num"))+1),testdata.get("frequencyType") ,testdata.get("requiredActions"),testdata.get("othersRequiredActions") ,testdata.get("requiredActionsPostDropdown"),testdata.get("othersRequiredActionsPostDropdown"), testdata.get("administeredBy"),testdata.get("maxDoesHours"),testdata.get("followUpAfterMinutes"),testdata.get("slidingScaleMin") , testdata.get("slidingScaleMax"), testdata.get("slidingScaleUnits"));
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(testdata.get("num")),testdata.get("physicianInstructions"),testdata.get("physicianInstructions"),Type);
		physicianPortal.SaveOrderFrequency();
		
		facilityPage.VerifyManageOrderFromSets(Description);
		
		}
		
		
		login.Logout();
	}
	
	@Test(enabled =false)
	public void QA047_AddMultipleOrdersetsWithinOneOrdersetTemplate()
	{
		PhysicianPortalPage physicianPortal=new PhysicianPortalPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		HomePage homepage = new HomePage(threadLocalWebDriver.get(), TestTemplate.testReport);
		LoginPage login = new LoginPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		FacilityPage facilityPage = new FacilityPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		
		
		/*String description = xlsReader.getCellData("facilityPortal", 0, 33)+physicianPortal.GenarateRandomNumber();
		String type = xlsReader.getCellData("facilityPortal", 1, 33);
		String libraryText = xlsReader.getCellData("facilityPortal", 2, 33);
		String routes = xlsReader.getCellData("facilityPortal", 3, 33);
		String num = xlsReader.getCellData("facilityPortal", 4, 33);
		String frequencyType = xlsReader.getCellData("facilityPortal", 5, 33);
		String requiredActions = xlsReader.getCellData("facilityPortal", 6, 33);
		String othersRequiredActions = xlsReader.getCellData("facilityPortal", 7, 33);
		String requiredActionsPostDropdown = xlsReader.getCellData("facilityPortal", 8, 33);
		String othersRequiredActionsPostDropdown = xlsReader.getCellData("facilityPortal", 9, 33);
		String administeredBy = xlsReader.getCellData("facilityPortal", 10, 33);
		String maxDoesHours = xlsReader.getCellData("facilityPortal", 11, 33);
		String followUpAfterMinutes = xlsReader.getCellData("facilityPortal", 12, 33);
		String slidingScaleMin = xlsReader.getCellData("facilityPortal", 13, 33);
		String slidingScaleMax = xlsReader.getCellData("facilityPortal", 14, 33);
		String slidingScaleUnits = xlsReader.getCellData("facilityPortal", 15, 33);
		String frequency = xlsReader.getCellData("facilityPortal", 16, 33);
		String howOften = xlsReader.getCellData("facilityPortal", 17, 33);
		String everyDay = xlsReader.getCellData("facilityPortal", 18, 33);
		String physicianInstructions = xlsReader.getCellData("facilityPortal", 19, 33);
		String additionalInstruction = physicianInstructions ;*/
		
		final String testCase = "QA047";
		HashMap<String ,String> testdata = xlsReader.GetValue(SheetName,testCase);
		String Description = testdata.get("description")+physicianPortal.GenarateRandomNumber()+testdata.get("type");
		
		homepage.NavigateToFacilityPortal();
		facilityPage.ManageOrdersSets();
		facilityPage.CreateOrderSetDescription(Description,testdata.get("type"),testdata.get("routes"),testdata.get("libraryText"));	
		physicianPortal.OrderFrequencyType(Integer.parseInt(testdata.get("num")),testdata.get("frequencyType"));
		physicianPortal.RequireActionRelatedLabel((Integer.parseInt(testdata.get("num"))+1),testdata.get("frequencyType") ,testdata.get("requiredActions"),testdata.get("othersRequiredActions") ,testdata.get("requiredActionsPostDropdown"),testdata.get("othersRequiredActionsPostDropdown"), testdata.get("administeredBy"),testdata.get("maxDoesHours"),testdata.get("followUpAfterMinutes"),testdata.get("slidingScaleMin") , testdata.get("slidingScaleMax"), testdata.get("slidingScaleUnits"));
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(testdata.get("num")),testdata.get("frequency"));
		physicianPortal.HowOftenDailyType(Integer.parseInt(testdata.get("num")),testdata.get("howOften"),testdata.get("everyDay"));
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(testdata.get("num")),testdata.get("physicianInstructions"),testdata.get("physicianInstructions"),testdata.get("type"));
		physicianPortal.SaveOrderFrequency();
		
		facilityPage.VerifyManageOrderFromSets(Description);
		facilityPage.ClickingTheCreatedOrderFromSets(Description);
		facilityPage.CreateOrderSet();
		facilityPage.VerifyManageOrderFromSets(Description);
		facilityPage.VerifyTheFieldsAfterClickingOnTheCreateOrderSetsButton();
		facilityPage.VerifyButtonsinVerifyFields();
		facilityPage.CreateOrderSetDescription(Description,testdata.get("type"),testdata.get("routes"),testdata.get("libraryText"));	
		physicianPortal.OrderFrequencyType(Integer.parseInt(testdata.get("num")),testdata.get("frequencyType"));
		physicianPortal.RequireActionRelatedLabel((Integer.parseInt(testdata.get("num"))+1),testdata.get("frequencyType") ,testdata.get("requiredActions"),testdata.get("othersRequiredActions") ,testdata.get("requiredActionsPostDropdown"),testdata.get("othersRequiredActionsPostDropdown"), testdata.get("administeredBy"),testdata.get("maxDoesHours"),testdata.get("followUpAfterMinutes"),testdata.get("slidingScaleMin") , testdata.get("slidingScaleMax"), testdata.get("slidingScaleUnits"));
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(testdata.get("num")),testdata.get("frequency"));
		physicianPortal.HowOftenDailyType(Integer.parseInt(testdata.get("num")),testdata.get("howOften"),testdata.get("everyDay"));
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(testdata.get("num")),testdata.get("physicianInstructions"),testdata.get("physicianInstructions"),testdata.get("type"));
		physicianPortal.SaveOrderFrequency();
		facilityPage.VerifyManageOrderFromSets(Description);
		
		login.Logout();
		
	}
	
	
	@Test(enabled =false)
	public void QA048_UpdatingOrRemovingOrder_LibrariesViaFacilityAppForDetailsType()
	{
		PhysicianPortalPage physicianPortal=new PhysicianPortalPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		HomePage homepage = new HomePage(threadLocalWebDriver.get(), TestTemplate.testReport);
		LoginPage login = new LoginPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		FacilityPage facilityPage = new FacilityPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		
				
		final String TesctCaseNo = "QA048";
		
		
		HashMap<String, String> testData = xlsReader.GetValue(SheetName, TesctCaseNo);
		
		
		
		homepage.NavigateToFacilityPortal();
		facilityPage.VerifyAndClickManageOrderLibrary();
	
		
		ArrayList<String> Options = facilityPage.VerifyOrderTemplate(testData.get("description"));
		int size = Options.size();
		
		
		homepage.NavigateToPhysicianPortal();
		physicianPortal.ClickOnPhysicianPortal();	
		physicianPortal.ClickOnExistingResident(testData.get("ResidentNo"));
		for(int i=0;i<=(size-1);i++)
		{
		physicianPortal.ResidentFullOrderDetailsWithoutMedication(Options.get(i),testData.get("description"),testData.get("createdType"));
		physicianPortal.CancelOrder();
		
		}
		
		homepage.NavigateToFacilityPortal();
		facilityPage.VerifyAndClickManageOrderLibrary();
		facilityPage.RemoveDescriptionInOrderTemplate(testData.get("description"));
		
		homepage.NavigateToPhysicianPortal();
		physicianPortal.ClickOnPhysicianPortal();	
		physicianPortal.ClickOnExistingResident(testData.get("ResidentNo"));
		
		for(int i=0;i<=(size-1);i++)
		{
		physicianPortal.VerifyRemoveButtonInPickFromLibrary(Options.get(i),testData.get("description"));
		physicianPortal.CancelOrder();
		
		}
		
		login.Logout();
	
	}
	
}
