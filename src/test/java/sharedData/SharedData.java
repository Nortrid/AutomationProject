package sharedData;

import sharedData.browser.BrowserFactory;
import org.openqa.selenium.WebDriver;

//aceasta clasa are ca scop pregatirea driverului / inchiderea driverului
public class SharedData {
    private WebDriver WebDriver;

    public void prepareDriver() {
        WebDriver = new BrowserFactory().getBrowserInstance();
    }


    public void clearDriver() {
        WebDriver.quit();

    }

    public WebDriver getWebDriver() {
        return WebDriver;
    }
}
