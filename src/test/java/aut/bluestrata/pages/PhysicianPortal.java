package aut.bluestrata.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.testreport.IReporter;

import dweb.aut.pages.templates.PageTemplate;

public class PhysicianPortal extends PageTemplate {

	public PhysicianPortal(WebDriver webDriver, IReporter testReport) {
		super(webDriver, testReport);
	}
	//Create Physician Portal 
	public By btnPhysicianPortal = By.xpath("//button[text()='Physician Portal']");
	public By aResidentOrders = By.xpath("//a[text()='Resident Orders']");
	public By resident = By.xpath("//datatable-scroller[@class='datatable-scroll ng-star-inserted']/datatable-row-wrapper[1]//datatable-body-cell[3]");
	
	//Create An order 
	public By btnCreateOrder = By.xpath("//button[text()='Create an Order']");	
	public By txtOrderType= By.id("settingOrderTypeId");
	public By linkCreateLibraryItem = By.xpath("//label[contains(.,'Pick From Library')]/../div/button");
	public By txtPickLibrary = By.id("libraryCreate");
	public By linkCreate = By.xpath("//label[contains(text(),'Pick From Library')]/..//button[1]");
	public By txtOrderDescription = By.id("description");
	public By linkAddDiagonosis = By.xpath("//label[text()='Diagnosis']/..//button[@class='btn btn-link']/i");
	public By txtSearchDiogonosis = By.id("query");
	public By txtSearchMedicineName = By.id("query");
	public By btnSearchDiogonosis = By.xpath("//div[@class='form-group row']//button[@type='submit']");
	public By diogonosisOption = By.xpath("//datatable-body[@class='datatable-body']//datatable-row-wrapper[1]");
	public By radioTreatment = By.xpath("//div[@class='col ng-star-inserted']//input[@value='TX']");
	public By txtMedicarePriority = By.xpath("//label[text()='Medicare B Priority']/..//input[@id='query']");
	public By chkbxAdmitting = By.xpath("(//div[@class='col ng-star-inserted']//div[@class='form-check']/label)[4]");
	public By chkbxSendToMDS = By.xpath("(//div[@class='col ng-star-inserted']//div[@class='form-check']/label)[5]");
	public By chkbxBillingAdmitDiagnosis = By.xpath("(//div[@class='col ng-star-inserted']//div[@class='form-check']/label)[6]");
	public By btnDiogonosisCreate = By.xpath("//div[@class='col ng-star-inserted']//button[@type='submit']");
	public By linkDuplicateDiogonosis = By.xpath("//div[text()='Duplicate Diagnosis']");
	public By btnClose = By.xpath("//button[@class='close']/span");
	//public By srchDiogonosis = By.xpath("//label[text()='Diagnosis']/..//select[@id='diagnosisCode']");
	public By srchDiogonosis = By.id("diagnosisCode");
	public By drpdwnPhysician = By.id("physicianId");
	public By drpdwnReceivedBy = By.id("receivedById");
	public By drpdwnReceivedOrder = By.id("typeReceivedOrder");
	public By chkbxIsAdmitting = By.id("isAdmitting");
	
	public By linkSearchMedications = By.xpath("(//label[text()='Medication']/..//button[@class='btn btn-link'])[1]");
	public By txtMedicationName = By.xpath("//input[@id='query']");
	
	
	//Create OrderFrequency
/*    public By drpdwnFrequencyType = By.id("routineTypeId");
	public By drpdwnEndDate = By.xpath("//label[text()='End']/..//select[@id='actions']");
	public By drpdwnRequiredActions = By.xpath("//label[text()='Require Action(s)']/..//select[@id='actions']");
	public By drpdwnRequiredActionsPostDropdown = By.xpath("//label[text()='Require Action(s) Post Administration']/..//select[@id='actionsPost']");
	public By drpdwnAdministeredBy = By.xpath("//label[text()='Administered By']/..//select[@id='settingOrderAdministratorId']");
	public By chkbxIsSelfAdministered = By.xpath("//input[@id='selfAdministered']");
	public By chkbxselfAdministeredRequiresSupervision = By.xpath("//input[@id='selfAdministeredRequiresSupervision']");*/
	public By chkbxRequiresFollowUp =By.xpath("//input[@id='requiresFollowUp']");
	/*public By txtMaxDoesHours = By.xpath("//label[text()='Max Doses Per 24 Hours']/..//input[@id='prnMaxDailyAdministration']");
	public By txtFollowUpAfterMinutes = By.id("followUpAfterMinutes");
	public By drpdwnFrequency = By.xpath("//label[text()='Frequency']/..//select[@id='typeOrderFrequencyId']");
	public By drpdwnHowOften = By.xpath("//label[text()='How often']/..//select[@id='patientOrderScheduleType']");
	public By txtEveryDay = By.xpath("//label[text()='Every']/..//input[@id='happensEvery']");
	public By txtPhysicianInstructions = By.xpath("//label[text()='Physician Instructions']/..//textarea[@id='instructions']");
	public By txtAdditionalInstruction = By.xpath("//label[text()='Additional Instruction']/..//textarea[@id='additionalNotes']");*/
	public By btnAddFrequency = By.xpath("//button[text()='Add Frequency']");
	public By btnSaveOrder = By.xpath("//button[text()='Save']");          
	
	
	public void ClickOnPhysicianPortal()
	{
		/*this.click(By.xpath(String.format(this.getLocator("button"), "Physician Portal")));
		this.click(By.xpath(String.format(this.getLocator("a"), "Resident Orders")));*/
		this.testReport.logSuccess("Clicked on Physician Portal Button ");
		this.click(btnPhysicianPortal);
		this.waitInSecs(2);
		this.testReport.logSuccess("Clicked on Resident Orders Links ");
		this.click(aResidentOrders); 
		this.waitInSecs(2);
	}
	
	public void ClickOnExistingResident(String residentMR)
	{
		//By Resident = By.xpath((String.format("//div[@class='datatable-row-center datatable-row-group ng-star-inserted']//span[text()='{0}']", residentMR)));
		this.testReport.logSuccess("Clicked on Existing Resident Present in the Portal ");
		this.click(resident);
		
	}

	public void CreateAnOrderWithOrderDetails(String type , String libraryText , String SearchDiogonosisTxt , String medicarePriority , String diogonosisName ,String physicianType,String ReceivedByType , String ReceivedOrderType)
	{
			
		if(this.isElementPresent(btnCreateOrder))
		{
		this.testReport.logSuccess("Order Created ");
		this.click(btnCreateOrder);
		}
		this.waitUntilElementIsVisible(txtOrderType);
		this.SelectDropDownByText(txtOrderType, type);
		if(type.equals("Medication") && type.equals("Treatment With Medication"))
		{
			this.click(linkSearchMedications);
			this.sendKeysAsAction(txtSearchMedicineName,"");
			this.click(btnSearchDiogonosis);
		}
		
		this.click(linkCreateLibraryItem);
		this.sendKeysAsAction(txtPickLibrary, libraryText);
		this.click(linkCreate);
		//this.AssettextEqual(txtOrderDescription, txtPickLibrary);
		this.click(linkAddDiagonosis);
		this.waitUntilElementIsVisible(txtSearchDiogonosis);
		this.sendKeysAsAction(txtSearchDiogonosis, SearchDiogonosisTxt);
		this.click(btnSearchDiogonosis);
		
		//By diogonosisOption = By.xpath((String.format("//div[@class='datatable-body-cell-label']/span[text()='{0}']", diogonosisName)));
		this.click(diogonosisOption);
		this.click(radioTreatment);	
		this.sendKeysAsAction(txtMedicarePriority, medicarePriority);
		this.click(chkbxAdmitting);
		this.click(chkbxSendToMDS);
		this.click(chkbxBillingAdmitDiagnosis);
		this.click(btnDiogonosisCreate);
		if(this.isElementPresent(linkDuplicateDiogonosis))
		{
			this.click(btnClose);
			this.SelectDropDownByText(srchDiogonosis, diogonosisName);
		}		
		this.SelectDropDownByText(drpdwnPhysician, physicianType);
		this.SelectDropDownByText(drpdwnReceivedBy, ReceivedByType);
		this.SelectDropDownByText(drpdwnReceivedOrder, ReceivedOrderType);
		this.click(chkbxIsAdmitting);
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
			this.sendKeysAsAction(txtMaxDoesHours, "5");
		}		
		this.sendKeysAsAction(txtFollowUpAfterMinutes, followUpAfterMinutes);
		this.SelectDropDownByText(drpdwnFrequency, frequency);
		this.SelectDropDownByText(drpdwnHowOften, howOften);
		this.sendKeysAsAction(txtEveryDay, everyDay);
		this.sendKeysAsAction(txtPhysicianInstructions, physicianInstructions);
		this.sendKeysAsAction(txtAdditionalInstruction, additionalInstruction);
		
	}*/
	
	public void SaveOrderFrequency()
	{
		this.testReport.logInfo("Add the Order Successfully ");
		this.click(btnSaveOrder);
	}
	public void AddOrderFrequency()
	{
		this.testReport.logInfo("Adding the Order Frequency ");
		this.click(btnAddFrequency);
	}
	
	public void CreateOrderFrequency(int num,String frequencyType,String endDate,String requiredActions,String requiredActionsPostDropdown,String administeredBy,String maxDoesHours,String followUpAfterMinutes,
			String frequency,String howOften, String everyDay , String physicianInstructions, String additionalInstruction)
	{
		int newNum = (num-1);
		By drpdwnFrequencyType = By.xpath(String.format("(//select[@id='routineTypeId'])[%d]", num));
		this.SelectDropDownByText(drpdwnFrequencyType, frequencyType);
		By drpdwnEndDate = By.xpath(String.format("(//label[text()='End']/..//select[@id='actions'])[%d]", num));
		this.SelectDropDownByText(drpdwnEndDate, endDate);
		By drpdwnRequiredActions = By.xpath(String.format("(//label[text()='Require Action(s)']/..//select[@id='actions'])[%d]", num));
		this.SelectDropDownByText(drpdwnRequiredActions, requiredActions);
		By drpdwnRequiredActionsPostDropdown = By.xpath(String.format("(//label[text()='Require Action(s) Post Administration']/..//select[@id='actionsPost'])[%d]", num));
		this.SelectDropDownByText(drpdwnRequiredActionsPostDropdown, requiredActionsPostDropdown);
		By drpdwnAdministeredBy = By.xpath(String.format("(//label[text()='Administered By']/..//select[@id='settingOrderAdministratorId'])[%d]", num));
		this.SelectDropDownByText(drpdwnAdministeredBy, administeredBy);
		By chkbxIsSelfAdministered = By.xpath(String.format("(//input[@id='selfAdministered'])[%d]",num));
		this.click(chkbxIsSelfAdministered);
		By chkbxselfAdministeredRequiresSupervision = By.xpath(String.format("(//input[@id='selfAdministeredRequiresSupervision'])[%d]", num));
		this.click(chkbxselfAdministeredRequiresSupervision);
		if(frequencyType.equals("Routine"))
		{			
			this.click(chkbxRequiresFollowUp);
		}
		else 
		{	
			By txtMaxDoesHours =By.xpath(String.format("(//label[text()='Max Doses Per 24 Hours']/..//input[@id='prnMaxDailyAdministration'])[%d]",newNum));
			this.sendKeysAsAction(txtMaxDoesHours, maxDoesHours);
		}	
		By txtFollowUpAfterMinutes = By.xpath(String.format("(//input[@id='followUpAfterMinutes'])[%d]", num));
		this.sendKeysAsAction(txtFollowUpAfterMinutes, followUpAfterMinutes);
		if(frequencyType.equals("Routine"))
		{		
		By drpdwnFrequency = By.xpath(String.format("(//label[text()='Frequency']/..//select[@id='typeOrderFrequencyId'])[%d]", num));
		this.SelectDropDownByText(drpdwnFrequency, frequency);
		By drpdwnHowOften = By.xpath(String.format("(//label[text()='How often']/..//select[@id='patientOrderScheduleType'])[%d]", num));
		this.SelectDropDownByText(drpdwnHowOften, howOften);
		By txtEveryDay  = By.xpath(String.format("(//label[text()='Every']/..//input[@id='happensEvery'])[%d]", num));
		this.sendKeysAsAction(txtEveryDay, everyDay);
		}
		By txtPhysicianInstructions  = By.xpath(String.format("(//label[text()='Physician Instructions']/..//textarea[@id='instructions'])[%d]", num));
		this.sendKeysAsAction(txtPhysicianInstructions, physicianInstructions);
		By txtAdditionalInstruction = By.xpath(String.format("(//label[text()='Additional Instruction']/..//textarea[@id='additionalNotes'])[%d]", num));
		this.sendKeysAsAction(txtAdditionalInstruction, additionalInstruction);
	}
}



































