package aut.tests.functionaltests;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.Hashtable;

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
	
	//private static final boolean false = false;
	Xls_Reader xlsReader = new Xls_Reader("C:\\Bluestrata\\Abhishek-Project-s\\src\\test\\resources\\testdata\\BluestrataTestData.xlsx");
	
	@Test(enabled = false)
	public void QA07_ResidentOrders() throws URISyntaxException
	{
		PhysicianPortal physicianPortal=new PhysicianPortal(threadLocalWebDriver.get(), TestTemplate.testReport);
		HomePage homepage = new HomePage(threadLocalWebDriver.get(), TestTemplate.testReport);
		LoginPage login = new LoginPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		
	//	String ResidentNo = xlsReader.getCellData("physicianportal", 0, 3);
		String EnterValue = xlsReader.getCellData("physicianportal", 1, 3);
		
		homepage.NavigateToPhysicianPortal();
		
		physicianPortal.PhysicianPortalHeaderVerfication();
		physicianPortal.VerifyPhysicianPortalDrropdown();
		physicianPortal.VerifyResidentPageHeaderHeading();
		physicianPortal.VerifytheFieldsDisplayDownToMessage();
		physicianPortal.CounttheNoOfResidentInAPage();
		physicianPortal.AssendingOrderUsingFirstName();
		physicianPortal.AssendingOrderUsingLastName();
		physicianPortal.AssendingOrderUsingMr();
		physicianPortal.AssendingOrderUsingAge();
		physicianPortal.AssendingOrderUsingLocation();
		physicianPortal.SearchResidentWithApplyFilterButton(EnterValue);
	//	physicianPortal.ClickOnExistingResident(ResidentNo)	;
		physicianPortal.VerifyPreviousOrders();
		physicianPortal.VerifyButtonInResidentOrders();
		physicianPortal.FullOrderPageVerification();
		
		login.Logout();
		
	}
	
	@Test(enabled = false)
	public void QA08_ResidentOrders_CreateAnOrder(ITestContext testContext)
	{
		
		
		PhysicianPortal physicianPortal=new PhysicianPortal(threadLocalWebDriver.get(), TestTemplate.testReport);
		HomePage homepage = new HomePage(threadLocalWebDriver.get(), TestTemplate.testReport);
		LoginPage login = new LoginPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		
				
		TestTemplate.testReport.logSuccess("Click to Physician Portal From Menu Bar");
		homepage.NavigateToPhysicianPortal();
		
		TestTemplate.testReport.logSuccess("Navigate to Residents Order From Physician Portal");
		physicianPortal.ClickOnPhysicianPortal();	
		
		String ResidentNo = xlsReader.getCellData("physicianportal", 28, 7);
		
		TestTemplate.testReport.logSuccess("Click On existing Resident");
		physicianPortal.ClickOnExistingResident(ResidentNo);
		
		
		String type1 = xlsReader.getCellData("physicianportal", 0, 7);
		String type2 = xlsReader.getCellData("physicianportal", 1, 7);
		String type3 = xlsReader.getCellData("physicianportal", 2, 7);
		String type4 = xlsReader.getCellData("physicianportal", 3, 7);
		String type5 = xlsReader.getCellData("physicianportal", 4, 7);
		String type6 = xlsReader.getCellData("physicianportal", 5, 7);
		String type7 = xlsReader.getCellData("physicianportal", 6, 7);
		String libraryText = xlsReader.getCellData("physicianportal", 7, 7);
		String createdType = xlsReader.getCellData("physicianportal", 8, 7);
		/*String libraryText1 = xlsReader.getCellData("physicianportal", 7, 7);
		String createdType1 = xlsReader.getCellData("physicianportal", 8, 7);	*/	
		String libraryText1 = xlsReader.getCellData("physicianportal", 9, 7);
		String createdType1 = xlsReader.getCellData("physicianportal", 10, 7);
		String nullDiagonisis = xlsReader.getCellData("physicianportal", 11, 7);
		String SearchDiogonosisTxt = xlsReader.getCellData("physicianportal", 12, 7);
		String medicarePriority = xlsReader.getCellData("physicianportal", 13, 7);
		String diogonosisName = xlsReader.getCellData("physicianportal", 14, 7);
		String physicianType = xlsReader.getCellData("physicianportal", 15, 7);
		String ReceivedByType = xlsReader.getCellData("physicianportal", 16, 7);
		String ReceivedOrderType1 = xlsReader.getCellData("physicianportal", 17, 7);
		String ReceivedOrderType2 = xlsReader.getCellData("physicianportal", 18, 7);
		String ReceivedOrderType3 = xlsReader.getCellData("physicianportal", 19, 7);
		String ReceivedOrderType4 = xlsReader.getCellData("physicianportal", 20, 7);
		String ReceivedOrderType5 = xlsReader.getCellData("physicianportal", 21, 7);
		String ReceivedOrderType6 = xlsReader.getCellData("physicianportal", 22, 7);
		String ReceivedOrderType7 = xlsReader.getCellData("physicianportal", 23, 7);
		String routes = xlsReader.getCellData("physicianportal", 24, 7);
		String WrittenDate = xlsReader.getCellData("physicianportal", 25, 7);
		String NoOfRefillis = xlsReader.getCellData("physicianportal", 26, 7);
		String WhenToFill = xlsReader.getCellData("physicianportal", 27, 7);
		
		
		physicianPortal.ResidentFullOrderDetailsWithoutMedication(type1,libraryText,createdType);
		physicianPortal.ResidentFullOrderDetails(type1 ,nullDiagonisis ,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType, ReceivedByType,ReceivedOrderType1,routes,WrittenDate,NoOfRefillis,WhenToFill);
		
		physicianPortal.CancelOrder();	
		
		physicianPortal.ResidentFullOrderDetailsWithoutMedication(type1,libraryText1,createdType1);
		physicianPortal.ResidentFullOrderDetails(type1 ,nullDiagonisis ,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType, ReceivedByType,ReceivedOrderType1,routes,WrittenDate,NoOfRefillis,WhenToFill);
		
		physicianPortal.CancelOrder();	
		
		physicianPortal.ResidentFullOrderDetailsWithoutMedication(type2,libraryText,createdType);
		physicianPortal.ResidentFullOrderDetails(type2 ,nullDiagonisis ,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType, ReceivedByType,ReceivedOrderType2,routes,WrittenDate,NoOfRefillis,WhenToFill);
		
		physicianPortal.CancelOrder();
		
		physicianPortal.ResidentFullOrderDetailsWithoutMedication(type2,libraryText1,createdType1);
		physicianPortal.ResidentFullOrderDetails(type2 ,nullDiagonisis ,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType, ReceivedByType,ReceivedOrderType2,routes,WrittenDate,NoOfRefillis,WhenToFill);
		
		physicianPortal.CancelOrder();	
		
		physicianPortal.ResidentFullOrderDetailsWithoutMedication(type3,libraryText,createdType);
		physicianPortal.ResidentFullOrderDetails(type3 ,nullDiagonisis ,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType, ReceivedByType,ReceivedOrderType3,routes,WrittenDate,NoOfRefillis,WhenToFill);
		
		physicianPortal.CancelOrder();
		
		physicianPortal.ResidentFullOrderDetailsWithoutMedication(type3,libraryText1,createdType1);
		physicianPortal.ResidentFullOrderDetails(type3 ,nullDiagonisis ,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType, ReceivedByType,ReceivedOrderType3,routes,WrittenDate,NoOfRefillis,WhenToFill);
		
		physicianPortal.CancelOrder();	
		
		physicianPortal.ResidentFullOrderDetailsWithoutMedication(type4,libraryText,createdType);
		physicianPortal.ResidentFullOrderDetails(type4 ,nullDiagonisis ,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType, ReceivedByType,ReceivedOrderType4,routes,WrittenDate,NoOfRefillis,WhenToFill);
		
		physicianPortal.CancelOrder();
		
		physicianPortal.ResidentFullOrderDetailsWithoutMedication(type4,libraryText1,createdType1);
		physicianPortal.ResidentFullOrderDetails(type4 ,nullDiagonisis ,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType, ReceivedByType,ReceivedOrderType4,routes,WrittenDate,NoOfRefillis,WhenToFill);
		
		physicianPortal.CancelOrder();	
		
		physicianPortal.ResidentFullOrderDetailsWithoutMedication(type5,libraryText,createdType);
		physicianPortal.ResidentFullOrderDetails(type5 ,nullDiagonisis ,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType, ReceivedByType,ReceivedOrderType5,routes,WrittenDate,NoOfRefillis,WhenToFill);
		
		physicianPortal.CancelOrder();
		
		physicianPortal.ResidentFullOrderDetailsWithoutMedication(type5,libraryText1,createdType1);
		physicianPortal.ResidentFullOrderDetails(type5 ,nullDiagonisis ,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType, ReceivedByType,ReceivedOrderType5,routes,WrittenDate,NoOfRefillis,WhenToFill);
		
		physicianPortal.CancelOrder();	
		
		physicianPortal.ResidentFullOrderDetailsWithoutMedication(type6,libraryText,createdType);
		physicianPortal.ResidentFullOrderDetails(type6 ,nullDiagonisis ,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType, ReceivedByType,ReceivedOrderType6,routes,WrittenDate,NoOfRefillis,WhenToFill);
		
		physicianPortal.CancelOrder();
		
		physicianPortal.ResidentFullOrderDetailsWithoutMedication(type6,libraryText1,createdType1);
		physicianPortal.ResidentFullOrderDetails(type6 ,nullDiagonisis ,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType, ReceivedByType,ReceivedOrderType6,routes,WrittenDate,NoOfRefillis,WhenToFill);
		
		physicianPortal.CancelOrder();	
		
		physicianPortal.ResidentFullOrderDetailsWithoutMedication(type7,libraryText,createdType);
		physicianPortal.ResidentFullOrderDetails(type7 ,nullDiagonisis ,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType, ReceivedByType,ReceivedOrderType7,routes,WrittenDate,NoOfRefillis,WhenToFill);
		
		physicianPortal.CancelOrder();
		
		physicianPortal.ResidentFullOrderDetailsWithoutMedication(type7,libraryText1,createdType1);
		physicianPortal.ResidentFullOrderDetails(type7 ,nullDiagonisis ,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType, ReceivedByType,ReceivedOrderType7,routes,WrittenDate,NoOfRefillis,WhenToFill);
		
		physicianPortal.CancelOrder();	
		login.Logout();
		
		
	}
	
	@Test(enabled = false)
	public void QA09_ResidentOrders_CreateAnOrderWithFrequencyRoutine(ITestContext testContext)
	{
		PhysicianPortal physicianPortal=new PhysicianPortal(threadLocalWebDriver.get(), TestTemplate.testReport);
		HomePage homepage = new HomePage(threadLocalWebDriver.get(), TestTemplate.testReport);
		LoginPage login = new LoginPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		
		
		TestTemplate.testReport.logSuccess("Click to Physician Portal From Menu Bar");
		homepage.NavigateToPhysicianPortal();
		
		TestTemplate.testReport.logSuccess("Navigate to Residents Order From Physician Portal");
		physicianPortal.ClickOnPhysicianPortal();	
		
		
		String ResidentNo = xlsReader.getCellData("physicianportal", 0, 12);
		String type1 = xlsReader.getCellData("physicianportal", 1, 12);
		String type2 = xlsReader.getCellData("physicianportal", 2, 12);
		String type3 = xlsReader.getCellData("physicianportal", 3, 12);
		String type4 = xlsReader.getCellData("physicianportal", 4, 12);
		String type5 = xlsReader.getCellData("physicianportal", 5, 12);
		String type6 = xlsReader.getCellData("physicianportal", 6, 12);
		String type7 = xlsReader.getCellData("physicianportal", 7, 12);
		String libraryText = xlsReader.getCellData("physicianportal", 8, 12);			
		String SearchDiogonosisTxt = xlsReader.getCellData("physicianportal", 9, 12);
		String medicarePriority = xlsReader.getCellData("physicianportal", 10, 12);
		String diogonosisName = xlsReader.getCellData("physicianportal", 11, 12);
		String physicianType = xlsReader.getCellData("physicianportal", 12, 12);
		String ReceivedByType = xlsReader.getCellData("physicianportal", 13, 12);
		String ReceivedOrderType = xlsReader.getCellData("physicianportal", 14, 12);		
		String routes = xlsReader.getCellData("physicianportal", 15, 12);
		String WrittenDate = xlsReader.getCellData("physicianportal", 16, 12);
		String NoOfRefillis = xlsReader.getCellData("physicianportal", 17, 12);
		String WhenToFill = xlsReader.getCellData("physicianportal", 18, 12);
		String num = xlsReader.getCellData("physicianportal", 19, 12);
		String frequencyType = xlsReader.getCellData("physicianportal", 20, 12);
		String startDate = xlsReader.getCellData("physicianportal", 21, 12);  
		String ByDate =startDate;
		String startDateTime = xlsReader.getCellData("physicianportal", 22, 12);
		String byDateTime =startDateTime ;
		String byDateno = xlsReader.getCellData("physicianportal", 23, 12);
		String afterNoOfAdminstrationsNo = xlsReader.getCellData("physicianportal", 24, 12);		
		String endDate = xlsReader.getCellData("physicianportal", 25, 12);
		String afterNumberOfAdminstrations = xlsReader.getCellData("physicianportal", 26, 12);
		String requiredActions = xlsReader.getCellData("physicianportal", 27, 12);
		String othersRequiredActions = xlsReader.getCellData("physicianportal", 28, 12);
		String requiredActionsPostDropdown = xlsReader.getCellData("physicianportal", 29, 12);
		String othersRequiredActionsPostDropdown = xlsReader.getCellData("physicianportal", 30, 12);
		String administeredBy = xlsReader.getCellData("physicianportal", 31, 12);
		String maxDoesHours = xlsReader.getCellData("physicianportal", 32, 12);
		String followUpAfterMinutes = xlsReader.getCellData("physicianportal", 33, 12);
		String slidingScaleMin = xlsReader.getCellData("physicianportal", 34, 12);
		String slidingScaleMax = xlsReader.getCellData("physicianportal", 35, 12);
		String slidingScaleUnits = xlsReader.getCellData("physicianportal", 36, 12);
		String frequency = xlsReader.getCellData("physicianportal", 37, 12);
		String howOften = xlsReader.getCellData("physicianportal", 38, 12);
		String everyDay = xlsReader.getCellData("physicianportal", 39, 12);
		String physicianInstructions = xlsReader.getCellData("physicianportal", 40, 12);
		String additionalInstruction = physicianInstructions ;
		String endDateType = xlsReader.getCellData("physicianportal", 42, 12);
		String endDateType1 = xlsReader.getCellData("physicianportal", 43, 12);
		String endDateType2 = xlsReader.getCellData("physicianportal", 44, 12);
		String TypeOfMode = xlsReader.getCellData("physicianportal", 45, 12);
		String howOften1 = xlsReader.getCellData("physicianportal", 46, 12);
		String howOften2 = xlsReader.getCellData("physicianportal", 47, 12);
		String howOften3 = xlsReader.getCellData("physicianportal", 48, 12);
		String DropdownNumber = xlsReader.getCellData("physicianportal", 49, 12);
		String DropdownDay = xlsReader.getCellData("physicianportal", 50, 12);
		String TypeOfMode1 = xlsReader.getCellData("physicianportal", 51, 12);
		String scheduleOnMonth = xlsReader.getCellData("physicianportal", 52, 12);
		
		TestTemplate.testReport.logSuccess("Click On existing Resident");
		physicianPortal.ClickOnExistingResident(ResidentNo);
	
		TestTemplate.testReport.logSuccess("Create Order With Treatment Dropdown Option");
		
		physicianPortal.CreateAnOrderWithOrderDetails(type1,libraryText+type1,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType,ReceivedByType,ReceivedOrderType,routes,WrittenDate,NoOfRefillis,WhenToFill);
		physicianPortal.OrderFrequencyType(Integer.parseInt(num),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDate ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(num),frequency);
		physicianPortal.HowOftenDailyType(Integer.parseInt(num),howOften,everyDay);
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num),physicianInstructions,additionalInstruction,type1);
		physicianPortal.SaveOrderFrequency();
		physicianPortal.OrderDisplayPageColourVerification();
		physicianPortal.OrderDisplayPageColoumnsVerification();
		physicianPortal.BottomPaneOfContainer();
		
		physicianPortal.CreateAnOrderWithOrderDetails(type2,libraryText+type2,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType,ReceivedByType,ReceivedOrderType,routes,WrittenDate,NoOfRefillis,WhenToFill);
		physicianPortal.OrderFrequencyType(Integer.parseInt(num),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType1,endDateType1 ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(num),frequency);
		physicianPortal.HowOftenDailyType(Integer.parseInt(num),howOften,everyDay);
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num),physicianInstructions,additionalInstruction,type2);
		physicianPortal.SaveOrderFrequency();
		
		physicianPortal.CreateAnOrderWithOrderDetails(type3,libraryText+type3,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType,ReceivedByType,ReceivedOrderType,routes,WrittenDate,NoOfRefillis,WhenToFill);
		physicianPortal.OrderFrequencyType(Integer.parseInt(num),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType2,endDateType2 ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(num),frequency);
		physicianPortal.HowOftenWeeklytype(Integer.parseInt(num),Integer.parseInt(num),howOften1,everyDay);
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num),physicianInstructions,additionalInstruction,type3);
		physicianPortal.SaveOrderFrequency();
		
		physicianPortal.CreateAnOrderWithOrderDetails(type4,libraryText+type4,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType,ReceivedByType,ReceivedOrderType,routes,WrittenDate,NoOfRefillis,WhenToFill);
		physicianPortal.OrderFrequencyType(Integer.parseInt(num),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDateType ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(num),frequency);
		physicianPortal.HowOftenMonthlytype(TypeOfMode,Integer.parseInt(num),Integer.parseInt(num),Integer.parseInt(num),howOften2,everyDay,DropdownNumber,DropdownDay);		
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num),physicianInstructions,additionalInstruction,type4);
		physicianPortal.SaveOrderFrequency();
		
		physicianPortal.CreateAnOrderWithOrderDetails(type5,libraryText+type5,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType,ReceivedByType,ReceivedOrderType,routes,WrittenDate,NoOfRefillis,WhenToFill);
		physicianPortal.OrderFrequencyType(Integer.parseInt(num),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDateType ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(num),frequency);
		physicianPortal.HowOftenMonthlytype(TypeOfMode1,Integer.parseInt(num),Integer.parseInt(num),Integer.parseInt(num),howOften2,everyDay,DropdownNumber,DropdownDay);
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num),physicianInstructions,additionalInstruction,type5);
		physicianPortal.SaveOrderFrequency();
		
		physicianPortal.CreateAnOrderWithOrderDetails(type6,libraryText+type6,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType,ReceivedByType,ReceivedOrderType,routes,WrittenDate,NoOfRefillis,WhenToFill);
		physicianPortal.OrderFrequencyType(Integer.parseInt(num),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDateType ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(num),frequency);
		physicianPortal.HowOftenYearlyType(Integer.parseInt(num),Integer.parseInt(num),howOften3,scheduleOnMonth,everyDay,everyDay);
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num),physicianInstructions,additionalInstruction,type6);
		physicianPortal.SaveOrderFrequency();
		
		physicianPortal.CreateAnOrderWithOrderDetails(type7,libraryText+type7,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType,ReceivedByType,ReceivedOrderType,routes,WrittenDate,NoOfRefillis,WhenToFill);
		physicianPortal.OrderFrequencyType(Integer.parseInt(num),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDateType ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(num),frequency);
		physicianPortal.HowOftenYearlyType(Integer.parseInt(num),Integer.parseInt(num),howOften3,scheduleOnMonth,everyDay,everyDay);
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num),physicianInstructions,additionalInstruction,type7);
		physicianPortal.SaveOrderFrequency();
		login.Logout();
	}
	
	
	
	@Test(priority = 1)
	public void QA10_ResidentOrders_CreateAnOrderWithFrequencyRoutine(ITestContext testContext)
	{
		PhysicianPortal physicianPortal=new PhysicianPortal(threadLocalWebDriver.get(), TestTemplate.testReport);
		HomePage homepage = new HomePage(threadLocalWebDriver.get(), TestTemplate.testReport);
	//	LoginPage login = new LoginPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		
		
		TestTemplate.testReport.logSuccess("Click to Physician Portal From Menu Bar");
		homepage.NavigateToPhysicianPortal();
		
		TestTemplate.testReport.logSuccess("Navigate to Residents Order From Physician Portal");
		physicianPortal.ClickOnPhysicianPortal();	
		
		 
		
		
		String ResidentNo = xlsReader.getCellData("physicianportal", 0, 16);
		String type1 = xlsReader.getCellData("physicianportal", 1, 16);
		String type2 = xlsReader.getCellData("physicianportal", 2, 16);
		String type3 = xlsReader.getCellData("physicianportal", 3, 16);
		String type4 = xlsReader.getCellData("physicianportal", 4, 16);
		String type5 = xlsReader.getCellData("physicianportal", 5, 16);
		String type6 = xlsReader.getCellData("physicianportal", 6, 16);
		String type7 = xlsReader.getCellData("physicianportal", 7, 16);
		String libraryText = xlsReader.getCellData("physicianportal", 8, 16);			
		String SearchDiogonosisTxt = xlsReader.getCellData("physicianportal", 9, 16);
		String medicarePriority = xlsReader.getCellData("physicianportal", 10, 16);
		String diogonosisName = xlsReader.getCellData("physicianportal", 11, 16);
		String physicianType = xlsReader.getCellData("physicianportal", 12, 16);
		String ReceivedByType = xlsReader.getCellData("physicianportal", 13, 16);
		String ReceivedOrderType = xlsReader.getCellData("physicianportal", 14, 16);		
		String routes = xlsReader.getCellData("physicianportal", 15, 16);
		String WrittenDate = xlsReader.getCellData("physicianportal", 16, 16);
		String NoOfRefillis = xlsReader.getCellData("physicianportal", 17, 16);
		String WhenToFill = xlsReader.getCellData("physicianportal", 18, 16);
		String num = xlsReader.getCellData("physicianportal", 19, 16);
		String frequencyType = xlsReader.getCellData("physicianportal", 20, 16);
		String startDate = xlsReader.getCellData("physicianportal", 21, 16);  
		String ByDate =startDate;
		String startDateTime = xlsReader.getCellData("physicianportal", 22, 16);
		String byDateTime =startDateTime ;
		String byDateno = xlsReader.getCellData("physicianportal", 23, 16);
		String afterNoOfAdminstrationsNo = xlsReader.getCellData("physicianportal", 24, 16);		
		String endDate = xlsReader.getCellData("physicianportal", 25, 16);
		String afterNumberOfAdminstrations = xlsReader.getCellData("physicianportal", 26, 16);
		String requiredActions = xlsReader.getCellData("physicianportal", 27, 16);
		String othersRequiredActions = xlsReader.getCellData("physicianportal", 28, 16);
		String requiredActionsPostDropdown = xlsReader.getCellData("physicianportal", 29, 16);
		String othersRequiredActionsPostDropdown = xlsReader.getCellData("physicianportal", 30, 16);
		String administeredBy = xlsReader.getCellData("physicianportal", 31, 16);
		String maxDoesHours = xlsReader.getCellData("physicianportal", 32, 16);
		String followUpAfterMinutes = xlsReader.getCellData("physicianportal", 33, 16);
		String slidingScaleMin = xlsReader.getCellData("physicianportal", 34, 16);
		String slidingScaleMax = xlsReader.getCellData("physicianportal", 35, 16);
		String slidingScaleUnits = xlsReader.getCellData("physicianportal", 36, 16);
		String frequency = xlsReader.getCellData("physicianportal", 37, 16);
		String howOften = xlsReader.getCellData("physicianportal", 38, 16);
		String everyDay = xlsReader.getCellData("physicianportal", 39, 16);
		String physicianInstructions = xlsReader.getCellData("physicianportal", 40, 16);
		String additionalInstruction = physicianInstructions ;
		String endDateType = xlsReader.getCellData("physicianportal", 42, 16);
		String frequency2 = xlsReader.getCellData("physicianportal", 43, 16);
		String frequency3 = xlsReader.getCellData("physicianportal", 44, 16);
		String frequency4 = xlsReader.getCellData("physicianportal", 45, 16);
		String frequency5 = xlsReader.getCellData("physicianportal", 46, 16);
		String frequency6 = xlsReader.getCellData("physicianportal", 47, 16);
		String frequency7 = xlsReader.getCellData("physicianportal", 48, 16);
		String frequencyTexttype = xlsReader.getCellData("physicianportal", 49, 16);
		String frequencyTexttype1 = xlsReader.getCellData("physicianportal", 50, 16);
		String timeInADayTime = xlsReader.getCellData("physicianportal", 51, 16);
		String timeInADayShift = xlsReader.getCellData("physicianportal", 52, 16);
		String frequency8 = xlsReader.getCellData("physicianportal", 53, 16);
		String frequency9 = xlsReader.getCellData("physicianportal", 54, 16);
		String frequency10 = xlsReader.getCellData("physicianportal", 55, 16);
		String frequency11 = xlsReader.getCellData("physicianportal", 56, 16);
		String frequency12 = xlsReader.getCellData("physicianportal", 57, 16);
		String frequency13 = xlsReader.getCellData("physicianportal", 58, 16);
		String frequency14 = xlsReader.getCellData("physicianportal", 59, 16);
		String frequency15 = xlsReader.getCellData("physicianportal", 60, 16);
		String timeInADayShiftBedTime = xlsReader.getCellData("physicianportal", 61, 16);
		String frequency16 = xlsReader.getCellData("physicianportal", 62, 16);
		String frequency17 = xlsReader.getCellData("physicianportal", 63, 16);
		String frequency18 = xlsReader.getCellData("physicianportal", 64, 16);
		String frequency19 = xlsReader.getCellData("physicianportal", 65, 16);
		String frequency20 = xlsReader.getCellData("physicianportal", 66, 16);
	    String frequency21 = xlsReader.getCellData("physicianportal", 67, 16);
		//String FrequencyName =  frequency21 ;
		
		
		TestTemplate.testReport.logSuccess("Click On existing Resident");
		physicianPortal.ClickOnExistingResident(ResidentNo);
		
		
        
     String[] typeArray= {type1,type2,type3,type4,type5,type6,type7};
	    int numberOfItems = typeArray.length;
	    for (int i=0; i<numberOfItems; i++)
		    		        
		{
		
	    	String type = typeArray[i];
	    	
		physicianPortal.CreateAnOrderWithOrderDetails(type,libraryText+type,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType,ReceivedByType,ReceivedOrderType,routes,WrittenDate,NoOfRefillis,WhenToFill);
		physicianPortal.OrderFrequencyType(Integer.parseInt(num),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDate ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(num),frequency);
		physicianPortal.HowOftenDailyType(Integer.parseInt(num),howOften,everyDay);
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num),physicianInstructions,additionalInstruction,type);
		
		physicianPortal.AddOrderFrequency();
		
		
		
		for(int newnum=2;newnum<=27;newnum ++)
		{
	
		physicianPortal.OrderFrequencyType(newnum,frequencyType);
		physicianPortal.StartDate(newnum,startDate,startDateTime);
		physicianPortal.OrderEndType(newnum,Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDate ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(newnum,frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		switch (newnum)
		{
		case 2:	
			physicianPortal.TextTypeNoOfTimesAdayFrequency(frequencyTexttype ,newnum ,frequency2 , Integer.parseInt(num) , timeInADayTime);
			break;
		case 3:				
	    	physicianPortal.TextTypeNoOfTimesAdayFrequency(frequencyTexttype1 ,newnum ,frequency2 , Integer.parseInt(num) , timeInADayShift);
			break;
		case 4:				
		    physicianPortal.TextTypeNoOfTimesAdayFrequency(frequencyTexttype ,newnum ,frequency3 , (Integer.parseInt(num)+1) , timeInADayTime);
			break;
		case 5:				
	    	physicianPortal.TextTypeNoOfTimesAdayFrequency(frequencyTexttype1 ,newnum ,frequency3 , (Integer.parseInt(num)+1) , timeInADayShift);
			break;
		case 6:				
		    physicianPortal.TextTypeNoOfTimesAdayFrequency(frequencyTexttype ,newnum ,frequency4 , (Integer.parseInt(num)+2) , timeInADayTime);
			break;
		case 7:				
	    	physicianPortal.TextTypeNoOfTimesAdayFrequency(frequencyTexttype1 ,newnum ,frequency4 , (Integer.parseInt(num)+2) , timeInADayShift);
	     	break;
		case 8:		
			physicianPortal.TextTypeNoOfTimesAdayFrequency(frequencyTexttype ,newnum ,frequency5 , (Integer.parseInt(num)+3) , timeInADayTime);
			break;
		case 9:				
	    	physicianPortal.TextTypeNoOfTimesAdayFrequency(frequencyTexttype1 ,newnum ,frequency5 , (Integer.parseInt(num)+3) , timeInADayShift);
			break;
		case 10:				
		    physicianPortal.TextTypeNoOfTimesAdayFrequency(frequencyTexttype ,newnum ,frequency6 , (Integer.parseInt(num)+4) , timeInADayTime);
			break;
		case 11:				
	    	physicianPortal.TextTypeNoOfTimesAdayFrequency(frequencyTexttype1 ,newnum ,frequency6 , (Integer.parseInt(num)+4) , timeInADayShift);
			break;
		case 12:				
		    physicianPortal.TextTypeNoOfTimesAdayFrequency(frequencyTexttype ,newnum ,frequency7 , (Integer.parseInt(num)+5) , timeInADayTime);
			break;
		case 13:				
	    	physicianPortal.TextTypeNoOfTimesAdayFrequency(frequencyTexttype1 ,newnum ,frequency7 , (Integer.parseInt(num)+5) , timeInADayShift);
	     	break;
		case 14:				
	    	physicianPortal.BedTimeFrequency(frequencyTexttype ,newnum ,frequency8,timeInADayTime);
	     	break;	  	
		case 15:				
			physicianPortal.HourWiseFrequency(newnum ,frequency9 ,timeInADayTime );
	     	break;
		case 16:				
	    	physicianPortal.HourWiseFrequency(newnum ,frequency10 ,timeInADayTime );
	     	break;
		case 17:				
			physicianPortal.HourWiseFrequency(newnum ,frequency11 ,timeInADayTime );
	     	break;
		case 18:				
			physicianPortal.HourWiseFrequency(newnum ,frequency12 ,timeInADayTime );
	     	break;
		case 19:				
			physicianPortal.HourWiseFrequency(newnum ,frequency13 ,timeInADayTime );
	     	break;
		case 20:				
			physicianPortal.HourWiseFrequency(newnum ,frequency14 ,timeInADayTime );
	     	break;
		case 21:				
			physicianPortal.HourWiseFrequency(newnum ,frequency15 ,timeInADayTime );
	     	break;
	    case 22:				
			physicianPortal.MealWiseFrequency(newnum ,frequency16,timeInADayShiftBedTime );
	     	break;
	   	case 23:				
	   		physicianPortal.MealWiseFrequency(newnum ,frequency17,timeInADayShiftBedTime );
	     	break; 	
	    case 24:				
	    	physicianPortal.MealWiseFrequency(newnum ,frequency18,timeInADayShiftBedTime );
	     	break;
	    case 25:				
	    	physicianPortal.MealWiseFrequency(newnum ,frequency19,timeInADayShiftBedTime );
	     	break;
	   	case 26:				
	   		physicianPortal.MealWiseFrequency(newnum ,frequency20,timeInADayShiftBedTime );
	     	break; 	
		case 27:				
			physicianPortal.OnceAShiftFrequency(newnum,frequency21);
	     	break; 	
		
		}
		String[] FrequencyNames = {frequency2,frequency2,frequency3,frequency3,frequency4,frequency4,frequency5,frequency5,frequency6,frequency6,frequency7,frequency7,frequency8,frequency9,frequency10,frequency11,
				frequency12,frequency13,frequency14,frequency15,frequency16,frequency17,frequency18,frequency19,frequency20,frequency21};
		 
		String FrequencyName = FrequencyNames[newnum-2];
		
		if(FrequencyName!=frequency21)
		{
		physicianPortal.HowOftenDailyType(newnum,howOften,everyDay);
		}
	
		physicianPortal.CreateOrderFrequencyForRoutine(newnum,physicianInstructions,additionalInstruction,type);		
		
		if(FrequencyName!=frequency21)
		{
			physicianPortal.AddOrderFrequency();
		}
		
		
		}
		physicianPortal.SaveOrderFrequency();		
		
		}	
	    
	    
		
	}
	
	
	@Test(enabled = false)
	public void QA11_HowOften_RoutineFrequencyType() throws URISyntaxException
	{
		PhysicianPortal physicianPortal=new PhysicianPortal(threadLocalWebDriver.get(), TestTemplate.testReport);
		HomePage homepage = new HomePage(threadLocalWebDriver.get(), TestTemplate.testReport);
		LoginPage login = new LoginPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		
		
		TestTemplate.testReport.logSuccess("Click to Physician Portal From Menu Bar");
		homepage.NavigateToPhysicianPortal();
		
		TestTemplate.testReport.logSuccess("Navigate to Residents Order From Physician Portal");
		physicianPortal.ClickOnPhysicianPortal();	
		
		String ResidentNo = xlsReader.getCellData("physicianportal", 0, 20);
		String type1 = xlsReader.getCellData("physicianportal", 1, 20);
		String type2 = xlsReader.getCellData("physicianportal", 2, 20);
		String type3 = xlsReader.getCellData("physicianportal", 3, 20);
		String type4 = xlsReader.getCellData("physicianportal", 4, 20);
		String type5 = xlsReader.getCellData("physicianportal", 5, 20);
		String type6 = xlsReader.getCellData("physicianportal", 6, 20);
		String type7 = xlsReader.getCellData("physicianportal", 7, 20);
		String libraryText = xlsReader.getCellData("physicianportal", 8, 20);			
		String SearchDiogonosisTxt = xlsReader.getCellData("physicianportal", 9, 20);
		String medicarePriority = xlsReader.getCellData("physicianportal", 10, 20);
		String diogonosisName = xlsReader.getCellData("physicianportal", 11, 20);
		String physicianType = xlsReader.getCellData("physicianportal", 12, 20);
		String ReceivedByType = xlsReader.getCellData("physicianportal", 13, 20);
		String ReceivedOrderType = xlsReader.getCellData("physicianportal", 14, 20);		
		String routes = xlsReader.getCellData("physicianportal", 15, 20);
		String WrittenDate = xlsReader.getCellData("physicianportal", 16, 20);
		String NoOfRefillis = xlsReader.getCellData("physicianportal", 17, 20);
		String WhenToFill = xlsReader.getCellData("physicianportal", 18, 20);
		String num = xlsReader.getCellData("physicianportal", 19, 20);
		String frequencyType = xlsReader.getCellData("physicianportal", 20, 20);
		String startDate = xlsReader.getCellData("physicianportal", 21, 20);  
		String ByDate =startDate;
		String startDateTime = xlsReader.getCellData("physicianportal", 22, 20);
		String byDateTime =startDateTime ;
		String byDateno = xlsReader.getCellData("physicianportal", 23, 20);
		String afterNoOfAdminstrationsNo = xlsReader.getCellData("physicianportal", 24, 20);		
		String endDate = xlsReader.getCellData("physicianportal", 25, 20);
		String afterNumberOfAdminstrations = xlsReader.getCellData("physicianportal", 26, 20);
		String requiredActions = xlsReader.getCellData("physicianportal", 27, 20);
		String othersRequiredActions = xlsReader.getCellData("physicianportal", 28, 20);
		String requiredActionsPostDropdown = xlsReader.getCellData("physicianportal", 29, 20);
		String othersRequiredActionsPostDropdown = xlsReader.getCellData("physicianportal", 30, 20);
		String administeredBy = xlsReader.getCellData("physicianportal", 31, 20);
		String maxDoesHours = xlsReader.getCellData("physicianportal", 32, 20);
		String followUpAfterMinutes = xlsReader.getCellData("physicianportal", 33, 20);
		String slidingScaleMin = xlsReader.getCellData("physicianportal", 34, 20);
		String slidingScaleMax = xlsReader.getCellData("physicianportal", 35, 20);
		String slidingScaleUnits = xlsReader.getCellData("physicianportal", 36, 20);
		String frequency = xlsReader.getCellData("physicianportal", 37, 20);
		String howOften = xlsReader.getCellData("physicianportal", 38, 20);
		String everyDay = xlsReader.getCellData("physicianportal", 39, 20);
		String physicianInstructions = xlsReader.getCellData("physicianportal", 40, 20);
		String additionalInstruction = physicianInstructions ;
		String endDateType = xlsReader.getCellData("physicianportal", 42, 20);
		String endDateType1 = xlsReader.getCellData("physicianportal", 43, 20);
		String endDateType2 = xlsReader.getCellData("physicianportal", 44, 20);
		String TypeOfMode = xlsReader.getCellData("physicianportal", 45, 20);
		String howOften1 = xlsReader.getCellData("physicianportal", 46, 20);
		String howOften2 = xlsReader.getCellData("physicianportal", 47, 20);
		String howOften3 = xlsReader.getCellData("physicianportal", 48, 20);
		String DropdownNumber = xlsReader.getCellData("physicianportal", 49, 20);
		String DropdownDay = xlsReader.getCellData("physicianportal", 50, 20);
		String TypeOfMode1 = xlsReader.getCellData("physicianportal", 51, 20);
		String scheduleOnMonth = xlsReader.getCellData("physicianportal", 52, 20);
		String num1= xlsReader.getCellData("physicianportal", 53, 20); 
		String num2= xlsReader.getCellData("physicianportal", 54, 20); 
		String num3= xlsReader.getCellData("physicianportal", 55, 20); 
		String num4= xlsReader.getCellData("physicianportal", 56, 20); 
		
		
		TestTemplate.testReport.logSuccess("Click On existing Resident");
		physicianPortal.ClickOnExistingResident(ResidentNo);
	
		TestTemplate.testReport.logSuccess("Create Order With Treatment Dropdown Option");
		
		physicianPortal.CreateAnOrderWithOrderDetails(type1,libraryText+type1,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType,ReceivedByType,ReceivedOrderType,routes,WrittenDate,NoOfRefillis,WhenToFill);
		physicianPortal.OrderFrequencyType(Integer.parseInt(num),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDate ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(num),frequency);
		physicianPortal.HowOftenDailyType(Integer.parseInt(num),howOften,everyDay);
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num),physicianInstructions,additionalInstruction,type1);
		

		TestTemplate.testReport.logSuccess("Create Frequency With  Weekly HowOften Dropdown Option");
		physicianPortal.AddOrderFrequency();
		
		physicianPortal.OrderFrequencyType(Integer.parseInt(num1),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num1),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num1),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDate ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num1),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(num1),frequency);
		physicianPortal.HowOftenWeeklytype(Integer.parseInt(num1),Integer.parseInt(num),howOften1,everyDay);
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num1),physicianInstructions,additionalInstruction,type1);
		
		TestTemplate.testReport.logSuccess("Create Frequency With  Monthly HowOften Dropdown Option");
		physicianPortal.AddOrderFrequency();
		
		physicianPortal.OrderFrequencyType(Integer.parseInt(num2),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num2),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num2),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDate ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num2),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(num2),frequency);
		physicianPortal.HowOftenMonthlytype(TypeOfMode,Integer.parseInt(num2),Integer.parseInt(num),Integer.parseInt(num2),howOften2,everyDay,DropdownNumber,DropdownDay);
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num2),physicianInstructions,additionalInstruction,type1);
		
		TestTemplate.testReport.logSuccess("Create Frequency With  Monthly HowOften Dropdown Option");
		physicianPortal.AddOrderFrequency();
		
		physicianPortal.OrderFrequencyType(Integer.parseInt(num3),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num3),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num3),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDate ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num3),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(num3),frequency);
		physicianPortal.HowOftenMonthlytype(TypeOfMode1,Integer.parseInt(num3),Integer.parseInt(num),Integer.parseInt(num3),howOften2,everyDay,DropdownNumber,DropdownDay);
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num3),physicianInstructions,additionalInstruction,type1);
		
		TestTemplate.testReport.logSuccess("Create Frequency With Yearly HowOften Dropdown Option");
		physicianPortal.AddOrderFrequency();
		
		physicianPortal.OrderFrequencyType(Integer.parseInt(num4),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num4),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num4),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDate ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num4),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(num4),frequency);
		physicianPortal.HowOftenYearlyType(Integer.parseInt(num4),Integer.parseInt(num),howOften3,scheduleOnMonth,everyDay,everyDay);
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num4),physicianInstructions,additionalInstruction,type1);
		physicianPortal.SaveOrderFrequency();
		
		physicianPortal.CreateAnOrderWithOrderDetails(type2,libraryText+type2,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType,ReceivedByType,ReceivedOrderType,routes,WrittenDate,NoOfRefillis,WhenToFill);
		physicianPortal.OrderFrequencyType(Integer.parseInt(num),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDate ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(num),frequency);
		physicianPortal.HowOftenDailyType(Integer.parseInt(num),howOften,everyDay);
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num),physicianInstructions,additionalInstruction,type2);
		

		TestTemplate.testReport.logSuccess("Create Frequency With  Weekly HowOften Dropdown Option");
		physicianPortal.AddOrderFrequency();
		
		physicianPortal.OrderFrequencyType(Integer.parseInt(num1),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num1),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num1),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDate ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num1),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(num1),frequency);
		physicianPortal.HowOftenWeeklytype(Integer.parseInt(num1),Integer.parseInt(num),howOften1,everyDay);
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num1),physicianInstructions,additionalInstruction,type2);
		
		TestTemplate.testReport.logSuccess("Create Frequency With  Monthly HowOften Dropdown Option");
		physicianPortal.AddOrderFrequency();
		
		physicianPortal.OrderFrequencyType(Integer.parseInt(num2),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num2),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num2),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDate ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num2),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(num2),frequency);
		physicianPortal.HowOftenMonthlytype(TypeOfMode,Integer.parseInt(num2),Integer.parseInt(num),Integer.parseInt(num2),howOften2,everyDay,DropdownNumber,DropdownDay);
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num2),physicianInstructions,additionalInstruction,type2);
		
		TestTemplate.testReport.logSuccess("Create Frequency With  Monthly HowOften Dropdown Option");
		physicianPortal.AddOrderFrequency();
		
		physicianPortal.OrderFrequencyType(Integer.parseInt(num3),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num3),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num3),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDate ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num3),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(num3),frequency);
		physicianPortal.HowOftenMonthlytype(TypeOfMode1,Integer.parseInt(num3),Integer.parseInt(num),Integer.parseInt(num3),howOften2,everyDay,DropdownNumber,DropdownDay);
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num3),physicianInstructions,additionalInstruction,type2);
		
		TestTemplate.testReport.logSuccess("Create Frequency With Yearly HowOften Dropdown Option");
		physicianPortal.AddOrderFrequency();
		
		physicianPortal.OrderFrequencyType(Integer.parseInt(num4),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num4),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num4),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDate ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num4),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(num4),frequency);
		physicianPortal.HowOftenYearlyType(Integer.parseInt(num4),Integer.parseInt(num),howOften3,scheduleOnMonth,everyDay,everyDay);
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num4),physicianInstructions,additionalInstruction,type2);
		physicianPortal.SaveOrderFrequency();
		
		
		
		physicianPortal.CreateAnOrderWithOrderDetails(type3,libraryText+type3,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType,ReceivedByType,ReceivedOrderType,routes,WrittenDate,NoOfRefillis,WhenToFill);
		physicianPortal.OrderFrequencyType(Integer.parseInt(num),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDate ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(num),frequency);
		physicianPortal.HowOftenDailyType(Integer.parseInt(num),howOften,everyDay);
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num),physicianInstructions,additionalInstruction,type3);
		

		TestTemplate.testReport.logSuccess("Create Frequency With  Weekly HowOften Dropdown Option");
		physicianPortal.AddOrderFrequency();
		
		physicianPortal.OrderFrequencyType(Integer.parseInt(num1),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num1),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num1),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDate ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num1),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(num1),frequency);
		physicianPortal.HowOftenWeeklytype(Integer.parseInt(num1),Integer.parseInt(num),howOften1,everyDay);
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num1),physicianInstructions,additionalInstruction,type3);
		
		TestTemplate.testReport.logSuccess("Create Frequency With  Monthly HowOften Dropdown Option");
		physicianPortal.AddOrderFrequency();
		
		physicianPortal.OrderFrequencyType(Integer.parseInt(num2),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num2),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num2),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDate ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num2),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(num2),frequency);
		physicianPortal.HowOftenMonthlytype(TypeOfMode,Integer.parseInt(num2),Integer.parseInt(num),Integer.parseInt(num2),howOften2,everyDay,DropdownNumber,DropdownDay);
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num2),physicianInstructions,additionalInstruction,type3);
		
		TestTemplate.testReport.logSuccess("Create Frequency With  Monthly HowOften Dropdown Option");
		physicianPortal.AddOrderFrequency();
		
		physicianPortal.OrderFrequencyType(Integer.parseInt(num3),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num3),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num3),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDate ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num3),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(num3),frequency);
		physicianPortal.HowOftenMonthlytype(TypeOfMode1,Integer.parseInt(num3),Integer.parseInt(num),Integer.parseInt(num3),howOften2,everyDay,DropdownNumber,DropdownDay);
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num3),physicianInstructions,additionalInstruction,type3);
		
		TestTemplate.testReport.logSuccess("Create Frequency With Yearly HowOften Dropdown Option");
		physicianPortal.AddOrderFrequency();
		
		physicianPortal.OrderFrequencyType(Integer.parseInt(num4),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num4),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num4),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDate ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num4),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(num4),frequency);
		physicianPortal.HowOftenYearlyType(Integer.parseInt(num4),Integer.parseInt(num),howOften3,scheduleOnMonth,everyDay,everyDay);
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num4),physicianInstructions,additionalInstruction,type3);
		physicianPortal.SaveOrderFrequency();
		
		physicianPortal.CreateAnOrderWithOrderDetails(type4,libraryText+type4,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType,ReceivedByType,ReceivedOrderType,routes,WrittenDate,NoOfRefillis,WhenToFill);
		physicianPortal.OrderFrequencyType(Integer.parseInt(num),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDate ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(num),frequency);
		physicianPortal.HowOftenDailyType(Integer.parseInt(num),howOften,everyDay);
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num),physicianInstructions,additionalInstruction,type4);
		

		TestTemplate.testReport.logSuccess("Create Frequency With  Weekly HowOften Dropdown Option");
		physicianPortal.AddOrderFrequency();
		
		physicianPortal.OrderFrequencyType(Integer.parseInt(num1),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num1),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num1),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDate ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num1),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(num1),frequency);
		physicianPortal.HowOftenWeeklytype(Integer.parseInt(num1),Integer.parseInt(num),howOften1,everyDay);
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num1),physicianInstructions,additionalInstruction,type4);
		
		TestTemplate.testReport.logSuccess("Create Frequency With  Monthly HowOften Dropdown Option");
		physicianPortal.AddOrderFrequency();
		
		physicianPortal.OrderFrequencyType(Integer.parseInt(num2),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num2),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num2),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDate ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num2),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(num2),frequency);
		physicianPortal.HowOftenMonthlytype(TypeOfMode,Integer.parseInt(num2),Integer.parseInt(num),Integer.parseInt(num2),howOften2,everyDay,DropdownNumber,DropdownDay);
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num2),physicianInstructions,additionalInstruction,type4);
		
		TestTemplate.testReport.logSuccess("Create Frequency With  Monthly HowOften Dropdown Option");
		physicianPortal.AddOrderFrequency();
		
		physicianPortal.OrderFrequencyType(Integer.parseInt(num3),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num3),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num3),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDate ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num3),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(num3),frequency);
		physicianPortal.HowOftenMonthlytype(TypeOfMode1,Integer.parseInt(num3),Integer.parseInt(num),Integer.parseInt(num3),howOften2,everyDay,DropdownNumber,DropdownDay);
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num3),physicianInstructions,additionalInstruction,type4);
		
		TestTemplate.testReport.logSuccess("Create Frequency With Yearly HowOften Dropdown Option");
		physicianPortal.AddOrderFrequency();
		
		physicianPortal.OrderFrequencyType(Integer.parseInt(num4),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num4),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num4),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDate ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num4),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(num4),frequency);
		physicianPortal.HowOftenYearlyType(Integer.parseInt(num4),Integer.parseInt(num),howOften3,scheduleOnMonth,everyDay,everyDay);
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num4),physicianInstructions,additionalInstruction,type4);
		physicianPortal.SaveOrderFrequency();
		
		physicianPortal.CreateAnOrderWithOrderDetails(type5,libraryText+type5,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType,ReceivedByType,ReceivedOrderType,routes,WrittenDate,NoOfRefillis,WhenToFill);
		physicianPortal.OrderFrequencyType(Integer.parseInt(num),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDate ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(num),frequency);
		physicianPortal.HowOftenDailyType(Integer.parseInt(num),howOften,everyDay);
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num),physicianInstructions,additionalInstruction,type5);
		

		TestTemplate.testReport.logSuccess("Create Frequency With  Weekly HowOften Dropdown Option");
		physicianPortal.AddOrderFrequency();
		
		physicianPortal.OrderFrequencyType(Integer.parseInt(num1),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num1),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num1),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDate ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num1),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(num1),frequency);
		physicianPortal.HowOftenWeeklytype(Integer.parseInt(num1),Integer.parseInt(num),howOften1,everyDay);
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num1),physicianInstructions,additionalInstruction,type5);
		
		TestTemplate.testReport.logSuccess("Create Frequency With  Monthly HowOften Dropdown Option");
		physicianPortal.AddOrderFrequency();
		
		physicianPortal.OrderFrequencyType(Integer.parseInt(num2),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num2),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num2),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDate ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num2),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(num2),frequency);
		physicianPortal.HowOftenMonthlytype(TypeOfMode,Integer.parseInt(num2),Integer.parseInt(num),Integer.parseInt(num2),howOften2,everyDay,DropdownNumber,DropdownDay);
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num2),physicianInstructions,additionalInstruction,type5);
		
		TestTemplate.testReport.logSuccess("Create Frequency With  Monthly HowOften Dropdown Option");
		physicianPortal.AddOrderFrequency();
		
		physicianPortal.OrderFrequencyType(Integer.parseInt(num3),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num3),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num3),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDate ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num3),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(num3),frequency);
		physicianPortal.HowOftenMonthlytype(TypeOfMode1,Integer.parseInt(num3),Integer.parseInt(num),Integer.parseInt(num3),howOften2,everyDay,DropdownNumber,DropdownDay);
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num3),physicianInstructions,additionalInstruction,type5);
		
		TestTemplate.testReport.logSuccess("Create Frequency With Yearly HowOften Dropdown Option");
		physicianPortal.AddOrderFrequency();
		
		physicianPortal.OrderFrequencyType(Integer.parseInt(num4),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num4),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num4),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDate ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num4),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(num4),frequency);
		physicianPortal.HowOftenYearlyType(Integer.parseInt(num4),Integer.parseInt(num),howOften3,scheduleOnMonth,everyDay,everyDay);
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num4),physicianInstructions,additionalInstruction,type5);
		physicianPortal.SaveOrderFrequency();
		
		physicianPortal.CreateAnOrderWithOrderDetails(type6,libraryText+type6,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType,ReceivedByType,ReceivedOrderType,routes,WrittenDate,NoOfRefillis,WhenToFill);
		physicianPortal.OrderFrequencyType(Integer.parseInt(num),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDate ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(num),frequency);
		physicianPortal.HowOftenDailyType(Integer.parseInt(num),howOften,everyDay);
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num),physicianInstructions,additionalInstruction,type6);
		

		TestTemplate.testReport.logSuccess("Create Frequency With  Weekly HowOften Dropdown Option");
		physicianPortal.AddOrderFrequency();
		
		physicianPortal.OrderFrequencyType(Integer.parseInt(num1),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num1),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num1),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDate ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num1),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(num1),frequency);
		physicianPortal.HowOftenWeeklytype(Integer.parseInt(num1),Integer.parseInt(num),howOften1,everyDay);
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num1),physicianInstructions,additionalInstruction,type6);
		
		TestTemplate.testReport.logSuccess("Create Frequency With  Monthly HowOften Dropdown Option");
		physicianPortal.AddOrderFrequency();
		
		physicianPortal.OrderFrequencyType(Integer.parseInt(num2),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num2),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num2),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDate ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num2),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(num2),frequency);
		physicianPortal.HowOftenMonthlytype(TypeOfMode,Integer.parseInt(num2),Integer.parseInt(num),Integer.parseInt(num2),howOften2,everyDay,DropdownNumber,DropdownDay);
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num2),physicianInstructions,additionalInstruction,type6);
		
		TestTemplate.testReport.logSuccess("Create Frequency With  Monthly HowOften Dropdown Option");
		physicianPortal.AddOrderFrequency();
		
		physicianPortal.OrderFrequencyType(Integer.parseInt(num3),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num3),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num3),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDate ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num3),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(num3),frequency);
		physicianPortal.HowOftenMonthlytype(TypeOfMode1,Integer.parseInt(num3),Integer.parseInt(num),Integer.parseInt(num3),howOften2,everyDay,DropdownNumber,DropdownDay);
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num3),physicianInstructions,additionalInstruction,type6);
		
		TestTemplate.testReport.logSuccess("Create Frequency With Yearly HowOften Dropdown Option");
		physicianPortal.AddOrderFrequency();
		
		physicianPortal.OrderFrequencyType(Integer.parseInt(num4),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num4),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num4),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDate ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num4),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(num4),frequency);
		physicianPortal.HowOftenYearlyType(Integer.parseInt(num4),Integer.parseInt(num),howOften3,scheduleOnMonth,everyDay,everyDay);
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num4),physicianInstructions,additionalInstruction,type6);
		physicianPortal.SaveOrderFrequency();
		
		physicianPortal.CreateAnOrderWithOrderDetails(type7,libraryText+type7,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType,ReceivedByType,ReceivedOrderType,routes,WrittenDate,NoOfRefillis,WhenToFill);
		physicianPortal.OrderFrequencyType(Integer.parseInt(num),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDate ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(num),frequency);
		physicianPortal.HowOftenDailyType(Integer.parseInt(num),howOften,everyDay);
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num),physicianInstructions,additionalInstruction,type7);
		

		TestTemplate.testReport.logSuccess("Create Frequency With  Weekly HowOften Dropdown Option");
		physicianPortal.AddOrderFrequency();
		
		physicianPortal.OrderFrequencyType(Integer.parseInt(num1),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num1),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num1),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDate ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num1),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(num1),frequency);
		physicianPortal.HowOftenWeeklytype(Integer.parseInt(num1),Integer.parseInt(num),howOften1,everyDay);
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num1),physicianInstructions,additionalInstruction,type7);
		
		TestTemplate.testReport.logSuccess("Create Frequency With  Monthly HowOften Dropdown Option");
		physicianPortal.AddOrderFrequency();
		
		physicianPortal.OrderFrequencyType(Integer.parseInt(num2),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num2),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num2),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDate ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num2),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(num2),frequency);
		physicianPortal.HowOftenMonthlytype(TypeOfMode,Integer.parseInt(num2),Integer.parseInt(num),Integer.parseInt(num2),howOften2,everyDay,DropdownNumber,DropdownDay);
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num2),physicianInstructions,additionalInstruction,type7);
		
		TestTemplate.testReport.logSuccess("Create Frequency With  Monthly HowOften Dropdown Option");
		physicianPortal.AddOrderFrequency();
		
		physicianPortal.OrderFrequencyType(Integer.parseInt(num3),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num3),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num3),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDate ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num3),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(num3),frequency);
		physicianPortal.HowOftenMonthlytype(TypeOfMode1,Integer.parseInt(num3),Integer.parseInt(num),Integer.parseInt(num3),howOften2,everyDay,DropdownNumber,DropdownDay);
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num3),physicianInstructions,additionalInstruction,type7);
		
		TestTemplate.testReport.logSuccess("Create Frequency With Yearly HowOften Dropdown Option");
		physicianPortal.AddOrderFrequency();
		
		physicianPortal.OrderFrequencyType(Integer.parseInt(num4),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num4),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num4),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDate ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num4),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(num4),frequency);
		physicianPortal.HowOftenYearlyType(Integer.parseInt(num4),Integer.parseInt(num),howOften3,scheduleOnMonth,everyDay,everyDay);
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num4),physicianInstructions,additionalInstruction,type7);
		physicianPortal.SaveOrderFrequency();
		
		login.Logout();
		
	}
	
	
	
	@Test(enabled = false)
	public void QA12_ResidentOrders_CreateAnOrderWithFrequencyPRN(ITestContext testContext)
	{
		PhysicianPortal physicianPortal=new PhysicianPortal(threadLocalWebDriver.get(), TestTemplate.testReport);
		HomePage homepage = new HomePage(threadLocalWebDriver.get(), TestTemplate.testReport);
		LoginPage login = new LoginPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		
		
		TestTemplate.testReport.logSuccess("Click to Physician Portal From Menu Bar");
		homepage.NavigateToPhysicianPortal();
		
		TestTemplate.testReport.logSuccess("Navigate to Residents Order From Physician Portal");
		physicianPortal.ClickOnPhysicianPortal();	
		
		
		String ResidentNo = xlsReader.getCellData("physicianportal", 0, 24);
		String type1 = xlsReader.getCellData("physicianportal", 1, 24);
		String type2 = xlsReader.getCellData("physicianportal", 2, 24);
		String type3 = xlsReader.getCellData("physicianportal", 3, 24);
		String type4 = xlsReader.getCellData("physicianportal", 4, 24);
		String type5 = xlsReader.getCellData("physicianportal", 5, 24);
		String type6 = xlsReader.getCellData("physicianportal", 6, 24);
		String type7 = xlsReader.getCellData("physicianportal", 7, 24);
		String libraryText = xlsReader.getCellData("physicianportal", 8, 24);			
		String SearchDiogonosisTxt = xlsReader.getCellData("physicianportal", 9, 24);
		String medicarePriority = xlsReader.getCellData("physicianportal", 10, 24);
		String diogonosisName = xlsReader.getCellData("physicianportal", 11, 24);
		String physicianType = xlsReader.getCellData("physicianportal", 12, 24);
		String ReceivedByType = xlsReader.getCellData("physicianportal", 13, 24);
		String ReceivedOrderType = xlsReader.getCellData("physicianportal", 14, 24);		
		String routes = xlsReader.getCellData("physicianportal", 15, 24);
		String WrittenDate = xlsReader.getCellData("physicianportal", 16, 24);
		String NoOfRefillis = xlsReader.getCellData("physicianportal", 17, 24);
		String WhenToFill = xlsReader.getCellData("physicianportal", 18, 24);
		String num = xlsReader.getCellData("physicianportal", 19, 24);
		String frequencyType = xlsReader.getCellData("physicianportal", 20, 24);
		String startDate = xlsReader.getCellData("physicianportal", 21, 24);  
		String ByDate =startDate;
		String startDateTime = xlsReader.getCellData("physicianportal", 22, 24);
		String byDateTime =startDateTime ;
		String byDateno = xlsReader.getCellData("physicianportal", 23, 24);
		String afterNoOfAdminstrationsNo = xlsReader.getCellData("physicianportal", 24, 24);		
		String endDate = xlsReader.getCellData("physicianportal", 25, 24);
		String afterNumberOfAdminstrations = xlsReader.getCellData("physicianportal", 26, 24);
		String requiredActions = xlsReader.getCellData("physicianportal", 27, 24);
		String othersRequiredActions = xlsReader.getCellData("physicianportal", 28, 24);
		String requiredActionsPostDropdown = xlsReader.getCellData("physicianportal", 29, 24);
		String othersRequiredActionsPostDropdown = xlsReader.getCellData("physicianportal", 30, 24);
		String administeredBy = xlsReader.getCellData("physicianportal", 31, 24);
		String maxDoesHours = xlsReader.getCellData("physicianportal", 32, 24);
		String followUpAfterMinutes = xlsReader.getCellData("physicianportal", 33, 24);
		String slidingScaleMin = xlsReader.getCellData("physicianportal", 34, 24);
		String slidingScaleMax = xlsReader.getCellData("physicianportal", 35, 24);
		String slidingScaleUnits = xlsReader.getCellData("physicianportal", 36, 24);
		/*String frequency = xlsReader.getCellData("physicianportal", 37, 12);
		String howOften = xlsReader.getCellData("physicianportal", 38, 12);
		String everyDay = xlsReader.getCellData("physicianportal", 39, 12);*/
		String physicianInstructions = xlsReader.getCellData("physicianportal", 40, 24);
		String additionalInstruction = physicianInstructions ;
		String endDateType = xlsReader.getCellData("physicianportal", 42, 24);
		String endDateType1 = xlsReader.getCellData("physicianportal", 43, 24);
		String endDateType2 = xlsReader.getCellData("physicianportal", 44, 24);
		/*String TypeOfMode = xlsReader.getCellData("physicianportal", 45, 12);
		String howOften1 = xlsReader.getCellData("physicianportal", 46, 12);
		String howOften2 = xlsReader.getCellData("physicianportal", 47, 12);
		String howOften3 = xlsReader.getCellData("physicianportal", 48, 12);
		String DropdownNumber = xlsReader.getCellData("physicianportal", 49, 12);
		String DropdownDay = xlsReader.getCellData("physicianportal", 50, 12);
		String TypeOfMode1 = xlsReader.getCellData("physicianportal", 51, 12);
		String scheduleOnMonth = xlsReader.getCellData("physicianportal", 52, 12);*/
		
		TestTemplate.testReport.logSuccess("Click On existing Resident");
		physicianPortal.ClickOnExistingResident(ResidentNo);
	
		TestTemplate.testReport.logSuccess("Create Order With Treatment Dropdown Option");
		
		physicianPortal.CreateAnOrderWithOrderDetails(type1,libraryText+type1,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType,ReceivedByType,ReceivedOrderType,routes,WrittenDate,NoOfRefillis,WhenToFill);
		physicianPortal.OrderFrequencyType(Integer.parseInt(num),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDate ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num),physicianInstructions,additionalInstruction,type1);
		physicianPortal.SaveOrderFrequency();
		physicianPortal.OrderDisplayPageColourVerification();
		physicianPortal.OrderDisplayPageColoumnsVerification();
		physicianPortal.BottomPaneOfContainer();
		
		physicianPortal.CreateAnOrderWithOrderDetails(type2,libraryText+type2,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType,ReceivedByType,ReceivedOrderType,routes,WrittenDate,NoOfRefillis,WhenToFill);
		physicianPortal.OrderFrequencyType(Integer.parseInt(num),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType1,endDateType1 ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num),physicianInstructions,additionalInstruction,type2);
		physicianPortal.SaveOrderFrequency();
		
		physicianPortal.CreateAnOrderWithOrderDetails(type3,libraryText+type3,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType,ReceivedByType,ReceivedOrderType,routes,WrittenDate,NoOfRefillis,WhenToFill);
		physicianPortal.OrderFrequencyType(Integer.parseInt(num),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType2,endDateType2 ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num),physicianInstructions,additionalInstruction,type3);
		physicianPortal.SaveOrderFrequency();
		
		physicianPortal.CreateAnOrderWithOrderDetails(type4,libraryText+type4,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType,ReceivedByType,ReceivedOrderType,routes,WrittenDate,NoOfRefillis,WhenToFill);
		physicianPortal.OrderFrequencyType(Integer.parseInt(num),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDateType ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
				
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num),physicianInstructions,additionalInstruction,type4);
		physicianPortal.SaveOrderFrequency();
		
		physicianPortal.CreateAnOrderWithOrderDetails(type5,libraryText+type5,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType,ReceivedByType,ReceivedOrderType,routes,WrittenDate,NoOfRefillis,WhenToFill);
		physicianPortal.OrderFrequencyType(Integer.parseInt(num),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDateType ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num),physicianInstructions,additionalInstruction,type5);
		physicianPortal.SaveOrderFrequency();
		
		physicianPortal.CreateAnOrderWithOrderDetails(type6,libraryText+type6,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType,ReceivedByType,ReceivedOrderType,routes,WrittenDate,NoOfRefillis,WhenToFill);
		physicianPortal.OrderFrequencyType(Integer.parseInt(num),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDateType ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num),physicianInstructions,additionalInstruction,type6);
		physicianPortal.SaveOrderFrequency();
		
		physicianPortal.CreateAnOrderWithOrderDetails(type7,libraryText+type7,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType,ReceivedByType,ReceivedOrderType,routes,WrittenDate,NoOfRefillis,WhenToFill);
		physicianPortal.OrderFrequencyType(Integer.parseInt(num),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDateType ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num),physicianInstructions,additionalInstruction,type7);
		physicianPortal.SaveOrderFrequency();
		login.Logout();
	}
	
	
	@Test(enabled = false)
	public void QA13_ResidentOrders_CreateAnOrderWithFrequencyPRNEveryHour(ITestContext testContext)
	{
		PhysicianPortal physicianPortal=new PhysicianPortal(threadLocalWebDriver.get(), TestTemplate.testReport);
		HomePage homepage = new HomePage(threadLocalWebDriver.get(), TestTemplate.testReport);
		LoginPage login = new LoginPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		
		
		TestTemplate.testReport.logSuccess("Click to Physician Portal From Menu Bar");
		homepage.NavigateToPhysicianPortal();
		
		TestTemplate.testReport.logSuccess("Navigate to Residents Order From Physician Portal");
		physicianPortal.ClickOnPhysicianPortal();	
		
		
		String ResidentNo = xlsReader.getCellData("physicianportal", 0, 28);
		String type1 = xlsReader.getCellData("physicianportal", 1, 28);
		String type2 = xlsReader.getCellData("physicianportal", 2, 28);
		String type3 = xlsReader.getCellData("physicianportal", 3, 28);
		String type4 = xlsReader.getCellData("physicianportal", 4, 28);
		String type5 = xlsReader.getCellData("physicianportal", 5, 28);
		String type6 = xlsReader.getCellData("physicianportal", 6, 28);
		String type7 = xlsReader.getCellData("physicianportal", 7, 28);
		String libraryText = xlsReader.getCellData("physicianportal", 8, 28);			
		String SearchDiogonosisTxt = xlsReader.getCellData("physicianportal", 9, 28);
		String medicarePriority = xlsReader.getCellData("physicianportal", 10, 28);
		String diogonosisName = xlsReader.getCellData("physicianportal", 11, 28);
		String physicianType = xlsReader.getCellData("physicianportal", 12, 28);
		String ReceivedByType = xlsReader.getCellData("physicianportal", 13, 28);
		String ReceivedOrderType = xlsReader.getCellData("physicianportal", 14, 28);		
		String routes = xlsReader.getCellData("physicianportal", 15, 28);
		String WrittenDate = xlsReader.getCellData("physicianportal", 16, 28);
		String NoOfRefillis = xlsReader.getCellData("physicianportal", 17, 28);
		String WhenToFill = xlsReader.getCellData("physicianportal", 18, 28);
		String num = xlsReader.getCellData("physicianportal", 19, 28);
		String frequencyType = xlsReader.getCellData("physicianportal", 20, 28);
		String startDate = xlsReader.getCellData("physicianportal", 21, 28);  
		String ByDate =startDate;
		String startDateTime = xlsReader.getCellData("physicianportal", 22, 28);
		String byDateTime =startDateTime ;
		String byDateno = xlsReader.getCellData("physicianportal", 23, 28);
		String afterNoOfAdminstrationsNo = xlsReader.getCellData("physicianportal", 24, 28);		
		String endDate = xlsReader.getCellData("physicianportal", 25, 28);
		String afterNumberOfAdminstrations = xlsReader.getCellData("physicianportal", 26, 28);
		String requiredActions = xlsReader.getCellData("physicianportal", 27, 28);
		String othersRequiredActions = xlsReader.getCellData("physicianportal", 28, 28);
		String requiredActionsPostDropdown = xlsReader.getCellData("physicianportal", 29, 28);
		String othersRequiredActionsPostDropdown = xlsReader.getCellData("physicianportal", 30, 28);
		String administeredBy = xlsReader.getCellData("physicianportal", 31, 28);
		String maxDoesHours = xlsReader.getCellData("physicianportal", 32, 28);
		String followUpAfterMinutes = xlsReader.getCellData("physicianportal", 33, 28);
		String slidingScaleMin = xlsReader.getCellData("physicianportal", 34, 28);
		String slidingScaleMax = xlsReader.getCellData("physicianportal", 35, 28);
		String slidingScaleUnits = xlsReader.getCellData("physicianportal", 36, 28);
		/*String frequency = xlsReader.getCellData("physicianportal", 37, 12);
		String howOften = xlsReader.getCellData("physicianportal", 38, 12);
		String everyDay = xlsReader.getCellData("physicianportal", 39, 12);*/
		String physicianInstructions = xlsReader.getCellData("physicianportal", 40, 28);
		String additionalInstruction = physicianInstructions ;
		String endDateType = xlsReader.getCellData("physicianportal", 42, 28);
		String endDateType1 = xlsReader.getCellData("physicianportal", 43, 28);
		String endDateType2 = xlsReader.getCellData("physicianportal", 44, 28);
		/*String TypeOfMode = xlsReader.getCellData("physicianportal", 45, 12);
		String howOften1 = xlsReader.getCellData("physicianportal", 46, 12);
		String howOften2 = xlsReader.getCellData("physicianportal", 47, 12);
		String howOften3 = xlsReader.getCellData("physicianportal", 48, 12);
		String DropdownNumber = xlsReader.getCellData("physicianportal", 49, 12);
		String DropdownDay = xlsReader.getCellData("physicianportal", 50, 12);
		String TypeOfMode1 = xlsReader.getCellData("physicianportal", 51, 12);
		String scheduleOnMonth = xlsReader.getCellData("physicianportal", 52, 12);*/
		
		TestTemplate.testReport.logSuccess("Click On existing Resident");
		physicianPortal.ClickOnExistingResident(ResidentNo);
	
		TestTemplate.testReport.logSuccess("Create Order With Treatment Dropdown Option");
		
		physicianPortal.CreateAnOrderWithOrderDetails(type1,libraryText+type1,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType,ReceivedByType,ReceivedOrderType,routes,WrittenDate,NoOfRefillis,WhenToFill);
		physicianPortal.OrderFrequencyType(Integer.parseInt(num),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDate ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num),physicianInstructions,additionalInstruction,type1);
		physicianPortal.SaveOrderFrequency();
		physicianPortal.OrderDisplayPageColourVerification();
		physicianPortal.OrderDisplayPageColoumnsVerification();
		physicianPortal.BottomPaneOfContainer();
		
		physicianPortal.CreateAnOrderWithOrderDetails(type2,libraryText+type2,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType,ReceivedByType,ReceivedOrderType,routes,WrittenDate,NoOfRefillis,WhenToFill);
		physicianPortal.OrderFrequencyType(Integer.parseInt(num),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType1,endDateType1 ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num),physicianInstructions,additionalInstruction,type2);
		physicianPortal.SaveOrderFrequency();
		
		physicianPortal.CreateAnOrderWithOrderDetails(type3,libraryText+type3,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType,ReceivedByType,ReceivedOrderType,routes,WrittenDate,NoOfRefillis,WhenToFill);
		physicianPortal.OrderFrequencyType(Integer.parseInt(num),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType2,endDateType2 ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num),physicianInstructions,additionalInstruction,type3);
		physicianPortal.SaveOrderFrequency();
		
		physicianPortal.CreateAnOrderWithOrderDetails(type4,libraryText+type4,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType,ReceivedByType,ReceivedOrderType,routes,WrittenDate,NoOfRefillis,WhenToFill);
		physicianPortal.OrderFrequencyType(Integer.parseInt(num),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDateType ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
				
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num),physicianInstructions,additionalInstruction,type4);
		physicianPortal.SaveOrderFrequency();
		
		physicianPortal.CreateAnOrderWithOrderDetails(type5,libraryText+type5,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType,ReceivedByType,ReceivedOrderType,routes,WrittenDate,NoOfRefillis,WhenToFill);
		physicianPortal.OrderFrequencyType(Integer.parseInt(num),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDateType ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num),physicianInstructions,additionalInstruction,type5);
		physicianPortal.SaveOrderFrequency();
		
		physicianPortal.CreateAnOrderWithOrderDetails(type6,libraryText+type6,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType,ReceivedByType,ReceivedOrderType,routes,WrittenDate,NoOfRefillis,WhenToFill);
		physicianPortal.OrderFrequencyType(Integer.parseInt(num),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDateType ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num),physicianInstructions,additionalInstruction,type6);
		physicianPortal.SaveOrderFrequency();
		
		physicianPortal.CreateAnOrderWithOrderDetails(type7,libraryText+type7,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType,ReceivedByType,ReceivedOrderType,routes,WrittenDate,NoOfRefillis,WhenToFill);
		physicianPortal.OrderFrequencyType(Integer.parseInt(num),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDateType ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num),physicianInstructions,additionalInstruction,type7);
		physicianPortal.SaveOrderFrequency();
		login.Logout();
	}
	
	@Test(enabled = false)
	public void QA14_ResidentOrders_CreateAnOrder(ITestContext testContext)
	{
		
		
		PhysicianPortal physicianPortal=new PhysicianPortal(threadLocalWebDriver.get(), TestTemplate.testReport);
		HomePage homepage = new HomePage(threadLocalWebDriver.get(), TestTemplate.testReport);
		LoginPage login = new LoginPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		
				
		TestTemplate.testReport.logSuccess("Click to Physician Portal From Menu Bar");
		homepage.NavigateToPhysicianPortal();
		
		TestTemplate.testReport.logSuccess("Navigate to Residents Order From Physician Portal");
		physicianPortal.ClickOnPhysicianPortal();	
		
		String ResidentNo = xlsReader.getCellData("physicianportal", 28, 32);
		
		TestTemplate.testReport.logSuccess("Click On existing Resident");
		physicianPortal.ClickOnExistingResident(ResidentNo);
		
		
		String type1 = xlsReader.getCellData("physicianportal", 0, 32);
		String type2 = xlsReader.getCellData("physicianportal", 1, 32);
		String medicationType = xlsReader.getCellData("physicianportal", 2, 32);
		String medicationType1 = xlsReader.getCellData("physicianportal", 3, 32);
		String searchMedicationName = xlsReader.getCellData("physicianportal", 4, 32);
		String type6 = xlsReader.getCellData("physicianportal", 5, 32);
		String type7 = xlsReader.getCellData("physicianportal", 6, 32);
		String libraryText = xlsReader.getCellData("physicianportal", 7, 32);
		String createdType = xlsReader.getCellData("physicianportal", 8, 32);		
		String libraryText1 = xlsReader.getCellData("physicianportal", 9, 32);
		String createdType1 = xlsReader.getCellData("physicianportal", 10, 32);
		String nullDiagonisis = xlsReader.getCellData("physicianportal", 11, 32);
		String SearchDiogonosisTxt = xlsReader.getCellData("physicianportal", 12, 32);
		String medicarePriority = xlsReader.getCellData("physicianportal", 13, 32);
		String diogonosisName = xlsReader.getCellData("physicianportal", 14, 32);
		String physicianType = xlsReader.getCellData("physicianportal", 15, 32);
		String ReceivedByType = xlsReader.getCellData("physicianportal", 16, 32);
		String ReceivedOrderType1 = xlsReader.getCellData("physicianportal", 17, 32);
		String ReceivedOrderType2 = xlsReader.getCellData("physicianportal", 18, 32);
		String ReceivedOrderType3 = xlsReader.getCellData("physicianportal", 19, 32);
		String ReceivedOrderType4 = xlsReader.getCellData("physicianportal", 20, 32);
		String ReceivedOrderType5 = xlsReader.getCellData("physicianportal", 21, 32);
		String ReceivedOrderType6 = xlsReader.getCellData("physicianportal", 22, 32);
		String ReceivedOrderType7 = xlsReader.getCellData("physicianportal", 23, 32);
		String routes = xlsReader.getCellData("physicianportal", 24, 32);
		String WrittenDate = xlsReader.getCellData("physicianportal", 25, 32);
		String NoOfRefillis = xlsReader.getCellData("physicianportal", 26, 32);
		String WhenToFill = xlsReader.getCellData("physicianportal", 27, 32);
		
		
		String[] frequencyTpyes = {type1,type2};
		for(int n=0;n<=1;n++)
		{
		String frequency = frequencyTpyes[n];
		
		String[] receivedOrders = {ReceivedOrderType1,ReceivedOrderType2,ReceivedOrderType3,ReceivedOrderType4,ReceivedOrderType5,ReceivedOrderType6,ReceivedOrderType7};
		String[] medicationtypes = {medicationType,medicationType1,medicationType,medicationType1,medicationType,medicationType1,medicationType};
		for(int i=0;i<=6;i++)
		{
		String RecivedOrderType = receivedOrders[i];
		String medicationtype = medicationtypes[i];
		
		physicianPortal.ResidentFullOrderDetailsWithMedication(frequency,medicationtype,searchMedicationName,libraryText1);
		physicianPortal.ResidentFullOrderDetails(frequency ,nullDiagonisis ,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType, ReceivedByType,RecivedOrderType,routes,WrittenDate,NoOfRefillis,WhenToFill);
		
		physicianPortal.CancelOrder();	
		
		
		}
		}
		
		
				
		login.Logout();
		
		
	}
	
	
	@Test(enabled = false)
	public void QA15_ResidentOrders_CreateAnOrderWithFrequencyRoutine(ITestContext testContext)
	{
		PhysicianPortal physicianPortal=new PhysicianPortal(threadLocalWebDriver.get(), TestTemplate.testReport);
		HomePage homepage = new HomePage(threadLocalWebDriver.get(), TestTemplate.testReport);
		LoginPage login = new LoginPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		
		
		TestTemplate.testReport.logSuccess("Click to Physician Portal From Menu Bar");
		homepage.NavigateToPhysicianPortal();
		
		TestTemplate.testReport.logSuccess("Navigate to Residents Order From Physician Portal");
		physicianPortal.ClickOnPhysicianPortal();	
		
		
		String ResidentNo = xlsReader.getCellData("physicianportal", 0, 36);
		String type1 = xlsReader.getCellData("physicianportal", 1, 36);
		String type2 = xlsReader.getCellData("physicianportal", 2, 36);
		String medicationType = xlsReader.getCellData("physicianportal", 3, 36);
		String medicationType1 = xlsReader.getCellData("physicianportal", 4, 36);
		String searchMedicationName = xlsReader.getCellData("physicianportal", 5, 36);
		String type6 = xlsReader.getCellData("physicianportal", 6, 36);
		String type7 = xlsReader.getCellData("physicianportal", 7, 36);
		String libraryText = xlsReader.getCellData("physicianportal", 8, 36);			
		String SearchDiogonosisTxt = xlsReader.getCellData("physicianportal", 9, 36);
		String medicarePriority = xlsReader.getCellData("physicianportal", 10, 36);
		String diogonosisName = xlsReader.getCellData("physicianportal", 11, 36);
		String physicianType = xlsReader.getCellData("physicianportal", 12, 36);
		String ReceivedByType = xlsReader.getCellData("physicianportal", 13, 36);
		String ReceivedOrderType = xlsReader.getCellData("physicianportal", 14, 36);		
		String routes = xlsReader.getCellData("physicianportal", 15, 36);
		String WrittenDate = xlsReader.getCellData("physicianportal", 16, 36);
		String NoOfRefillis = xlsReader.getCellData("physicianportal", 17, 36);
		String WhenToFill = xlsReader.getCellData("physicianportal", 18, 36);
		String num = xlsReader.getCellData("physicianportal", 19, 36);
		String frequencyType = xlsReader.getCellData("physicianportal", 20, 36);
		String startDate = xlsReader.getCellData("physicianportal", 21, 36);  
		String ByDate =startDate;
		String startDateTime = xlsReader.getCellData("physicianportal", 22, 36);
		String byDateTime =startDateTime ;
		String byDateno = xlsReader.getCellData("physicianportal", 23, 36);
		String afterNoOfAdminstrationsNo = xlsReader.getCellData("physicianportal", 24, 36);		
		String endDate = xlsReader.getCellData("physicianportal", 25, 36);
		String afterNumberOfAdminstrations = xlsReader.getCellData("physicianportal", 26, 36);
		String requiredActions = xlsReader.getCellData("physicianportal", 27, 36);
		String othersRequiredActions = xlsReader.getCellData("physicianportal", 28, 36);
		String requiredActionsPostDropdown = xlsReader.getCellData("physicianportal", 29, 36);
		String othersRequiredActionsPostDropdown = xlsReader.getCellData("physicianportal", 30, 36);
		String administeredBy = xlsReader.getCellData("physicianportal", 31, 36);
		String maxDoesHours = xlsReader.getCellData("physicianportal", 32, 36);
		String followUpAfterMinutes = xlsReader.getCellData("physicianportal", 33, 36);
		String slidingScaleMin = xlsReader.getCellData("physicianportal", 34, 36);
		String slidingScaleMax = xlsReader.getCellData("physicianportal", 35, 36);
		String slidingScaleUnits = xlsReader.getCellData("physicianportal", 36, 36);
		String frequency = xlsReader.getCellData("physicianportal", 37, 36);
		String howOften = xlsReader.getCellData("physicianportal", 38, 36);
		String everyDay = xlsReader.getCellData("physicianportal", 39, 36);
		String physicianInstructions = xlsReader.getCellData("physicianportal", 40, 36);
		String additionalInstruction = physicianInstructions ;
		String endDateType = xlsReader.getCellData("physicianportal", 42, 36);
		String endDateType1 = xlsReader.getCellData("physicianportal", 43, 36);
		String endDateType2 = xlsReader.getCellData("physicianportal", 44, 36);
		String TypeOfMode = xlsReader.getCellData("physicianportal", 45, 36);
		String howOften1 = xlsReader.getCellData("physicianportal", 46, 36);
		String howOften2 = xlsReader.getCellData("physicianportal", 47, 36);
		String howOften3 = xlsReader.getCellData("physicianportal", 48, 36);
		String DropdownNumber = xlsReader.getCellData("physicianportal", 49, 36);
		String DropdownDay = xlsReader.getCellData("physicianportal", 50, 36);
		String TypeOfMode1 = xlsReader.getCellData("physicianportal", 51, 36);
		String scheduleOnMonth = xlsReader.getCellData("physicianportal", 52, 36);
		
		TestTemplate.testReport.logSuccess("Click On existing Resident");
		physicianPortal.ClickOnExistingResident(ResidentNo);
	
		TestTemplate.testReport.logSuccess("Create Order With Treatment Dropdown Option");
		int newnum;
		String[] frequencyTpyes = {type1,type2};
		for(int n=0;n<=1;n++)
		{
			String Frequency = frequencyTpyes[n];	
		
		physicianPortal.CreateAnOrderWithOrderDetails(Frequency,libraryText,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType,ReceivedByType,ReceivedOrderType,routes,WrittenDate,NoOfRefillis,WhenToFill);
		
		for( newnum=1;newnum<=5;newnum++)
		{
		physicianPortal.OrderFrequencyType(newnum,frequencyType);
		physicianPortal.StartDate(newnum,startDate,startDateTime);
		String[] OrderEndType = {endDateType,endDateType1,endDateType2,endDateType,endDateType1};
		
		String OrderEnd = OrderEndType[newnum-1];
		physicianPortal.OrderEndType(newnum,Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,OrderEnd,endDate ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.DoseUnitWithMedication(newnum,Frequency);
		physicianPortal.RequireActionRelatedLabel(newnum,frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		physicianPortal.OnceAShiftFrequency(newnum,frequency);
		switch(newnum)
		{
		case 1 :physicianPortal.HowOftenDailyType(newnum,howOften,everyDay);
				break;
		case 2 :physicianPortal.HowOftenWeeklytype(newnum,Integer.parseInt(num),howOften1,everyDay);
				break;		
		case 3 :physicianPortal.HowOftenMonthlytype(TypeOfMode,newnum,Integer.parseInt(num),Integer.parseInt(num),howOften2,everyDay,DropdownNumber,DropdownDay);
				break;	
		case 4 :physicianPortal.HowOftenMonthlytype(TypeOfMode1,newnum,(Integer.parseInt(num)+1),Integer.parseInt(num),howOften2,everyDay,DropdownNumber,DropdownDay);
				break;
		case 5 :physicianPortal.HowOftenYearlyType(newnum,Integer.parseInt(num),howOften3,scheduleOnMonth,everyDay,everyDay);
				break;
		
		}
		physicianPortal.CreateOrderFrequencyForRoutine(newnum,physicianInstructions,additionalInstruction,Frequency);
		physicianPortal.AddOrderFrequency();
		}
		physicianPortal.RemoveFrequency(newnum);		
		physicianPortal.SaveOrderFrequency();
		physicianPortal.WhereToTabValidation();
		physicianPortal.OrderDisplayPageColourVerification();
		physicianPortal.OrderDisplayPageColoumnsVerification();
		physicianPortal.BottomPaneOfContainer();
		
		}
		
		login.Logout();
		
	}
	
	@Test(enabled = false)
	public void QA16_ResidentOrders_CreateAnOrderWithFrequencyPRNEveryHour(ITestContext testContext)
	{
		PhysicianPortal physicianPortal=new PhysicianPortal(threadLocalWebDriver.get(), TestTemplate.testReport);
		HomePage homepage = new HomePage(threadLocalWebDriver.get(), TestTemplate.testReport);
		LoginPage login = new LoginPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		
		
		TestTemplate.testReport.logSuccess("Click to Physician Portal From Menu Bar");
		homepage.NavigateToPhysicianPortal();
		
		TestTemplate.testReport.logSuccess("Navigate to Residents Order From Physician Portal");
		physicianPortal.ClickOnPhysicianPortal();	
		
		
		String ResidentNo = xlsReader.getCellData("physicianportal", 0, 40);
		String type1 = xlsReader.getCellData("physicianportal", 1, 40);
		String type2 = xlsReader.getCellData("physicianportal", 2, 40);
		/*String medicationType = xlsReader.getCellData("physicianportal", 3, 40);
		String medicationType1 = xlsReader.getCellData("physicianportal", 4, 40);
		String searchMedicationName = xlsReader.getCellData("physicianportal", 5, 40);
		String type6 = xlsReader.getCellData("physicianportal", 6, 40);
		String type7 = xlsReader.getCellData("physicianportal", 7, 40);*/
		String libraryText = xlsReader.getCellData("physicianportal", 8, 40);			
		String SearchDiogonosisTxt = xlsReader.getCellData("physicianportal", 9, 40);
		String medicarePriority = xlsReader.getCellData("physicianportal", 10, 40);
		String diogonosisName = xlsReader.getCellData("physicianportal", 11, 40);
		String physicianType = xlsReader.getCellData("physicianportal", 12, 40);
		String ReceivedByType = xlsReader.getCellData("physicianportal", 13, 40);
		String ReceivedOrderType = xlsReader.getCellData("physicianportal", 14, 40);		
		String routes = xlsReader.getCellData("physicianportal", 15, 40);
		String WrittenDate = xlsReader.getCellData("physicianportal", 16, 40);
		String NoOfRefillis = xlsReader.getCellData("physicianportal", 17, 40);
		String WhenToFill = xlsReader.getCellData("physicianportal", 18, 40);
		//String num = xlsReader.getCellData("physicianportal", 19, 40);
		String frequencyType = xlsReader.getCellData("physicianportal", 20, 40);
		String startDate = xlsReader.getCellData("physicianportal", 21, 40);  
		String ByDate =startDate;
		String startDateTime = xlsReader.getCellData("physicianportal", 22, 40);
		String byDateTime =startDateTime ;
		String byDateno = xlsReader.getCellData("physicianportal", 23, 40);
		String afterNoOfAdminstrationsNo = xlsReader.getCellData("physicianportal", 24, 40);		
		String endDate = xlsReader.getCellData("physicianportal", 25, 40);
		String afterNumberOfAdminstrations = xlsReader.getCellData("physicianportal", 26, 40);
		String requiredActions = xlsReader.getCellData("physicianportal", 27, 40);
		String othersRequiredActions = xlsReader.getCellData("physicianportal", 28, 40);
		String requiredActionsPostDropdown = xlsReader.getCellData("physicianportal", 29, 40);
		String othersRequiredActionsPostDropdown = xlsReader.getCellData("physicianportal", 30, 40);
		String administeredBy = xlsReader.getCellData("physicianportal", 31, 40);
		String maxDoesHours = xlsReader.getCellData("physicianportal", 32, 40);
		String followUpAfterMinutes = xlsReader.getCellData("physicianportal", 33, 40);
		String slidingScaleMin = xlsReader.getCellData("physicianportal", 34, 40);
		String slidingScaleMax = xlsReader.getCellData("physicianportal", 35, 40);
		String slidingScaleUnits = xlsReader.getCellData("physicianportal", 36, 40);
		/*String frequency = xlsReader.getCellData("physicianportal", 37, 40);
		String howOften = xlsReader.getCellData("physicianportal", 38, 40);
		String everyDay = xlsReader.getCellData("physicianportal", 39, 40);*/
		String physicianInstructions = xlsReader.getCellData("physicianportal", 40, 40);
		String additionalInstruction = physicianInstructions ;
		String endDateType = xlsReader.getCellData("physicianportal", 42, 40);
		String endDateType1 = xlsReader.getCellData("physicianportal", 43, 40);
		String endDateType2 = xlsReader.getCellData("physicianportal", 44, 40);
		/*String TypeOfMode = xlsReader.getCellData("physicianportal", 45, 40);
		String howOften1 = xlsReader.getCellData("physicianportal", 46, 40);
		String howOften2 = xlsReader.getCellData("physicianportal", 47, 40);
		String howOften3 = xlsReader.getCellData("physicianportal", 48, 40);
		String DropdownNumber = xlsReader.getCellData("physicianportal", 49, 40);
		String DropdownDay = xlsReader.getCellData("physicianportal", 50, 40);
		String TypeOfMode1 = xlsReader.getCellData("physicianportal", 51, 40);
		String scheduleOnMonth = xlsReader.getCellData("physicianportal", 52, 40);*/
		
		TestTemplate.testReport.logSuccess("Click On existing Resident");
		physicianPortal.ClickOnExistingResident(ResidentNo);
	
		TestTemplate.testReport.logSuccess("Create Order With Treatment Dropdown Option");
		int newnum;
		String[] frequencyTpyes = {type1,type2};
		for(int n=0;n<=1;n++)
		{
			String Frequency = frequencyTpyes[n];	
		
		physicianPortal.CreateAnOrderWithOrderDetails(Frequency,libraryText,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType,ReceivedByType,ReceivedOrderType,routes,WrittenDate,NoOfRefillis,WhenToFill);
		
		for( newnum=1;newnum<=3;newnum++)
		{
		physicianPortal.OrderFrequencyType(newnum,frequencyType);
		physicianPortal.StartDate(newnum,startDate,startDateTime);
		String[] OrderEndType = {endDateType,endDateType1,endDateType2};
		
		String OrderEnd = OrderEndType[newnum-1];
		physicianPortal.OrderEndType(newnum,Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,OrderEnd,endDate ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.DoseUnitWithMedication(newnum,Frequency);
		physicianPortal.RequireActionRelatedLabel(newnum,frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		
		physicianPortal.CreateOrderFrequencyForRoutine(newnum,physicianInstructions,additionalInstruction,Frequency);
		physicianPortal.AddOrderFrequency();
		}
		physicianPortal.RemoveFrequency(newnum);		
		physicianPortal.SaveOrderFrequency();
		physicianPortal.WhereToTabValidation();
		physicianPortal.OrderDisplayPageColourVerification();
		physicianPortal.OrderDisplayPageColoumnsVerification();
		physicianPortal.BottomPaneOfContainer();
		
		}
		
		login.Logout();
		
	}
	
	@Test(enabled = false)
	public void QA17_ResidentOrders_CreateAnOrderWithFrequencyPRN(ITestContext testContext)
	{
		PhysicianPortal physicianPortal=new PhysicianPortal(threadLocalWebDriver.get(), TestTemplate.testReport);
		HomePage homepage = new HomePage(threadLocalWebDriver.get(), TestTemplate.testReport);
		LoginPage login = new LoginPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		
		
		TestTemplate.testReport.logSuccess("Click to Physician Portal From Menu Bar");
		homepage.NavigateToPhysicianPortal();
		
		TestTemplate.testReport.logSuccess("Navigate to Residents Order From Physician Portal");
		physicianPortal.ClickOnPhysicianPortal();	
		
		
		String ResidentNo = xlsReader.getCellData("physicianportal", 0, 44);
		String type1 = xlsReader.getCellData("physicianportal", 1, 44);
		String type2 = xlsReader.getCellData("physicianportal", 2, 44);
		/*String medicationType = xlsReader.getCellData("physicianportal", 3, 44);
		String medicationType1 = xlsReader.getCellData("physicianportal", 4, 44);
		String searchMedicationName = xlsReader.getCellData("physicianportal", 5, 44);
		String type6 = xlsReader.getCellData("physicianportal", 6, 44);
		String type7 = xlsReader.getCellData("physicianportal", 7, 44);*/
		String libraryText = xlsReader.getCellData("physicianportal", 8, 44);			
		String SearchDiogonosisTxt = xlsReader.getCellData("physicianportal", 9, 44);
		String medicarePriority = xlsReader.getCellData("physicianportal", 10, 44);
		String diogonosisName = xlsReader.getCellData("physicianportal", 11, 44);
		String physicianType = xlsReader.getCellData("physicianportal", 12, 44);
		String ReceivedByType = xlsReader.getCellData("physicianportal", 13, 44);
		String ReceivedOrderType = xlsReader.getCellData("physicianportal", 14, 44);		
		String routes = xlsReader.getCellData("physicianportal", 15, 44);
		String WrittenDate = xlsReader.getCellData("physicianportal", 16, 44);
		String NoOfRefillis = xlsReader.getCellData("physicianportal", 17, 44);
		String WhenToFill = xlsReader.getCellData("physicianportal", 18, 44);
		/*String num = xlsReader.getCellData("physicianportal", 19, 44);*/
		String frequencyType = xlsReader.getCellData("physicianportal", 20, 44);
		String startDate = xlsReader.getCellData("physicianportal", 21, 44);  
		String ByDate =startDate;
		String startDateTime = xlsReader.getCellData("physicianportal", 22, 44);
		String byDateTime =startDateTime ;
		String byDateno = xlsReader.getCellData("physicianportal", 23, 44);
		String afterNoOfAdminstrationsNo = xlsReader.getCellData("physicianportal", 24, 44);		
		String endDate = xlsReader.getCellData("physicianportal", 25, 44);
		String afterNumberOfAdminstrations = xlsReader.getCellData("physicianportal", 26, 44);
		String requiredActions = xlsReader.getCellData("physicianportal", 27, 44);
		String othersRequiredActions = xlsReader.getCellData("physicianportal", 28, 44);
		String requiredActionsPostDropdown = xlsReader.getCellData("physicianportal", 29, 44);
		String othersRequiredActionsPostDropdown = xlsReader.getCellData("physicianportal", 30, 44);
		String administeredBy = xlsReader.getCellData("physicianportal", 31, 44);
		String maxDoesHours = xlsReader.getCellData("physicianportal", 32, 44);
		String followUpAfterMinutes = xlsReader.getCellData("physicianportal", 33, 44);
		String slidingScaleMin = xlsReader.getCellData("physicianportal", 34, 44);
		String slidingScaleMax = xlsReader.getCellData("physicianportal", 35, 44);
		String slidingScaleUnits = xlsReader.getCellData("physicianportal", 36, 44);
		/*String frequency = xlsReader.getCellData("physicianportal", 37, 44);
		String howOften = xlsReader.getCellData("physicianportal", 38, 44);
		String everyDay = xlsReader.getCellData("physicianportal", 39, 44);*/
		String physicianInstructions = xlsReader.getCellData("physicianportal", 40, 44);
		String additionalInstruction = physicianInstructions ;
		String endDateType = xlsReader.getCellData("physicianportal", 42, 44);
		String endDateType1 = xlsReader.getCellData("physicianportal", 43, 44);
		String endDateType2 = xlsReader.getCellData("physicianportal", 44, 44);
		/*String TypeOfMode = xlsReader.getCellData("physicianportal", 45, 44);
		String howOften1 = xlsReader.getCellData("physicianportal", 46, 44);
		String howOften2 = xlsReader.getCellData("physicianportal", 47, 44);
		String howOften3 = xlsReader.getCellData("physicianportal", 48, 44);
		String DropdownNumber = xlsReader.getCellData("physicianportal", 49, 44);
		String DropdownDay = xlsReader.getCellData("physicianportal", 50, 44);
		String TypeOfMode1 = xlsReader.getCellData("physicianportal", 51, 44);
		String scheduleOnMonth = xlsReader.getCellData("physicianportal", 52, 44);*/
		
		TestTemplate.testReport.logSuccess("Click On existing Resident");
		physicianPortal.ClickOnExistingResident(ResidentNo);
	
		TestTemplate.testReport.logSuccess("Create Order With Treatment Dropdown Option");
		int newnum;
		String[] frequencyTpyes = {type1,type2};
		for(int n=0;n<=1;n++)
		{
			String Frequency = frequencyTpyes[n];	
		
		physicianPortal.CreateAnOrderWithOrderDetails(Frequency,libraryText,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType,ReceivedByType,ReceivedOrderType,routes,WrittenDate,NoOfRefillis,WhenToFill);
		
		for( newnum=1;newnum<=3;newnum++)
		{
		physicianPortal.OrderFrequencyType(newnum,frequencyType);
		physicianPortal.StartDate(newnum,startDate,startDateTime);
		String[] OrderEndType = {endDateType,endDateType1,endDateType2};
		
		String OrderEnd = OrderEndType[newnum-1];
		physicianPortal.OrderEndType(newnum,Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,OrderEnd,endDate ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.DoseUnitWithMedication(newnum,Frequency);
		physicianPortal.RequireActionRelatedLabel(newnum,frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		
		physicianPortal.CreateOrderFrequencyForRoutine(newnum,physicianInstructions,additionalInstruction,Frequency);
		physicianPortal.AddOrderFrequency();
		}
		physicianPortal.RemoveFrequency(newnum);		
		physicianPortal.SaveOrderFrequency();
		physicianPortal.WhereToTabValidation();
		physicianPortal.OrderDisplayPageColourVerification();
		physicianPortal.OrderDisplayPageColoumnsVerification();
		physicianPortal.BottomPaneOfContainer();
		
		}
		
		login.Logout();
		
	}
	
}
