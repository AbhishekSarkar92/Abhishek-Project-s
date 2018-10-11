package POC.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.testreport.IReporter;

import dweb.aut.pages.templates.PageTemplate;

public class POC_CarePlan_Vitals extends POC_CarePlan_BowelAndBladder {

	public POC_CarePlan_Vitals(WebDriver webDriver, IReporter testReport) {
		super(webDriver, testReport);			
		
	}
	
	public void SelectVitals(String[] VitalOptions, String Text, String Value)
	{
		int Size = VitalOptions.length;
		for(int i=1;i<=Size;i++)
		{
			String ActivityName = VitalOptions[i-1];			
			this.click(By.xpath(String.format("//button//*[contains(text(),'%s')]", ActivityName)), ActivityName);
			this.waitInSecs(2);
			ComponentsInBMWindow();
			this.waitInSecs(4);
			String text = WrittingTextInNotes(Text);
			VefifyEnterNotesValidation();
			SaveEnterNotesWindow();
			ValidateEnterNoteText(text,"");
			VerifyCalculator();
			EnterPasscode(Value);
		}
				
	}

}
