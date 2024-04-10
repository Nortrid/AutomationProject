package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertPage extends BasePage {

    public AlertPage(WebDriver webDriver){
        super(webDriver);
    }

    @FindBy (id = "alertButton")
    private WebElement alertOk;
    @FindBy (id = "timerAlertButton")
    private WebElement timerAlertButton;
    @FindBy (id = "confirmButton")
    private WebElement confirmButton;
    @FindBy (id = "promtButton")
    private WebElement promptAlertButton;
    @FindBy (id = "confirmResult")
    private WebElement confirmButtonResult;
    @FindBy (id = "promptResult")
    private WebElement promptResult;

    public void dealWithAcceptAlert () {
        elementMethods.clickElement(alertOk);
        LoggerUtility.infoTest("The user clicks on alertOk element");

        alertMethods.acceptAlert();
        LoggerUtility.infoTest("The user accepts the alert");
    }

    public void dealWithDelayAlert () {
        elementMethods.clickElement(timerAlertButton);
        LoggerUtility.infoTest("The user clicks on timerAlertButton element");

        alertMethods.waitForAlert();
        LoggerUtility.infoTest("The user waits for the alert timer");

        alertMethods.acceptAlert();
        LoggerUtility.infoTest("The user accepts the alert");

    }

    public  void dealWithPromtButton (String text) {
        elementMethods.clickElement(promptAlertButton);
        LoggerUtility.infoTest("The user clicks on promptAlertButton element");

        alertMethods.fillAlert(text);
        LoggerUtility.infoTest("The user fills the alert with the following text" + " " + text);

        elementMethods.validateElementText(promptResult, "You entered " + text);
        LoggerUtility.infoTest("The user validate the element text");
    }

    public void dealWithConfirmButton () {
        elementMethods.clickElement(confirmButton);
        LoggerUtility.infoTest("The user clicks on confirmButton element");

        alertMethods.acceptAlert();
        LoggerUtility.infoTest("The user accepts the alert");

        elementMethods.validateElementText(confirmButtonResult,"You selected Ok");
        LoggerUtility.infoTest("The user validates the confirm message");

        elementMethods.clickElement(confirmButton);
        LoggerUtility.infoTest("The user clicks on confirmButton element");

        alertMethods.cancelAlert();
        LoggerUtility.infoTest("The user cancels the alert");

        elementMethods.validateElementText(confirmButtonResult,"You selected Cancel");
        LoggerUtility.infoTest("The user validates the cancel message");
    }

}
