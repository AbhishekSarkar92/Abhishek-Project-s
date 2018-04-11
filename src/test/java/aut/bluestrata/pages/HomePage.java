package aut.bluestrata.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.testreport.IReporter;

import dweb.aut.pages.templates.PageTemplate;

public class HomePage extends PageTemplate {

	public HomePage(WebDriver webDriver, IReporter testReport) {
		super(webDriver, testReport);
		// TODO Auto-generated constructor stub
	}
	
	public By btnMenu = By.xpath("//div[@class='col-md-auto']//button");
	public By optionPhysicianPortal = By.xpath("//div[@class='modal-content']//img[@src='https://cdn.bluestrataemr.com/Images/Menu/sigma_medical_doctor_128.png']");
	
	
	public void NavigateToPhysicianPortal()
	{
		this.click(btnMenu ,"Menu Button");
		this.click(optionPhysicianPortal ,"Physician Portal Option");
	}

}
