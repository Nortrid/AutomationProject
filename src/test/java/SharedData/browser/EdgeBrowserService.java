package SharedData.browser;

import PropertyUtility.PropertyUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;
import java.util.Map;


public class EdgeBrowserService implements BrowserService{

    private WebDriver webDriver;

    @Override
    public void openBrowser(Map<String, String> testData) {
        //aceasta metoda are ca scop sa deschida un chrome cu configurarile noastre

        PropertyUtility propertyUtility = new PropertyUtility("atfData");

        EdgeOptions options = (EdgeOptions)  getBrowserOptions(propertyUtility.getAllData());
        webDriver = new EdgeDriver(options);

        webDriver.manage().window().maximize();

        webDriver.get(propertyUtility.getAllData().get("url"));

        //wait implicit
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Override
    public Object getBrowserOptions(Map<String, String> testData) {
        //configuram optiunile pt browserul nostru
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments(testData.get("gpu"));
        edgeOptions.addArguments(testData.get("infobars"));
        edgeOptions.addArguments(testData.get("extensions"));
        edgeOptions.addArguments(testData.get("sandbox"));
        if(!testData.get("headless").isEmpty() ){
            edgeOptions.addArguments(testData.get("headless"));
        }

        return edgeOptions;
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }
}


