package aut.bluestrata.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.testreport.IReporter;

public class FacilityPage extends PhysicianPortal {

	public FacilityPage(WebDriver webDriver, IReporter testReport) {
		super(webDriver, testReport);
		// TODO Auto-generated constructor stub
	}

	
	public By btnMaintenance = By.xpath("//button[text()='Maintenance']");
	public By btnManageOrderSets = By.xpath("//button[text()='Manage Order Sets']");
	public By btnManageOrderLibrary = By.xpath("//button[text()='Manage Order Library']");
	public By btnCreateAnOrderSet = By.xpath("//button[text()='Create an Order Set']");
	public By txtDescription = By.xpath("(//label[text()='Description']/..//textarea[@id='description'])");
	public By txtDetailDescription = By.xpath("(//label[text()='Description']/..//input[@id='description'])");
	public By btnAddOrder = By.xpath("//button[text()='Add Order']");
	
	
	public void ManageOrdersSets()
	{
		if(this.isElementPresent(btnMaintenance))
		{
		this.VerifyWebElementPresent(btnMaintenance, "Maintenance");
		this.click(btnMaintenance, "Maintenance");
	    }
		if(this.isElementPresent(btnManageOrderSets))
		{
		this.VerifyWebElementPresent(btnManageOrderSets, "Manage Order Sets");
		this.click(btnManageOrderSets, "Manage Order Sets");
		}
		if(this.isElementPresent(btnCreateAnOrderSet))
		{
		this.VerifyWebElementPresent(btnCreateAnOrderSet, "Create an Order Set");
		this.click(btnCreateAnOrderSet,"Create an Order Set");
		}
	}
	
	public void CreateOrderSetDescription(String description, String type , String routes , String libraryText)
	{
		this.VerifyWebElementPresent(txtDescription, "Description");
		this.SendKeysToElementClearFirst(txtDescription,description);
		
		this.waitUntilElementIsVisible(txtOrderType);
		this.SelectDropDownByText(txtOrderType, type);
		
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
			this.SelectDropDownByText(drpDwnroutes, routes);
			
		}
		else
		{
		this.VerifyWebElementPresent(txtDetailDescription, " Detail Description");
		this.SendKeysToElementClearFirst(txtDetailDescription,description);
		}
		
	}
	
	public void VerifyManageOrderFromSets(String description)
	{
		By Description = By.xpath(String.format("//div[@class='list-group']//a//div/h5[text()='%s']", description));
		this.VerifyWebElementPresent(Description, "Created order present in Existing Set");
	}
	
	public void AddOder()
	{
		this.VerifyWebElementPresent(btnAddOrder, "AddOrder");
		this.click(btnAddOrder, "AddOrder");
	}
}
