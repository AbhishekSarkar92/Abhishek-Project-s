package aut.bluestrata.pages;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.testreport.IReporter;
import dweb.aut.pages.templates.PageTemplate;

public class HomePage extends PageTemplate {

	public HomePage(WebDriver webDriver, IReporter testReport) {
		super(webDriver, testReport);
		// TODO Auto-generated constructor stub
	}
	
	public By btnMenu = By.xpath("//div[contains(@class,'col-md-auto')]//button");
	public By optionPhysicianPortal = By.xpath("//div[@class='modal-content']//img[@src='https://cdn.bluestrataemr.com/Images/Menu/sigma_medical_doctor_128.png']");
	public By optionFacilityPortal = By.xpath("//div[@class='modal-content']//img[@src='https://cdn.bluestrataemr.com/Images/Menu/sigma_educationicons_school_128.png']");
	public By optionClinicalPortal = By.xpath("//div[@class='modal-content']//img[@src='https://cdn.bluestrataemr.com/Images/Menu/sigma_medical_nurse_128.png']");
	public By optionEmarPortal = By.xpath("//div[@class='modal-content']//img[@src='https://cdn.bluestrataemr.com/Images/Menu/sigma_medical_tablet_128.png']");
	
	
	public void NavigateToPhysicianPortal()
	{
		this.click(btnMenu ,"Menu Button");
		this.click(optionPhysicianPortal ,"Physician Portal Option");
	}
	
	public void NavigateToClinicalPortal()
	{
		this.click(btnMenu ,"Menu Button");
		this.click(optionClinicalPortal ,"Clinical Option");
	}
	
	public void NavigateToFacilityPortal()
	{
		this.click(btnMenu ,"Menu Button");
		this.click(optionFacilityPortal ,"Facility Portal Option");
	}
	
	public void DismissAlert()
	{
		wd.switchTo().alert().dismiss();
	}
	
	public void NavigateToEmar()
	{
		this.click(btnMenu ,"Menu Button");
		
		
		this.click(optionEmarPortal ,"Emar Portal Option");
	}
	
	public String GetHoMePageUrl()
	{
		String ParentWindow = wd.getWindowHandle();
		return ParentWindow;
	}
	
	public String NavigateToEmarWindow(String URL) throws Throwable 
	{
		
		String parentWindow = this.wd.getWindowHandle();
		try
		{			
			NavigateToEmar();
			java.util.Set<String> AllWindows = this.wd.getWindowHandles();
			for(String ChildWindow : AllWindows)
			{
				if(!parentWindow.equalsIgnoreCase(ChildWindow))
				{


					this.wd.switchTo().window(ChildWindow);
					wd.manage().window().maximize();
					String Name = wd.getCurrentUrl();
					if(Name.equals(URL))
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
		return parentWindow;



	}
	
	public void VerifyAllapps()
	{
		this.click(btnMenu ,"Menu Button");
		List<WebElement> apps = wd.findElements(By.xpath("//div[@class='modal-content']//img/..//small"));
		int No = apps.size();
		ArrayList<String> Apps = new ArrayList<String>();
		for(int i =1 ; i<=No ;i++)
		{
			Apps.add(wd.findElement(By.xpath("//div[@class='modal-content']//img/..//small")).getText());
		}
		this.testReport.logSuccess("Present Apps ", String.format("Present Apps On application Menu <mark>%s<mark/> ", Apps.toString()) );
		
		this.click(btnMenu ,"Menu Button");
	}

	
}
