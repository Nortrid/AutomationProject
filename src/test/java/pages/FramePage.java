package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FramePage extends BasePage{
    public FramePage(WebDriver webDriver) {
        super(webDriver);
    }

@FindBy(id = "sampleHeading")
    public WebElement frameElement;

    public  void dealWithIFrame() {
        frameMethods.switchSpecificIframe("frame1");
        LoggerUtility.infoTest("The user switches to a specific Iframe");

        System.out.println(frameElement.getText());
        LoggerUtility.infoTest("The user interacts with the text of frameElement");

        frameMethods.switchParentFrame();
        LoggerUtility.infoTest("The user switches to default frame");

        frameMethods.switchSpecificIframe("frame2");
        LoggerUtility.infoTest("The user switches to a specific Iframe");

        System.out.println(frameElement.getText());
        LoggerUtility.infoTest("The user interacts with the text of frameElement");
    }
}
