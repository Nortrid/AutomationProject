package tests;

import objectData.PracticeFormObject;
import pages.FormsPage;
import pages.HomePage;
import pages.PracticeFormsPage;
import propertyUtility.PropertyUtility;
import sharedData.Hooks;
import org.testng.annotations.Test;

public class PracticeFormTest extends Hooks {

    @Test
    public void metodaTest() {

        PropertyUtility propertyUtility = new PropertyUtility("PracticeFormData");
        PracticeFormObject practiceFormObject = new PracticeFormObject(propertyUtility.getAllData());

        HomePage homePage = new HomePage(getWebDriver());
        homePage.navigateToFormsPage();

        FormsPage formsPage = new FormsPage(getWebDriver());
        formsPage.navigateToPracticeForm();


        PracticeFormsPage practiceFormsPage = new PracticeFormsPage(getWebDriver());

        practiceFormsPage.fillEntireForm(practiceFormObject);

        practiceFormsPage.validatePracticeFormTable(practiceFormObject);
    }
}


