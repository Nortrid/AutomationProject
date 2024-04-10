package tests;

import pages.AlertWindowFramePage;
import pages.HomePage;
import pages.WindowPage;
import sharedData.Hooks;
import org.testng.annotations.Test;

public class WindowTest extends Hooks {


    @Test
    public void windowMethod(){

        HomePage homePage = new HomePage(getWebDriver());
        homePage.navigateToAlertFrameWindowPage();

        AlertWindowFramePage alertWindowFramePage = new AlertWindowFramePage(getWebDriver());
        alertWindowFramePage.navigateToWindowPage();

        WindowPage windowPage = new WindowPage(getWebDriver());
        windowPage.interactWithTabBrowser();
        windowPage.interactNewWindow();
    }
}
