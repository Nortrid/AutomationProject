package tests;

import pages.AlertWindowFramePage;
import pages.FramePage;
import pages.HomePage;
import sharedData.Hooks;
import org.testng.annotations.Test;

public class FrameTest extends Hooks {


    @Test
    public void frameMethod() {

        HomePage homePage = new HomePage(getWebDriver());
        homePage.navigateToAlertFrameWindowPage();

        AlertWindowFramePage alertWindowFramePage = new AlertWindowFramePage(getWebDriver());
        alertWindowFramePage.navigateToFramePage();

        FramePage framePage = new FramePage(getWebDriver());
        framePage.dealWithIFrame();

    }
}