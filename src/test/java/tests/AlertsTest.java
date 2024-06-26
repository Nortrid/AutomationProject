package tests;

import objectData.AlertObject;
import objectData.PracticeFormObject;
import pages.AlertPage;
import pages.AlertWindowFramePage;
import pages.HomePage;
import org.testng.annotations.Test;
import propertyUtility.PropertyUtility;
import sharedData.Hooks;

public class AlertsTest extends Hooks {


    @Test
    public void testMethod() {

        PropertyUtility propertyUtility = new PropertyUtility("AlertData");
        AlertObject alertObject = new AlertObject(propertyUtility.getAllData());

        HomePage homePage = new HomePage(getWebDriver());
        homePage.navigateToAlertFrameWindowPage();

        AlertWindowFramePage alertWindowFramePage = new AlertWindowFramePage(getWebDriver());
        alertWindowFramePage.navigateToAlertPage();

        AlertPage alertPage = new AlertPage(getWebDriver());
        alertPage.dealWithAcceptAlert();
        alertPage.dealWithDelayAlert();
        alertPage.dealWithPromtButton(alertObject);
        alertPage.dealWithConfirmButton(alertObject);
    }
}
