package Tests;

import HelperMethods.ElementMethods;
import HelperMethods.FrameMethods;
import SharedData.SharedData;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameTest extends SharedData {


    @Test
    public void frameMethod() {

        ElementMethods elementMethods = new ElementMethods(getWebDriver());
        FrameMethods frameMethods = new FrameMethods(getWebDriver());

        elementMethods.scrollElementByPixel(0, 450);
//        JavascriptExecutor js = (JavascriptExecutor) webDriver;
//        js.executeScript("window.scrollBy(0,450)", "");

        WebElement consentField = getWebDriver().findElement(By.className("fc-button-label"));
        elementMethods.clickElement(consentField);

        WebElement windowField= getWebDriver().findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        elementMethods.clickElement(windowField);

        WebElement frameField = getWebDriver().findElement(By.xpath("//span[text()='Frames']"));
        elementMethods.clickElement(frameField);

        //interactionam cu un iframe

        frameMethods.switchSpecificIframe("frame1");
        WebElement frameElement = getWebDriver().findElement(By.id("sampleHeading"));
        elementMethods.printElementText(frameElement);

        //specificam sa revina la frame-ul curent
        frameMethods.switchParentFrame();

        frameMethods.switchSpecificIframe("frame2");
        WebElement frame2Element = getWebDriver().findElement(By.id("sampleHeading"));
        elementMethods.printElementText(frame2Element);
    }
}