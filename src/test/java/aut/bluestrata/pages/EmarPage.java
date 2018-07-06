package aut.bluestrata.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.lang.reflect.Array;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import org.apache.tools.ant.types.resources.comparators.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.testreport.IReporter;

import dweb.aut.pages.templates.PageTemplate;

public class EmarPage extends LoginPage {

	public EmarPage(WebDriver webDriver, IReporter testReport) {
		super(webDriver, testReport);

	}



	public By btnTester = By.xpath("//a[@id='userDropDown']");
	public By btnlogout = By.xpath("//a[@id='userDropDown']/..//div/a[text()='Logout']");
	public By btnChangePassword = By.xpath("//a[@id='userDropDown']/..//div/a[text()='Change Password']");
	public By btnLock = By.xpath("//a[@id='userDropDown']/..//div/a[text()='Lock']");	
	public By labelChangePassword = By.xpath("//div[contains(text(),'Change Password')]");
	public By labelUserName = By.xpath("//label[contains(text(),'User Name')]");
	public By labelCurrentPassword = By.xpath("//label[contains(text(),'Current Password')]");
	public By labelNewPassword = By.xpath("//label[contains(text(),'New Password')]");
	public By labelConfirmPassword = By.xpath("//label[contains(text(),'Confirm Password')]");
	public By btnHelp = By.xpath("//a[@id='helpDropDown']");
	public By btnHelpSite = By.xpath("//a[@id='helpDropDown']/..//div/a[text()='Help Site']");
	public By btnAbout = By.xpath("//a[@id='helpDropDown']/..//div/a[text()='About']");
	public By blueStrataLogo = By.xpath("//img[@alt='BlueStrata EHR logo']");
	public By btnMenu = By.xpath("//div[contains(@class,'navbar-brand')]//button");
	public By arrowBtnEmarPage = By.xpath("//div[@role='main']//i");
	public By selectFilter = By.xpath("//div[@role='main']//select");
	public By selectAcessTypes = By.xpath("//div[@role='main']//button[@ng-reflect-klass='dropdown-toggle']");
	public By findSelectAcess = By.xpath("//ul//input[@placeholder='Find']");
	public By btnManageInventory = By.xpath("//div[@role='main']//button[text()='Manage Inventory']");
	public By btnReports = By.xpath("//div[@role='main']//button[text()='Reports']");
	public By btnMessage = By.xpath("//li[contains(@class,'item')]//i/span");
	public By btnHome = By.xpath("//li/a[text()='Home']");
	public By btnDashboard = By.xpath("//li/a[text()='Dashboard']");
	public By labelLastMedication = By.xpath("//div[contains(@class,'dashboard')]/div[contains(text(),'Late Medications Last 24 Hours')]");
	public By labelLastMedicationName = By.xpath("//div[contains(text(),'Late Medications Last 24 Hours')]/..//span[contains(text(),'Name')]");
	public By labelLastMedicationDescription = By.xpath("//div[contains(text(),'Late Medications Last 24 Hours')]/..//span[contains(text(),'Description')]");
	public By labelLastMedicationDue = By.xpath("//div[contains(text(),'Late Medications Last 24 Hours')]/..//span[contains(text(),'Due')]");
	public By labelLastMedicationType = By.xpath("//div[contains(text(),'Late Medications Last 24 Hours')]/..//span[contains(text(),'Type')]");
	public By labelFollowups = By.xpath("//div[contains(@class,'dashboard')]/div[contains(text(),'Follow-ups')]");
	public By labelFollowupsName = By.xpath("//div[contains(text(),'Follow-ups')]/..//span[contains(text(),'Name')]");
	public By labelFollowupsDescription = By.xpath("//div[contains(text(),'Follow-ups')]/..//span[contains(text(),'Description')]");
	public By labelFollowupsDue = By.xpath("//div[contains(text(),'Follow-ups')]/..//span[contains(text(),'Due')]");
	public By labelFollowupsType = By.xpath("//div[contains(text(),'Follow-ups')]/..//span[contains(text(),'Type')]");
	public By labelOrders = By.xpath("//div[contains(@class,'dashboard')]/div[contains(text(),'Orders')]");
	public By labelADTChanges = By.xpath("//div[contains(@class,'dashboard')]/div[contains(text(),'ADT Changes')]");
	public By txtMoveInLast = By.xpath("//div[contains(@class,'dashboard')]/div[contains(text(),'ADT Changes')]/..//input[contains(@class,'form-control')]");
	public By btnOrdersBackButton = By.xpath("//div[contains(@class,'dashboard')]/div[contains(text(),'Orders')]/..//button");
	public By btnAdtChangesBackButton = By.xpath("//div[contains(@class,'dashboard')]/div[contains(text(),'ADT Changes')]/..//button");

	public By btnCreateOrder = By.xpath("//button[text()='Create an Order']");
	public By btnCreateSet = By.xpath("//button[text()='Create From Set']");
	public By txtResidentRequired = By.xpath("//*[text()='Resident Required']");

	public By loginPageText = By.xpath("//*[contains(text(),'AUTHORIZED USERS')]");
	public By btnUnlock = By.xpath("//button[contains(text(),'Unlock')]");
	public By txtPassword = By.xpath("//input[@placeholder='Password']");

	public By leftArrow = By.xpath("//div[contains(@class,'order')]//i[contains(@class,'left')]");
	public By rightArrow = By.xpath("//div[contains(@class,'order')]//i[contains(@class,'right')]");
	public By residentImage = By.xpath("//div[contains(@class,'profile')]//img");
	public By residentImageTop = By.xpath("(//div[contains(@class,'border-left')]//img)");
	public By btnViewAllorders = By.xpath("//a[text()='View All Orders']");

	public By btnAdministerRoutine = By.xpath("//div[@class='card-body']//a[@id='current']");
	public By btnAdministerPRN = By.xpath("//div[@class='card-body']//a[@id='prn']");
	public By btnAdministerFollowup = By.xpath("//div[@class='card-body']//a[@id='followup']");
	public By btnAdministerBehavior = By.xpath("//div[@class='card-body']//a[@id='behavior']");
	public By btnAdminister = By.xpath("(//div[contains(@class,'card-header')])//button[text()='Administer']");
	public By btnCurrentTab = By.xpath("//a[@id='tab-main']");
	public By txtPreAdministrationRequirements = By.xpath("//div[contains(@class,'order')]//h4[text()='Pre Administration Requirements']");
	public By headerAdministrations = By.xpath("//div[contains(text(),'Administrations')]");
	public By txtMedicationMonograph = By.xpath("//*[contains(text(),'Medication Monograph')]");
	public By btnAdministrationsSave = By.xpath("//div[contains(text(),'Administrations')]/..//button[text()='Save']");
	public By typeAdministrationsNotes = By.xpath("//div[contains(text(),'Administrations')]/..//input[@placeholder='Notes']");
	public By selectAdministrationsCode = By.xpath("//div[contains(text(),'Administrations')]/..//select[@formcontrolname='administered']");
	public By btnNonMedIntervention = By.xpath("//div[contains(text(),'Administrations')]/..//button[contains(text(),'Select interventions')]");
	public By inputAdministrationsAmount = By.xpath("//div[contains(text(),'Administrations')]/..//input[@formcontrolname='amount']");
	public By labelDescriptionDiagonosis = By.xpath("//div[contains(@class,'card')]//h5[text()='Diagnosis']");
	public By labelLatestAdministrations = By.xpath("//div[contains(@class,'card')]//h5[text()='Latest Administrations']");
	
	
	public By labelLatestAdministrationsBy = By.xpath("//h5[text()='Latest Administrations']/..//*[text()='By']");
	public By labelLatestAdministrationsWhen = By.xpath("//h5[text()='Latest Administrations']/..//*[text()='When']");
	public By labelLatestAdministrationsReason = By.xpath("//h5[text()='Latest Administrations']/..//*[text()='Reason']");
	public By labelPostAdministrationRequirements = By.xpath("//div[contains(text(),'Post Administration Requirements')]");
	public By btnPostAdministrationRequirementsSave = By.xpath("//div[contains(text(),'Post Administration Requirements')]/..//button[text()='Save']");
	
	public By txtFollowUp = By.xpath("//*[text()='Follow-up']");
	public By drpDwnFollowUpResult =By.xpath("//div[@class='modal-content']//select[@formcontrolname='administered']");
	public By drpDwnFollowUpmethod =By.xpath("//div[@class='modal-content']//select[@formcontrolname='method']");
	public By drpDwnFollowUpPainLevel =By.xpath("//div[@class='modal-content']//select[@formcontrolname='value']");
	public By TypeFollowUpNotes =By.xpath("//div[@class='modal-content']//textarea[@formcontrolname='notes']");
	public By btnFollowUpSave =By.xpath("//div[@class='modal-content']//button[text()='Save']");
	
	public By btnShowFutureOrders = By.xpath("//button[text()='Show Future Orders']");
	public By txtShowFutureOrdersConfirm = By.xpath("//*[text()='Confirm']");
	public By btnCancelShowFutureOrders = By.xpath("//button[text()='Cancel']");
	public By btnOkShowFutureOrders = By.xpath("//button[text()='Ok']");
	public By btnHideFutureOrders = By.xpath("//button[text()='Hide Future Orders']");	
	
	public By btnInteractionsTab = By.xpath("//a[contains(text(),'Interactions')]");
	public By btnInteractionsTabTxt = By.xpath("//div[contains(text(),'No data to display')]");
	public By btnInteractionType = By.xpath("//button[contains(text(),'Interaction Type')]");
	public By txtAvailableMedications = By.xpath("//div[@role='tabpanel']//div[contains(text(),'Available Medications')]");
	public By txtAvailableMedicationsDescription = By.xpath("//div[contains(text(),'Available Medications')]/..//span[contains(text(),'Description')]");
    public By txtNoInteractionsFound = By.xpath("//*[contains(text(),'No Interactions Found')]");
    public By txtInteractionsResult = By.xpath("//*[contains(text(),'Interaction results will be displayed here.')]");
    
    public By btnLostoRDisposedTab = By.xpath("//a[contains(text(),'Lost / Disposed Med')]");
    public By btnLostoRDisposedTabSubmit = By.xpath("//button[text()='Submit']");
    public By btnSignVerify = By.xpath("//button[contains(text(),'Verify')]");
    public By msgSave = By.xpath("//div[text()='Save Complete']"); 
    
    public By btnPastAdministrationsTab = By.xpath("//a[contains(text(),'Past Administrations')]");
    public By dateFrmtAdministrationDate = By.xpath("//label[text()='Administration Date']");
    public By labelPastAdministrations = By.xpath("//div[text()='Past Administrations']");
    public By btnApply = By.xpath("//button[text()='Apply']");
    public By btnCalender = By.xpath("//div/button[@class='btn btn-outline-secondary']/i");
    public By inputAdministrationsDate = By.xpath("//*[@formcontrolname='historyDate']//input[@placeholder='mm/dd/yyyy']");
    
	public By txtEditAdministration = By.cssSelector("div[class='modal-header']>h5");
	public By btnEditadministrationClose = By.cssSelector("div[class='modal-header']>button");
	public By btnEditadministrationSave = By.cssSelector("div[class='modal-footer']>button");
    public By labelOrderDescription = By.xpath("//div[@class='modal-body']//label[text()='Order Description']");
    public By labelAdministered = By.xpath("//div[@class='modal-body']//label[text()='Administered']");
    public By labelInstruction = By.xpath("//div[@class='modal-body']//label[text()='Instruction']");    
    public By labelNotes = By.xpath("//div[@class='modal-body']//label[text()='Notes']");
    public By labelStatus = By.xpath("//div[@class='modal-body']//label[text()='Status']");
    
    public By UndoModelTitle = By.cssSelector("div[class='modal-header']>h4[class='modal-title']");
    public By UndoCancel = By.cssSelector("button[class*='dark']");
    public By UndoOK = By.cssSelector("div[class*='modal-footer']>button[class*='btn-primary']");
    
    
	public void SwitchToHomePage(String ParentWindow)
	{
		wd.switchTo().window(ParentWindow);
	}

	public void ClosingEmarURL()
	{
		wd.close();
	}

	public void LogoutFromEmar()
	{
		this.click(btnTester, "Tester Button in Emar");
		this.click(btnlogout, "Logout from Ear");
	}


	public void TesterButtonOptionsVerification()
	{
		this.click(btnTester, "Tester Button in Emar");
		List<WebElement> Buttons = wd.findElements(By.xpath("//a[@id='userDropDown']/..//div/a"));
		int NoOfButtons = Buttons.size();
		ArrayList<String> Optins = new ArrayList<String>();
		for(int i=1; i<=NoOfButtons ; i++)
		{
			Optins.add((wd.findElement(By.xpath(String.format("(//a[@id='userDropDown']/..//div/a)[%s]",i))).getText()));
		}

		this.testReport.logSuccess("Present Element", String.format("Element Present <mark>%s<mark/>", Optins.toString()));

	}


	public void ChangePasswordVerifications()
	{
		this.click(btnTester, "Tester Button in Emar");
		this.click(btnChangePassword, "Change Password");
		this.VerifyWebElementPresent(labelChangePassword, "Change Password label");
		this.VerifyWebElementPresent(labelUserName, "User Name label");
		this.VerifyWebElementPresent(labelCurrentPassword, "Current Password label");
		this.VerifyWebElementPresent(labelNewPassword, "New Password label");
		this.VerifyWebElementPresent(labelConfirmPassword, "Confirm Password label");	

	}

	public void NavigateBackToPreviesPage()
	{
		wd.navigate().back();
	}


	public void lockFromApplication(String Password)
	{
		this.click(btnTester, "Tester Button in Emar");
		this.click(btnLock, "Lock");
		this.VerifyWebElementPresent(loginPageText, "This system is to be accessed by AUTHORIZED USERS only!");
		this.VerifyWebElementPresent(btnUnlock, "Unlock");
		this.SendKeysToElementClearFirst(txtPassword, Password);
		this.click(btnUnlock, "Unlock");
	}

	public void HelpButtonvalidation()
	{
		this.click(btnHelp, "Help");
		List<WebElement> Buttons = wd.findElements(By.xpath("//a[@id='helpDropDown']/..//div/a"));
		int NoOfButtons = Buttons.size();
		ArrayList<String> Optins = new ArrayList<String>();
		for(int i=1; i<=NoOfButtons ; i++)
		{
			Optins.add((wd.findElement(By.xpath(String.format("(//a[@id='helpDropDown']/..//div/a)[%s]",i))).getText()));
		}

		this.testReport.logSuccess("Present Element", String.format("Element Present <mark>%s<mark/>", Optins.toString()));

	}

	public String HelpSiteValidation(String helpSiteURL) throws Throwable
	{

		if(this.isElementVisible(btnHelpSite))
		{

		}
		else
		{
			this.click(btnHelp, "Help");
		}
		String ParrenTWindow = wd.getWindowHandle();
		try
		{
			this.click(btnHelpSite, "Help Site");

			Set<String> AllWindows = wd.getWindowHandles();
			for(String ChildWindow: AllWindows)
			{
				if(!ParrenTWindow.equalsIgnoreCase(ChildWindow))
				{
					wd.switchTo().window(ChildWindow);
					wd.manage().window().maximize();
					String Name = wd.getCurrentUrl();
					if(Name.equals(helpSiteURL))
					{
						this.testReport.logSuccess("user have the URL to access the Key page ", String.format("user have the <mark>%s<mark/> to access the Key page", Name) );
					}
					else
					{
						this.testReport.logSuccess("user dosn't have the URL to access the Key page ", String.format("user dosn't have the <mark>%s<mark/> to access the Key page", Name) );
					}

				}
			}

		}
		catch(Exception e)
		{

		}

		return ParrenTWindow ;
	}

	public void BlueStrataLogoValidation()
	{
		this.VerifyWebElementPresent(blueStrataLogo, "BlueStrata Logo");
	}

	public void EmarPageHeaderValidation()
	{
		this.VerifyWebElementPresent(btnMenu ,"Menu Button");
		this.VerifyWebElementPresent(btnTester ,"Tester Button");
		String  btnTester = wd.findElement(By.xpath("//a[@id='userDropDown']")).getText();
		this.testReport.logSuccess("User Name Present ", String.format("User Name   <mark>%s<mark/> Present in  page", btnTester) );
		this.VerifyWebElementPresent(btnHelp ,"Help Button");
		String  CurrentTime = wd.findElement(By.xpath("//app-current-time/div")).getText();
		this.testReport.logSuccess("Current Time ", String.format("Current Time <mark>%s<mark/> Present in  page", CurrentTime) );
	}

	public void EmarPageButtonsVerification()
	{
		this.VerifyWebElementPresent(arrowBtnEmarPage ,"Arrow Button Emar Page");
		this.VerifyWebElementPresent(selectFilter ,"Select Filter");
		this.VerifyWebElementPresent(selectAcessTypes ,"Select Acess Types");
		if(this.isElementPresent(btnManageInventory))
		{
			this.VerifyWebElementPresent(btnManageInventory ,"Manage Inventory");
		}
		if(this.isElementPresent(btnReports))
		{
			this.VerifyWebElementPresent(btnReports ,"Reports");
		}

	}

	public void VerifyMessageButton()
	{
		this.VerifyWebElementPresent(btnMessage ,"Mediprocity & Messages ");

	}
	

	public void VerifyHomeAndDashBoard()
	{
		this.VerifyWebElementPresent(btnHome ,"Home");
		this.VerifyWebElementPresent(btnDashboard ,"Dashboard");
	}

	public void VerifyLastMedicationBox()
	{
		this.VerifyWebElementPresent(labelLastMedication, "Late Medications Last 24 Hours");
		this.VerifyWebElementPresent(labelLastMedicationName, "Late Medications Last 24 Hours Name");
		this.VerifyWebElementPresent(labelLastMedicationDescription, "Late Medications Last 24 Hours Description");
		this.VerifyWebElementPresent(labelLastMedicationDue, "Late Medications Last 24 Hours Due");
		this.VerifyWebElementPresent(labelLastMedicationType, "Late Medications Last 24 Hours Type");
	}
	public void VerifyFolloeupsBox()
	{ 
		this.VerifyWebElementPresent(labelFollowups, "Follow-ups");
		this.VerifyWebElementPresent(labelFollowupsName, "Follow-ups Name");
		this.VerifyWebElementPresent(labelFollowupsDescription, "Follow-ups Description");
		this.VerifyWebElementPresent(labelFollowupsDue, "Follow-ups Due");
		this.VerifyWebElementPresent(labelFollowupsType, "Follow-ups Type");
	}


	public void VerifyOrdersBox()
	{
		this.VerifyWebElementPresent(labelOrders, "Orders");
		List<WebElement> options = wd.findElements(By.xpath("//div[contains(@class,'dashboard')]/div[contains(text(),'Orders')]/..//a"));
		int no = options.size();
		ArrayList<String> Status = new ArrayList<String>();
		for(int i=1; i<=no ;i++)
		{
			Status.add(wd.findElement(By.xpath(String.format("(//div[contains(@class,'dashboard')]/div[contains(text(),'Orders')]/..//a)[%s]",i))).getText());
		}
		this.testReport.logSuccess("Present Status No ", String.format("Status Presents no <mark>%s<mark/> ", no) );

		this.testReport.logSuccess("Present Status ", String.format("Status Presents <mark>%s<mark/> ", Status.toString()) );

	}

	public void VerifyADTChangesBox()
	{
		this.VerifyWebElementPresent(labelADTChanges, "ADT Changes");
		this.VerifyWebElementPresent(txtMoveInLast, "Moves in last ");
		List<WebElement> options = wd.findElements(By.xpath("//div[contains(@class,'dashboard')]/div[contains(text(),'ADT Changes')]/..//a"));
		int no = options.size();
		ArrayList<String> Status = new ArrayList<String>();
		for(int i=1; i<=no ;i++)
		{
			Status.add(wd.findElement(By.xpath(String.format("(//div[contains(@class,'dashboard')]/div[contains(text(),'ADT Changes')]/..//a)[%s]",i))).getText());
		}
		this.testReport.logSuccess("Present Status No ", String.format("Status Presents no <mark>%s<mark/> ", no) );
		this.testReport.logSuccess("Present Status ", String.format("Status Presents <mark>%s<mark/> ", Status.toString()) );

	}

	public void VerifyTotalNoOfOrdersINOrdersBox() throws Throwable
	{
		try
		{
			this.VerifyWebElementPresent(labelOrders, "Orders");
			List<WebElement> options = wd.findElements(By.xpath("//div[contains(@class,'dashboard')]/div[contains(text(),'Orders')]/..//a"));
			int no = options.size();
			//ArrayList<String> Status = new ArrayList<String>();
			for(int i=1; i<=no ;i++)
			{
				String OrdersNo = wd.findElement(By.xpath(String.format("(//div[contains(@class,'dashboard')]/div[contains(text(),'Orders')]/..//a/span)[%s]",i))).getText();
				By OrdersCount = By.xpath(String.format("(//div[contains(@class,'dashboard')]/div[contains(text(),'Orders')]/..//a)[%s]/span[text()='%s']",i,OrdersNo));
				this.click(OrdersCount, "Orders");
				List<WebElement> Orders = wd.findElements(By.xpath("//div[contains(@class,'dashboard')]/div[contains(text(),'Orders')]/..//a"));
				int OrdersOption = Orders.size();
				if(OrdersOption== Integer.parseInt(OrdersNo))
				{
					this.testReport.logSuccess("Orders Count", String.format(" <mark>%s<mark/> no of Orders Matching with Listed <mark>%s<mark/> orders ", OrdersNo,OrdersOption) );

					String ParentWindow = wd.getWindowHandle();
					if(OrdersOption>0)
					{
						By Order = By.xpath("(//div[contains(@class,'dashboard')]/div[contains(text(),'Orders')]/..//a[contains(@href,'javascript')])[1]");
						this.click(Order, "Orders Page");
						Set<String> allwindows = wd.getWindowHandles();

						for(String ChildWindow : allwindows)
						{
							if(!ParentWindow.equalsIgnoreCase(ChildWindow) )
							{
								wd.switchTo().window(ChildWindow);								
								wd.manage().window().maximize();

								if(this.isElementPresent(txtResidentRequired))
								{
									this.VerifyWebElementPresent(txtResidentRequired, "Resident Required");
									wd.close();
								}


								wd.switchTo().window(ParentWindow);
							}
						}
					}

					this.VerifyWebElementPresent(btnOrdersBackButton, "Orders Back Button");
					this.click(btnOrdersBackButton, "Orders Back Button");					 
				}
			}
		}
		catch(Exception e)
		{

		}

	}

	public void VerifyADTChnages(String ADTDaysValue) throws Throwable
	{

		try
		{
			this.VerifyWebElementPresent(labelADTChanges, "ADT Changes");
			this.VerifyWebElementPresent(txtMoveInLast, "Moves in last ");
			String BydefaultValue = wd.findElement(By.xpath("//div[contains(@class,'dashboard')]/div[contains(text(),'ADT Changes')]/..//input[contains(@class,'form-control')]")).getText();
			this.testReport.logSuccess("By Default Value", String.format("By Default Value <mark>%s<mark/>  ", BydefaultValue) );
			this.SendKeysToElementClearFirst(txtMoveInLast, ADTDaysValue);	// Every Time By default Value should be 99 
			this.waitInSecs(3);
			WebElement Element =wd.findElement(By.xpath("//div[contains(@class,'dashboard')]/div[contains(text(),'ADT Changes')]/..//input[@max='99']"));
			Element.sendKeys(Keys.ENTER);
			this.waitInSecs(3);
			/*//keys.enter
			wd.findElement(By.xpath("//div[contains(@class,'dashboard')]/div[contains(text(),'ADT Changes')]/..//input[contains(@class,'form-control')]")).sendKeys("99"+Keys.ENTER);

			//with robot class 
			wd.findElement(By.xpath("//div[contains(@class,'dashboard')]/div[contains(text(),'ADT Changes')]/..//input[contains(@class,'form-control')]")).sendKeys("99");
			Robot robot = new Robot();
			Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);

			//using action class
			wd.findElement(By.xpath("//div[contains(@class,'dashboard')]/div[contains(text(),'ADT Changes')]/..//input[contains(@class,'form-control')]")).sendKeys("99");
			this.waitInSecs(3);
			Actions action = new Actions(wd); 
			action.sendKeys(Keys.ENTER).build().perform();*/

			//this.waitInSecs(3);

			List<WebElement> options = wd.findElements(By.xpath("//div[contains(@class,'dashboard')]/div[contains(text(),'ADT Changes')]/..//a"));
			int no = options.size();
			//ArrayList<String> Status = new ArrayList<String>();
			for(int i=1; i<=no ;i++)
			{
				String OrdersNo = wd.findElement(By.xpath(String.format("(//div[contains(@class,'dashboard')]/div[contains(text(),'ADT Changes')]/..//a/span)[%s]",i))).getText();
				By OrdersCount = By.xpath(String.format("(//div[contains(@class,'dashboard')]/div[contains(text(),'ADT Changes')]/..//a)[%s]/span[text()='%s']",i,OrdersNo));
				this.click(OrdersCount, "Orders");
				List<WebElement> Orders = wd.findElements(By.xpath("//div[contains(@class,'dashboard')]/div[contains(text(),'ADT Changes')]/..//a"));
				int OrdersOption = Orders.size();
				if(OrdersOption== Integer.parseInt(OrdersNo))
				{
					this.testReport.logSuccess("Orders Count", String.format(" <mark>%s<mark/> no of Orders Matching with Listed <mark>%s<mark/> orders ", OrdersNo,OrdersOption) );

				}

				this.VerifyWebElementPresent(btnAdtChangesBackButton, "ADT Changes Back Button");
				this.click(btnAdtChangesBackButton, "ADT Changes Back Button");					 

			}
		}
		catch(Exception e)
		{

		}


	}


	public void SelectAllAccessType(String Value)
	{
		this.click(selectAcessTypes ,"Select Acess Types");
		//	this.SendKeysToElementClearFirst(findSelectAcess, Value);
		By OptionSelectAll = By.xpath("(//button//following-sibling::ul//a)[1]");
		this.click(OptionSelectAll, Value);
	}

	public void SelectStationAndResidentVerification()
	{
		this.click(selectFilter ,"Select Filter");
		List<WebElement> Stations = wd.findElements(By.xpath("//div[@role='main']//select/option[contains(text(),'Station')]"));
		ArrayList<String> stations = new ArrayList<String>();
		int stationsNo = Stations.size();
		for(int i=1;i<=stationsNo ; i++)
		{
			String Station = wd.findElement(By.xpath(String.format(("(//div[@role='main']//select/option[contains(text(),'Station')])[%s]"),i))).getText();

			this.SelectDropDownByText(selectFilter, Station);			
			this.waitInSecs(5);

			List<WebElement> Residents = wd.findElements(By.xpath("//div[@class='emar-sidebar-main']//a"));
			int residentsNo = Residents.size();
			ArrayList<String> ResidentName = new ArrayList<String>();
			ArrayList<String> ResidentAddress = new ArrayList<String>();
			if(residentsNo>0)
			{
				this.testReport.logSuccess("Resident Present", String.format("Resident Present <mark>%s<mark/> with the <mark>%s<mark/> ", residentsNo,Station) );
				for(int n=1;n<=residentsNo ;n++)
				{

					ResidentName.add(wd.findElement(By.xpath(String.format("((//div[@class='emar-sidebar-main']//a//ul)[%s]/li)[1]", n))).getText());
					ResidentAddress.add(wd.findElement(By.xpath(String.format("((//div[@class='emar-sidebar-main']//a//ul)[%s]/li)[2]", n))).getText());
				}

				this.testReport.logSuccess("Resident Name", String.format("Resident Name <mark>%s<mark/> with Address <mark>%s<mark/> ", ResidentName.toString(), ResidentAddress.toString()) );
			}

			for(int j=1;j<=residentsNo ; j++)
			{
				String Colour = wd.findElement(By.xpath(String.format(("(//div[@class='emar-sidebar-main']//a)[%s]"),j))).getCssValue("background-color");
				if(Colour.equals("rgba(14, 118, 188, 1)" ))
				{
					this.testReport.logSuccess("Blue Color", String.format("Color of the Resident  <mark>%s<mark/> = Blue-needs to be completed ", Colour) );
				}
				else if(Colour.equals("rgba(220, 53, 69, 1)" ))
				{
					this.testReport.logSuccess("Red Color", String.format("Color of the Resident  <mark>%s<mark/> = Red-Late ", Colour) );
				}
				else if(Colour.equals("rgba(40, 167, 69, 1) " ))
				{
					this.testReport.logSuccess("Green Color", String.format("Color of the Resident  <mark>%s<mark/> = Green-PRN ", Colour) );
				}
				else if(Colour.equals("rgba(255, 255, 255, 1)" ))
				{
					this.testReport.logSuccess("White Color", String.format("Color of the Resident  <mark>%s<mark/> = White-No orders due at this time ", Colour) );
				}
				else
				{
					this.testReport.logSuccess("Gray Color", String.format("Color of the Resident  <mark>%s<mark/> = Gray-On hold ", Colour) );
				}

			}



		}
	}


	public void SelectStation(String station)
	{
		this.SelectDropDownByText(selectFilter, station);
		this.waitInSecs(5);
	}

	public void LastMedicationRecordDisplayAndVerifyPaginationFeature()
	{
		List<WebElement> records = wd.findElements(By.xpath("//div[contains(@class,'dashboard')]/div[contains(text(),'Late Medications Last 24 Hours')]/..//datatable-body-row"));
		int RecordsNo = records.size();
		this.testReport.logSuccess("Records Number", String.format("Total Number of Records  <mark>%s<mark/>", RecordsNo) );

		List<WebElement> pages = wd.findElements(By.xpath("//div[contains(text(),'Late Medications Last 24 Hours')]/..//datatable-pager//li[@role='button']"));
		int PagesNo = pages.size();
		this.testReport.logSuccess("Page Number Display", String.format("Total Number of Pages  <mark>%s<mark/>", PagesNo) );

		String PageTotal = wd.findElement(By.xpath("//div[contains(text(),'Late Medications Last 24 Hours')]/..//datatable-footer//div[contains(@class,'page-count')]")).getText();
		this.testReport.logSuccess("Record Number Display", String.format("Total Record Numbers  <mark>%s<mark/>", PageTotal) );

	}

	public void FollupsRecordDisplayAndVerifyPaginationFeature()
	{
		List<WebElement> records = wd.findElements(By.xpath("//div[contains(@class,'dashboard')]/div[contains(text(),'Follow-ups')]/..//datatable-body-row"));
		int RecordsNo = records.size();
		this.testReport.logSuccess("Records Number", String.format("Total Number of Records  <mark>%s<mark/>", RecordsNo) );

		List<WebElement> pages = wd.findElements(By.xpath("//div[contains(text(),'Follow-ups')]/..//datatable-pager//li[@role='button']"));
		int PagesNo = pages.size();
		this.testReport.logSuccess("Page Number Display", String.format("Total Number of Pages  <mark>%s<mark/>", PagesNo) );

		String PageTotal = wd.findElement(By.xpath("//div[contains(text(),'Follow-ups')]/..//datatable-footer//div[contains(@class,'page-count')]")).getText();
		this.testReport.logSuccess("Record Number Display", String.format("Total Record Numbers  <mark>%s<mark/>", PageTotal) );

	}


	public void SpecificResidentVerification()
	{
		/*if(this.isElementPresent(rightArrow))
		{
			this.click(leftArrow, "Left Arrow");
		}
		 */
		List<WebElement> Resident = wd.findElements(By.xpath("//div[@class='emar-sidebar-main']//a"));
		int residentNo = Resident.size();
		if(residentNo==0)
		{
			this.click(leftArrow, "Left Arrow");
		}
		List<WebElement> Residents = wd.findElements(By.xpath("//div[@class='emar-sidebar-main']//a"));
		int residentsNo = Residents.size();

		if(residentsNo>0)
		{
			this.testReport.logSuccess("Resident Present", String.format("Resident Present <mark>%s<mark/>  ", residentsNo) );
			for(int n=1;n<=residentsNo ;n++)
			{
				By resident = By.xpath(String.format("((//div[@class='emar-sidebar-main']//a//ul)[%s]/li)[1]", n));
				this.click(resident, "Resident Clicked");
				this.waitInSecs(5);
				VerifyReidentCredentialsAtTop();
				VerifyResident();
				VerifyViewAllOrders();
			}
		}

	}

	public void VerifyResident()
	{
		this.VerifyWebElementPresent(residentImage, "Image Present");
		String ResidentName = wd.findElement(By.xpath("//div[contains(@class,'profile')]//h3")).getText();
		String ResidentMrNo = wd.findElement(By.xpath("//div[contains(@class,'profile')]//h5")).getText();

		this.testReport.logSuccess("Resident Present", String.format("Resident :- <mark>%s<mark/> Present with Location :- <mark>%s<mark/>  ", ResidentName,ResidentMrNo) );

		List<WebElement> ResidentsBoldheaders = wd.findElements(By.xpath("(//div[contains(@class,'profile-left')]//h5)"));
		int residentsBoldheaders = ResidentsBoldheaders.size();

		for(int i=1;i<=residentsBoldheaders; i++)
		{
			String Headers = wd.findElement(By.xpath(String.format("(//div[contains(@class,'profile-left')]//h5)[%s]", i))).getText();
			this.testReport.logSuccess("Header Present", String.format("Header Present  <mark>%s<mark/>  ", Headers) );
		}


		List<WebElement> NO = wd.findElements(By.xpath("//div[contains(@class,'profile-left')]//dl"));
		int no = NO.size();
		for(int i=1;i<=no; i++)
		{
			List<WebElement> NOs = wd.findElements(By.xpath(String.format("(//div[contains(@class,'profile-left')]//dl)[%s]//dt",i)));
			int nos = NOs.size();			
			for(int j=1;j<=nos;j++)
			{

				String Header = wd.findElement(By.xpath(String.format("((//div[contains(@class,'profile-left')]//dl)[%s]//dt)[%s]", i,j))).getText();
				String Answer = wd.findElement(By.xpath(String.format("((//div[contains(@class,'profile-left')]//dl)[%s]//following-sibling::dd)[%s]", i,j))).getText();
				this.testReport.logSuccess("Header & Answer Present", String.format("Header Present  <mark>%s<mark/> with Answer <mark>%s<mark/> ", Header,Answer) );
			}


		}

		List<WebElement> WithoutAnswer = wd.findElements(By.xpath("//div[contains(@class,'profile-left')]//p"));
		int WithoutAnswerNo = WithoutAnswer.size();
		for(int i=1;i<=WithoutAnswerNo;i++)
		{

			List<WebElement> NOs = wd.findElements(By.xpath(String.format("((//div[contains(@class,'profile-left')]//p)[%s]//span[contains(@class,'list-inline')])",i)));
			int nos = NOs.size();			
			for(int j=1;j<=nos;j++)
			{
				String Answer = wd.findElement(By.xpath(String.format("((//div[contains(@class,'profile-left')]//p)[%s]//span[contains(@class,'list-inline')])[%s]", i,j))).getText();
				this.testReport.logSuccess("Header & Answer Present", String.format("Resident Page Answer <mark>%s<mark/> Present ",Answer) );
			}
		}


	}


	public void VerifyReidentCredentialsAtTop()
	{
		this.VerifyWebElementPresent(residentImageTop, "Image Present At Left Top");
		String ResidentNameWithMr = wd.findElement(By.xpath("(//div[contains(@class,'border-left')]//Strong)")).getText();
		String ResidentLocation = wd.findElement(By.xpath("(//div[contains(@class,'border-left')]//li)[2]")).getText();


		this.testReport.logSuccess("Resident Present At Left top", String.format("Resident <mark>%s<mark/> Present with Location <mark>%s<mark/>  ", ResidentNameWithMr,ResidentLocation) );
	}

	public void VerifyViewAllOrders()
	{
		String ParrentWindow = wd.getWindowHandle();
		this.click(btnViewAllorders, "View All Orders");

		Set<String> Allwindows = wd.getWindowHandles();
		for(String ChildWindow : Allwindows)
		{
			if(!ParrentWindow.equalsIgnoreCase(ChildWindow))
			{
				wd.switchTo().window(ChildWindow);
				wd.manage().window().maximize();

				if(this.isElementPresent(txtResidentRequired))
				{
					this.VerifyWebElementPresent(txtResidentRequired, "Resident Required");
					wd.close();
				}


				wd.switchTo().window(ParrentWindow);

			}
		}
	}



	public String[] AdministrationButtonRoutineTabValidation(String TabType , String Tab , String Task)
	{
		List<WebElement> Resident = wd.findElements(By.xpath("//div[@class='emar-sidebar-main']//a"));
		int residentNo = Resident.size();
		String[] OrderDescription = null ;
		if(residentNo>0)
		{
			for(int i=1;i<=residentNo;i++)
			{
				By residentName = By.xpath(String.format("(((//div[@class='emar-sidebar-main']//a//ul)[%s])//li)[1]", i));
				String resident = wd.findElement(By.xpath(String.format("(((//div[@class='emar-sidebar-main']//a//ul)[%s])//li)[1]", i))).getText();
				this.click(residentName, resident);
				this.waitInSecs(10);
				if(Task.equals("CurrentTask"))
				{
					BooleanCurrentTasks();					
					String RoutineCount = BooleanRoutinePRNFollowUpTab(TabType);
					if((Integer.parseInt(RoutineCount)!=0))
					{

						break;
					}
				}
				else if(Task.equals("InteractionsTask"))
				{
					BooleanInteractionsTasks();
					if(this.isElementNotPresent(btnInteractionsTabTxt))
					{
						break ;
					}
				}
				
				else if(Task.equals("Lost/Disposed"))
				{
					BooleanLostOrDisposedTasks();
					int Count =LostOrDisposedMedButtonVerification();
					if(Count>0)
					{
						break;
					}
					
				}


			}
		}
		if(Tab.equals("Y"))
		{			
			RoutineDescriptionFrontColorValidation(TabType);


			if(TabType.equals("current") || TabType.equals("prn"))
			{
				RoutineDescriptionSelectionWithCheckBox(TabType);
			}
			OrderDescription = DescriptionSelectionFromRoutine(TabType);
		}



		return OrderDescription;
	}
	
	public String ClickOnShowFutureButton(String TabType)
	{
		String RoutineCount = BooleanRoutinePRNFollowUpTab(TabType);
		this.VerifyWebElementPresent(btnShowFutureOrders, "Show Future Orders");
		this.click(btnShowFutureOrders, "Show Future Orders");
		return RoutineCount;
	}
	
	

	public void AdministrationButtonValidation()
	{
		List<WebElement> Resident = wd.findElements(By.xpath("//div[@class='emar-sidebar-main']//a"));
		int residentNo = Resident.size();
		if(residentNo==0)
		{
			this.click(leftArrow, "Left Arrow");
		}
		List<WebElement> Residents = wd.findElements(By.xpath("//div[@class='emar-sidebar-main']//a"));
		int residentsNo = Residents.size();

		if(residentsNo>0)
		{
			this.testReport.logSuccess("Resident Present", String.format("Resident Present <mark>%s<mark/>  ", residentsNo) );
			for(int n=1;n<=residentsNo ;n++)
			{
				String ResidentName=wd.findElement(By.xpath(String.format("((//div[@class='emar-sidebar-main']//a//ul)[%s]/li)[1]", n))).getText();
				this.testReport.logSuccess("Administration Button Validation", String.format("Administration Button Validation for :- <mark>%s<mark/>  ", ResidentName) );

				By resident = By.xpath(String.format("((//div[@class='emar-sidebar-main']//a//ul)[%s]/li)[1]", n));
				this.click(resident, "Resident Clicked");
				this.waitInSecs(5);
				AdministrationBoxButtonTabValidation();
			}
		}
	}

	public void BooleanCurrentTasks()
	{
		boolean tab = wd.findElement(By.xpath("//a[@id='tab-main']")).getAttribute("aria-expanded").equals("true");
		if(!tab)
		{
			this.click(btnCurrentTab, "Current Tab");
		}
	}	
	
	public void BooleanInteractionsTasks()
	{
		boolean tab = wd.findElement(By.xpath("//a[contains(text(),'Interactions')]")).getAttribute("aria-expanded").equals("true");
		if(!tab)
		{
			this.click(btnInteractionsTab, "Interactions Tab");
		}
	}
	
	public void BooleanLostOrDisposedTasks()
	{
		boolean tab = wd.findElement(By.xpath("//a[contains(text(),'Lost / Disposed Med')]")).getAttribute("aria-expanded").equals("true");
		if(!tab)
		{
			this.click(btnLostoRDisposedTab, "Lost / Disposed Med Tab");
		}
	}
	
	public void BooleanTasks(String Task)
	{
		boolean tab = wd.findElement(By.xpath(String.format("//a[contains(text(),'%s')]",Task))).getAttribute("aria-expanded").equals("true");
		if(!tab)
		{
			By task = By.xpath(String.format("//a[contains(text(),'%s')]", Task));
			this.click(task, Task);
		}
	}
	

	public String BooleanRoutinePRNFollowUpTab(String TabType)
	{
		boolean tab = wd.findElement(By.xpath(String.format("//div[@class='card-body']//a[@id='%s']",TabType))).getAttribute("aria-expanded").equals("true");
		if(!tab)
		{
			By AdministrationTabButton = By.xpath(String.format("//div[@class='card-body']//a[@id='%s']",TabType));
					
			this.click(AdministrationTabButton,"Administer Tab Button");
		}

		String RoutineCount = wd.findElement(By.xpath(String.format("//div[@class='card-body']//a[@id='%s']/span",TabType))).getText();
		return RoutineCount;
	}
	
	
	


	public void AdministrationBoxButtonTabValidation()
	{

		BooleanCurrentTasks();
		List<WebElement> boxs = wd.findElements(By.xpath("//div[@class='card-header']"));
		int BxNo = boxs.size();
		ArrayList<String> Box = new ArrayList<String>();
		for(int i=1;i<=BxNo;i++)
		{
			Box.add(wd.findElement(By.xpath(String.format("(//div[@class='card-header'])[%s]", i))).getText());
		}
		this.testReport.logSuccess("Administrations Boxs", String.format("Administrations Boxs Present <mark>%s<mark/>  ", Box.toString()) );

		List<WebElement> buttons = wd.findElements(By.xpath("(//div[contains(@class,'card-header')])//button"));
		int ButtonsNo = buttons.size();
		ArrayList<String> Button = new ArrayList<String>();
		for(int i=1;i<=ButtonsNo;i++)
		{
			Button.add(wd.findElement(By.xpath(String.format("((//div[contains(@class,'card-header')])//button)[%s]", i))).getText());
		}
		this.testReport.logSuccess("Administrations Buttons", String.format("Administrations Buttons Present <mark>%s<mark/>  ", Button.toString()) );


		List<WebElement> tabs = wd.findElements(By.xpath("//div[@class='card-body']//ul[@role='tablist']//a"));
		int TabNo = tabs.size();
		ArrayList<String> Tab = new ArrayList<String>();
		for(int i=1;i<=TabNo;i++)
		{
			Tab.add(wd.findElement(By.xpath(String.format("(//div[@class='card-body']//ul[@role='tablist']//a)[%s]", i))).getText());
		}
		this.testReport.logSuccess("Administrations Tabs", String.format("Administrations Tabs Present <mark>%s<mark/>  ", Tab.toString()) );

		this.click(btnAdministerRoutine,"Administer Routine");

		String RoutineCount = wd.findElement(By.xpath("//div[@class='card-body']//a[@id='current']/span")).getText();

		if(Integer.parseInt(RoutineCount)!=0)
		{

			List<WebElement> routineDescriptions =  wd.findElements(By.xpath("//div[@id='current-panel']//h5"));
			int descriptionNo = routineDescriptions.size();
			ArrayList<String> decription = new ArrayList<String>();
			for(int i=1;i<=descriptionNo;i++)
			{
				decription.add(wd.findElement(By.xpath(String.format("(//div[@id='current-panel']//h5)[%s]", i))).getText());
			}
			this.testReport.logSuccess("Routine Tab Descriptions", String.format("Administrations Routine Tab Descriptions :- <mark>%s<mark/>  ", decription.toString()) );

			List<WebElement> routineDescriptionrefillButton =  wd.findElements(By.xpath("//div[@id='current-panel']//button"));
			int RoutineDescriptionrefillButton = routineDescriptionrefillButton.size();

			this.testReport.logSuccess("Routine Tab Descriptions Refill Button", String.format("Administrations Routine Tab Descriptions Refill Button :- <mark>%s<mark/>  ", RoutineDescriptionrefillButton ));

			List<WebElement> routineDescriptionCheckBx =  wd.findElements(By.xpath("//div[@id='current-panel']//input"));
			int RoutineDescriptionCheckBx = routineDescriptionCheckBx.size();
			if(descriptionNo>0)
			{
				if(RoutineDescriptionCheckBx==descriptionNo+1)
				{
					this.testReport.logSuccess("Routine Tab Check Boxs", String.format("Routine Tab Check Boxs :- <mark>%s<mark/> and CheckBox for All Present ", RoutineDescriptionCheckBx ));

				}
			}
		}

		else
		{
			this.testReport.logSuccess("Routine Tab Count", String.format("Routine Tab Count :- <mark>%s<mark/>  ", Integer.parseInt(RoutineCount) ));
		}

		this.click(btnAdministerPRN,"Administer PRN");

		String PRNCount = wd.findElement(By.xpath("//div[@class='card-body']//a[@id='prn']/span")).getText();

		if(Integer.parseInt(PRNCount)!=0)
		{

			List<WebElement> prnDescriptions =  wd.findElements(By.xpath("//div[@id='prn-panel']//h5"));
			int DescriptionNo = prnDescriptions.size();
			ArrayList<String> Decription = new ArrayList<String>();
			for(int i=1;i<=DescriptionNo;i++)
			{
				Decription.add(wd.findElement(By.xpath(String.format("(//div[@id='prn-panel']//h5)[%s]", i))).getText());
			}
			this.testReport.logSuccess("PRN Tab Descriptions", String.format("Administrations PRN Tab Descriptions :- <mark>%s<mark/>  ", Decription.toString()) );
			List<WebElement> prnDescriptionCheckBx =  wd.findElements(By.xpath("//div[@id='prn-panel']//input"));
			int PRNDescriptionCheckBx = prnDescriptionCheckBx.size();
			if(DescriptionNo>0)
			{
				if(PRNDescriptionCheckBx==DescriptionNo+1)
				{
					this.testReport.logSuccess("PRN Tab Check Boxs", String.format("PRN Tab Check Boxs :- <mark>%s<mark/> and CheckBox for All Present ", PRNDescriptionCheckBx ));

				}
			}
		}

		else
		{
			this.testReport.logSuccess("PRN Tab Count", String.format("PRN Tab Count :- <mark>%s<mark/>  ", Integer.parseInt(PRNCount) ));
		}


		this.click(btnAdministerFollowup,"Administer Followup");

		String FollowCount = wd.findElement(By.xpath("//div[@class='card-body']//a[@id='followup']/span")).getText();

		if(Integer.parseInt(FollowCount)!=0)
		{

			List<WebElement> FollowupDescriptions =  wd.findElements(By.xpath("//div[@id='followup-panel']//h5"));
			int FollowupDescriptionsNo = FollowupDescriptions.size();
			ArrayList<String> DecriptionFollowUp = new ArrayList<String>();
			for(int i=1;i<=FollowupDescriptionsNo;i++)
			{
				DecriptionFollowUp.add(wd.findElement(By.xpath(String.format("(//div[@id='followup-panel']//h5)[%s]", i))).getText());
			}
			this.testReport.logSuccess("Followup Tab Descriptions", String.format("Administrations Followup Tab Descriptions :- <mark>%s<mark/>  ", DecriptionFollowUp.toString()) );

			List<WebElement> FollowUpCompleteButton =  wd.findElements(By.xpath("//div[@id='followup-panel']//button[text()='Complete']"));
			int FollowUpCompleteButtonNo = FollowUpCompleteButton.size();

			this.testReport.logSuccess("Followup Tab Descriptions Complete Button", String.format("Followup Tab Descriptions Complete Button :- <mark>%s<mark/>  ", FollowUpCompleteButtonNo ));


		}

		else
		{
			this.testReport.logSuccess("Followup Tab Count", String.format("Followup Tab Count :- <mark>%s<mark/>  ", Integer.parseInt(FollowCount) ));
		}


	}


	public void RoutineDescriptionFrontColorValidation(String TabType)
	{
		String RoutineCount = BooleanRoutinePRNFollowUpTab(TabType);

		if(Integer.parseInt(RoutineCount)!=0)
		{
			if(TabType.equals("current") || TabType.equals("followup"))
			{
			List<WebElement> RedColor = wd.findElements(By.xpath(String.format("//div[@aria-labelledby='%s']//span[contains(@class,'danger')]",TabType)));
			int RedColourCount = RedColor.size();
			
			this.testReport.logSuccess("Front Color Validation", String.format("Front Color Validation with Red Front Respectively  :- <mark>%s<mark/>  ", RedColourCount) );

			}

			List<WebElement> BlueColor = wd.findElements(By.xpath(String.format("//div[@aria-labelledby='%s']//span[contains(@class,'info')]",TabType)));
			int BlueColourCount = BlueColor.size();

			this.testReport.logSuccess("Front Color Validation", String.format("Front Color Validation with Blue Front Respectively  :- <mark>%s<mark/>  ", BlueColourCount) );


		}
	}
	
	
	
	
	public void BooleanRoutinePRNDescriptionCheckBox(String TabType)
	{
		boolean tab = wd.findElement(By.xpath(String.format("//div[@aria-labelledby='%s']//input[@id='administer-all']",TabType))).getAttribute("ng-reflect-model").equals("true");
		if(!tab)
		{
			By ChkBox = By.xpath(String.format("//div[@aria-labelledby='%s']//input[@id='administer-all']",TabType));
			this.click(ChkBox, "Check Box");
		}
		
	}
	
	public void BooleanRoutinePRNDescriptionUncheckBoxCheckBox(String TabType)
	{
		boolean tab = wd.findElement(By.xpath(String.format("//div[@aria-labelledby='%s']//input[@id='administer-all']",TabType))).getAttribute("ng-reflect-model").equals("false");
		if(!tab)
		{
			By ChkBox = By.xpath(String.format("//div[@aria-labelledby='%s']//input[@id='administer-all']",TabType));
			this.click(ChkBox, "Check Box");
		}
		
	}

	public void RoutineDescriptionSelectionWithCheckBox(String TabType)
	{
		String RoutineCount = BooleanRoutinePRNFollowUpTab(TabType);

		if(Integer.parseInt(RoutineCount)!=0)
		{
			List<WebElement> routineCheckBxwithoutClick =  wd.findElements(By.xpath(String.format("//div[@aria-labelledby='%s']//input[contains(@class,'untouched')]",TabType)));
			int routineCheckBxwithoutClickNo = routineCheckBxwithoutClick.size();

		//	this.testReport.logSuccess("All Check Box Validation", String.format("All Check Box Validation With Without Clicking  :- <mark>%s<mark/>  ", routineCheckBxwithoutClickNo) );

			BooleanRoutinePRNDescriptionCheckBox(TabType);	
			
			
			List<WebElement> routineCheckBxwithClick =  wd.findElements(By.xpath(String.format("//div[@aria-labelledby='%s']//input[contains(@class,'touched')]",TabType)));
			int routineCheckBxwithClickNo = routineCheckBxwithClick.size();
			
			if(routineCheckBxwithoutClickNo==routineCheckBxwithClickNo)
			{
				this.testReport.logSuccess("All Check Box Validation", String.format("All Check Box Validation  <mark>%s<mark/> With Without Clicking and With clicking <mark>%s<mark/>  Same ", routineCheckBxwithoutClickNo,routineCheckBxwithClickNo) );

			}
			else
			{
				this.testReport.logFailure("All Check Box Validation", String.format("All Check Box Validation  <mark>%s<mark/> With Without Clicking and With clicking <mark>%s<mark/> not  Same ", routineCheckBxwithoutClickNo,routineCheckBxwithClickNo) );

			}
			
			BooleanRoutinePRNDescriptionUncheckBoxCheckBox(TabType);

			

		}

	}
	
	
	
	
	public String[] DescriptionSelectionFromRoutine(String TabType)
	{

		String Value = null;		
		String RoutineCount = BooleanRoutinePRNFollowUpTab(TabType);
		if(Integer.parseInt(RoutineCount)!=0)
		{

			List<WebElement> Descriptions = wd.findElements(By.xpath(String.format("//div[@aria-labelledby='%s']//li[contains(@class,'inserted')]",TabType)));
			int Description = Descriptions.size();

			String DescriptionName = wd.findElement(By.xpath(String.format("(//div[@aria-labelledby='%s']//li[contains(@class,'inserted')])[%s]",TabType, Description))).getText();

			if(TabType.equals("current") || TabType.equals("prn"))
			{

				By DescriptionChkBox = By.xpath(String.format("(//div[@aria-labelledby='%s']//li[contains(@class,'inserted')])[%s]//input",TabType, Description));
				this.click(DescriptionChkBox, DescriptionName);
			}
			
			else if(TabType.equals("followup"))
			{
				By btnComplete = By.xpath(String.format("(//div[@aria-labelledby='%s']//li[contains(@class,'inserted')]//button)[%s]", TabType,Description));
				this.click(btnComplete, DescriptionName);
			}

			String[] description = DescriptionName.split("\n");
			Value = description[0];

		}

		if(TabType.equals("current") || TabType.equals("prn"))
		{
		this.click(btnAdminister, "Button Administer");
		}

		String[] arr = new String[2];
		if(TabType.equals("current") || TabType.equals("prn"))
		{
		arr[0] = Value;
		}
		else if(TabType.equals("followup") )
		{
			
		 String[] Value1 =Value.split(" -");
		 String newValue = Value1[0];
		 arr[0] = newValue;
		}
		
		arr[1] = RoutineCount;
		return arr;		

	}
	
	
	public void PreAdministrationRequirementsValidation(String Comment)
	{
		try
		{
			if(this.isElementPresent(txtPreAdministrationRequirements))
			{
				List<WebElement> Boxs = wd.findElements(By.xpath("//h4[text()='Pre Administration Requirements']/..//h5"));
				int OptionsNo = Boxs.size();
				for(int i=1;i<=OptionsNo;i++)
				{
					By IgnoreBox = By.xpath(String.format("(//*[text()='Pre Administration Requirements']/..//input[@formcontrolname='isSkipping'])[%s]", i));
					this.VerifyWebElementPresent(IgnoreBox, "Ignore Box Present");	
					By CompletechkBox = By.xpath(String.format("(//*[text()='Pre Administration Requirements']/..//input[@formcontrolname='value'])[%s]", i));
					if(this.isElementVisible(CompletechkBox))
					{
						this.VerifyWebElementPresent(CompletechkBox, "Complete Check Box Present");	
					}
					this.click(IgnoreBox, "Ignore Box");
					By IgnoreReasonBox = By.xpath(String.format("(//label[text()='Reason For Ingoring']/..//textarea[@formcontrolname='skipReason'])[%s]", i));
					this.SendKeysToElementClearFirst(IgnoreReasonBox, Comment);
				}
				
			}
		}

		catch(Exception e)
		{

		}

	}
	
	public void AdministrationsValidation(String Notes , String Amount , String Value)
	{
		try
		{
			this.VerifyWebElementPresent(headerAdministrations, "Administrations Present");
			this.VerifyWebElementPresent(btnAdministrationsSave, "Administrations Save Button Present");		
			this.VerifyWebElementPresent(typeAdministrationsNotes, "Administrations Notes Field Present");
			this.VerifyWebElementPresent(selectAdministrationsCode, "Administrations Code DropDown Present");

			this.SendKeysToElementClearFirst(typeAdministrationsNotes, Notes);
			List<WebElement> Options = wd.findElements(By.xpath("//div[contains(text(),'Administrations')]/..//select[@formcontrolname='administered']/option"));
			int OptionsNo = Options.size();
			ArrayList<String> Option = new ArrayList<String>();
			for(int i=1;i<=OptionsNo;i++)
			{
				Option.add(wd.findElement(By.xpath(String.format("(//div[contains(text(),'Administrations')]/..//select[@formcontrolname='administered']/option)[%s]", i))).getText());
			}

			this.testReport.logSuccess("Notes Available", String.format("Notes Available :- <mark>%s<mark/>", Option.toString()));

			String DrpDwnValue = Option.get(OptionsNo-1);
			
			this.SelectDropDownByText(selectAdministrationsCode, DrpDwnValue);
			//this.SelectDropDownByValue(selectAdministrationsCode, value);
			if(this.isElementPresent(inputAdministrationsAmount))
			{
				this.SendKeysToElementClearFirst(inputAdministrationsAmount, Amount);
			}
			
			if(this.isElementPresent(btnNonMedIntervention))
			{
				this.click(btnNonMedIntervention, "btnNonMedIntervention");				
				By OptionSelectAll = By.xpath("(//button//following-sibling::ul//a)[1]");
				this.click(OptionSelectAll, Value);
			}

			this.click(btnAdministrationsSave, "Administrations Save Button Present");
		}
		catch(Exception e)
		{
			//this.testReport.logException(ex, screenShotPath);
		}
	}
	
	public void AdministrationsMedicationNameValidation(String descriptionName)
	{
		try
		{
			By DescriptionName = By.xpath(String.format("//div[contains(@class,'card')]//h4[text()='%s']", descriptionName));
			this.VerifyWebElementPresent(DescriptionName, "Description In Administrations Page");
			if(this.isElementPresent(labelDescriptionDiagonosis))
			{
				this.VerifyWebElementPresent(labelDescriptionDiagonosis, "Diagonosis In Administrations Page");
				String labelDescriptionDiagonosisValue = wd.findElement(By.xpath("//div[contains(@class,'card')]//h5[text()='Diagnosis']//following-sibling::p")).getText();
				this.testReport.logSuccess("Diagonosis Available", String.format("Diagonosis Available :- <mark>%s<mark/>", labelDescriptionDiagonosisValue));
			}
			if(this.isElementPresent(labelLatestAdministrations))
			{
				this.VerifyWebElementPresent(labelLatestAdministrationsBy, "label Latest Administrations By");
				this.VerifyWebElementPresent(labelLatestAdministrationsWhen, "label Latest Administrations When");
				this.VerifyWebElementPresent(labelLatestAdministrationsReason, "label Latest Administrations Reason");
			}
			this.VerifyWebElementPresent(txtMedicationMonograph, "Medication Monograph");

		}

		catch(Exception e)
		{

		}
	}
	
	public void PostAdministrationRequirmentsVerification(String Comment)
	{
		try
		{
			if(this.isElementPresent(labelPostAdministrationRequirements))
			{
				List<WebElement> Boxs = wd.findElements(By.xpath("//div[contains(text(),'Post Administration Requirements')]/..//h5"));
				int OptionsNo = Boxs.size();
				for(int i=1;i<=OptionsNo;i++)
				{
					By IgnoreBox = By.xpath(String.format("(//div[contains(text(),'Post Administration Requirements')]/..//h5/..//input[@formcontrolname='isSkipping'])[%s]", i));
					this.VerifyWebElementPresent(IgnoreBox, "Ignore Box Present");		
					this.click(IgnoreBox, "Ignore Box");
					By IgnoreReasonBox = By.xpath(String.format("(//label[text()='Reason For Ingoring']/..//textarea[@formcontrolname='skipReason'])[%s]", i));
					this.SendKeysToElementClearFirst(IgnoreReasonBox, Comment);
					
					this.click(btnPostAdministrationRequirementsSave, "Post Administration Requirements Save Button");
				}
			}
		}
		catch(Exception e)
		{

		}
	}
	
	public static String getDate() 
    {	
        try
        {
            Calendar cal = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yy");
            String dt = sdf.format(cal.getTime());
            return dt;
        }
        catch(Exception e)
        {        	
            return "false";
        }
    }
	
	public void VerifyAdministrationHistoryOverLast24Hours(String descriptionName , String routineCount,String TabType) throws Throwable
	{
		try
		{
			BooleanCurrentTasks();
			if(TabType.equals("current"))
			{
				this.click(btnAdministerRoutine, "Button Administer Routine");
			}
			else if(TabType.equals("prn"))
			{
				this.click(btnAdministerPRN, "Button Administer PRN");
			}
			else if(TabType.equals("followup"))
			{
				this.click(btnAdministerFollowup, "Button Administer Followup");
			}

			List<WebElement> Descriptions = wd.findElements(By.xpath("//div[@class='card']//li[contains(@class,'inserted')]"));
			int Description = Descriptions.size();
			for(int i=1;i<=Description;i++)
			{
				String DescriptionName = wd.findElement(By.xpath(String.format("(//div[@class='card']//li[contains(@class,'inserted')])[%s]", i))).getText();
				String[] decription1 = DescriptionName.split("\n");

				String DescriptionValue = decription1[0];
				int len = decription1.length;

				String DescriptionValue1 = decription1[len-1];
				String[]  DescriptionValue2 =DescriptionValue1.split(" at");
				String DescriptionValue3 = DescriptionValue2[1];			
				String[] Description4 = DescriptionValue3.split("by");

				String DateAndTime = Description4[0];
				String[] dateAndtime = DateAndTime.split(",");

				String TIME = dateAndtime[1];
				String [] time = TIME.split(" ");
				String Time = time[1];
				String[] HourMinute = Time.split(":");
				String min = HourMinute[1];
				String hour = HourMinute[0];
				String HOURMINUTE = null ;
				if(min.endsWith("0"))				
				{
					if(hour.equals("12"))
					{
						String Hour = hour.replace("12", "0");						
						HOURMINUTE = Hour +":"+ min ;
					}

				}

				else
				{
					if(hour.equals("12"))
					{
						String Hour = hour.replace("12", "0");
						String Minute = min.replace("0","" );
						HOURMINUTE = Hour +":"+ Minute ;
					}
					else
					{
						String Minute = min.replace("0","" );			
						HOURMINUTE = HourMinute[0] +":"+ Minute ;
					}
				}

				for( int iStart=0 ; iStart<=5; iStart++)
				{
					Calendar now = Calendar.getInstance();
					now.add(Calendar.MINUTE, -iStart);
					
					int Value2 = now.get(Calendar.MONTH);
					int value3 = now.get(Calendar.DATE);
					
					String Value1 =(now.get(Calendar.HOUR)
							+ ":"
							+ now.get(Calendar.MINUTE));

					if(Value1.equals(HOURMINUTE))
					{
						this.testReport.logSuccess("Time Matching ", String.format("Save Time Matching <mark>%s<mark/> With the Current Timing  <mark>%s<mark/> ", Time,Value1) );
						break ;
					}

				}



				String RoutineCount = BooleanRoutinePRNFollowUpTab(TabType);

				if(DescriptionValue.equals(descriptionName) &&  (Integer.parseInt(routineCount)==Integer.parseInt(RoutineCount)+1) )
				{
					this.testReport.logSuccess("Administration History Over The Last 24 Hours", String.format("Administration History Over The Last 24 Hours display the Description <mark>%s<mark/> and removed from the Administration box For Routine Tab", DescriptionValue) );
					break ;

				}
				else if(DescriptionValue.equals(descriptionName) && (Integer.parseInt(routineCount)==Integer.parseInt(RoutineCount)))				
				{
					this.testReport.logSuccess("Administration History Over The Last 24 Hours", String.format("Administration History Over The Last 24 Hours not displaing the Description <mark>%s<mark/> and not removed from the Administration box For PRN Tab", DescriptionValue) );
					break ;
				}


			}
		}
		catch(Exception e)
		{

		}
	}
	
	public String CurrentTime()
	{
		LocalTime localTime = LocalTime.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm a");
		System.out.println(localTime.format(dateTimeFormatter));
		String Value = localTime.format(dateTimeFormatter);
		
		 Calendar now = Calendar.getInstance();
		 String Value1 =("Current time : " + now.get(Calendar.HOUR)
         + ":"
         + now.get(Calendar.MINUTE));
		 
		

		 System.out.println(Value1);
		return Value ;
	}

	public void FollowFieldValidation(String Notes) throws Throwable
	{
		try
		{
		this.VerifyWebElementPresent(txtFollowUp, "Follow Up");
		this.VerifyWebElementPresent(drpDwnFollowUpResult, "FollowUp Result");		
		
		List<WebElement> DrpDwnFollowUpResult = wd.findElements(By.xpath("//div[@class='modal-content']//select[@formcontrolname='administered']//option"));
		int FollowUpResultCount = DrpDwnFollowUpResult.size();
		ArrayList<String> FollowUpResultOptions = new ArrayList<String>();
		for(int i=1;i<=FollowUpResultCount;i++)
		{
			FollowUpResultOptions.add(wd.findElement(By.xpath(String.format("(//div[@class='modal-content']//select[@formcontrolname='administered']//option)[%s]",i))).getText());
			
		}
		
		this.testReport.logSuccess("FollowUp Result ", String.format("FollowUp Result Options <mark>%s<mark/> ", FollowUpResultOptions.toString()) );
		
		this.SelectDropDownByText(drpDwnFollowUpResult,FollowUpResultOptions.get(FollowUpResultCount-1) );
		
		this.VerifyWebElementPresent(drpDwnFollowUpmethod, "FollowUp method");
		
		List<WebElement> DrpDwnFollowUpmethod = wd.findElements(By.xpath("//div[@class='modal-content']//select[@formcontrolname='method']//option"));
		int FollowUpmethodCount = DrpDwnFollowUpmethod.size();
		ArrayList<String> FollowUpmethodOptions = new ArrayList<String>();
		for(int i=1;i<=FollowUpmethodCount;i++)
		{
			FollowUpmethodOptions.add(wd.findElement(By.xpath(String.format("(//div[@class='modal-content']//select[@formcontrolname='method']//option)[%s]",i))).getText());
			
		}
		
		this.testReport.logSuccess("FollowUp Method ", String.format("FollowUp Method Options <mark>%s<mark/> ", FollowUpmethodOptions.toString()) );
		
		this.SelectDropDownByText(drpDwnFollowUpmethod,FollowUpmethodOptions.get(FollowUpmethodCount-1) );
		
		this.VerifyWebElementPresent(drpDwnFollowUpPainLevel, "FollowUp Pain Level");
		
		List<WebElement> DrpDwnFollowUpPainLevel = wd.findElements(By.xpath("//div[@class='modal-content']//select[@formcontrolname='value']//option"));
		int FollowUpPainLevelCount = DrpDwnFollowUpPainLevel.size();
		ArrayList<String> FollowUpPainLevelOptions = new ArrayList<String>();
		for(int i=1;i<=FollowUpPainLevelCount;i++)
		{
			FollowUpPainLevelOptions.add(wd.findElement(By.xpath(String.format("(//div[@class='modal-content']//select[@formcontrolname='value']//option)[%s]",i))).getText());
			
		}
		
		this.testReport.logSuccess("FollowUp Pain Level ", String.format("FollowUp Pain Level Options <mark>%s<mark/> ", FollowUpPainLevelOptions.toString()) );
		
		this.SelectDropDownByText(drpDwnFollowUpPainLevel,FollowUpPainLevelOptions.get(FollowUpPainLevelCount-1) );
		
		this.VerifyWebElementPresent(TypeFollowUpNotes, "FollowUp Notes");
		this.SendKeysToElementClearFirst(TypeFollowUpNotes, Notes);
		this.VerifyWebElementPresent(btnFollowUpSave, "FollowUp Save Button");
		this.click(btnFollowUpSave, "FollowUp Save Button");
		}
		catch(Exception e)
		{
			
		}
		
	}
	
	
	public void ShowFutureOrdersConfirmTabValidation(String TabType , String RoutineCount) throws Throwable
	{
		try
		{
			this.VerifyWebElementPresent(btnShowFutureOrders, "Show Future Orders Button");
			this.VerifyWebElementPresent(txtShowFutureOrdersConfirm, "Show Future Orders Confirm Text");
			String ConfirmText = wd.findElement(By.xpath("//*[text()='Confirm']/..//..//*[contains(text(),'Are you sure')]")).getText();
			this.testReport.logSuccess("Confirm Text Present With Long Text", String.format("Confirm Text Present With Long Text :- <mark>%s<mark/>", ConfirmText));
			this.VerifyWebElementPresent(btnCancelShowFutureOrders, "Show Future Orders 'Cancel' Button");
			this.VerifyWebElementPresent(btnOkShowFutureOrders, "Show Future Orders 'OK' Button");
			this.click(btnOkShowFutureOrders, "Show Future Orders 'OK' Button");

			BooleanCurrentTasks();		
			String ShowFutureOrdersRoutineCount = BooleanRoutinePRNFollowUpTab(TabType);
			if(Integer.parseInt(ShowFutureOrdersRoutineCount)==(Integer.parseInt(RoutineCount)*2))
			{
				this.testReport.logSuccess("RoutineCount", String.format("display the counter :-  <mark>%s<mark/> just double of the previous before clicking on Future Orders :- <mark>%s<mark/>", ShowFutureOrdersRoutineCount,RoutineCount));
			}
			else
			{
				this.testReport.logFailure("RoutineCount", String.format("display the counter :-  <mark>%s<mark/> Not double of the previous before clicking on Future Orders :- <mark>%s<mark/>", ShowFutureOrdersRoutineCount,RoutineCount));
			}

			this.VerifyWebElementPresent(btnHideFutureOrders, "Hide Future Orders Button");
			this.click(btnHideFutureOrders, "Hide Future Orders Button");
			this.VerifyWebElementPresent(btnShowFutureOrders, "Show Future Orders Button");

		}
		catch(Exception e)
		{

		}

	}
	
	
	public void InterActionsTabValidation()
	{
		try
		{
			this.VerifyWebElementPresent(txtAvailableMedications, "Available Medications");
			this.VerifyWebElementPresent(txtInteractionsResult, "Interaction results will be displayed here.");
			this.VerifyWebElementPresent(txtAvailableMedicationsDescription, "Available Medications Description");
			this.VerifyWebElementPresent(btnInteractionType, "Interaction Type Button");
			List<WebElement> ChkBx = wd.findElements(By.xpath("//div[contains(text(),'Available Medications')]/..//input"));
			int ChkBxCount = ChkBx.size();
			this.testReport.logSuccess("Total CheckBox", String.format("Total CheckBox Present :-  <mark>%s<mark/> ",ChkBxCount ));
			By DescriptionChkBx = By.xpath("(//div[contains(text(),'Available Medications')]/..//input)[1]");
			this.VerifyWebElementPresent(DescriptionChkBx, "Description Check Box");
			this.click(DescriptionChkBx, "Description Check Box");

			List<WebElement> spans = wd.findElements(By.xpath("//datatable-body-row//div[@class='datatable-body-cell-label']//span"));
			int spansCount = spans.size();
			ArrayList<String> Span = new ArrayList<String>();

			for(int i=2 ; i<=spansCount ; i+=2)
			{
				Span.add(wd.findElement(By.xpath(String.format("(//datatable-body-row//div[@class='datatable-body-cell-label']//span)[%s]", i))).getText());
			}

			this.testReport.logSuccess("Medicine Presents", String.format("Medicine Presents :-  <mark>%s<mark/> ",Span.toString() ));
			
			String SelectedTxt = wd.findElement(By.xpath("//div[contains(text(),'Available Medications')]/..//span[contains(text(),'selected')]")).getText();
			this.testReport.logSuccess("Selected Present With Count Number", String.format("Selected Present With Count Number :-  <mark>%s<mark/> ",SelectedTxt ));
		}
		catch(Exception e)
		{

		}

	}
	
	
	public void InterActionsTypeButtonValidation()
	{
		try
		{
			this.click(btnInteractionType, "Interaction Type Button");
			
			List<WebElement> Button = wd.findElements(By.xpath("//div[@class='dropdown-menu show']//button"));
			int ButtonCount = Button.size();
			ArrayList<String> BUTTON = new ArrayList<String>();
			
			for(int i=1; i<=ButtonCount ; i++)
			{
				//BUTTON.add(wd.findElement(By.xpath(String.format("(//div[@class='dropdown-menu show']//button)[%s]", i))).getText());
				String ButtonName = wd.findElement(By.xpath(String.format("(//div[@class='dropdown-menu show']//button)[%s]", i))).getText();
				By button = By.xpath(String.format("(//div[@class='dropdown-menu show']//button)[%s]", i));
				this.click(button, ButtonName);
				this.waitInSecs(5);
				if(this.isElementPresent(txtNoInteractionsFound))
				{
					this.testReport.logSuccess("Interaction Type", String.format("No Interactions Found for Interaction Type :-  <mark>%s<mark/> ",ButtonName));
				}
				else
				{
					this.testReport.logSuccess("Interaction Type", String.format("Interactions Found for Interaction Type :-  <mark>%s<mark/> ",ButtonName));
				}
				this.click(btnInteractionType, "Interaction Type Button");
			}
			
			
			
			
		}
		catch(Exception e)
		{

		}

	}
	
	
	public void LostOrDisposedMedTabCountVerification(String Amount , String Notes)
	{
		try
		{		
			List<WebElement> Medications = wd.findElements(By.xpath("//ul[@formarrayname='medications']//li"));
			int MedicationsCount = Medications.size();
			
				for(int i=1; i<=MedicationsCount;i++)
				{
					String MedicationName = wd.findElement(By.xpath(String.format("(//ul[@formarrayname='medications']//li//h5)[%s]", i))).getText();
					String ControlName = wd.findElement(By.xpath(String.format("(//ul[@formarrayname='medications']//li//span)[%s]", i))).getText();
					this.testReport.logSuccess("Control Name", String.format("Control Present :-  <mark>%s<mark/> ",ControlName));
							
					By drpDwnReason = By.xpath(String.format("(//ul[@formarrayname='medications']//li//select)[%s]", i));
					this.VerifyWebElementPresent(drpDwnReason, MedicationName+":-" + " Reason Present");

					List<WebElement> drpDwnReasonOptions = wd.findElements(By.xpath(String.format("(//ul[@formarrayname='medications']//li//select)[%s]/option",i)));
					int ReasonOptionsCount = drpDwnReasonOptions.size();
					ArrayList<String> ReasonOptions = new ArrayList<String>();
					for(int j=1; j<=ReasonOptionsCount;j++)
					{
						ReasonOptions.add(wd.findElement(By.xpath(String.format("((//ul[@formarrayname='medications']//li//select)[%s]/option)[%s]", i,j))).getText());
					}

					this.testReport.logSuccess("Reason Options", String.format("Reason Options :-  <mark>%s<mark/> for Medicine :- <mark>%s<mark/> ",ReasonOptions.toString(),MedicationName));
					this.SelectDropDownByText(drpDwnReason, ReasonOptions.get(ReasonOptionsCount-1));

					By inputAmount = By.xpath(String.format("(//ul[@formarrayname='medications']//li//input[@formcontrolname='amount'])[%s]", i));
					this.VerifyWebElementPresent(inputAmount, MedicationName+":-" + " Amount Present");
					this.SendKeysToElementClearFirst(inputAmount, Amount);

					By inputNote = By.xpath(String.format("(//ul[@formarrayname='medications']//li//textarea[@formcontrolname='note'])[%s]", i));
					this.VerifyWebElementPresent(inputNote, MedicationName+":-" + " Note Present");
					this.SendKeysToElementClearFirst(inputNote, Notes);

				}
			
		}
		catch(Exception e)
		{

		}
	}
	
	public int LostOrDisposedMedButtonVerification()
	{
		
		this.VerifyWebElementPresent(btnLostoRDisposedTabSubmit, "Submit Button");
		String Comment = wd.findElement(By.xpath("//ul[@formarrayname='medications']//following-sibling::p")).getText();
		this.testReport.logSuccess("Comment", String.format("Comment Present :-  <mark>%s<mark/> ",Comment));
		List<WebElement> SignButtons = wd.findElements(By.xpath("//button[contains(@class,'primary')]/i"));
		int SignButtonsCount = SignButtons.size();
		this.testReport.logSuccess("Sign Button", String.format("Sign Button Count :-  <mark>%s<mark/> ",SignButtonsCount));
		
		List<WebElement> Medications = wd.findElements(By.xpath("//ul[@formarrayname='medications']//li"));
		int MedicationsCount = Medications.size();
		
		return MedicationsCount ;
		
	}
	
	
	public void doubleSignWithCredentials(String userName, String password, String userName1 , String password1 )
	{
		List<WebElement> SignButtons = wd.findElements(By.xpath("//button[contains(@class,'primary')]/i"));
		int SignButtonsCount = SignButtons.size();

		for(int i=1; i<=SignButtonsCount;i++)
		{
			By SignButton = By.xpath("(//button[contains(@class,'primary')]/i)[1]");
			this.click(SignButton, "Sign Button");			
			switch(i) 
			{
			case 1:	login(userName , password);
			break ;
			case 2:	login(userName1 , password1);
			break ;
			}
			if(this.isElementPresent(btnSignVerify))
			{
				this.click(btnSignVerify, "Sign Verify");
			}
			
			String verified = wd.findElement(By.xpath(String.format("(//div[contains(@class,'text-success')])[%s]", i))).getText();
			this.testReport.logSuccess("Verified By User", String.format("Verified By User with UserName :-  <mark>%s<mark/> ",verified));
		}
		
		

	}
	
	public void SubmitLostOrDisposedMed()
	{
		this.click(btnLostoRDisposedTabSubmit, "Submit Button");
		if(wd.findElement(msgSave).isDisplayed())
		{
			this.testReport.logSuccess("reason will be updated", "<mark><mark>Submit Reason will be updated <mark><mark/> ");
		}
		
		
	}
	
	public String GetCurrentDateInCalenderFormat()
	{
		 Calendar now = Calendar.getInstance();
		 int Date =now.get(Calendar.DATE) ; 
		 String Month = now.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH );
		 String Day = now.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.ENGLISH );		
		 int Year = now.get(Calendar.YEAR);
		 
		 String CurrentDate = (Day +", "+ Month + " " + Integer.toString(Date) + ", " + Integer.toString(Year));
		 return CurrentDate;
	}
	
	
	public void VerifyPastAdministrationsTab(String Task)
	{
		BooleanTasks(Task);
		this.VerifyWebElementPresent(dateFrmtAdministrationDate , "Administration Date");
		this.VerifyWebElementPresent(labelPastAdministrations, "Past Administrations");
		this.VerifyWebElementPresent(btnApply, "Apply");		
		String CurrentDate = GetCurrentDateInCalenderFormat();		 
        this.click(btnCalender, "Calender Icon");
        By Date = By.xpath(String.format("//div[@aria-label='%s']/div", CurrentDate));
        this.click(Date, CurrentDate);        
        this.click(btnApply, "Apply");
		
	}
	
	
	public String AdministrationBooleanRoutinePRNFollowUpTab(String TabType)
	{	
		String Value = null;
		if(TabType.equals("current"))
		{
			 Value ="1";
		}
		else if(TabType.equals("prn"))
		{
			 Value ="2";
		}
		else if(TabType.equals("followup"))
		{
			 Value ="3";
		}		
		boolean tab = wd.findElement(By.xpath(String.format("(//div[@class='card-body']//a[contains(@id,'ngb-tab')])[%s]",Value))).getAttribute("aria-expanded").equals("true");
		if(!tab)
		{
			By AdministrationTabButton = By.xpath(String.format("(//div[@class='card-body']//a[contains(@id,'ngb-tab')])[%s]",Value));
					
			this.click(AdministrationTabButton,"Administer Tab Button");
		}

		this.waitInSecs(5);
		String RoutineCount = wd.findElement(By.xpath(String.format("(//div[@class='card-body']//a[contains(@id,'ngb-tab')])[%s]//span",Value))).getText();
		return RoutineCount;
	}
	
	public String[] VerifyTabsForAdministrations(String Task, String TabType)
	{
		String AdministrationDescription = null ;
		BooleanTasks(Task);
		String RoutineCount = AdministrationBooleanRoutinePRNFollowUpTab(TabType);
		
		if((Integer.parseInt(RoutineCount)!=0))
		{
			List<WebElement> Description = wd.findElements(By.xpath("//div[@role='tabpanel']//li//div//h5"));
			int DescriptionNo = Description.size();
			ArrayList<String> DescriptionName = new ArrayList<String>();
			for(int i=1;  i<=DescriptionNo;i++ )
			{
				DescriptionName.add(wd.findElement(By.xpath(String.format("(//div[@role='tabpanel']//li//div//h5)[%s]", i))).getText());
			}
			
		

			List<WebElement> TimeStamp = wd.findElements(By.xpath("//div[@role='tabpanel']//li//div//span[@ng-reflect-klass='badge']"));
			int TimeStampNo = TimeStamp.size();
			ArrayList<String> TimeStampName = new ArrayList<String>();
			for(int i=1;  i<=TimeStampNo;i++ )
			{
				TimeStampName.add(wd.findElement(By.xpath(String.format("(//div[@role='tabpanel']//li//div//span[@ng-reflect-klass='badge'])[%s]", i))).getText());
			}

			this.testReport.logSuccess("Descriptions and Time Stamp", String.format("Descriptions and Time Stamp Present :- <mark>%s<mark/> and <mark>%s<mark/> ", DescriptionName.toString(), TimeStampName.toString()));


			List<WebElement> Descriptions = wd.findElements(By.xpath("//div[@role='tabpanel']//li[contains(@ng-reflect-klass,'list-group')]"));
			int DescriptionNO = Descriptions.size();

			
			for(int i=1;i<=DescriptionNO;i++)
			{
				String DesName = wd.findElement(By.xpath(String.format("(//div[@role='tabpanel']//li[contains(@ng-reflect-klass,'list-group')])[%s]", i))).getText();
				String[] decription1 = DesName.split("\n");				
				int len = decription1.length;
				String ResidentName = decription1[len-1];	
				AdministrationDescription = decription1[0];
				this.testReport.logSuccess("Resident With Type",String.format("Resident With Type Present :- <mark>%s<mark/>", ResidentName));

			}			
			
			List<WebElement> EditButton = wd.findElements(By.xpath("//button[text()='Edit']"));
			int EditButtonNO = EditButton.size();
			List<WebElement> UndoButton = wd.findElements(By.xpath("//button[text()='Undo']"));
			int UndoButtonNO = UndoButton.size();

			this.testReport.logSuccess("Edit And Undo Button No ", String.format("Edit And Undo Button Present :- <mark>%s<mark/> and <mark>%s<mark/> ", EditButtonNO,UndoButtonNO ));
            
			

		}
		String[] arr = new String[2];
		arr[0]= AdministrationDescription;
		arr[1] = RoutineCount ;
		
		return arr;
		
	}
	
	
	public void EditUndoButtonVerification(String TabType , String RoutineCount)
	{
		By EditButton = By.xpath("(//button[text()='Edit'])[1]");
		this.click(EditButton, "Edit Button");
		this.VerifyWebElementPresent(txtEditAdministration, "Edit Administration");
		this.VerifyWebElementPresent(btnEditadministrationClose, "Edit Administration Close Button");
		this.VerifyWebElementPresent(labelOrderDescription, "Order Description");
		this.VerifyWebElementPresent(labelAdministered, "Administered");
		this.VerifyWebElementPresent(labelInstruction, "Instruction");
		this.VerifyWebElementPresent(labelNotes, "Notes");
		this.VerifyWebElementPresent(labelStatus, "Status");
		this.VerifyWebElementPresent(btnEditadministrationSave, "Edit Administration Save Button");
		this.click(btnEditadministrationClose, "Edit Administration Close Button");

		By UndoButton = By.xpath("(//button[text()='Undo'])[1]");
		this.click(UndoButton, "Undo Button");
		this.VerifyWebElementPresent(UndoModelTitle, "Confirm");
		this.VerifyWebElementPresent(UndoCancel, "Cancel");
		this.VerifyWebElementPresent(UndoOK, "OK");
		this.click(UndoOK, "OK");
		this.waitInSecs(2);

		String NewRoutineCount = AdministrationBooleanRoutinePRNFollowUpTab(TabType);
		if((Integer.parseInt(RoutineCount))==(Integer.parseInt(NewRoutineCount)+1))
		{
			this.testReport.logSuccess(" Undo button Verification", String.format("Clicking on Undo button under Routine tab to revert the changes made on past administration med"));
		}
		else
		{
			this.testReport.logFailure(" Undo button Verification", String.format("Clicking on Undo button under Routine tab to revert the changes not made on past administration med"));
		}		

	}
}











