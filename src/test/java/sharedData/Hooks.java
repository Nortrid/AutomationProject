package sharedData;

import loggerUtility.LoggerUtility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Hooks extends SharedData{

    private  String testName;

    @BeforeMethod
    public void prepareEnvironment() {
        testName = this.getClass().getSimpleName();
        LoggerUtility.startTestCase(testName);
        prepareDriver();
        LoggerUtility.infoTest("The driver is opened with success");

    }

    @AfterMethod
    public void clearEnvironment() {
        clearDriver();
        LoggerUtility.infoTest("The driver is closed with success");
        LoggerUtility.finishTestCase(testName);
    }
}
