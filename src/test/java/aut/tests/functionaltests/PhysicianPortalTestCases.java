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
	
	@Test( enabled = false) 
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
	
	@Test(enabled = false )
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
	
	@Test(priority =1 )
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
		
		/*physicianPortal.CreateAnOrderWithOrderDetails(type1,libraryText,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType,ReceivedByType,ReceivedOrderType,routes,WrittenDate,NoOfRefillis,WhenToFill);
		physicianPortal.OrderFrequencyType(Integer.parseInt(num),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDate ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(num),frequency);
		physicianPortal.HowOftenDailyType(Integer.parseInt(num),howOften,everyDay);
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num),physicianInstructions,additionalInstruction,frequencyType);
		physicianPortal.SaveOrderFrequency();
		physicianPortal.OrderDisplayPageColourVerification();
		physicianPortal.OrderDisplayPageColoumnsVerification();
		physicianPortal.BottomPaneOfContainer();
		
		physicianPortal.CreateAnOrderWithOrderDetails(type2,libraryText,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType,ReceivedByType,ReceivedOrderType,routes,WrittenDate,NoOfRefillis,WhenToFill);
		physicianPortal.OrderFrequencyType(Integer.parseInt(num),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType1,endDateType1 ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(num),frequency);
		physicianPortal.HowOftenDailyType(Integer.parseInt(num),howOften,everyDay);
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num),physicianInstructions,additionalInstruction,frequencyType);
		physicianPortal.SaveOrderFrequency();
		
		physicianPortal.CreateAnOrderWithOrderDetails(type3,libraryText,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType,ReceivedByType,ReceivedOrderType,routes,WrittenDate,NoOfRefillis,WhenToFill);
		physicianPortal.OrderFrequencyType(Integer.parseInt(num),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType2,endDateType2 ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(num),frequency);
		physicianPortal.HowOftenWeeklytype(Integer.parseInt(num),Integer.parseInt(num),howOften1,everyDay);
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num),physicianInstructions,additionalInstruction,frequencyType);
		physicianPortal.SaveOrderFrequency();
		
		physicianPortal.CreateAnOrderWithOrderDetails(type4,libraryText,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType,ReceivedByType,ReceivedOrderType,routes,WrittenDate,NoOfRefillis,WhenToFill);
		physicianPortal.OrderFrequencyType(Integer.parseInt(num),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDateType ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(num),frequency);
		physicianPortal.HowOftenMonthlytype(TypeOfMode,Integer.parseInt(num),Integer.parseInt(num),Integer.parseInt(num),howOften2,everyDay,DropdownNumber,DropdownDay);		
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num),physicianInstructions,additionalInstruction,frequencyType);
		physicianPortal.SaveOrderFrequency();*/
		
		physicianPortal.CreateAnOrderWithOrderDetails(type5,libraryText,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType,ReceivedByType,ReceivedOrderType,routes,WrittenDate,NoOfRefillis,WhenToFill);
		physicianPortal.OrderFrequencyType(Integer.parseInt(num),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDateType ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(num),frequency);
		physicianPortal.HowOftenMonthlytype(TypeOfMode1,Integer.parseInt(num),Integer.parseInt(num),Integer.parseInt(num),howOften2,everyDay,DropdownNumber,DropdownDay);
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num),physicianInstructions,additionalInstruction,frequencyType);
		physicianPortal.SaveOrderFrequency();
		
		physicianPortal.CreateAnOrderWithOrderDetails(type6,libraryText,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType,ReceivedByType,ReceivedOrderType,routes,WrittenDate,NoOfRefillis,WhenToFill);
		physicianPortal.OrderFrequencyType(Integer.parseInt(num),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDateType ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(num),frequency);
		physicianPortal.HowOftenYearlyType(Integer.parseInt(num),Integer.parseInt(num),howOften3,scheduleOnMonth,everyDay,everyDay);
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num),physicianInstructions,additionalInstruction,frequencyType);
		physicianPortal.SaveOrderFrequency();
		
		physicianPortal.CreateAnOrderWithOrderDetails(type7,libraryText,SearchDiogonosisTxt,medicarePriority,diogonosisName,physicianType,ReceivedByType,ReceivedOrderType,routes,WrittenDate,NoOfRefillis,WhenToFill);
		physicianPortal.OrderFrequencyType(Integer.parseInt(num),frequencyType);
		physicianPortal.StartDate(Integer.parseInt(num),startDate,startDateTime);
		physicianPortal.OrderEndType(Integer.parseInt(num),Integer.parseInt(byDateno),Integer.parseInt(afterNoOfAdminstrationsNo) ,endDateType,endDateType ,ByDate ,byDateTime, afterNumberOfAdminstrations);
		physicianPortal.RequireActionRelatedLabel(Integer.parseInt(num),frequencyType ,requiredActions,othersRequiredActions ,requiredActionsPostDropdown,othersRequiredActionsPostDropdown, administeredBy,maxDoesHours,followUpAfterMinutes, slidingScaleMin, slidingScaleMax, slidingScaleUnits);
		physicianPortal.OnceAShiftFrequency(Integer.parseInt(num),frequency);
		physicianPortal.HowOftenYearlyType(Integer.parseInt(num),Integer.parseInt(num),howOften3,scheduleOnMonth,everyDay,everyDay);
		physicianPortal.CreateOrderFrequencyForRoutine(Integer.parseInt(num),physicianInstructions,additionalInstruction,frequencyType);
		physicianPortal.SaveOrderFrequency();
		login.Logout();
	}
	
	
	
	
	
}
