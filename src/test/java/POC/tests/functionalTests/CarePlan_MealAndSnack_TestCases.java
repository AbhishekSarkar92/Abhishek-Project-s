package POC.tests.functionalTests;

import java.awt.AWTException;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import POC.pages.POC_CarePlan_ADLs;
import POC.pages.POC_CarePlan_BowelAndBladder;
import POC.pages.POC_CarePlan_HeightAndWeight;
import POC.pages.POC_HomePage;
import dweb.test.templates.TestTemplate;
import dweb.test.templates.TestTemplateMethodLevelInit;

public class CarePlan_MealAndSnack_TestCases extends TestTemplateMethodLevelInit{

	@Test()
	public void POC_QA298_Verify_Hydration__Meal_And_Snack_For_Resident(ITestContext testContext) throws InterruptedException, AWTException
	{
		POC_HomePage pocHome = new POC_HomePage(threadLocalWebDriver.get(), TestTemplate.testReport);
		POC_CarePlan_ADLs pocResident = new POC_CarePlan_ADLs(threadLocalWebDriver.get(), TestTemplate.testReport);
		POC_CarePlan_HeightAndWeight pocHeightWeight = new POC_CarePlan_HeightAndWeight(threadLocalWebDriver.get(), TestTemplate.testReport);
		POC_CarePlan_BowelAndBladder pocBowelBladder = new POC_CarePlan_BowelAndBladder(threadLocalWebDriver.get(), TestTemplate.testReport);

		String PassCode = this.getTestParameter(testContext, "passCode");
		String LoginName = this.getTestParameter(testContext, "LoginName");
		String MealAndSnack = "Hydration";

		pocHome.ClickOnIcon("Setup user's fingerprint");
		pocHome.SelectUser("KevinH - QA - HBV (Wired)");
		pocHome.SelectUserAndVerifyCalculator(LoginName);
		pocHome.EnterPasscode(PassCode);
		pocResident.VerifyResidentDashBoard();
		pocResident.SelectUserByName("Riley Thurman");
		pocResident.VerifyCarePlansInResidentPage("Meal &  Snack");
		pocResident.SelectActivityOptionFromMatrix("Meal &  Snack");
		String[] OptionName =pocBowelBladder.SelectMealAndSnack(MealAndSnack);
		for(int i=0;i<OptionName.length;i++)
		{
			String MealAndSnackOption = OptionName[i];
			if(MealAndSnack.equalsIgnoreCase(MealAndSnackOption))
			{
				pocBowelBladder.ComponentsInBMWindow();
				pocResident.VefifyEnterNotesValidation();
				pocResident.SaveEnterNotesWindow();
				pocHeightWeight.EnterOptionsForWeight("Regular Snack", "Dining Room");
				pocHome.SelectUserAndVerifyCalculator("");
				pocHome.EnterPasscode("50");
				pocBowelBladder.SelectMealAndSnack(MealAndSnack);
				pocHeightWeight.SelectOutOfFacility();
			}
		}
		pocResident.BigLogoutFromApplication();
		pocHome.ShutDownTheApplication();
	}

	@Test()
	public void POC_QA299_Verify_Lunch__Meal_And_Snack_For_Resident(ITestContext testContext) throws InterruptedException, AWTException
	{
		POC_HomePage pocHome = new POC_HomePage(threadLocalWebDriver.get(), TestTemplate.testReport);
		POC_CarePlan_ADLs pocResident = new POC_CarePlan_ADLs(threadLocalWebDriver.get(), TestTemplate.testReport);
		POC_CarePlan_HeightAndWeight pocHeightWeight = new POC_CarePlan_HeightAndWeight(threadLocalWebDriver.get(), TestTemplate.testReport);
		POC_CarePlan_BowelAndBladder pocBowelBladder = new POC_CarePlan_BowelAndBladder(threadLocalWebDriver.get(), TestTemplate.testReport);

		String PassCode = this.getTestParameter(testContext, "passCode");
		String LoginName = this.getTestParameter(testContext, "LoginName");
		String MealAndSnack = "Lunch";

		pocHome.ClickOnIcon("Setup user's fingerprint");
		pocHome.SelectUser("KevinH - QA - HBV (Wired)");
		pocHome.SelectUserAndVerifyCalculator(LoginName);
		pocHome.EnterPasscode(PassCode);
		pocResident.VerifyResidentDashBoard();
		pocResident.SelectUserByName("Riley Thurman");
		pocResident.VerifyCarePlansInResidentPage("Meal &  Snack");
		pocResident.SelectActivityOptionFromMatrix("Meal &  Snack");
		String[] OptionName =pocBowelBladder.SelectMealAndSnack(MealAndSnack);
		for(int i=0;i<OptionName.length;i++)
		{
			String MealAndSnackOption = OptionName[i];
			if(MealAndSnack.equalsIgnoreCase(MealAndSnackOption))
			{
				pocBowelBladder.ComponentsInBMWindow();
				pocResident.VefifyEnterNotesValidation();
				pocResident.SaveEnterNotesWindow();
				pocHeightWeight.EnterOptionsForWeight("Dining Room");
				pocHome.SelectUserAndVerifyCalculator("");
				pocHome.EnterPasscode("50");
				pocBowelBladder.SelectMealAndSnack(MealAndSnack);
				pocHeightWeight.SelectOutOfFacility();
			}
		}
		pocResident.BigLogoutFromApplication();
		pocHome.ShutDownTheApplication();
	}

	@Test()
	public void POC_QA300_Verify_Test2__Meal_And_Snack_For_Resident(ITestContext testContext) throws InterruptedException, AWTException
	{
		POC_HomePage pocHome = new POC_HomePage(threadLocalWebDriver.get(), TestTemplate.testReport);
		POC_CarePlan_ADLs pocResident = new POC_CarePlan_ADLs(threadLocalWebDriver.get(), TestTemplate.testReport);
		POC_CarePlan_HeightAndWeight pocHeightWeight = new POC_CarePlan_HeightAndWeight(threadLocalWebDriver.get(), TestTemplate.testReport);
		POC_CarePlan_BowelAndBladder pocBowelBladder = new POC_CarePlan_BowelAndBladder(threadLocalWebDriver.get(), TestTemplate.testReport);

		String PassCode = this.getTestParameter(testContext, "passCode");
		String LoginName = this.getTestParameter(testContext, "LoginName");
		String MealAndSnack = "Test2";

		pocHome.ClickOnIcon("Setup user's fingerprint");
		pocHome.SelectUser("KevinH - QA - HBV (Wired)");
		pocHome.SelectUserAndVerifyCalculator(LoginName);
		pocHome.EnterPasscode(PassCode);
		pocResident.VerifyResidentDashBoard();
		pocResident.SelectUserByName("Riley Thurman");
		pocResident.VerifyCarePlansInResidentPage("Meal &  Snack");
		pocResident.SelectActivityOptionFromMatrix("Meal &  Snack");
		String[] OptionName =pocBowelBladder.SelectMealAndSnack(MealAndSnack);
		for(int i=0;i<OptionName.length;i++)
		{
			String MealAndSnackOption = OptionName[i];
			if(MealAndSnack.equalsIgnoreCase(MealAndSnackOption))
			{
				pocBowelBladder.ComponentsInBMWindow();
				pocResident.VefifyEnterNotesValidation();
				pocResident.SaveEnterNotesWindow();
				pocHeightWeight.EnterOptionsForWeight("Regular Snack", "Dining Room");
				pocHome.SelectUserAndVerifyCalculator("");
				pocHome.EnterPasscode("50");
				pocBowelBladder.SelectMealAndSnack(MealAndSnack);
				pocHeightWeight.SelectOutOfFacility();
			}
		}
		pocResident.BigLogoutFromApplication();
		pocHome.ShutDownTheApplication();
	}

}
