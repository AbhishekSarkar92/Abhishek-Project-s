package aut.tests.functionaltests;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.excel.Xls_Reader;

import aut.bluestrata.pages.HomePage;
import aut.bluestrata.pages.PhysicianPortal;

import dweb.test.templates.TestTemplate;
import dweb.test.templates.TestTemplateMethodLevelInit;

public class CreateOrderDetails extends TestTemplateMethodLevelInit {
	Xls_Reader xls = new Xls_Reader("C:\\Users\\E002489\\git\\JTAFi18n\\src\\test\\resources\\testdata\\WebAutomationTestData.xlsx");


	
	
	@Test(priority=1)
	public void CreateOrderDetailsForResidentWithoutMedication(ITestContext testContext)
	{
		PhysicianPortal physicianPortal=new PhysicianPortal(threadLocalWebDriver.get(), TestTemplate.testReport);
		HomePage homepage = new HomePage(threadLocalWebDriver.get(), TestTemplate.testReport);
		
		TestTemplate.testReport.logInfo("Click to Physician Portal From Menu Bar");
		homepage.NavigateToPhysicianPortal();
		
		TestTemplate.testReport.logInfo("Navigate to Residents Order From Physician Portal");
		physicianPortal.ClickOnPhysicianPortal();	
		
		TestTemplate.testReport.logInfo("Click On existing Resident");
		physicianPortal.ClickOnExistingResident("201332171");
	
		TestTemplate.testReport.logInfo("Create Order With Treatment Dropdown Option");
		physicianPortal.CreateAnOrderWithOrderDetails("Treatment","New Text 5thApril","10","5","R29.71 - NIHSS score 10-19","TestDR, Test","Singh, Vishal","Telephone","Both Ears","04/04/2019","5","Don't fill");
		
		
		TestTemplate.testReport.logInfo("Create Frequency With Once A Shift Frequency & Daily HowOften Dropdown Option");
		physicianPortal.CreateOrderFrequencyForRoutine(1,"Routine","No End","Other","OtherNew","Other","OtherNew","LPN","","10","1","10","5");
		physicianPortal.OnceAShiftFrequency(1,"Once a Shift");
		physicianPortal.HowOftenDailyType(1,"Daily","5");
		physicianPortal.CreateOrderFrequencyForRoutine(1,"Comments","Comments","Routine");
		
		
		TestTemplate.testReport.logInfo("Create Frequency With Once a Day Frequency & Weekly HowOften Dropdown Option");
		physicianPortal.AddOrderFrequency();
		
		physicianPortal.CreateOrderFrequencyForRoutine(2,"Routine","No End","Other","OtherNew1","Other","OtherNew1","LPN","","10","1","10","5");
		physicianPortal.TextTypeNoOfTimesAdayFrequency("text Box",2,"Once a Day",1,1,"08:00 am",0);
		physicianPortal.HowOftenWeeklytype(2,1,"Weekly","5");
		physicianPortal.CreateOrderFrequencyForRoutine(2,"Comments","Comments","Routine");
		
		
		TestTemplate.testReport.logInfo("Create Frequency With Once a Day Frequency & Monthly HowOften Dropdown Option");
		physicianPortal.AddOrderFrequency();		
		
		physicianPortal.CreateOrderFrequencyForRoutine(3,"Routine","No End","Other","OtherNew1","Other","OtherNew1","LPN","","10","1","10","5");
		physicianPortal.TextTypeNoOfTimesAdayFrequency(" ",3,"Once a Day",2,1,"Morning",2);
		physicianPortal.HowOftenMonthlytype("Use Specific Days",3,1,5,"Monthly","4","First","Sunday");
		physicianPortal.CreateOrderFrequencyForRoutine(3,"Comments","Comments","Routine");
		
		
		TestTemplate.testReport.logInfo("Create Frequency With Twice a Day Frequency & Monthly HowOften Dropdown Option");
		physicianPortal.AddOrderFrequency();
		
		physicianPortal.CreateOrderFrequencyForRoutine(4,"Routine","No End","Other","OtherNew2","Other","OtherNew2","LPN","","10","1","10","5");
		physicianPortal.TextTypeNoOfTimesAdayFrequency("text Box",4,"Twice a Day",3,2,"08:00 am",0);
		physicianPortal.HowOftenMonthlytype("",4,1,5,"Monthly","4","First","Sunday");
		physicianPortal.CreateOrderFrequencyForRoutine(4,"Comments","Comments","Routine");
		
		
		TestTemplate.testReport.logInfo("Create Frequency With Twice a Day Frequency & Yearly HowOften Dropdown Option");
		physicianPortal.AddOrderFrequency();
		
		physicianPortal.CreateOrderFrequencyForRoutine(5,"Routine","No End","Other","OtherNew3","Other","OtherNew3","LPN","","10","1","10","5");
		physicianPortal.TextTypeNoOfTimesAdayFrequency(" ",5,"Twice a Day",4,2,"Morning",3);
		physicianPortal.HowOftenYearlyType(5,1,"Yearly","June","5","1");
		physicianPortal.CreateOrderFrequencyForRoutine(5,"Comments","Comments","Routine");
		
		
		TestTemplate.testReport.logInfo("Create Frequency With Three Time a Day Frequency & Yearly HowOften Dropdown Option");
		physicianPortal.AddOrderFrequency();
		
		physicianPortal.CreateOrderFrequencyForRoutine(6,"Routine","No End","Other","OtherNew2","Other","OtherNew2","LPN","","10","1","10","5");
		physicianPortal.TextTypeNoOfTimesAdayFrequency("text Box",6,"Three Times a Day",5,3,"08:00 am",0);
		physicianPortal.HowOftenYearlyType(6,2,"Yearly","June","5","1");
		physicianPortal.CreateOrderFrequencyForRoutine(6,"Comments","Comments","Routine");
		
		
		TestTemplate.testReport.logInfo("Create Frequency With Three Time a Day Frequency & Yearly HowOften Dropdown Option");
		physicianPortal.AddOrderFrequency();		
				
		physicianPortal.CreateOrderFrequencyForRoutine(7,"Routine","No End","Other","OtherNew3","Other","OtherNew3","LPN","","10","1","10","5");
		physicianPortal.TextTypeNoOfTimesAdayFrequency(" ",7,"Three Times a Day",6,3,"Morning",4);
		physicianPortal.HowOftenYearlyType(7,3,"Yearly","June","5","1");
		physicianPortal.CreateOrderFrequencyForRoutine(7,"Comments","Comments","Routine");
		
		
		TestTemplate.testReport.logInfo("Create Frequency With Four Time a Day Frequency & Yearly HowOften Dropdown Option");
        physicianPortal.AddOrderFrequency();
		
		physicianPortal.CreateOrderFrequencyForRoutine(8,"Routine","No End","Other","OtherNew2","Other","OtherNew2","LPN","","10","1","10","5");
		physicianPortal.TextTypeNoOfTimesAdayFrequency("text Box",8,"Four Times a Day",7,4,"08:00 am",0);
		physicianPortal.HowOftenYearlyType(8,4,"Yearly","June","5","1");
		physicianPortal.CreateOrderFrequencyForRoutine(8,"Comments","Comments","Routine");
		
		
		TestTemplate.testReport.logInfo("Create Frequency With Four Time a Day Frequency & Yearly HowOften Dropdown Option");
		physicianPortal.AddOrderFrequency();
		
		physicianPortal.CreateOrderFrequencyForRoutine(9,"Routine","No End","Other","OtherNew3","Other","OtherNew3","LPN","","10","1","10","5");
		physicianPortal.TextTypeNoOfTimesAdayFrequency(" ",9,"Four Times a Day",8,4,"Morning",5);
		physicianPortal.HowOftenYearlyType(9,5,"Yearly","June","5","1");
		physicianPortal.CreateOrderFrequencyForRoutine(9,"Comments","Comments","Routine");
		
		
		TestTemplate.testReport.logInfo("Create Frequency With Five Time a Day Frequency & Yearly HowOften Dropdown Option");
        physicianPortal.AddOrderFrequency();
		
		physicianPortal.CreateOrderFrequencyForRoutine(10,"Routine","No End","Other","OtherNew2","Other","OtherNew2","LPN","","10","1","10","5");
		physicianPortal.TextTypeNoOfTimesAdayFrequency("text Box",10,"Five Times a Day",9,5,"08:00 am",0);
		physicianPortal.HowOftenYearlyType(10,6,"Yearly","June","5","1");
		physicianPortal.CreateOrderFrequencyForRoutine(10,"Comments","Comments","Routine");
		
		
		TestTemplate.testReport.logInfo("Create Frequency With Five Time a Day Frequency & Yearly HowOften Dropdown Option");
		physicianPortal.AddOrderFrequency();
		
		physicianPortal.CreateOrderFrequencyForRoutine(11,"Routine","No End","Other","OtherNew3","Other","OtherNew3","LPN","","10","1","10","5");
		physicianPortal.TextTypeNoOfTimesAdayFrequency(" ",11,"Five Times a Day",10,5,"Morning",6);
		physicianPortal.HowOftenYearlyType(11,7,"Yearly","June","5","1");
		physicianPortal.CreateOrderFrequencyForRoutine(11,"Comments","Comments","Routine");
		
		
		TestTemplate.testReport.logInfo("Create Frequency With Six Time a Day Frequency & Yearly HowOften Dropdown Option");
		physicianPortal.AddOrderFrequency();
		
		physicianPortal.CreateOrderFrequencyForRoutine(12,"Routine","No End","Other","OtherNew2","Other","OtherNew2","LPN","","10","1","10","5");
		physicianPortal.TextTypeNoOfTimesAdayFrequency("text Box",12,"Six Times a Day",11,6,"08:00 am",0);
		physicianPortal.HowOftenYearlyType(12,8,"Yearly","June","5","1");
		physicianPortal.CreateOrderFrequencyForRoutine(12,"Comments","Comments","Routine");
		
		
		TestTemplate.testReport.logInfo("Create Frequency With Six Time a Day Frequency & Yearly HowOften Dropdown Option");
		physicianPortal.AddOrderFrequency();
		
		physicianPortal.CreateOrderFrequencyForRoutine(13,"Routine","No End","Other","OtherNew3","Other","OtherNew3","LPN","","10","1","10","5");
		physicianPortal.TextTypeNoOfTimesAdayFrequency(" ",13,"Six Times a Day",12,3,"Morning",7);
		physicianPortal.HowOftenYearlyType(13,9,"Yearly","June","5","1");
		physicianPortal.CreateOrderFrequencyForRoutine(13,"Comments","Comments","Routine");
		
		
		TestTemplate.testReport.logInfo("Create Frequency With PRN type");
		physicianPortal.AddOrderFrequency();
		
		physicianPortal.CreateOrderFrequency(14,1,"PRN","No End","Height","Height","LPN","10","30","","","","Comments","Comments","Treatment");
		
		TestTemplate.testReport.logInfo("Create Frequency With PRN Every (x) Hour(s) type");
		physicianPortal.AddOrderFrequency();
		physicianPortal.CreateOrderFrequency(15,2,"PRN Every (x) Hour(s)","No End","Height","Height","LPN","10","30","","","","Comments","Comments","Treatment");		
		
		
		physicianPortal.SaveOrderFrequency();
}
	
	@Test(priority=2)
	public void CreateOrderDetailsForResidentWithMedication(ITestContext testContext)
	{
		PhysicianPortal physicianPortal=new PhysicianPortal(threadLocalWebDriver.get(), TestTemplate.testReport);
		HomePage homepage = new HomePage(threadLocalWebDriver.get(), TestTemplate.testReport);
		
		TestTemplate.testReport.logInfo("Click to Physician Portal From Menu Bar");
		homepage.NavigateToPhysicianPortal();
		
		TestTemplate.testReport.logInfo("Navigate to Residents Order From Physician Portal");
		physicianPortal.ClickOnPhysicianPortal();	
		
		TestTemplate.testReport.logInfo("Click On existing Resident");
		physicianPortal.ClickOnExistingResident("2010064");
	
		TestTemplate.testReport.logInfo("Create Order With Treatment Dropdown Option");
		physicianPortal.CreateAnOrderWithOrderDetails("Medication","Amoxicillin 125 MG/5ML Suspension Reconstituted","10","5","R29.71 - NIHSS score 10-19","TestDR, Test","Singh, Vishal","Telephone",
		"Both Ears","04/04/2019","5","Don't fill");
		
		
		TestTemplate.testReport.logInfo("Create Frequency With Once A Shift Frequency & Daily HowOften Dropdown Option");
		physicianPortal.CreateOrderFrequencyForRoutine(1,"Routine","No End","Other","OtherNew","Other","OtherNew","LPN","","10","1","10","5");
		physicianPortal.OnceAShiftFrequency(1,"Once a Shift");
		physicianPortal.HowOftenDailyType(1,"Daily","5");
		physicianPortal.CreateOrderFrequencyForRoutine(1,"Comments","Comments","Routine");
		
		
		TestTemplate.testReport.logInfo("Create Frequency With Once a Day Frequency & Weekly HowOften Dropdown Option");
		physicianPortal.AddOrderFrequency();
		
		physicianPortal.CreateOrderFrequencyForRoutine(2,"Routine","No End","Other","OtherNew1","Other","OtherNew1","LPN","","10","1","10","5");
		physicianPortal.TextTypeNoOfTimesAdayFrequency("text Box",2,"Once a Day",1,1,"08:00 am",0);
		physicianPortal.HowOftenWeeklytype(2,1,"Weekly","5");
		physicianPortal.CreateOrderFrequencyForRoutine(2,"Comments","Comments","Routine");
		
		
		TestTemplate.testReport.logInfo("Create Frequency With Once a Day Frequency & Monthly HowOften Dropdown Option");
		physicianPortal.AddOrderFrequency();		
		
		physicianPortal.CreateOrderFrequencyForRoutine(3,"Routine","No End","Other","OtherNew1","Other","OtherNew1","LPN","","10","1","10","5");
		physicianPortal.TextTypeNoOfTimesAdayFrequency(" ",3,"Once a Day",2,1,"Morning",2);
		physicianPortal.HowOftenMonthlytype("Use Specific Days",3,1,5,"Monthly","4","First","Sunday");
		physicianPortal.CreateOrderFrequencyForRoutine(3,"Comments","Comments","Routine");
		
		
		TestTemplate.testReport.logInfo("Create Frequency With Twice a Day Frequency & Monthly HowOften Dropdown Option");
		physicianPortal.AddOrderFrequency();
		
		physicianPortal.CreateOrderFrequencyForRoutine(4,"Routine","No End","Other","OtherNew2","Other","OtherNew2","LPN","","10","1","10","5");
		physicianPortal.TextTypeNoOfTimesAdayFrequency("text Box",4,"Twice a Day",3,2,"08:00 am",0);
		physicianPortal.HowOftenMonthlytype("",4,1,5,"Monthly","4","First","Sunday");
		physicianPortal.CreateOrderFrequencyForRoutine(4,"Comments","Comments","Routine");
		
		
		TestTemplate.testReport.logInfo("Create Frequency With Twice a Day Frequency & Yearly HowOften Dropdown Option");
		physicianPortal.AddOrderFrequency();
		
		physicianPortal.CreateOrderFrequencyForRoutine(5,"Routine","No End","Other","OtherNew3","Other","OtherNew3","LPN","","10","1","10","5");
		physicianPortal.TextTypeNoOfTimesAdayFrequency(" ",5,"Twice a Day",4,2,"Morning",3);
		physicianPortal.HowOftenYearlyType(5,1,"Yearly","June","5","1");
		physicianPortal.CreateOrderFrequencyForRoutine(5,"Comments","Comments","Routine");
		
		
		TestTemplate.testReport.logInfo("Create Frequency With Three Time a Day Frequency & Yearly HowOften Dropdown Option");
		physicianPortal.AddOrderFrequency();
		
		physicianPortal.CreateOrderFrequencyForRoutine(6,"Routine","No End","Other","OtherNew2","Other","OtherNew2","LPN","","10","1","10","5");
		physicianPortal.TextTypeNoOfTimesAdayFrequency("text Box",6,"Three Times a Day",5,3,"08:00 am",0);
		physicianPortal.HowOftenYearlyType(6,2,"Yearly","June","5","1");
		physicianPortal.CreateOrderFrequencyForRoutine(6,"Comments","Comments","Routine");
		
		
		TestTemplate.testReport.logInfo("Create Frequency With Three Time a Day Frequency & Yearly HowOften Dropdown Option");
		physicianPortal.AddOrderFrequency();		
				
		physicianPortal.CreateOrderFrequencyForRoutine(7,"Routine","No End","Other","OtherNew3","Other","OtherNew3","LPN","","10","1","10","5");
		physicianPortal.TextTypeNoOfTimesAdayFrequency(" ",7,"Three Times a Day",6,3,"Morning",4);
		physicianPortal.HowOftenYearlyType(7,3,"Yearly","June","5","1");
		physicianPortal.CreateOrderFrequencyForRoutine(7,"Comments","Comments","Routine");
		
		
		TestTemplate.testReport.logInfo("Create Frequency With Four Time a Day Frequency & Yearly HowOften Dropdown Option");
        physicianPortal.AddOrderFrequency();
		
		physicianPortal.CreateOrderFrequencyForRoutine(8,"Routine","No End","Other","OtherNew2","Other","OtherNew2","LPN","","10","1","10","5");
		physicianPortal.TextTypeNoOfTimesAdayFrequency("text Box",8,"Four Times a Day",7,4,"08:00 am",0);
		physicianPortal.HowOftenYearlyType(8,4,"Yearly","June","5","1");
		physicianPortal.CreateOrderFrequencyForRoutine(8,"Comments","Comments","Routine");
		
		
		TestTemplate.testReport.logInfo("Create Frequency With Four Time a Day Frequency & Yearly HowOften Dropdown Option");
		physicianPortal.AddOrderFrequency();
		
		physicianPortal.CreateOrderFrequencyForRoutine(9,"Routine","No End","Other","OtherNew3","Other","OtherNew3","LPN","","10","1","10","5");
		physicianPortal.TextTypeNoOfTimesAdayFrequency(" ",9,"Four Times a Day",8,4,"Morning",5);
		physicianPortal.HowOftenYearlyType(9,5,"Yearly","June","5","1");
		physicianPortal.CreateOrderFrequencyForRoutine(9,"Comments","Comments","Routine");
		
		
		TestTemplate.testReport.logInfo("Create Frequency With Five Time a Day Frequency & Yearly HowOften Dropdown Option");
        physicianPortal.AddOrderFrequency();
		
		physicianPortal.CreateOrderFrequencyForRoutine(10,"Routine","No End","Other","OtherNew2","Other","OtherNew2","LPN","","10","1","10","5");
		physicianPortal.TextTypeNoOfTimesAdayFrequency("text Box",10,"Five Times a Day",9,5,"08:00 am",0);
		physicianPortal.HowOftenYearlyType(10,6,"Yearly","June","5","1");
		physicianPortal.CreateOrderFrequencyForRoutine(10,"Comments","Comments","Routine");
		
		
		TestTemplate.testReport.logInfo("Create Frequency With Five Time a Day Frequency & Yearly HowOften Dropdown Option");
		physicianPortal.AddOrderFrequency();
		
		physicianPortal.CreateOrderFrequencyForRoutine(11,"Routine","No End","Other","OtherNew3","Other","OtherNew3","LPN","","10","1","10","5");
		physicianPortal.TextTypeNoOfTimesAdayFrequency(" ",11,"Five Times a Day",10,5,"Morning",6);
		physicianPortal.HowOftenYearlyType(11,7,"Yearly","June","5","1");
		physicianPortal.CreateOrderFrequencyForRoutine(11,"Comments","Comments","Routine");
		
		
		TestTemplate.testReport.logInfo("Create Frequency With Six Time a Day Frequency & Yearly HowOften Dropdown Option");
		physicianPortal.AddOrderFrequency();
		
		physicianPortal.CreateOrderFrequencyForRoutine(12,"Routine","No End","Other","OtherNew2","Other","OtherNew2","LPN","","10","1","10","5");
		physicianPortal.TextTypeNoOfTimesAdayFrequency("text Box",12,"Six Times a Day",11,6,"08:00 am",0);
		physicianPortal.HowOftenYearlyType(12,8,"Yearly","June","5","1");
		physicianPortal.CreateOrderFrequencyForRoutine(12,"Comments","Comments","Routine");
		
		
		TestTemplate.testReport.logInfo("Create Frequency With Six Time a Day Frequency & Yearly HowOften Dropdown Option");
		physicianPortal.AddOrderFrequency();
		
		physicianPortal.CreateOrderFrequencyForRoutine(13,"Routine","No End","Other","OtherNew3","Other","OtherNew3","LPN","","10","1","10","5");
		physicianPortal.TextTypeNoOfTimesAdayFrequency(" ",13,"Six Times a Day",12,3,"Morning",7);
		physicianPortal.HowOftenYearlyType(13,9,"Yearly","June","5","1");
		physicianPortal.CreateOrderFrequencyForRoutine(13,"Comments","Comments","Routine");
		
		
		TestTemplate.testReport.logInfo("Create Frequency With PRN type");
		physicianPortal.AddOrderFrequency();
		
		physicianPortal.CreateOrderFrequency(14,1,"PRN","No End","Height","Height","LPN","10","30","","","","Comments","Comments","Medication");
		
		TestTemplate.testReport.logInfo("Create Frequency With PRN Every (x) Hour(s) type");
		physicianPortal.AddOrderFrequency();
		physicianPortal.CreateOrderFrequency(15,2,"PRN Every (x) Hour(s)","No End","Height","Height","LPN","10","30","","","","Comments","Comments","Medication");		
		
		
		physicianPortal.SaveOrderFrequency();
		physicianPortal.LastMessage();
}
	
}
	
	
	


