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
	
	Xls_Reader xlsReader = new Xls_Reader("C:\\Bluestrata\\Abhishek-Project-s\\src\\test\\resources\\testdata\\BluestrataTestData.xlsx");
	
	@Test(enabled = false)
	public void QA07_ResidentOrders() throws URISyntaxException
	{
		PhysicianPortal physicianPortal=new PhysicianPortal(threadLocalWebDriver.get(), TestTemplate.testReport);
		HomePage homepage = new HomePage(threadLocalWebDriver.get(), TestTemplate.testReport);
		LoginPage login = new LoginPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		
		String ResidentNo = xlsReader.getCellData("physicianportal", 0, 3);
		
		
		homepage.NavigateToPhysicianPortal();
		
		physicianPortal.PhysicianPortalHeaderVerfication();
		physicianPortal.VerifyPhysicianPortalDrropdown();
		physicianPortal.VerifyResidentPageHeaderHeading();
		physicianPortal.VerifytheFieldsDisplayDownToMessage();
		physicianPortal.CounttheNoOfResidentInAPage();
		physicianPortal.AssendingOrderUsingFirstName();
		physicianPortal.AssendingOrderUsingLastName();
		physicianPortal.AssendingOrderUsingMr();		
		physicianPortal.ClickOnExistingResident(ResidentNo)	;
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
	
	
	@Test(priority =1)
	public void QA10_ResidentOrders_CreateAnOrderWithFrequencyRoutine(ITestContext testContext)
	{
		PhysicianPortal physicianPortal=new PhysicianPortal(threadLocalWebDriver.get(), TestTemplate.testReport);
		HomePage homepage = new HomePage(threadLocalWebDriver.get(), TestTemplate.testReport);
		LoginPage login = new LoginPage(threadLocalWebDriver.get(), TestTemplate.testReport);
		
		
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
		
		
		TestTemplate.testReport.logSuccess("Click On existing Resident");
		physicianPortal.ClickOnExistingResident(ResidentNo);
		
		physicianPortal.CreateAnOrderWithOrderDetails(type1,libraryText+type1,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType,ReceivedByType,ReceivedOrderType,routes,WrittenDate,NoOfRefillis,WhenToFill);
		physicianPortal.OrderFrequencyType(Integer.parseInt(num),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDate ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(num),frequency);
		physicianPortal.HowOftenDailyType(Integer.parseInt(num),howOften,everyDay);
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num),physicianInstructions,additionalInstruction,type1);
		
		physicianPortal.AddOrderFrequency();
		
		for(int newnum=2;newnum<=7;newnum ++)
		{
		
		
		physicianPortal.OrderFrequencyType(newnum,frequencyType);
		physicianPortal.StartDate(newnum,startDate,startDateTime);
		physicianPortal.OrderEndType(newnum,Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDate ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(newnum,frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		physicianPortal.TextTypeNoOfTimesAdayFrequency("text Box" ,newnum ,frequency , (newnum-1) , "08:00 am");
		physicianPortal.HowOftenDailyType(Integer.parseInt(num),howOften,everyDay);
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num),physicianInstructions,additionalInstruction,type1);
		
		physicianPortal.AddOrderFrequency();
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
	
	
}
