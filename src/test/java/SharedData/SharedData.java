package SharedData;

import SharedData.browser.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

//aceasta clasa are ca scop pregatirea driverului / inchiderea driverului
public class SharedData {
    private WebDriver webDriver;
    @BeforeMethod
    public void prepareDriver () {
        webDriver = new BrowserFactory().getBrowserInstance();
    }

    @AfterMethod

    public void clearDriver() {
        webDriver.quit();
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }
}
