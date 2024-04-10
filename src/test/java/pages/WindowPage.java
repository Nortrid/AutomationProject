package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WindowPage extends BasePage{
    public WindowPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id = "tabButton")
    private WebElement newTabButton;
    @FindBy(id = "windowButton")
    private WebElement newWindowButton;

    public void interactWithTabBrowser(){
        elementMethods.clickElement(newTabButton);
        LoggerUtility.infoTest("The user clicks on new tab button");

        windowMethods.switchSpecificTabWindow(1);
        LoggerUtility.infoTest("The user switches to a tab with index 1");

        windowMethods.closeCurrentTabWindow();
        LoggerUtility.infoTest("The user closes current tab window");

        windowMethods.switchSpecificTabWindow(0);
        LoggerUtility.infoTest("The user switches to a tab with index 0");
    }

    public void interactNewWindow(){
        elementMethods.clickElement(newWindowButton);
        LoggerUtility.infoTest("The user clicks on new window button");

        windowMethods.switchSpecificTabWindow(1);
        LoggerUtility.infoTest("The user switches to a tab with index 1");

        windowMethods.closeCurrentTabWindow();
        LoggerUtility.infoTest("The user closes current tab window");

        windowMethods.switchSpecificTabWindow(0);
        LoggerUtility.infoTest("The user switches to a tab with index 0");
    }
}
