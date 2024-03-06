package Tests;

import HelperMethods.AlertMethods;
import HelperMethods.ElementMethods;
import Pages.AlertPage;
import Pages.AlertWindowFramePage;
import Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import SharedData.SharedData;

public class Alerts extends SharedData {


    @Test
    public void testMethod() {

        HomePage homePage = new HomePage(getWebDriver());
        homePage.navigateToAlertFrameWindowPage();

        AlertWindowFramePage alertWindowFramePage = new AlertWindowFramePage(getWebDriver());
        alertWindowFramePage.navigateToAlertPage();

//        // First alert
//        WebElement alertOk = getWebDriver().findElement(By.id("alertButton"));
//        elementMethods.clickElement(alertOk);
//        alertMethods.acceptAlert();
//
//        // Second alert
//        WebElement timerAlertButton = getWebDriver().findElement(By.id("timerAlertButton"));
//        elementMethods.clickElement(timerAlertButton);
//
//        // Explicit wait
//        alertMethods.acceptAlert();
//        elementMethods.scrollElementByPixel(0, 450);
//
//        // Third alert
//        String cancelValue = "Cancel";
//        WebElement confirmButton = getWebDriver().findElement(By.id("confirmButton"));
//        elementMethods.clickElement(confirmButton);
//        alertMethods.cancelAlert();
//
//        elementMethods.scrollElementByPixel(0, 450);
//
//        // Fourth alert
//        WebElement promptAlertButton = getWebDriver().findElement(By.id("promtButton"));
//        elementMethods.clickElement(promptAlertButton);
//        String text = "test";
//        alertMethods.fillAlert(text);
//
//        WebElement confirmButtonResult = getWebDriver().findElement(By.id("confirmResult"));
//        elementMethods.validateElementText(confirmButtonResult,"You selected " + cancelValue);
//
//
//        WebElement promptResult = getWebDriver().findElement(By.id("promptResult"));
//        elementMethods.validateElementText(promptResult, "You entered " + text);

        AlertPage alertPage = new AlertPage(getWebDriver());
        alertPage.dealWithAcceptAlert();
        alertPage.dealWithDelayAlert();
        alertPage.dealWithPromtButton("test");
        alertPage.dealWithConfirmButton();
    }
}
