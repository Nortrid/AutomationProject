package tests;

import pages.AlertPage;
import pages.AlertWindowFramePage;
import pages.HomePage;
import org.testng.annotations.Test;
import sharedData.Hooks;

public class AlertsTest extends Hooks {


    @Test
    public void testMethod() {

        HomePage homePage = new HomePage(getWebDriver());
        homePage.navigateToAlertFrameWindowPage();

        AlertWindowFramePage alertWindowFramePage = new AlertWindowFramePage(getWebDriver());
        alertWindowFramePage.navigateToAlertPage();

        AlertPage alertPage = new AlertPage(getWebDriver());
        alertPage.dealWithAcceptAlert();
        alertPage.dealWithDelayAlert();
        alertPage.dealWithPromtButton("test");
        alertPage.dealWithConfirmButton();
    }
}
