package sharedData.browser;

import propertyUtility.PropertyUtility;
import org.openqa.selenium.WebDriver;

import java.util.Map;

public class BrowserFactory {
    //aplicam design patternul "factory method" ca sa definim un obiect care sa primeasca o instanta diferita de browser
    public WebDriver getBrowserInstance() {
        PropertyUtility propertyUtility = new PropertyUtility("atfData");
        Map<String, String> browserData = propertyUtility.getAllData();

        String cIcD = System.getProperty("cIcD");
        String browser = System.getProperty("browser");
        if (Boolean.parseBoolean(cIcD)) {
            browserData.put("headless", "--headless=new");
        } else {
            browser = browserData.get("browser");
        }


        //dupa ce am aflat pe ce environment trebuie sa rulez deschid browserul dorit
        switch (browser){
            case "chrome":
                ChromeBrowserService chromeBrowserService = new ChromeBrowserService();
                chromeBrowserService.openBrowser(browserData);
                return chromeBrowserService.getWebDriver();

            case "edge":
                EdgeBrowserService edgeBrowserService = new EdgeBrowserService();
                edgeBrowserService.openBrowser(browserData);
                return edgeBrowserService.getWebDriver();

        }

        return null;
    }
}
