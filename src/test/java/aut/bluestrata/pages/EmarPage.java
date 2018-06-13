package aut.bluestrata.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.testreport.IReporter;

import dweb.aut.pages.templates.PageTemplate;

public class EmarPage extends PageTemplate {

	public EmarPage(WebDriver webDriver, IReporter testReport) {
		super(webDriver, testReport);
		
	}
	
	public By btnTester = By.xpath("//a[@id='userDropDown']");
	public By btnlogout = By.xpath("//a[@id='userDropDown']/..//div/a[text()='Logout']");
	public By btnChangePassword = By.xpath("//a[@id='userDropDown']/..//div/a[text()='Change Password']");
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
	
	public void NavigateBackToPrviesPage()
	{
		wd.navigate().back();
	}
	
	public void HelpButtonvalidation()
	{
		this.click(btnHelp, "Help");
		List<WebElement> Buttons = wd.findElements(By.xpath("//a[@id='helpDropDown']/..//div/a"));
		int NoOfButtons = Buttons.size();
		ArrayList<String> Optins = new ArrayList<String>();
		for(int i=1; i<=NoOfButtons ; i++)
		{
			Optins.add((wd.findElement(By.xpath("//a[@id='helpDropDown']/..//div/a"))).getText());
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
		this.VerifyWebElementPresent(btnManageInventory ,"Manage Inventory");
		this.VerifyWebElementPresent(btnReports ,"Reports");
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
	}
		

