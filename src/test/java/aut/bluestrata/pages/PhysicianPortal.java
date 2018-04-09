package aut.bluestrata.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.testreport.IReporter;

import dweb.aut.pages.templates.PageTemplate;

public class PhysicianPortal extends PageTemplate {

	public PhysicianPortal(WebDriver webDriver, IReporter testReport) {
		super(webDriver, testReport);
	}
	//Create Physician Portal 
	public By btnPhysicianPortal = By.xpath("//button[text()='Physician Portal']");
	public By aResidentOrders = By.xpath("//a[text()='Resident Orders']");
	//public By resident = By.xpath("//datatable-scroller[@class='datatable-scroll ng-star-inserted']/datatable-row-wrapper[1]//datatable-body-cell[3]");
	
	//Create An order 
	public By btnCreateOrder = By.xpath("//button[text()='Create an Order']");
	public By btnCreateSet = By.xpath("//button[text()='Create from Sets']");
	public By txtOrderType= By.id("settingOrderTypeId");
	public By linkCreateLibraryItem = By.xpath("//label[contains(.,'Pick From Library')]/../div/button");
	public By txtPickLibrary = By.id("libraryCreate");
	public By linkCreate = By.xpath("//label[contains(text(),'Pick From Library')]/..//button[1]");
	public By txtOrderDescription = By.id("description");
	public By linkAddDiagonosis = By.xpath("//label[text()='Diagnosis']/..//button[@class='btn btn-link']/i");
	public By txtSearchDiogonosis = By.id("query");
	public By txtSearchMedicineName = By.id("query");
	public By btnSearchDiogonosis = By.xpath("//div[@class='form-group row']//button[@type='submit']");
	
	//public By diogonosisOption = By.xpath("//datatable-body[@class='datatable-body']//datatable-row-wrapper[1]");
	public By diogonosisOption = By.xpath("(//div[@class='datatable-body-cell-label']/span)[1]");
	
	public By radioTreatment = By.xpath("//div[@class='col ng-star-inserted']//input[@value='TX']");
	public By txtMedicarePriority = By.xpath("//label[text()='Medicare B Priority']/..//input[@id='query']");
	public By chkbxAdmitting = By.xpath("(//div[@class='col ng-star-inserted']//div[@class='form-check']/label)[4]");
	public By chkbxSendToMDS = By.xpath("(//div[@class='col ng-star-inserted']//div[@class='form-check']/label)[5]");
	public By chkbxBillingAdmitDiagnosis = By.xpath("(//div[@class='col ng-star-inserted']//div[@class='form-check']/label)[6]");
	public By btnDiogonosisCreate = By.xpath("//div[@class='col ng-star-inserted']//button[@type='submit']");
	public By linkDuplicateDiogonosis = By.xpath("//div[text()='Duplicate Diagnosis']");
	public By btnClose = By.xpath("//button[@class='close']/span");
	public By srchDiogonosis = By.xpath("//label[text()='Diagnosis']/..//select[@id='diagnosisCode']");
	//public By srchDiogonosis = By.id("diagnosisCode");
	public By drpdwnPhysician = By.id("physicianId");
	public By drpdwnReceivedBy = By.id("receivedById");
	public By drpdwnReceivedOrder = By.id("typeReceivedOrder");
	public By chkbxIsAdmitting = By.id("isAdmitting");
	
	public By linkSearchMedications = By.xpath("(//label[text()='Medication']/..//button[@class='btn btn-link'])[1]");
	public By txtMedicationName = By.xpath("//input[@id='query']");
	
	public By warningMessage = By.xpath("//div[@class='alert alert-warning']");
	public By declineInput = By.xpath("//div[@class='alert alert-warning']//input");
	public By drpDwnroutes = By.xpath("//label[text()='Routes']/..//select[@id='settingOrderRouteId']");
	public By txtNoOfRefillis = By.xpath("//label[text()='No. Refills']/..//input[@id='numberOfRefills']");
	public By DrpdwnWhenToFill = By.xpath("//label[text()='When to refill']/..//select[@id='whenToRefillId']");
	public By txtWrittenDate = By.xpath("(//label[text()='Written Date']/..//input[@placeholder='mm/dd/yyyy'])[1]");
	public By radioMedication = By.xpath("//div[@class='col ng-star-inserted']//input[@value='Med']");
	public By txtDecline = By.xpath("//div[@class='ng-star-inserted']//textarea[@id='declinedInfectionControlReason']");
	
	
	//Create OrderFrequency
/*    public By drpdwnFrequencyType = By.id("routineTypeId");
	public By drpdwnEndDate = By.xpath("//label[text()='End']/..//select[@id='actions']");
	public By drpdwnRequiredActions = By.xpath("//label[text()='Require Action(s)']/..//select[@id='actions']");
	public By drpdwnRequiredActionsPostDropdown = By.xpath("//label[text()='Require Action(s) Post Administration']/..//select[@id='actionsPost']");
	public By drpdwnAdministeredBy = By.xpath("//label[text()='Administered By']/..//select[@id='settingOrderAdministratorId']");
	public By chkbxIsSelfAdministered = By.xpath("//input[@id='selfAdministered']");
	public By chkbxselfAdministeredRequiresSupervision = By.xpath("//input[@id='selfAdministeredRequiresSupervision']");
	public By chkbxRequiresFollowUp =By.xpath("//input[@id='requiresFollowUp']");
	public By txtMaxDoesHours = By.xpath("//label[text()='Max Doses Per 24 Hours']/..//input[@id='prnMaxDailyAdministration']");
	public By txtFollowUpAfterMinutes = By.id("followUpAfterMinutes");
	public By drpdwnFrequency = By.xpath("//label[text()='Frequency']/..//select[@id='typeOrderFrequencyId']");
	public By drpdwnHowOften = By.xpath("//label[text()='How often']/..//select[@id='patientOrderScheduleType']");
	public By txtEveryDay = By.xpath("//label[text()='Every']/..//input[@id='happensEvery']");
	public By txtPhysicianInstructions = By.xpath("//label[text()='Physician Instructions']/..//textarea[@id='instructions']");
	public By txtAdditionalInstruction = By.xpath("//label[text()='Additional Instruction']/..//textarea[@id='additionalNotes']");*/
	public By btnAddFrequency = By.xpath("//button[text()='Add Frequency']");
	public By btnSaveOrder = By.xpath("//button[text()='Save']");    
	
	public By btnHeaderPhysicianPortal = By.xpath("//*[@class='col-auto nav primary-menu-links']//button[text()='Physician Portal']");
	public By btnHeaderMessages = By.xpath("//*[@class='col-auto nav primary-menu-links']//button[contains(text(),'Messages')]");
	public By btnHeaderMediprocity = By.xpath("//*[@class='col-auto nav primary-menu-links']//button[contains(text(),'@@Mediprocity')]");
	
	public By spandrpdwnSign = By.xpath("//div[@aria-labelledby='menuDropDown']//a[text()='Sign']");
	public By spandrpdwnResidentOrder = By.xpath("//div[@aria-labelledby='menuDropDown']//a[text()='Resident Orders']");
	public By spandrpdwnRecap = By.xpath("//div[@aria-labelledby='menuDropDown']//a[text()='Recap']");
	public By spandrpdwnVerify = By.xpath("//div[@aria-labelledby='menuDropDown']//a[text()='Verify']");
	public By spandrpdwnHistoryandPhysical = By.xpath("//div[@aria-labelledby='menuDropDown']//a[text()='History and Physical']");
	public By spandrpdwnPhysicianProgressNoteAssessment = By.xpath("//div[@aria-labelledby='menuDropDown']//a[text()='Physician Progress Note Assessment']");
	public By spandrpdwnPhysicianProgressNotes = By.xpath("//div[@aria-labelledby='menuDropDown']//a[text()='Physician Progress Notes']");
	
	public By spanResidentFirstName = By.xpath("//div[@class='datatable-row-center ng-star-inserted']//span[text()='First Name']");
	public By spanResidentLastName = By.xpath("//div[@class='datatable-row-center ng-star-inserted']//span[text()='Last Name']");
	public By spanResidentMr = By.xpath("//div[@class='datatable-row-center ng-star-inserted']//span[text()='Mr #']");
	public By spanResidentMr2 = By.xpath("//div[@class='datatable-row-center ng-star-inserted']//span[text()='Mr2']");
	public By spanResidentLocation = By.xpath("//div[@class='datatable-row-center ng-star-inserted']//span[text()=Location']");
	
	public void ClickOnPhysicianPortal()
	{
		/*this.click(By.xpath(String.format(this.getLocator("button"), "Physician Portal")));
		this.click(By.xpath(String.format(this.getLocator("a"), "Resident Orders")));*/
		this.testReport.logSuccess("Clicked on Physician Portal Button ");
		this.click(btnPhysicianPortal,"Physician Portal Button");
		this.waitInSecs(2);
		this.testReport.logSuccess("Clicked on Resident Orders Links ");
		this.click(aResidentOrders,"Resident Orders"); 
		this.waitInSecs(2);
	}
	
	public void ClickOnExistingResident(String residentMR)
	{
		By Resident = By.xpath((String.format("//datatable-scroller[@class='datatable-scroll ng-star-inserted']/datatable-row-wrapper//datatable-body-cell[3]//span[text()='%s']", residentMR)));
		this.testReport.logSuccess("Clicked on Existing Resident Present in the Portal ");		
		for(int i=3;i<=8;i++)
		{
		By linkPageBottom = By.xpath(String.format("(//*[@class='datatable-pager ng-star-inserted']//a)[%d]",i));
		click(linkPageBottom,"Navigate Page");
		
		if(this.isElementVisible(Resident))
		{
		this.click(Resident,"Selected Resident");
		break;
		}
		
		}
		
	}

	public void CreateAnOrderWithOrderDetails(String type , String libraryText , String SearchDiogonosisTxt , String medicarePriority , 
			String diogonosisName ,String physicianType,String ReceivedByType , String ReceivedOrderType,
			String routes,String WrittenDate,String NoOfRefillis,String WhenToFill)
	{
			
		if(this.isElementPresent(btnCreateOrder))
		{
		this.testReport.logSuccess("Order Created ");
		this.click(btnCreateOrder,"Create Order Button");
		this.waitInSecs(5);
		}
		this.waitUntilElementIsVisible(txtOrderType);
		this.SelectDropDownByText(txtOrderType, type);
		this.waitInSecs(5);
		if(type.equals("Medication") || type.equals("Treatment With Medication"))
		{
			this.click(linkSearchMedications,"Search Medications");
			this.waitInSecs(2);
			this.sendKeys(txtSearchMedicineName,"Amox");
			this.waitInSecs(2);
			this.click(btnSearchDiogonosis,"Search Medication");
			this.waitInSecs(20);            //constant
			By medicineName = By.xpath(String.format("//datatable-scroller[@class='datatable-scroll ng-star-inserted']//span[text()='%s']", libraryText));
			this.click(medicineName, "Medicine");		
			this.waitInSecs(2);
			this.waitUntilElementIsVisible(warningMessage);
			if(this.isElementPresent(warningMessage))
			{
				this.click(declineInput, "Decline Input ");
				this.waitInSecs(2);
				this.sendKeys(txtDecline, libraryText);
				this.waitInSecs(10);
			}
		}
		else
		{
		this.click(linkCreateLibraryItem,"Create Library Item Link");
		this.waitInSecs(2);
		this.sendKeys(txtPickLibrary, libraryText);
		this.waitInSecs(2);
		this.click(linkCreate,"Create Link");
		this.waitInSecs(2);
		}
		//this.AssettextEqual(txtOrderDescription, txtPickLibrary);
		this.click(linkAddDiagonosis,"Add Diagonosis Link");
		this.waitInSecs(2);
		this.waitUntilElementIsVisible(txtSearchDiogonosis);
		this.sendKeys(txtSearchDiogonosis, SearchDiogonosisTxt);
		this.waitInSecs(2);
		this.click(btnSearchDiogonosis,"Search Diogonosis Button");
		this.waitInSecs(2);
		
		//By diogonosisOption = By.xpath((String.format("//div[@class='datatable-body-cell-label']/span[text()='%d']", diogonosisName)));
		this.click(diogonosisOption,"Diogonosis Option");
		this.waitInSecs(2);
		if(type.equals("Medication") || type.equals("Treatment With Medication"))
		{
			this.click(radioMedication,"Medication radio Button");
			this.waitInSecs(2);
		}
		else
		{
		this.click(radioTreatment,"Treatment radio Button");
		this.waitInSecs(2);
		}
		this.sendKeys(txtMedicarePriority, medicarePriority);
		this.waitInSecs(2);
		this.click(chkbxAdmitting,"Admitting Check Box");
		this.waitInSecs(2);
		this.click(chkbxSendToMDS,"Send To MDS Check Box");
		this.waitInSecs(2);
		this.click(chkbxBillingAdmitDiagnosis,"Billing Admit Diagnosis Check Box");
		this.waitInSecs(2);
		this.click(btnDiogonosisCreate,"Create Diogonosis Button");
		if(this.isElementPresent(linkDuplicateDiogonosis))
		{
			this.click(btnClose,"Close Button");
			this.waitInSecs(2);
			this.SelectDropDownByText(srchDiogonosis, diogonosisName);
			this.waitInSecs(2);
		}		
		this.SelectDropDownByText(drpdwnPhysician, physicianType);
		this.waitInSecs(2);
		this.SelectDropDownByText(drpdwnReceivedBy, ReceivedByType);
		this.waitInSecs(2);
		this.SelectDropDownByText(drpdwnReceivedOrder, ReceivedOrderType);
		this.waitInSecs(2);
		this.click(chkbxIsAdmitting,"Is Admitting Check Box");
		this.waitInSecs(2);
		if(type.equals("Medication") || type.equals("Treatment With Medication"))
		{
			this.SelectDropDownByText(drpDwnroutes, routes);// Both Ears
			this.waitInSecs(2);
		//	this.sendKeys(txtWrittenDate, WrittenDate);
		//	this.waitInSecs(2);
			this.SendKeysToElementClearFirst(txtNoOfRefillis, NoOfRefillis);
			this.waitInSecs(2);
			this.SelectDropDownByText(DrpdwnWhenToFill, WhenToFill);
			this.waitInSecs(2);
		}
		
	}
	
	
	
	/*public void CreateOrderFrequency(String frequencyType,String endDate,String requiredActions,String requiredActionsPostDropdown,String administeredBy,String followUpAfterMinutes,
			String frequency,String howOften, String everyDay , String physicianInstructions, String additionalInstruction)
	{
		
		this.SelectDropDownByText(drpdwnFrequencyType, frequencyType);
		this.SelectDropDownByText(drpdwnEndDate, endDate);
		this.SelectDropDownByText(drpdwnRequiredActions, requiredActions);
		this.SelectDropDownByText(drpdwnRequiredActionsPostDropdown, requiredActionsPostDropdown);
		this.SelectDropDownByText(drpdwnAdministeredBy, administeredBy);		
		this.click(chkbxIsSelfAdministered);		
		this.click(chkbxselfAdministeredRequiresSupervision);
		
		
		
		if(frequencyType.equals("Routine"))
		{
			this.click(chkbxRequiresFollowUp);
		}
		else 
		{			
			this.sendKeys(txtMaxDoesHours, "5");
		}		
		this.sendKeys(txtFollowUpAfterMinutes, followUpAfterMinutes);
		this.SelectDropDownByText(drpdwnFrequency, frequency);
		this.SelectDropDownByText(drpdwnHowOften, howOften);
		this.sendKeys(txtEveryDay, everyDay);
		this.sendKeys(txtPhysicianInstructions, physicianInstructions);
		this.sendKeys(txtAdditionalInstruction, additionalInstruction);
		
	}*/
	
	
	public void SaveOrderFrequency()
	{
		this.testReport.logInfo("Add the Order Successfully ");
		this.click(btnSaveOrder,"Save Order");
		this.waitInSecs(5);
	}
	public void AddOrderFrequency()
	{
		this.testReport.logInfo("Adding the Order Frequency ");
		this.click(btnAddFrequency,"Add Frequency Button");
	}
	
	public void CreateOrderFrequency(int num,int no,String frequencyType,String endDate,String requiredActions,String requiredActionsPostDropdown,String administeredBy,String maxDoesHours,String followUpAfterMinutes,
			String frequency,String howOften, String everyDay , String physicianInstructions, String additionalInstruction, String type)
	{
		int newNum = (num-1);
		By drpdwnFrequencyType = By.xpath(String.format("(//select[@id='routineTypeId'])[%d]", num));
		this.SelectDropDownByText(drpdwnFrequencyType, frequencyType);
		By drpdwnEndDate = By.xpath(String.format("(//label[text()='End']/..//select[@id='actions'])[%d]", num));
		this.SelectDropDownByText(drpdwnEndDate, endDate);
		if(type.equals("Medication") || type.equals("Treatment With Medication"))
		{
			By txtDose = By.xpath(String.format("(//label[text()='Dose']/..//input[@id='dose'])[%d]", num));
			this.sendKeys(txtDose, "4");
			By txtUnit = By.xpath(String.format("(//label[text()='Unit']/..//input[@id='doseUnit'])[%d]", num));
			this.sendKeys(txtUnit, "4");
		}
		
		By drpdwnRequiredActions = By.xpath(String.format("(//label[text()='Require Action(s)']/..//select[@id='actions'])[%d]", num));
		this.SelectDropDownByText(drpdwnRequiredActions, requiredActions);
		By drpdwnRequiredActionsPostDropdown = By.xpath(String.format("(//label[text()='Require Action(s) Post Administration']/..//select[@id='actionsPost'])[%d]", num));
		this.SelectDropDownByText(drpdwnRequiredActionsPostDropdown, requiredActionsPostDropdown);
		By drpdwnAdministeredBy = By.xpath(String.format("(//label[text()='Administered By']/..//select[@id='settingOrderAdministratorId'])[%d]", num));
		this.SelectDropDownByText(drpdwnAdministeredBy, administeredBy);		
		By chkbxIsSelfAdministered = By.xpath(String.format("(//input[@id='selfAdministered'])[%d]",num));
		this.click(chkbxIsSelfAdministered,"Is Self Administered Check Box");
		By chkbxselfAdministeredRequiresSupervision = By.xpath(String.format("(//input[@id='selfAdministeredRequiresSupervision'])[%d]", num));
		this.click(chkbxselfAdministeredRequiresSupervision,"Self Administered Requires Supervision Check Box");
		if(frequencyType.equals("Routine"))
		{	
			By chkbxRequiresFollowUp =By.xpath(String.format("(//input[@id='requiresFollowUp'])[%d]",num));
			this.click(chkbxRequiresFollowUp,"Requires FollowUp Check Box");
		}
		else 
		{	
			By txtMaxDoesHours =By.xpath(String.format("(//label[text()='Max Doses Per 24 Hours']/..//input[@id='prnMaxDailyAdministration'])[%d]",no));
			this.sendKeys(txtMaxDoesHours, maxDoesHours);
		}	
		By chkbxRequiresFollowUp =By.xpath(String.format("(//input[@id='requiresFollowUp'])[%d]",num));
		this.click(chkbxRequiresFollowUp,"Requires FollowUp Check Box");
		
		By txtFollowUpAfterMinutes = By.xpath(String.format("(//input[@id='followUpAfterMinutes'])[%d]", num));
		this.sendKeys(txtFollowUpAfterMinutes, followUpAfterMinutes);
		if(frequencyType.equals("Routine"))
		{		
		By drpdwnFrequency = By.xpath(String.format("(//label[text()='Frequency']/..//select[@id='typeOrderFrequencyId'])[%d]", num));
		this.SelectDropDownByText(drpdwnFrequency, frequency);
		By drpdwnHowOften = By.xpath(String.format("(//label[text()='How often']/..//select[@id='patientOrderScheduleType'])[%d]", num));
		this.SelectDropDownByText(drpdwnHowOften, howOften);
		By txtEveryDay  = By.xpath(String.format("(//label[text()='Every']/..//input[@id='happensEvery'])[%d]", num));
		this.sendKeys(txtEveryDay, everyDay);
		}
		
		
	
	
		//By txtPhysicianInstructions  = By.xpath(String.format("(//label[text()='Physician Instructions']/..//textarea[@id='instructions'])[%d]", num));
		//this.sendKeys(txtPhysicianInstructions, physicianInstructions);
		
		
		
			By btnGenerrate = By.xpath(String.format("(//label[text()='Physician Instructions']/..//button[text()='Generate'])[%d]",num));
			this.click(btnGenerrate, "Genrate Button");
		
		By txtAdditionalInstruction = By.xpath(String.format("(//label[text()='Additional Instruction']/..//textarea[@id='additionalNotes'])[%d]", num));
		this.sendKeys(txtAdditionalInstruction, additionalInstruction);
	}
	
	
	public void CreateOrderFrequencyForRoutine(int num,String frequencyType,String endDate,String requiredActions,String othersRequiredActions ,String requiredActionsPostDropdown,String othersRequiredActionsPostDropdown, String administeredBy,String maxDoesHours,
			String followUpAfterMinutes,String slidingScaleMin,String slidingScaleMax,String slidingScaleUnits)
	{
		By drpdwnFrequencyType = By.xpath(String.format("(//select[@id='routineTypeId'])[%d]", num));
		this.SelectDropDownByText(drpdwnFrequencyType, frequencyType);
		By drpdwnEndDate = By.xpath(String.format("(//label[text()='End']/..//select[@id='actions'])[%d]", num));
		this.SelectDropDownByText(drpdwnEndDate, endDate);
		if(frequencyType.equals("PRN")  ||  frequencyType.equals("PRN Every (x) Hour(s)"))
		{
			By txtDose = By.xpath(String.format("(//label[text()='Dose']/..//input[@id='dose'])[%d]", num));
			this.sendKeys(txtDose, "4");
			By txtUnit = By.xpath(String.format("(//label[text()='Unit']/..//input[@id='doseUnit'])[%d]", num));
			this.sendKeys(txtUnit, "4");
		}
		
		By drpdwnRequiredActions = By.xpath(String.format("(//label[text()='Require Action(s)']/..//select[@id='actions'])[%d]", num));
		this.SelectDropDownByText(drpdwnRequiredActions, requiredActions);
		if(requiredActions=="Other")
		{
			By txtOthersRequiredActions = By.xpath(String.format("(//select[@id='actions']/..//input[@formcontrolname='description'])[%d]", num));
			this.sendKeys(txtOthersRequiredActions, othersRequiredActions);
		}
		By drpdwnRequiredActionsPostDropdown = By.xpath(String.format("(//label[text()='Require Action(s) Post Administration']/..//select[@id='actionsPost'])[%d]", num));
		this.SelectDropDownByText(drpdwnRequiredActionsPostDropdown, requiredActionsPostDropdown);
		if(requiredActionsPostDropdown=="Other")
		{
			By txtOthersRequiredActionsPostDropdown = By.xpath(String.format("(//select[@id='actionsPost']/..//input[@formcontrolname='description'])[%d]", num));
			this.sendKeys(txtOthersRequiredActionsPostDropdown, othersRequiredActionsPostDropdown);
		}
		By drpdwnAdministeredBy = By.xpath(String.format("(//label[text()='Administered By']/..//select[@id='settingOrderAdministratorId'])[%d]", num));
		this.SelectDropDownByText(drpdwnAdministeredBy, administeredBy);		
		By chkbxIsSelfAdministered = By.xpath(String.format("(//input[@id='selfAdministered'])[%d]",num));
		this.click(chkbxIsSelfAdministered,"Is Self Administered Check Box");
		By chkbxselfAdministeredRequiresSupervision = By.xpath(String.format("(//input[@id='selfAdministeredRequiresSupervision'])[%d]", num));
		this.click(chkbxselfAdministeredRequiresSupervision,"Self Administered Requires Supervision Check Box");
		if(frequencyType.equals("Routine"))
		{			
			By chkbxRequiresFollowUp =By.xpath(String.format("(//input[@id='requiresFollowUp'])[%d]",num));
			this.click(chkbxRequiresFollowUp,"Requires FollowUp Check Box");
		}
			
		By txtFollowUpAfterMinutes = By.xpath(String.format("(//input[@id='followUpAfterMinutes'])[%d]", num));
		this.sendKeys(txtFollowUpAfterMinutes, followUpAfterMinutes);
		By chkbxRequiesSlidingScale = By.xpath(String.format("(//label[@class='form-check-label']/input[@id='useSlidingScale'])[%d]", num));
		this.click(chkbxRequiesSlidingScale,"Requies Sliding Scale Check Box");
		By txtSlidingScaleMin = By.xpath(String.format("(//table//input[@formcontrolname='minValue'])[%d]", num));
		this.sendKeys(txtSlidingScaleMin, slidingScaleMin);
		By txtSlidingScaleMax = By.xpath(String.format("(//table//input[@formcontrolname='maxValue'])[%d]", num));
		this.sendKeys(txtSlidingScaleMax, slidingScaleMax);
		By txtSlidingScaleUnits = By.xpath(String.format("(//table//input[@formcontrolname='units'])[%d]", num));
		this.sendKeys(txtSlidingScaleUnits, slidingScaleUnits);
		By chkBoxSlidingScaleNotifyRemove = By.xpath(String.format("(//table//input[@formcontrolname='notifyPhysician'])[%d]", num));
		this.click(chkBoxSlidingScaleNotifyRemove,"Sliding Scale Notify Remove Check Box");
		
	}
	
	
	public void CreateOrderFrequencyForRoutine(int num ,String physicianInstructions, String additionalInstruction,String frequencyType)
	{
		if(frequencyType.equals("Routine"))
		{
		By txtPhysicianInstructions  = By.xpath(String.format("(//label[text()='Physician Instructions']/..//textarea[@id='instructions'])[%d]", num));
		this.sendKeys(txtPhysicianInstructions, physicianInstructions);
		}
		else
		{
			By btnGenerrate = By.xpath(String.format("(//label[text()='Physician Instructions']/..//button[text()='Generate'])[%d]",num));
			this.click(btnGenerrate, "Genrate Button");
		}
		By txtAdditionalInstruction = By.xpath(String.format("(//label[text()='Additional Instruction']/..//textarea[@id='additionalNotes'])[%d]", num));
		this.sendKeys(txtAdditionalInstruction, additionalInstruction);
	}
	
	public void HowOftenDailyType(int FrequencyNum , String howOften , String everyDay)
	{
		By drpdwnHowOften = By.xpath(String.format("(//label[text()='How often']/..//select[@id='patientOrderScheduleType'])[%d]", FrequencyNum));
		this.SelectDropDownByText(drpdwnHowOften, howOften);
		By txtEveryDay  = By.xpath(String.format("(//label[text()='Every']/..//input[@id='happensEvery'])[%d]", FrequencyNum));
		this.sendKeys(txtEveryDay, everyDay);
		
	}
	
	public void HowOftenWeeklytype(int FrequencyNum , int noOfTimes , String howOften , String everyDay)
	{
		By drpdwnHowOften = By.xpath(String.format("(//label[text()='How often']/..//select[@id='patientOrderScheduleType'])[%d]", FrequencyNum));
		this.SelectDropDownByText(drpdwnHowOften, howOften);
		By txtEveryDay  = By.xpath(String.format("(//label[text()='Every']/..//input[@id='happensEvery'])[%d]", FrequencyNum));
		this.sendKeys(txtEveryDay, everyDay);	
		
		
		List<WebElement> weeklyDays = wd.findElements(By.xpath(String.format("(//div[@class='form-group row ng-star-inserted']//div[@formarrayname='schedules'])[%d]/div",noOfTimes)));
		List<String> WeeklyDayInHowOften = new ArrayList<>();
		
		for (WebElement match : weeklyDays) {
			WeeklyDayInHowOften.add(match.getText());
			String noOfDays=match.getText();
			System.out.println(noOfDays);
	    }
		    for(int i=1;i<=7;i++)
		    {
			By ChkBxScheduleDay = By.xpath(String.format("(//div[@class='form-group row ng-star-inserted']//div[@formarrayname='schedules'])[%d]/div[%d]//input", noOfTimes ,i));
			this.click(ChkBxScheduleDay,"Schedule Day Check Box");
		    }
		
		
		}	
	


	public void HowOftenMonthlytype(String typeOfMode ,int FrequencyNum,int howOftenTime , int dayNo ,String howOften, String everyDay, String DropdownNumber ,String DropdownDay )
	{
		if(typeOfMode=="Use Specific Days") {
		
		By drpdwnHowOften = By.xpath(String.format("(//label[text()='How often']/..//select[@id='patientOrderScheduleType'])[%d]", FrequencyNum));
		this.SelectDropDownByText(drpdwnHowOften, howOften);
		By chkbxUseSpecificDays = By.xpath(String.format("((//div[@class='form-row']//input[@name='rdoMonthlyChoice'])[1])[%d]", FrequencyNum));
		
		boolean IsSelected = wd.findElement(By.xpath(String.format("((//div[@class='form-row']//input[@name='rdoMonthlyChoice'])[1])[%d]", howOftenTime))).getAttribute("ng-reflect-value").equals("true");
		if(!IsSelected)
		{
			this.click(chkbxUseSpecificDays,"Use Specific Days Check box");
		}
		
		
		List<WebElement> MonthlyDays = wd.findElements(By.xpath(String.format("((//div[@class='col-sm-8 col-md-9 ng-star-inserted']//div[@formarrayname='schedules'])[%d]/div)", howOftenTime)));
		List<String> MonthlyDaysInHowOften = new ArrayList<>();
		
		for(WebElement match : MonthlyDays)
		{
			MonthlyDaysInHowOften.add(match.getText());
			String noOfDays =match.getText();
			System.out.println(noOfDays);
		}
		
		 
		 for(int i=1;i<=31; i++)
		 {
			By ChkBxScheduleDay = By.xpath(String.format("(//div[@class='col-sm-8 col-md-9 ng-star-inserted']//div[@formarrayname='schedules'])[%d]/div[%d]//input", howOftenTime ,i));
			this.click(ChkBxScheduleDay,"Schedule Day Check Box");
		 }
			By txtEveryDay  = By.xpath(String.format("(//label[text()='of every']/..//input[@id='happensEvery'])[%d]", howOftenTime));
			this.sendKeys(txtEveryDay, everyDay);
			
		}
		else {
			
			int newHowOftenTime =(howOftenTime + 1 );
			
			By drpdwnHowOften = By.xpath(String.format("(//label[text()='How often']/..//select[@id='patientOrderScheduleType'])[%d]", FrequencyNum));
			this.SelectDropDownByText(drpdwnHowOften, howOften);
			
			By radioUseByWeeks = By.xpath(String.format("((//div[@class='form-row']//input[@name='rdoMonthlyChoice'])[4])"));
			
			
			boolean IsSelected = wd.findElement(By.xpath(String.format("((//div[@class='form-row']//input[@name='rdoMonthlyChoice'])[4])"))).getAttribute("ng-reflect-value").equals("true");
			if(!IsSelected)
			{
				this.click(radioUseByWeeks,"Use By Weeks Radio Button");
			}
									
			
			By drpdwnNumber = By.xpath(String.format("(//select[@formcontrolname='weekOfTheMonth'])[%d]",howOftenTime));
			this.SelectDropDownByText(drpdwnNumber, DropdownNumber);
			
			By drpdwnDay = By.xpath(String.format("(//select[@formcontrolname='dayOfTheWeek'])[%d]",howOftenTime));
			this.SelectDropDownByText(drpdwnDay, DropdownDay);
			
			By txtEveryDay  = By.xpath(String.format("(//label[text()='of every']/..//input[@id='happensEvery'])[%d]", newHowOftenTime));
			this.sendKeys(txtEveryDay, everyDay);			
		
		}
	}
		
	public void HowOftenYearlyType(int FrequencyNum , int newHowOftenNumber,String howOften , String scheduleOnMonth , String scheduleOnNumber ,String scheduleOnYear)
		{
			//int newHowOftenNumber =1;
			
			By drpdwnHowOften = By.xpath(String.format("(//label[text()='How often']/..//select[@id='patientOrderScheduleType'])[%d]", FrequencyNum));
			this.SelectDropDownByText(drpdwnHowOften, howOften);	
			
			By drpdwnScheduleOnMonth = By.xpath(String.format("(//label[text()='On']/..//select[@formcontrolname='monthOfTheYear'])[%d]",newHowOftenNumber));
			this.SelectDropDownByText(drpdwnScheduleOnMonth, scheduleOnMonth);
			By drpdwnScheduleOnNumber = By.xpath(String.format("(//label[text()='On']/..//input[@formcontrolname='dayOfTheMonth'])[%d]",newHowOftenNumber));
			this.SendKeysToElementClearFirst(drpdwnScheduleOnNumber, scheduleOnNumber);
			By drpdwnScheduleOnYear = By.xpath(String.format("(//label[text()='of every']/..//input[@formcontrolname='happensEvery'])[%d]",newHowOftenNumber));
			this.sendKeys(drpdwnScheduleOnYear, scheduleOnYear);
			
		}
	
	
	
	public void OnceAShiftFrequency(int frequencyNum , String frequency)
	{
		By drpdwnFrequency = By.xpath(String.format("(//label[text()='Frequency']/..//select[@id='typeOrderFrequencyId'])[%d]", frequencyNum));
		this.SelectDropDownByText(drpdwnFrequency, frequency);
	}
	
	public void TextTypeNoOfTimesAdayFrequency(String frequencytype ,int frequencyNum , String frequency ,int frequencyCount , int numberOfShifts , String timeInADay,int chkbxNo)
	{
		By drpdwnFrequency = By.xpath(String.format("(//label[text()='Frequency']/..//select[@id='typeOrderFrequencyId'])[%d]", frequencyNum));
	
		this.SelectDropDownByText(drpdwnFrequency, frequency); 
		if(frequencytype=="text Box")	{					
		for(int i=1;i<=numberOfShifts;i++)
		{
	//	By textbxTimeInADayOnce = By.xpath(String.format("(((//div[@formarrayname='timeRanges'])[%d]//input[@placeholder='hh:mm ampm'])[%d])",frequencyCount,i));
		By textbxTimeInADayOnce = By.xpath(String.format("((//label[text()='Times']/..//div[@formarrayname='timeRanges'])[%d]/..//div//input[@placeholder='hh:mm ampm'])[%d]",frequencyCount,i));	
		
	/*	for(double j=06.00;j<12.00;j++) {
			int 
		}   */
		this.SendKeysToElementClearFirst(textbxTimeInADayOnce, timeInADay);
		
		}
		}
		else
		{
		
	//	int newfrequencyCount = (frequencyCount + 1);
		By chkbxUserPredefinedTimeRange = By.xpath((String.format("(//label[text()='Times']/..//input[@ng-reflect-model='false'])[%d]", chkbxNo)));
		this.click(chkbxUserPredefinedTimeRange, "User Predefined TimeRange Check Box");						
		for(int i=1;i<=numberOfShifts;i++)
		{
	//	By ckhbxTimeInADayOnce = By.xpath(String.format("((//div[@formarrayname='timeRanges']//select[@formcontrolname='settingId'])[%d])[%d]", i,frequencyCount));
			By ckhbxTimeInADayOnce = By.xpath(String.format("((((//label[text()='Times'])/..//div[@formarrayname='timeRanges'])[%d])//div//select[@formcontrolname='settingId'])[%d]",frequencyCount,i));
	 
		this.SelectDropDownByText(ckhbxTimeInADayOnce, timeInADay);
		
		}
		}
	}
		
		
	
		public void LastMessage()
		{
			By notRightNow = By.xpath("//div[@class='modal-content']//button[text()='Not right now']");
			this.click(notRightNow, "Not right now");
		}
		
		
		public void PhysicianPortalHeaderVerfication()
		{
			this.testReport.logInfo("clicking on Physician Portal app, below menu display : Physician Portal, Messages, Mediprocity");
			this.VerifyWebElementPresent(btnHeaderPhysicianPortal,"Physician Portal");
			this.VerifyWebElementPresent(btnHeaderMessages,"Messages");
			this.VerifyWebElementPresent(btnHeaderMediprocity,"Mediprocity");
			
		}
		
		public void VerifyPhysicianPortalDrropdown()
		{
			this.testReport.logInfo("Clicking on Physician portal display below sub menus :Sign,Resident Orders,Recap,Verify,History & Physicial,Physician Progress Note Assessment,Physician Progress Note");
			this.VerifyWebElementPresent(spandrpdwnSign,"Sign");
			this.VerifyWebElementPresent(spandrpdwnResidentOrder,"Resident Order");
			this.VerifyWebElementPresent(spandrpdwnRecap,"Recap");
			this.VerifyWebElementPresent(spandrpdwnVerify,"Verify");
			this.VerifyWebElementPresent(spandrpdwnHistoryandPhysical,"History and Physical");
			this.VerifyWebElementPresent(spandrpdwnPhysicianProgressNoteAssessment,"Physician Progress Note Assessment");
			this.VerifyWebElementPresent(spandrpdwnPhysicianProgressNotes,"Physician Progress Notes");
		}
		
		public void VerifyResidentPageHeaderHeading()
		{
			this.testReport.logInfo(" Clicking on Resident Order submenu should display under below columns First Name,Last Name,Mr#,Mr2,Location");
					
			this.VerifyWebElementPresent(spanResidentFirstName,"Resident FirstName");
			this.VerifyWebElementPresent(spanResidentLastName,"Resident LastName");
			this.VerifyWebElementPresent(spanResidentMr,"Resident Mr#");
			this.VerifyWebElementPresent(spanResidentMr2,"Resident Mr2");
			this.VerifyWebElementPresent(spanResidentLocation,"Resident Location");
			
		}
		
		public void CounttheNoOfResidentInAPage()
		{
			List<WebElement> CountInAPage = wd.findElements(By.xpath("//datatable-scroller[@class='datatable-scroll']//*[@class='datatable-row-wrapper']"));
			List<String> ResidentCountNos = new ArrayList<>();
			
			
			this.testReport.logSuccess("Clicked on Existing Resident Present in the Portal ");		
			for(int i=3;i<=8;i++)
			{
			By linkPageBottom = By.xpath(String.format("(//*[@class='datatable-pager ng-star-inserted']//a)[%d]",i));
			
			for (WebElement match : CountInAPage) {
				ResidentCountNos.add(match.getText());
				String noOfResidents=match.getText();
				System.out.println(noOfResidents);
				
			click(linkPageBottom,"Navigate Page");
					
			
			}
		}
		
		}
		
		public void VerifyButtonInResidentOrders()
		{
			this.testReport.logInfo("clicking on Orders >> Resident Orders display two buttons :i> Create an Order ii>Create from Sets");
			this.VerifyWebElementPresent(btnCreateOrder, "Create An Order");
			this.VerifyWebElementPresent(btnCreateSet, "Create From Set");
		}
		
		
}
	
	
		
		
	
		






































