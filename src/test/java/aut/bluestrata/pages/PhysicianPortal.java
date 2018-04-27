package aut.bluestrata.pages;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.testreport.IReporter;

import dweb.aut.pages.templates.PageTemplate;

public class PhysicianPortal extends PageTemplate {

	public PhysicianPortal(WebDriver webDriver, IReporter testReport) {
		super(webDriver, testReport);
	}
	//Create Physician Portal 
	public By btnPhysicianPortal = By.xpath("//button[text()='Physician Portal']");
	public By aResidentOrders = By.xpath("//button[text()='Resident Orders']");
	//public By resident = By.xpath("//datatable-scroller[@class='datatable-scroll ng-star-inserted']/datatable-row-wrapper[1]//datatable-body-cell[3]");
	
	//Create An order 
	public By btnCreateOrder = By.xpath("//button[text()='Create an Order']");
	public By btnCreateSet = By.xpath("//button[text()='Create From Set']");
	public By txtOrderType= By.id("settingOrderTypeId");
	public By linkCreateLibraryItem = By.xpath("//label[contains(.,'Pick From Library')]/../div/button");
	public By txtPickLibrary = By.id("libraryCreate");
	public By linkCreate = By.xpath("//label[contains(text(),'Pick From Library')]/..//button[1]");
	public By linkCancel = By.xpath("//label[contains(text(),'Pick From Library')]/..//button[2]");
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
	public By labelDiagnosisRequired = By.xpath("//label[text()='Diagnosis']/..//div[@class='invalid-feedback']//i");
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
	
	public By labelPickFromLibrary = By.xpath("//div[@class='ng-star-inserted']//label[text()='Pick From Library']");
	public By labelICD10Database = By.xpath("//div[@class='modal-header']/h5[text()='ICD-10 Database']");
	public By txtPickFromLibrary = By.xpath("//label[text()='Pick From Library']/..//select[@id='libraryselect']");
	
	
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
	public By btnCancel = By.xpath("//button[text()='Cancel']");
	
	public By btnHeaderPhysicianPortal = By.xpath("//*[@class='col-auto nav primary-menu-links']//button[text()='Physician Portal']");
	public By btnHeaderMessages = By.xpath("//*[@class='col-auto nav primary-menu-links']//button[contains(text(),'Messages')]");
	public By btnHeaderMediprocity = By.xpath("//*[@class='col-auto nav primary-menu-links']//button[contains(text(),'@@Mediprocity')]");
	
	public By spandrpdwnSign = By.xpath("//div[@aria-labelledby='menuDropDown']//button[text()='Sign']");
	public By spandrpdwnResidentOrder = By.xpath("//div[@aria-labelledby='menuDropDown']//button[text()='Resident Orders']");
	public By spandrpdwnRecap = By.xpath("//div[@aria-labelledby='menuDropDown']//button[text()='Recap']");
	public By spandrpdwnVerify = By.xpath("//div[@aria-labelledby='menuDropDown']//button[text()='Verify']");
	public By spandrpdwnHistoryandPhysical = By.xpath("//div[@aria-labelledby='menuDropDown']//button[text()='History and Physical']");
	public By spandrpdwnPhysicianProgressNoteAssessment = By.xpath("//div[@aria-labelledby='menuDropDown']//button[text()='Physician Progress Note Assessment']");
	public By spandrpdwnPhysicianProgressNotes = By.xpath("//div[@aria-labelledby='menuDropDown']//button[text()='Physician Progress Notes']");
	
	public By spanResidentFirstName = By.xpath("//div[@class='datatable-row-center ng-star-inserted']//span[text()='First Name']");
	public By spanResidentLastName = By.xpath("//div[@class='datatable-row-center ng-star-inserted']//span[text()='Last Name']");
	public By spanResidentMr = By.xpath("//div[@class='datatable-row-center ng-star-inserted']//span[text()='Mr #']");
	public By spanResidentMr2 = By.xpath("//div[@class='datatable-row-center ng-star-inserted']//span[text()='Mr2']");
	public By spanResidentLocation = By.xpath("//div[@class='datatable-row-center ng-star-inserted']//span[text()='Location']");
	
	public By txtEnterNameOrMrNumber = By.xpath("//input[@placeholder='Enter name or mr number']");
	public By drpdwnSelectStations = By.xpath("//button[contains(text(),'Select stations')]");
	public By drpdwnSelectStatus = By.xpath("//button[contains(text(),'Select statuses')]");
	public By btnApplyFilters = By.xpath("//button[contains(text(),'Apply filters')]");
	
	public By spanOrderSummaryDescription = By.xpath("//div[@class='datatable-header-inner']//span[text()='Description']");
	public By spanOrderSummaryType = By.xpath("//div[@class='datatable-header-inner']//span[text()='Type']");
	public By spanOrderSummaryPhysician = By.xpath("//div[@class='datatable-header-inner']//span[text()='Physician']");
	public By spanOrderSummaryFrequencies = By.xpath("//div[@class='datatable-header-inner']//span[text()='Frequencies']");
	public By spanOrderSummaryStatus = By.xpath("//div[@class='datatable-header-inner']//span[text()='Status']");
	
	public By defaultSection = By.xpath("//li[@class='pages active']/a");
	
	
	
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
	//	By Resident = By.xpath((String.format("//datatable-scroller[@class='datatable-scroll ng-star-inserted']/datatable-row-wrapper//datatable-body-cell[3]//span[text()='%s']", residentMR)));
		
		By Resident = By.xpath((String.format("//datatable-scroller[@class='datatable-scroll ng-star-inserted']/datatable-row-wrapper//datatable-body-cell[4]//span[text()='%s']/../../..//div/button[text()='Select']", residentMR)));
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
		this.VerifyWebElementPresent(linkCreateLibraryItem,"Create Library Item Link");	
		this.click(linkCreateLibraryItem,"Create Library Item Link");
		this.VerifyWebElementPresent(linkCreate,"Create Link");	
		this.VerifyWebElementPresent(linkCancel,"Cancel");	
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
		if(endDate=="No End") 
		{
		By drpdwnEndDate = By.xpath(String.format("(//label[text()='End']/..//select[@id='actions'])[%d]", num));
		this.SelectDropDownByText(drpdwnEndDate, endDate);
		}
		else if(endDate=="By Date")
		{
			By drpdwnEndDate = By.xpath(String.format("(//label[text()='End']/..//select[@id='actions'])[%d]", num));
			this.SelectDropDownByText(drpdwnEndDate, endDate);
		//	By txtDate = By.xpath("(//label[text()='End']/..//input[@placeholder='mm/dd/yyyy' and @class='form-control'])[%d]",num);
		}
		else
		{
			By drpdwnEndDate = By.xpath(String.format("(//label[text()='End']/..//select[@id='actions'])[%d]", num));
			this.SelectDropDownByText(drpdwnEndDate, endDate);
		}
		
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
	
	
	public void CreateOrderFrequencyForRoutine(int num ,String physicianInstructions, String additionalInstruction,String type)
	{
		if(type.equals("Medication") || type.equals("Treatment With Medication"))
		{
			By btnGenerrate = By.xpath(String.format("(//label[text()='Physician Instructions']/..//button[text()='Generate'])[%d]",num));
			this.click(btnGenerrate, "Genrate Button");
		}
		else
		{
			
			By txtPhysicianInstructions  = By.xpath(String.format("(//label[text()='Physician Instructions']/..//textarea[@id='instructions'])[%d]", num));
			this.sendKeys(txtPhysicianInstructions, physicianInstructions);
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
		if(typeOfMode.equals("Use Specific Days")){
		
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
			
		//	By radioUseByWeeks = By.xpath(String.format("((//div[@class='form-row']//input[@name='rdoMonthlyChoice'])[4])"));
			
			By radioUseByWeeks = By.xpath(String.format("((//div[@class='card'])[%d]//div[@class='form-row']//input[@name='rdoMonthlyChoice'])[2]",FrequencyNum));
			
			
			boolean IsSelected = wd.findElement(By.xpath(String.format("((//div[@class='card'])[%d]//div[@class='form-row']//input[@name='rdoMonthlyChoice'])[2]",FrequencyNum))).getAttribute("ng-reflect-value").equals("true");
			if(!IsSelected)
			{
				this.click(radioUseByWeeks,"Use By Weeks Radio Button");
			}
									
			
			By drpdwnNumber = By.xpath(String.format("(//select[@formcontrolname='weekOfTheMonth'])[%d]",howOftenTime));
			this.SelectDropDownByText(drpdwnNumber, DropdownNumber);
			
			By drpdwnDay = By.xpath(String.format("(//select[@formcontrolname='dayOfTheWeek'])[%d]",howOftenTime));
			this.SelectDropDownByText(drpdwnDay, DropdownDay);
			
			By txtEveryDay  = By.xpath(String.format("((//div[@class='card'])[%d]//label[text()='of every']/..//input[@id='happensEvery'])", FrequencyNum));
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
	//		By drpdwnScheduleOnYear = By.xpath(String.format("(//label[text()='of every']/..//input[@formcontrolname='happensEvery'])[%d]",newHowOftenNumber));
	//		this.sendKeys(drpdwnScheduleOnYear, scheduleOnYear);
			
			By txtEveryDay  = By.xpath(String.format("((//div[@class='card'])[%d]//label[text()='of every']/..//input[@id='happensEvery'])", FrequencyNum));
			this.sendKeys(txtEveryDay, scheduleOnYear);			
		
			
		}
	
	
	
	public void OnceAShiftFrequency(int frequencyNum , String frequency)
	{
		By drpdwnFrequency = By.xpath(String.format("(//label[text()='Frequency']/..//select[@id='typeOrderFrequencyId'])[%d]", frequencyNum));
		this.SelectDropDownByText(drpdwnFrequency, frequency);
	}
	
	public void TextTypeNoOfTimesAdayFrequency(String frequencyTexttype ,int frequencyNum , String frequency , int numberOfShifts , String timeInADay)
	{
		By drpdwnFrequency = By.xpath(String.format("(//label[text()='Frequency']/..//select[@id='typeOrderFrequencyId'])[%d]", frequencyNum));
	
		this.SelectDropDownByText(drpdwnFrequency, frequency); 
		if(frequencyTexttype.equals("text Box"))	{					
		for(int i=1;i<=numberOfShifts;i++)
		{			
			
		By textbxTimeInADayOnce = By.xpath(String.format("(((//div[@class='card'])[%d]//label[text()='Times']/..//div[@formarrayname='timeRanges'])/..//div//input[@placeholder='hh:mm ampm'])[%d]",frequencyNum,i));	
	
		this.SendKeysToElementClearFirst(textbxTimeInADayOnce, timeInADay);
		
		}
		}
		else
		{
		
	
		By chkbxUserPredefinedTimeRange = By.xpath((String.format("(//div[@class='card'])[%d]//label[text()='Times']/..//input[@ng-reflect-model='false']", frequencyNum)));
		this.click(chkbxUserPredefinedTimeRange, "User Predefined TimeRange Check Box");						
		for(int i=1;i<=numberOfShifts;i++)
		{
	
			By ckhbxTimeInADayOnce = By.xpath(String.format("(((//div[@class='card'])[%d]//label[text()='Times']/..//div[@formarrayname='timeRanges'])//select[@formcontrolname='settingId'])[%d]",frequencyNum,i));
	 
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
			this.testReport.logSuccess("clicking on Physician Portal app, below menu display : Physician Portal, Messages, Mediprocity");
			this.VerifyWebElementPresent(btnHeaderPhysicianPortal,"Physician Portal");
			this.VerifyWebElementPresent(btnHeaderMessages,"Messages");
			this.VerifyWebElementPresent(btnHeaderMediprocity,"Mediprocity");
			
		}
		
		public void VerifyPhysicianPortalDrropdown()
		{
			this.testReport.logSuccess("Clicking on Physician portal display below sub menus :Sign,Resident Orders,Recap,Verify,History & Physicial,Physician Progress Note Assessment,Physician Progress Note");
			this.click(btnPhysicianPortal,"Physician Portal Button");
			this.waitInSecs(2);
			this.VerifyWebElementPresent(spandrpdwnSign,"Sign");
			this.VerifyWebElementPresent(spandrpdwnResidentOrder,"Resident Order");
			this.VerifyWebElementPresent(spandrpdwnRecap,"Recap");
			this.VerifyWebElementPresent(spandrpdwnVerify,"Verify");
			this.VerifyWebElementPresent(spandrpdwnHistoryandPhysical,"History and Physical");
			this.VerifyWebElementPresent(spandrpdwnPhysicianProgressNoteAssessment,"Physician Progress Note Assessment");
			this.VerifyWebElementPresent(spandrpdwnPhysicianProgressNotes,"Physician Progress Notes");
			this.click(aResidentOrders,"Resident Orders"); 
			this.waitInSecs(2);
		}
		
		public void VerifyResidentPageHeaderHeading()
		{
			this.testReport.logSuccess(" Clicking on Resident Order submenu should display under below columns First Name,Last Name,Mr#,Mr2,Location");
					
			this.VerifyWebElementPresent(spanResidentFirstName,"Resident FirstName");
			this.VerifyWebElementPresent(spanResidentLastName,"Resident LastName");
			this.VerifyWebElementPresent(spanResidentMr,"Resident Mr#");
			this.VerifyWebElementPresent(spanResidentMr2,"Resident Mr2");
			this.VerifyWebElementPresent(spanResidentLocation,"Resident Location");
			
		}
		
		public void CounttheNoOfResidentInAPage()
		{
			List<WebElement> CountInAPage = wd.findElements(By.xpath("//datatable-scroller[@class='datatable-scroll ng-star-inserted']/datatable-row-wrapper//datatable-body-cell[3]//span"));
			List<String> ResidentCountNos = new ArrayList<>();
			
			for (WebElement match : CountInAPage) {
				ResidentCountNos.add(match.getText());
				String noOfResidents=match.getText();
				System.out.println(noOfResidents);
				int totalnoofResident = ResidentCountNos.size();
				System.out.println(totalnoofResident);
			}
				
			By nextSideClick = By.xpath("(//*[@class='datatable-pager ng-star-inserted']//a)[8]");
			By nextArrowClick = By.xpath("(//*[@class='datatable-pager ng-star-inserted']//a)[9]");
			this.VerifyWebElementPresent(nextSideClick, "Side Click");
			this.VerifyWebElementPresent(nextArrowClick, "Arrow Click");
			
			this.testReport.logSuccess("Clicked on Existing Resident Present in the Portal ");		
			for(int i=3;i<=7;i++)
			{
			By linkPageBottom = By.xpath(String.format("(//*[@class='datatable-pager ng-star-inserted']//a)[%d]",i));
			
			
				
			click(linkPageBottom,"Navigate Page");
					
			
			
		}
			
			By firstSideClick = By.xpath("(//*[@class='datatable-pager ng-star-inserted']//a)[1]");
			this.click(firstSideClick,"First Side Click");
		
		}
		
		public void VerifyButtonInResidentOrders()
		{
			this.testReport.logInfo("clicking on Orders >> Resident Orders display two buttons :i> Create an Order ii>Create from Sets");
			this.VerifyWebElementPresent(btnCreateOrder, "Create An Order");
			this.VerifyWebElementPresent(btnCreateSet, "Create From Set");
		}
		
		
		public void VerifytheFieldsDisplayDownToMessage()
		{
			this.testReport.logSuccess("Verify below fields display down to message to find/search the resident Enter Name or MR Number ,Select Station ,Select Statuses ,Apply Filter button ");
			this.VerifyWebElementPresent(txtEnterNameOrMrNumber, "Enter Name or MR Number");
			this.VerifyWebElementPresent(drpdwnSelectStations, "Select Station");
			this.VerifyWebElementPresent(drpdwnSelectStatus, "Select Statuses");
			this.VerifyWebElementPresent(btnApplyFilters, "Apply Filter button");
		}
		
		
		public void VerifyPreviousOrders()
		{
			List<WebElement> totalNoOfOrders = wd.findElements(By.xpath("//datatable-scroller[@class='datatable-scroll ng-star-inserted']/datatable-row-wrapper//datatable-body-cell[1]//span"));
		//	List<String> TotalNoOfResidentCount = new ArrayList<>();
			if(totalNoOfOrders.size()>0)
			{
				this.testReport.logSuccess("any previous orders display in the list for the resident");
	
			}
			else
			{
				this.testReport.logSuccess("No previous orders display in the list for the resident");
			}
			
		}
		
		
		public void FullOrderPageVerification()
		{
			this.testReport.logSuccess("Clicking on Create an Orders button, open Full Order Page with below fields Save button,Cancel button,Type List box,Add frequency Button");
			this.click(btnCreateOrder, "Create An Order");
			this.VerifyWebElementPresent(btnSaveOrder, "Save button");
			this.VerifyWebElementPresent(btnCancel, "Cancel button");
			this.VerifyWebElementPresent(txtOrderType, "Type List box");
			this.VerifyWebElementPresent(btnAddFrequency, "Add frequency Button");
		}
		
		public void SearchResidentWithApplyFilterButton(String enterName)
		{
			List<WebElement> CountInAPage = wd.findElements(By.xpath("//datatable-scroller[@class='datatable-scroll']//*[@class='datatable-row-wrapper']//div[@class='datatable-row-center datatable-row-group']"));
		    this.sendKeys(txtEnterNameOrMrNumber, enterName);
		    this.waitInSecs(1);
		    this.click(btnApplyFilters, "Apply Filter button");
		    this.waitInSecs(2);
		    List<WebElement> FilterCountInAPage = wd.findElements(By.xpath("//datatable-scroller[@class='datatable-scroll ng-star-inserted']/datatable-row-wrapper"));
		    
		    if(CountInAPage.size()>FilterCountInAPage.size() && FilterCountInAPage.size()==1)
		    {
		    	this.testReport.logSuccess("clicking on Apply Filter button, display the list of filtered residents in the Container");
		    }
		    
		    else
		    {
		    	this.testReport.logFailure("clicking on Apply Filter button, not display the list of filtered residents in the Container");
		    }
		}
		
		 public static boolean CheckAscendingOrder(List<String> Names)
	        {
	            String previous = "";
	            for (String match : Names) 
	            {
	                if (match.compareTo(previous) < 0)
	                {
	                    return false;
	                }
	                previous = match;
	            }
	            
	            return true;
	        }
	        public static boolean CheckDescendingOrder(List<String> Names)
	        {
	            String previous = "";
	            for (String match : Names)
	            {
	                if (match.compareTo(previous) > 0)
	                {
	                    return true;
	                }
	                previous = match;
	            }
	            return false;
	        }
		
		public void AssendingOrderUsingFirstName()
		{
			
				List<WebElement> CountInAPage = wd.findElements(By.xpath(("//datatable-scroller[@class='datatable-scroll ng-star-inserted']/datatable-row-wrapper//datatable-body-cell[1]//span")));
				List<String> CountInAPageOrder = new ArrayList<>();
			
				for (WebElement match : CountInAPage) {
					CountInAPageOrder.add(match.getText());
					String noOfResidents=match.getText();
					System.out.println(noOfResidents);
				}
			
			By Name = By.xpath("//span[contains(text(),'First Name')]")	;
			this.click(Name, "Name");
			Collections.sort(CountInAPageOrder);
			boolean sorted = CheckAscendingOrder(CountInAPageOrder);
			 if (sorted == true)
			 {
				 this.testReport.logSuccess("Sorted the Name in Ascending Order");
			 }
			 else {
				 this.testReport.logFailure(" Not Sorted the Name in Ascending Order"); 
			 }
	             
			 this.click(Name, "Name");
				
		
		}
		
		
		public void AssendingOrderUsingLastName()
		{
			
				List<WebElement> CountInAPage = wd.findElements(By.xpath(("//datatable-scroller[@class='datatable-scroll ng-star-inserted']/datatable-row-wrapper//datatable-body-cell[2]//span")));
				List<String> CountInAPageOrder = new ArrayList<>();
			
				for (WebElement match : CountInAPage) {
					CountInAPageOrder.add(match.getText());
					String noOfResidents=match.getText();
					System.out.println(noOfResidents);
				}
			
			By Name = By.xpath("//span[contains(text(),'Last Name')]")	;
			this.click(Name, "Name");
			Collections.sort(CountInAPageOrder);
			boolean sorted = CheckAscendingOrder(CountInAPageOrder);
			 if (sorted == true)
			 {
				 this.testReport.logSuccess("Sorted the Last Name in Ascending Order");
			 }
			 else {
				 this.testReport.logFailure(" Not Sorted the Last Name in Ascending Order"); 
			 }
	             
			 this.click(Name, "Name");
				
		}
		
		
		public void AssendingOrderUsingMr()
		{
			
				List<WebElement> CountInAPage = wd.findElements(By.xpath(("//datatable-scroller[@class='datatable-scroll ng-star-inserted']/datatable-row-wrapper//datatable-body-cell[3]//span")));
				List<String> CountInAPageOrder = new ArrayList<>();
			
				for (WebElement match : CountInAPage) {
					CountInAPageOrder.add(match.getText());
					String noOfResidents=match.getText();
					System.out.println(noOfResidents);
				}
			
			By Mr = By.xpath("//span[contains(text(),'Mr #')]")	;
			this.click(Mr, "Mr#");
			Collections.sort(CountInAPageOrder);
			boolean sorted = CheckAscendingOrder(CountInAPageOrder);
			 if (sorted == true)
			 {
				 this.testReport.logSuccess("Sorted the Mr# in Ascending Order");
			 }
			 else {
				 this.testReport.logFailure(" Not Sorted the Mr# in Ascending Order"); 
			 }
	             
			 this.click(Mr, "Mr#");
				
		}
		
		
		public void ResidentFullOrderDetailsWithoutMedication(String type , String libraryText , String createdType)
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
			this.VerifyWebElementPresent(labelPickFromLibrary,"Label Pick From Library");	
			this.VerifyWebElementPresent(linkCreateLibraryItem,"Create Library Item Link");	
			if(createdType == "DropDown")
			{
				this.SelectDropDownByText(txtPickFromLibrary, libraryText);
				this.waitInSecs(2);
				this.AssettextEqual(txtOrderDescription, txtPickFromLibrary);
				
			}
			else
			{
			this.click(linkCreateLibraryItem,"Create Library Item Link");
			this.VerifyWebElementPresent(linkCreate,"Create Link");	
			
			this.VerifyWebElementPresent(linkCancel,"Cancel");	
			this.waitInSecs(2);
			this.sendKeys(txtPickLibrary, libraryText);
			this.waitInSecs(2);
			this.click(linkCreate,"Create Link");
			this.waitInSecs(2);
			this.AssettextEqual(txtOrderDescription, txtPickFromLibrary);
			}
			
			
		}
		
		public void ResidentFullOrderDetails(String type ,String nullDiagonisis ,String SearchDiogonosisTxt,String medicarePriority , String diogonosisName
				,String physicianType,String ReceivedByType , String ReceivedOrderType,	String routes,String WrittenDate,String NoOfRefillis,String WhenToFill)
		{
			this.SelectDropDownByText(srchDiogonosis, nullDiagonisis);
			this.waitInSecs(2);
			this.VerifyWebElementPresent(labelDiagnosisRequired, "Diagonosis Required");
			this.click(linkAddDiagonosis,"Add Diagonosis Link");
			this.waitInSecs(2);
			this.VerifyWebElementPresent(labelICD10Database, "ICD10 Database");
			this.waitUntilElementIsVisible(txtSearchDiogonosis);
			this.sendKeys(txtSearchDiogonosis, SearchDiogonosisTxt);
			this.waitInSecs(2);
			this.click(btnSearchDiogonosis,"Search Diogonosis Button");
			this.waitInSecs(2);
			
			//By diogonosisOption = By.xpath((String.format("//div[@class='datatable-body-cell-label']/span[text()='%d']", diogonosisName)));
			this.click(diogonosisOption,"Diogonosis Option");
			this.waitInSecs(2);
			this.VerifyWebElementPresent(radioMedication,"Medication radio Button");
			this.VerifyWebElementPresent(radioTreatment,"Treatment radio Button");
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
			this.VerifyWebElementPresent(txtMedicarePriority, "Medicare Priority");
			this.sendKeys(txtMedicarePriority, medicarePriority);
			this.waitInSecs(2);
			this.VerifyWebElementPresent(chkbxAdmitting,"Admitting Check Box");
			this.click(chkbxAdmitting,"Admitting Check Box");
			this.waitInSecs(2);
			this.VerifyWebElementPresent(chkbxSendToMDS,"Send To MDS Check Box");
			this.click(chkbxSendToMDS,"Send To MDS Check Box");
			this.waitInSecs(2);
			this.VerifyWebElementPresent(chkbxBillingAdmitDiagnosis,"Billing Admit Diagnosis Check Box");
			this.click(chkbxBillingAdmitDiagnosis,"Billing Admit Diagnosis Check Box");
			this.waitInSecs(2);
			this.VerifyWebElementPresent(btnDiogonosisCreate,"Create Diogonosis Button");
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
		
		public void CancelOrder()
		{
			this.waitInSecs(2);
			this.click(btnCancel, "Cancel");
		}
		
		public void OrderFrequencyType(int num,String frequencyType)
		{
			By drpdwnFrequencyType = By.xpath(String.format("(//select[@id='routineTypeId'])[%d]", num));
			this.VerifyWebElementPresent(drpdwnFrequencyType, "Frequency Type");
			this.SelectDropDownByText(drpdwnFrequencyType, frequencyType);
		}
		
		public void StartDate(int num,String startDate , String startDateTime)
		{
			By txtStartDate = By.xpath(String.format("(//label[text()='Start Date']/..//input[@placeholder='mm/dd/yyyy' and @class='form-control'])[%d]",num));
			this.VerifyWebElementPresent(txtStartDate, "Start Date");
			By iconCalender = By.xpath(String.format("((//label[text()='Start Date']/..//button[@class='btn btn-outline-secondary']/i))[%d]",num));
			this.click(iconCalender, "Calender icon");
			By HighlightDate = By.xpath(String.format("((//div[@class='card'])[%d]//label[text()='Start Date']/..//ngb-datepicker-month-view[@class='d-block']//div[@ng-reflect-selected='true'])",num));
			this.click(HighlightDate, "Today's Date");
		//	this.SendKeysToElementClearFirst(txtStartDate, startDate);
			By txtStartDateTime = By.xpath(String.format("(//label[text()='Start Date']/..//input[@placeholder='hh:mm ampm' ])[%d]",num));
			this.VerifyWebElementPresent(txtStartDateTime, "Start Date Time");
			this.SendKeysToElementClearFirst(txtStartDateTime, startDateTime);
		}

		
		public void OrderEndType(int num, int byDateno, int afterNoOfAdminstrationsNo , String endDateType ,String endDate , String ByDate ,String byDateTime, String afterNumberOfAdminstrations)
		{
			if(endDateType.equals("No End")) 
			{
			By drpdwnEndDate = By.xpath(String.format("(//label[text()='End']/..//select[@id='actions'])[%d]", num));
			this.VerifyWebElementPresent(drpdwnEndDate, "No End Date");
			this.SelectDropDownByText(drpdwnEndDate, endDate);
			}
			else if(endDateType.equals("By Date"))
			{
				By drpdwnEndDate = By.xpath(String.format("(//label[text()='End']/..//select[@id='actions'])[%d]", num));
				this.VerifyWebElementPresent(drpdwnEndDate, "By Date");
				this.SelectDropDownByText(drpdwnEndDate, endDate);
				By txtByDate = By.xpath(String.format("(//label[text()='End']/..//input[@placeholder='mm/dd/yyyy' and @class='form-control'])[%d]",byDateno));
				this.VerifyWebElementPresent(txtByDate, "By Date");
				By iconCalender = By.xpath(String.format("((//label[text()='End']/..//button[@class='btn btn-outline-secondary']/i))[%d]",num));
				this.click(iconCalender, "Calender icon");
				By HighlightDate = By.xpath(String.format("((//label[text()='End']/..//ngb-datepicker-month-view[@class='d-block']//div[@class='btn-light ng-star-inserted'])[1])[%d]",num));
				this.click(HighlightDate, "Today's Date");
				
			//	this.SendKeysToElementClearFirst(txtByDate, ByDate);
				By txtByDateTime = By.xpath(String.format("(//label[text()='End']/..//input[@placeholder='hh:mm ampm' ])[%d]",byDateno));
				this.VerifyWebElementPresent(txtByDateTime, "By Date Time");
				this.SendKeysToElementClearFirst(txtByDateTime, byDateTime);
			}
			else
			{
				By drpdwnEndDate = By.xpath(String.format("(//label[text()='End']/..//select[@id='actions'])[%d]", num));
				this.VerifyWebElementPresent(drpdwnEndDate, "After Number Of Administrations");
				this.SelectDropDownByText(drpdwnEndDate, endDate);
				By txtAfterNumberOfAdministrations = By.xpath(String.format("(//label[text()='End']/..//input[@formcontrolname='endAfterNumberOfAdmin'])[%d]", afterNoOfAdminstrationsNo));
				this.VerifyWebElementPresent(txtAfterNumberOfAdministrations, "After Number Of Administrations");
				this.sendKeys(txtAfterNumberOfAdministrations, afterNumberOfAdminstrations);
			}
		}
		
		
		public void RequireActionRelatedLabel(int num,String frequencyType ,String requiredActions,String othersRequiredActions ,String requiredActionsPostDropdown,String othersRequiredActionsPostDropdown, String administeredBy,String maxDoesHours,
				String followUpAfterMinutes,String slidingScaleMin,String slidingScaleMax,String slidingScaleUnits)
		{
			By drpdwnRequiredActions = By.xpath(String.format("(//label[text()='Require Action(s)']/..//select[@id='actions'])[%d]", num));
			this.SelectDropDownByText(drpdwnRequiredActions, requiredActions);
			if(requiredActions.equals("Other"))
			{
				By txtOthersRequiredActions = By.xpath(String.format("(//select[@id='actions']/..//input[@formcontrolname='description'])[%d]", num));
				this.sendKeys(txtOthersRequiredActions, othersRequiredActions);
			}
			By drpdwnRequiredActionsPostDropdown = By.xpath(String.format("(//label[text()='Require Action(s) Post Administration']/..//select[@id='actionsPost'])[%d]", num));
			this.SelectDropDownByText(drpdwnRequiredActionsPostDropdown, requiredActionsPostDropdown);
			if(requiredActionsPostDropdown.equals("Other"))
			{
				By txtOthersRequiredActionsPostDropdown = By.xpath(String.format("(//select[@id='actionsPost']/..//input[@formcontrolname='description'])[%d]", num));
				this.sendKeys(txtOthersRequiredActionsPostDropdown, othersRequiredActionsPostDropdown);
			}
			By drpdwnAdministeredBy = By.xpath(String.format("(//label[text()='Administered By']/..//select[@id='settingOrderAdministratorId'])[%d]", num));
			this.SelectDropDownByText(drpdwnAdministeredBy, administeredBy);
			if(!frequencyType.equals("Routine"))
			{			
				By txtMaxDoesHours = By.xpath(String.format("(//label[text()='Max Doses Per 24 Hours']/..//input[@id='prnMaxDailyAdministration'])[%d]",num));
				this.sendKeys(txtMaxDoesHours,maxDoesHours);
			}
			
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
			this.SendKeysToElementClearFirst(txtFollowUpAfterMinutes, followUpAfterMinutes);
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
		
		public void OrderDisplayPageColourVerification()
		{
			List<WebElement> bluecolourNeedSinging = wd.findElements(By.xpath("//strong[text()='Needs Signing']"));
			int needSinging = bluecolourNeedSinging.size();
			System.out.println("Total No of Need Singing : " +needSinging);
			
			List<WebElement> grayColourNeedsVerifications = wd.findElements(By.xpath("//strong[text()='Needs Verification']"));
			int needsVerifications = grayColourNeedsVerifications.size();
			System.out.println("Total No of Needs Verifications : " +needsVerifications);
			
			List<WebElement> greencolourActive = wd.findElements(By.xpath("//strong[text()='Active']"));
			int Active = greencolourActive.size();
			System.out.println("Total No of Active : " +Active);
		}
		
		public void OrderDisplayPageColoumnsVerification()
		{
			this.VerifyWebElementPresent(spanOrderSummaryDescription, "Summary Description");
			this.VerifyWebElementPresent(spanOrderSummaryType, "SummaryType");
			this.VerifyWebElementPresent(spanOrderSummaryPhysician, "SummaryPhysician");
			this.VerifyWebElementPresent(spanOrderSummaryFrequencies, "Order Summary Frequencies");
			this.VerifyWebElementPresent(spanOrderSummaryStatus, "Order Summary Status");
			
		}
		
		public void BottomPaneOfContainer()
		{
			this.VerifyWebElementPresent(defaultSection, "Default Section 25");
			List<WebElement> pagesNo = wd.findElements(By.xpath("//li[@class='pages']"));
			int PagesNoInOrderDisplay  = pagesNo.size();
			System.out.println("Total No of Normal page Containers : " + PagesNoInOrderDisplay);
		}
		
		public void HourWiseFrequency(int frequencyNum , String frequency,String startingTime)
		{
			By drpdwnFrequency = By.xpath(String.format("(//label[text()='Frequency']/..//select[@id='typeOrderFrequencyId'])[%d]", frequencyNum));			
			this.SelectDropDownByText(drpdwnFrequency, frequency); 
			
			By startingAt = By.xpath(String.format("((//div[@class='card'])[%d]//label[text()='Times']/..//input[@placeholder='hh:mm ampm'])",frequencyNum));
		    this.SendKeysToElementClearFirst(startingAt, startingTime);
		//	this.SendKeysToElementClearFirst(startingAt, "12:00 am");
			this.waitInSecs(2);
			//	By doseTimings = By.xpath("//select[contains(@class,'form-control ng-pristine ng-valid ng-touched')]");
			
			
			By doseTimings = By.xpath(String.format("(//div[@class='card'])[%d]//label[text()='with the last dose at ']/../..//select[contains(@class,'form-control')]",frequencyNum));
			this.click(doseTimings, "Dose Timings ");
			
			List<WebElement> NoOfTimings = wd.findElements(By.xpath(String.format("(//div[@class='card'])[%d]//label[text()='with the last dose at ']/../..//select[contains(@class,'form-control')]/option",frequencyNum)));
			int frequencyNoOfTimings = NoOfTimings.size();
			System.out.println("Total No of Timings in a Frequency : " + frequencyNoOfTimings);
									
	//		this.SelectDropDownByText(doseTimings, "09:00 am");
		
			this.SelectDropDownByIndex(doseTimings, 1);
			
			
		
		}
		
		public void BedTimeFrequency(String frequencyTexttype ,int frequencyNum , String frequency,String timeInADay)
		{
			
			By drpdwnFrequency = By.xpath(String.format("(//label[text()='Frequency']/..//select[@id='typeOrderFrequencyId'])[%d]", frequencyNum));			
			this.SelectDropDownByText(drpdwnFrequency, frequency); 
			
			if(frequencyTexttype.equals("text Box"))
			{
				By chkbxUserPredefinedTimeRange = By.xpath((String.format("(//div[@class='card'])[%d]//label[text()='Times']/..//input[@ng-reflect-model='true']", frequencyNum)));
				this.click(chkbxUserPredefinedTimeRange, "User Predefined TimeRange Check Box");	
				
				By textbxTimeInADayOnce = By.xpath(String.format("(((//div[@class='card'])[%d]//label[text()='Times']/..//div[@formarrayname='timeRanges'])/..//div//input[@placeholder='hh:mm ampm'])",frequencyNum));	
				
				this.SendKeysToElementClearFirst(textbxTimeInADayOnce, timeInADay);
			}
			else
			{				
				By ckhbxTimeInADayOnce = By.xpath(String.format("(((//div[@class='card'])[%d]//label[text()='Times']/..//div[@formarrayname='timeRanges'])//select[@formcontrolname='settingId'])",frequencyNum));
				 
				this.SelectDropDownByText(ckhbxTimeInADayOnce, timeInADay);
				
				
			}
			
		}
		
		public void MealWiseFrequency(int frequencyNum , String frequency,String timeInADay)
		{
			By drpdwnFrequency = By.xpath(String.format("(//label[text()='Frequency']/..//select[@id='typeOrderFrequencyId'])[%d]", frequencyNum));			
			this.SelectDropDownByText(drpdwnFrequency, frequency); 
			
			if(frequency.equals("Before Meals + Bed Time") || frequency.equals("After Meals + Bed Time"))
			{
			for(int i=1;i<=4;i++)
			{
				By ckhbxTimeInADayOnce = By.xpath(String.format("(((//div[@class='card'])[%d]//label[text()='Times']/..//div[@formarrayname='timeRanges'])//select[@formcontrolname='settingId'])[%d]",frequencyNum,i));
				 
				this.SelectDropDownByText(ckhbxTimeInADayOnce, timeInADay);
			}
			}
			else
			{
				for(int i=1;i<=3;i++)
				{
					By ckhbxTimeInADayOnce = By.xpath(String.format("(((//div[@class='card'])[%d]//label[text()='Times']/..//div[@formarrayname='timeRanges'])//select[@formcontrolname='settingId'])[%d]",frequencyNum,i));
					 
					this.SelectDropDownByText(ckhbxTimeInADayOnce, timeInADay);
				}
			}
		}
		
		
		
		
		}



	
	
		
		
	
		






































