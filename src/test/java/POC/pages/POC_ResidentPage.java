package POC.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.testreport.IReporter;

import dweb.aut.pages.templates.PageTemplate;

public class POC_ResidentPage extends PageTemplate {

	public POC_ResidentPage(WebDriver webDriver, IReporter testReport) {
		super(webDriver, testReport);
		// TODO Auto-generated constructor stub
	}
	
	public By iconBigLogOut = By.xpath("//img[contains(@src,'BigLogout')]");
	public By txtSelfPerforment = By.xpath("//span[text()='Self Performance']");
	public By txtSupport = By.xpath("//span[text()='Support']");
	public By btnEdit = By.xpath("//img[contains(@src,'Edit')]/ancestor::button");
	public By txtKioskNotesInformation = By.xpath("//div[contains(@class,'border')]/following-sibling::div//div[contains(@class,'border')]");
	public By btnEditShift = By.xpath("//img[contains(@src,'Calendar')]/ancestor::button");
	public By txtActivity = By.xpath("//*[text()='Activity']");
	public By txtSelfPerformance = By.xpath("//*[text()='Self Performance']");
	public By textSupport = By.xpath("//*[text()='Support']");
	public By txtAdditionalAnswer = By.xpath("//*[text()='Additional Answer']");
	public By txtDateRecorded = By.xpath("//*[text()='Date Recorded']");
	public By txtRecordedBy = By.xpath("//*[text()='Recorded By']");
	public By txtNotes = By.xpath("//*[text()='Notes']");
	By SelfPerformanceImg = By.xpath("//div[@id='collapse1']//following-sibling::div//img[contains(@src,'SelfPerformance')]");
	By SelfPerformanceText = By.xpath("//div[@id='collapse1']//following-sibling::div//span[text()='Self Performance']");
	By SupportImg = By.xpath("//div[@id='collapse1']//following-sibling::div//img[contains(@src,'Support')]");
	By SupportText = By.xpath("//div[@id='collapse1']//following-sibling::div//span[text()='Support']");
	By btnSubmenu = By.xpath("//div[@id='adl-answer-child-modal']//button[@aria-expanded='false']/img[contains(@src,'SubMenu')]");
	By btnRefuse =  By.xpath("//div[@id='adl-answer-child-modal']//button/img[contains(@src,'Stophand')]");
	By btnOutOfFacility = By.xpath("//div[@id='adl-answer-child-modal']//button/img[contains(@src,'ADLSubMenu')]");
	By btnNotes = By.xpath("//div[@id='adl-answer-child-modal']//button[@data-backdrop='static']/img[contains(@src,'EnterNotes')]");
	By enterNotesKeyboardText = By.xpath("//div[contains(@class,'keyboard-preview')]//*");
	By enterNotesKeyBoard = By.xpath("//div[contains(@name,'normal')]");
	By enterNotesbtnCancel = By.xpath("//button[@data-dismiss='modal' and @type='button']//img[contains(@src,'Cancel')]");
	By enterNotesbtnSave = By.xpath("//button[@data-dismiss='modal' and @type='button']//img[contains(@src,'Select')]");
	
	By btnBack = By.xpath("//*[text()='Back']/ancestor::button");
	
	
	
	public void VerifyResidentDashBoard()
	{
		List<WebElement> Span = wd.findElements(By.xpath("//div[@class='information']//span"));
		ArrayList<String> Spans = new ArrayList<String>();
		for(int i=1;i<=Span.size();i++)
		{
			Spans.add(wd.findElement(By.xpath(String.format("(//div[@class='information']//span)[%s]",i))).getText());
		}
		this.testReport.logSuccess("Resident DashBoard Details", String.format("Resident DashBoard Details :- <mark>%s<mark/>", Spans.toString()));
	}
	
	public void SelectUserByName(String UserName)
	{
		By User = By.xpath(String.format("//*[text()='%s']", UserName));
		this.click(User, UserName);
	}
	
	public void VerifyResidentDetails()
	{
		List<WebElement> Span = wd.findElements(By.xpath("//div[@class='information bg']//span"));
		ArrayList<String> Spans = new ArrayList<String>();
		for(int i=1;i<=Span.size();i++)
		{
			Spans.add(wd.findElement(By.xpath(String.format("(//div[@class='information bg']//span)[%s]",i))).getText());
		}
		
		this.testReport.logSuccess("Resident Details", String.format("Resident Details :- <mark>%s<mark/>", Spans.toString()));
	}
	
	public void VerifyCarePlansInResidentPage()
	{
		List<WebElement> CarePlans = wd.findElements(By.xpath("//div[contains(@class,'text-center')]//p"));
		ArrayList<String> CarePlan = new ArrayList<String>();
		for(int i=1;i<=CarePlans.size();i++)
		{
			CarePlan.add(wd.findElement(By.xpath(String.format("(//div[contains(@class,'text-center')]//p)[%s]",i))).getText());
		}
		
		this.testReport.logSuccess("All Care Plans", String.format("All Care Plans :- <mark>%s<mark/>", CarePlan.toString()));
	}
	
	public void BigLogoutFromApplication()
	{
		if(this.isElementPresent(iconBigLogOut))
		{
			this.click(iconBigLogOut, "Big Log Out");
		}
	}
	
	public By ClickOnCarePlanes(String CarePlan)
	{
		return By.xpath(String.format("//button[contains(@class,'has-hover shadow')]//*[text()='%s']",CarePlan));
	}
	
	public void SelectActivityOptionFromMatrix(String Activity)
	{
		this.click(ClickOnCarePlanes(Activity), Activity);
	}
	
	public void VerifyADLsSelfPerformentAndSupport()
	{		
		this.VerifyWebElementPresent(txtSelfPerforment, "Self Performent");
		this.VerifyWebElementPresent(txtSupport, "Support");
		
		List<WebElement> Activities = wd.findElements(By.xpath("(//div[contains(@class,'flex flex') and contains(@class,'stretch flex-column')])"));
		
		String Activity = null ;
		for(int i=1;i<=Activities.size();i++)
		{
			Activity = wd.findElement(By.xpath(String.format("(//div[contains(@class,'flex flex') and contains(@class,'stretch flex-column')])[%s]//div[contains(@class,'py')]", i))).getText();
		    
			List<WebElement> NoData = wd.findElements(By.xpath(String.format("((//div[contains(@class,'flex flex') and contains(@class,'stretch flex-column')])[%s]//img[contains(@src,'General')])",i)));
		
			for(int j=1;j<=NoData.size();j++)
			{
				this.VerifyWebElementPresent(By.xpath(String.format("((//div[contains(@class,'flex flex') and contains(@class,'stretch flex-column')])[%s]//img[contains(@src,'General')])[%s]",i,j)), String.format("Under <mark>%s<mark/> presented No Data :- <mark>%s<mark/>", Activity,j));
			}
		}
		
	}
	
	public void PageZoomOut() throws AWTException
	{
		this.waitInSecs(1);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ADD);
		robot.keyRelease(KeyEvent.VK_ADD);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		this.waitInSecs(2);
	}
	
	public void AddADLsActivities(String SelfPerformance , String Support) throws AWTException
	{
		PageZoomOut();

		List<WebElement> Activities = wd.findElements(By.xpath("//button[contains(@class,'shadow') and contains(@class,'yellow')]//p"));
																														//btn-block
		ArrayList<String> Activity = new ArrayList<String>();
		for(int i=1;i<=Activities.size();i++)
		{
			Activity.add(wd.findElement(By.xpath(String.format("(//button[contains(@class,'shadow') and contains(@class,'yellow')]//p)[%s]",i))).getText());
		}
		this.testReport.logSuccess("Activities Under ADLs", String.format("Activities Under ADLs :-<mark>%s<mark/>", Activity.toString()));
		String[] AllActivities = Activity.toArray(new String[Activity.size()]);

		for(int i=1;i<=Activities.size();i++)
		{
			String ActivityName = AllActivities[i-1];
			if(!ActivityName.equals(null))
			{
				this.click(By.xpath(String.format("//button//*[contains(text(),'%s')]", ActivityName)), ActivityName);
				//this.click(By.xpath(String.format("(//button[contains(@class,'has-hover shadow')])[%s]//*[contains(@class,'center')]", i)), ActivityName);

				By Activityname = By.xpath(String.format("//div[@id='adl-answer-child-modal']//span[text()='%s']", ActivityName));
				this.VerifyWebElementPresent(Activityname, ActivityName);

				By Selfperformance = By.xpath(String.format("(//div[@id='adl-answer-child-modal']//button//*[text()='%s'])[1]", SelfPerformance));
				this.click(Selfperformance, SelfPerformance);

				By support = By.xpath(String.format("(//div[@id='adl-answer-child-modal']//button[@is-disabled='false']//*[contains(text(),'%s')])", Support));
				this.click(support, Support);
				
				if(this.isElementPresent(btnBack))
				{
					this.click(btnBack, "Back Button");
				}
				
			}


		}


	}
	
	public void SelectedActivity(String ActivityName)
	{			
		this.click(By.xpath(String.format("//button//*[contains(text(),'%s')]", ActivityName)), ActivityName);
		
		By Activityname = By.xpath(String.format("//div[@id='adl-answer-child-modal']//span[text()='%s']", ActivityName));
		this.VerifyWebElementPresent(Activityname, ActivityName);
		
	}
	
	public void EditingAndRemovingADLsRecords()
	{
		try
		{
			boolean EditButton = wd.findElement(btnEdit).getAttribute("is-disabled").equals("false");
			if(EditButton)
			{
				this.click(btnEdit, "Edit Button");
			}

			List<WebElement> CreatedActivites = wd.findElements(By.xpath("//div[@class='j-border bg-white']//div[contains(@class,'font-weight-bold')]"));
			if(CreatedActivites.size()>0)
			{
				for(int i=CreatedActivites.size();i>=1;i--)
				{
					this.click(By.xpath(String.format("(//div[@class='j-border bg-white']//div[contains(@class,'font-weight-bold')])[%s]",i)), "Created Activity");
					this.click(By.xpath("//*[text()='Delete']/ancestor::button[contains(@is-disabled,'false')]"), "Delete");
					this.waitInSecs(2);
				}
				
				this.click(btnBack, "Back Button");
			}

			
		}
		catch(Exception e)
		{
			e.getMessage();
		}

	}
	
	public void VerifyADLResidentKioskNotes()
	{
		this.VerifyWebElementPresent(txtKioskNotesInformation, "Kiosk Notes Information");
		String NotesText = wd.findElement(txtKioskNotesInformation).getText();
		this.testReport.logSuccess("Kiosk Notes Information", String.format("Kiosk Notes Information Text :- <mark>%s<mark/>", NotesText));
	}
	
	public void EditADLEntryForShifts()
	{
		this.VerifyWebElementPresent(btnEditShift, "Edit Shift Button");
		List<WebElement> Dates = wd.findElements(By.xpath("//button[contains(@class,'border-dark')]//div[contains(@class,'text-bold')]"));
		for(int i=1;i<=Dates.size();i++)
		{
			By date = By.xpath(String.format("(//button[contains(@class,'border-dark')]//div[contains(@class,'text-bold')])[%s]", i));
			this.click(date,wd.findElement(date).getText());
			if(this.isElementPresent(By.xpath("//table[contains(@class,'table')]")))
			{
				VerifyTableForEditADLsEntryForShifts();
			}
			
		}
		this.click(By.xpath("//button[contains(@class,'border-dark')]//img[contains(@src,'Cancel')]"), "Cancel");
	}
	
	public void VerifyTableForEditADLsEntryForShifts()
	{
		this.VerifyWebElementPresent(txtActivity, "Activity");
		this.VerifyWebElementPresent(txtSelfPerformance, "Self Performance");
		this.VerifyWebElementPresent(textSupport, "Support");
		this.VerifyWebElementPresent(txtAdditionalAnswer, "Additional Answer");
		this.VerifyWebElementPresent(txtDateRecorded, "Date Recorded");
		this.VerifyWebElementPresent(txtRecordedBy, "Recorded By");
		this.VerifyWebElementPresent(txtNotes, "Notes");
		
		List<WebElement> Activity = wd.findElements(By.xpath("//tbody//tr/td[1]"));
		ArrayList<String> Activities = new ArrayList<String>();
		for(int i=1;i<=Activity.size();i++)
		{
			Activities.add(wd.findElement(By.xpath(String.format("(//tbody//tr/td[1])[%s]", i))).getText());
		}
		this.testReport.logSuccess("Activity List", String.format("Activity List :- <mark>%s<mark/>", Activities.toString()));
		
		List<WebElement> SelfPerformance = wd.findElements(By.xpath("//tbody//tr/td[2]"));
		ArrayList<String> SelfPerformances = new ArrayList<String>();
		for(int i=1;i<=SelfPerformance.size();i++)
		{
			SelfPerformances.add(wd.findElement(By.xpath(String.format("(//tbody//tr/td[2])[%s]", i))).getText());
		}		
		this.testReport.logSuccess("Self Performance List", String.format("Self Performance List :- <mark>%s<mark/>", SelfPerformances.toString()));
		
		List<WebElement> Support = wd.findElements(By.xpath("//tbody//tr/td[3]"));
		ArrayList<String> Supports = new ArrayList<String>();
		for(int i=1;i<=Support.size();i++)
		{
			Supports.add(wd.findElement(By.xpath(String.format("(//tbody//tr/td[3])[%s]", i))).getText());
		}
		this.testReport.logSuccess("Support List", String.format("Support List :- <mark>%s<mark/>", Supports.toString()));
		
		List<WebElement> AdditionalAnswer = wd.findElements(By.xpath("//tbody//tr/td[4]"));
		ArrayList<String> AdditionalAnswers = new ArrayList<String>();
		for(int i=1;i<=AdditionalAnswer.size();i++)
		{
			AdditionalAnswers.add(wd.findElement(By.xpath(String.format("(//tbody//tr/td[4])[%s]", i))).getText());
		}
		this.testReport.logSuccess("Additional Answer List", String.format("Additional Answer List :- <mark>%s<mark/>", AdditionalAnswers.toString()));
		
		List<WebElement> DateRecorded = wd.findElements(By.xpath("//tbody//tr/td[5]"));
		ArrayList<String> DateRecords = new ArrayList<String>();
		for(int i=1;i<=DateRecorded.size();i++)
		{
			DateRecords.add(wd.findElement(By.xpath(String.format("(//tbody//tr/td[5])[%s]", i))).getText());
		}
		
		this.testReport.logSuccess("Date Recorded List", String.format("Date Recorded List :- <mark>%s<mark/>", DateRecords.toString()));
		
		List<WebElement> RecordedBy = wd.findElements(By.xpath("//tbody//tr/td[6]"));
		ArrayList<String> Records = new ArrayList<String>();
		for(int i=1;i<=RecordedBy.size();i++)
		{
			Records.add(wd.findElement(By.xpath(String.format("(//tbody//tr/td[1])[%s]", i))).getText());
		}
		this.testReport.logSuccess("Recorded By List", String.format("Recorded By List :- <mark>%s<mark/>", Records.toString()));
		
	}
	
	
	public void VerifyColourBeforeSelectingOptions(String ActivityName)
	{
		try
		{
		boolean ActivityTabColour = wd.findElement(By.xpath(String.format("//button//*[contains(text(),'ActivityName')]/ancestor::button",ActivityName))).getAttribute("class").contains("yellow");
		if(ActivityTabColour)
		{
			this.testReport.logSuccess("Tab Colour", String.format("Tab Colour of :-<mark>%s<mark/> is yellow", ActivityName));
		}
		else
		{
			this.testReport.logFailure("Tab Colour", String.format("Tab Colour of :-<mark>%s<mark/> is not yellow", ActivityName));
		}
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void VerifyColourAfterSelectingOptions(String ActivityName)
	{
		try
		{
		boolean ActivityTabColour = wd.findElement(By.xpath(String.format("//button//*[contains(text(),'ActivityName')]/ancestor::button",ActivityName))).getAttribute("class").contains("blue");
		if(ActivityTabColour)
		{
			this.testReport.logSuccess("Tab Colour", String.format("Tab Colour of :-<mark>%s<mark/> is Blue", ActivityName));
		}
		else
		{
			this.testReport.logFailure("Tab Colour", String.format("Tab Colour of :-<mark>%s<mark/> is not Blue", ActivityName));
		}
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void VerifyActivityCapabilities(String Activity)
	{
		try
		{
			this.VerifyWebElementPresent(btnSubmenu, "Sub Menu");
			this.click(btnSubmenu, "Sub Menu");
			this.VerifyWebElementPresent(btnRefuse, "Refuse");
			this.VerifyWebElementPresent(btnOutOfFacility, "Out Of Facility");
			this.click(btnRefuse, "Refuse");
			SelectActivityOptionFromMatrix(Activity);
			this.click(btnSubmenu, "Sub Menu");
			this.click(btnOutOfFacility, "Out Of Facility");
			SelectActivityOptionFromMatrix(Activity);
			this.VerifyWebElementPresent(btnNotes, "Enter Notes");
			this.click(btnNotes, "Enter Notes");
			this.VerifyWebElementPresent(enterNotesKeyboardText, "Enter Notes Keyboard Text");
			this.VerifyWebElementPresent(enterNotesKeyBoard, "Enter Notes KeyBoard");
			this.VerifyWebElementPresent(enterNotesbtnCancel, "Enter Notes Cancel Button");
			this.VerifyWebElementPresent(enterNotesbtnSave, "Enter Notes Save Button");
			
			this.click(enterNotesbtnCancel, "Enter Notes Cancel Button");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public String[] VerifyActivitySelfPerformanceAndSupport(String SelfPerformance , String Support)
	{
		String[] OPTION = {SelfPerformance,Support};
		try
		{
			
			this.VerifyWebElementPresent(SelfPerformanceImg, "Self Performance");
			this.VerifyWebElementPresent(SelfPerformanceText, "Self Performance Text");
			this.VerifyWebElementPresent(SupportImg, "Support ");
			this.VerifyWebElementPresent(SupportText, "Support Text");

			List<WebElement> Options = wd.findElements(By.xpath("//div[@id='collapse1']//following-sibling::div//button//img[contains(@src,'Main')]/ancestor::button//figcaption/span"));
			ArrayList<String> Option = new ArrayList<String>();
			for(int i=1;i<=Options.size();i++)
			{
				Option.add(wd.findElement(By.xpath(String.format("(//div[@id='collapse1']//following-sibling::div//button//img[contains(@src,'Main')]/ancestor::button//figcaption/span)[%s]", i))).getText());
			}
			
			this.testReport.logSuccess("All Options Present Under Self Performance And Support ",
					String.format("All Options Present Under Self Performance And Support :- <mark>%s<mark/>", Option.toString()));
			
			By Selfperformance = By.xpath(String.format("(//div[@id='adl-answer-child-modal']//button//span[contains(text(),'%s')])[1]", SelfPerformance));
			this.click(Selfperformance, SelfPerformance);

			By support = By.xpath(String.format("(//div[@id='adl-answer-child-modal']//button[@is-disabled='false']//span[contains(text(),'%s')])", Support));
			this.click(support, Support);		
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return OPTION;
		
	}
	
	public void VerifySelectedButtonInResultsTab(String ActivityName ,String SelfPerformance , String Support)
	{
		try
		{
			WebElement ActivityPerfomance = wd.findElement(By.xpath(String.format("(//div[contains(text(),'%s')]//..//div[contains(@class,'flex-grow')])[1]//img", ActivityName)));
			WebElement ActivitySupport = wd.findElement(By.xpath(String.format("(//div[contains(text(),'Bed Mobility')]//..//div[contains(@class,'flex-grow')])[2]//img", ActivityName)));

			Actions action = new Actions(wd);
			this.waitInSecs(2);
			action.moveToElement(ActivityPerfomance).build().perform();

			String PerformanceText = wd.findElement(By.xpath("//div[contains(@class,'text-white') and contains(@class,'items-center')]/div[contains(@class,'bold')]")).getText();
			if(PerformanceText.contains(SelfPerformance))
			{
				this.testReport.logSuccess("Verify Bed Mobility matrix display the selected icon of Self Performance options under Activities of Daily Living Assistance Results/Shift",
						"Verify Bed Mobility matrix display the selected icon of Self Performance options under Activities of Daily Living Assistance Results/Shift displaing properly");
			}
			else
			{
				this.testReport.logSuccess("Verify Bed Mobility matrix display the selected icon of Self Performance options under Activities of Daily Living Assistance Results/Shift",
						"Verify Bed Mobility matrix display the selected icon of Self Performance options under Activities of Daily Living Assistance Results/Shift not displaing properly");
			}
			
			this.waitInSecs(2);
			action.moveToElement(ActivitySupport).build().perform();

			String SupportText = wd.findElement(By.xpath("//div[contains(@class,'text-white') and contains(@class,'items-center')]/div[contains(@class,'bold')]")).getText();
			if(SupportText.equalsIgnoreCase(Support))
			{
				this.testReport.logSuccess("Verify Bed Mobility matrix display the selected icon of Support options under Activities of Daily Living Assistance Results/Shift",
						"Verify Bed Mobility matrix display the selected icon of Support options under Activities of Daily Living Assistance Results/Shift displaing properly");
			}
			else
			{
				this.testReport.logSuccess("Verify Bed Mobility matrix display the selected icon of Support options under Activities of Daily Living Assistance Results/Shift",
						"Verify Bed Mobility matrix display the selected icon of Support options under Activities of Daily Living Assistance Results/Shift not displaing properly");
			}

		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	
	

}
