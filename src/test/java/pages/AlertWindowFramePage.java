package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertWindowFramePage extends BasePage {

    public AlertWindowFramePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//span[text() ='Alerts']")
    public WebElement alertField;
    @FindBy(xpath = "//span[text()='Frames']")
    public WebElement framesField;
    @FindBy(xpath = "//span[text()='Browser Windows']")
    public WebElement browserWindowField;

    public void navigateToAlertPage() {
        elementMethods.scrollElementByPixel(0, 350);
        LoggerUtility.infoTest("The user scrolls down the page");

        elementMethods.clickElement(alertField);
        LoggerUtility.infoTest("The user clicks on alertField element");
    }
    public void navigateToFramePage(){

        elementMethods.clickElement(framesField);
        LoggerUtility.infoTest("The user clicks framesField element");
    }

    public void navigateToWindowPage(){
        elementMethods.clickElement(browserWindowField);
        LoggerUtility.infoTest("The user clicks on browserWindowField element");

    }
}
