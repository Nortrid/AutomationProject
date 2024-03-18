package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FormsPage extends BasePage{

    public FormsPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath =  "//span[text()='Practice Form']")
    private WebElement practiceFormField;

    public void navigateToPracticeForm(){

        elementMethods.clickElement(practiceFormField);
    }
}