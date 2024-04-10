package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormsPage extends BasePage{

    public FormsPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath =  "//span[text()='Practice Form']")
    private WebElement practiceFormField;

    public void navigateToPracticeForm(){

        elementMethods.clickElement(practiceFormField);
        LoggerUtility.infoTest("The user clicks on practiceFormField element");
    }
}