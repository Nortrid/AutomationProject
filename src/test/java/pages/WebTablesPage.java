package pages;

import dataBase.queries.WebTable;
import objectData.WebTableObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebTablesPage extends BasePage{
    private WebTable webTable;
    public WebTablesPage(WebDriver webDriver) {
        super(webDriver);
        webTable = new WebTable();
    }

    @FindBy (id = "addNewRecordButton")
    private WebElement addButton;
    @FindBy(id = "firstName")
    private WebElement firstNameField;
    @FindBy(id = "lastName")
    private WebElement lastNameField;
    @FindBy(id = "userEmail")
    private WebElement emailField;
    @FindBy(id = "age")
    private WebElement ageField;
    @FindBy(id = "salary")
    private WebElement salaryField;
    @FindBy(id = "department")
    private WebElement departmentField;
    @FindBy(id = "submit")
    private WebElement submitButton;
    @FindBy(id = "edit-record-4")
    private WebElement editButton;
    @FindBy(id = "delete-record-4")
    private WebElement deleteButton;

    public void addNewEntry(WebTableObject webTableObject){
        addButton.click();

        elementMethods.fillElement(firstNameField, webTableObject.getFirstNameFieldValue());
        elementMethods.fillElement(lastNameField, webTableObject.getLastNameFieldValue());
        elementMethods.fillElement(emailField, webTableObject.getUserEmailFieldValue());
        elementMethods.fillElement(ageField, webTableObject.getAgeFieldValue());
        elementMethods.fillElement(salaryField, webTableObject.getSalaryFieldValue());
        elementMethods.fillElement(departmentField, webTableObject.getDepartmentFieldValue());
        submitButton.click();
        webTable.insertIntoWebTable(webTableObject);
    }

    public void editEntry(WebTableObject webTableObject){
        elementMethods.clickElement(editButton);
        elementMethods.refillElement(firstNameField, webTableObject.getFirstNameFieldValue());
        elementMethods.refillElement(ageField, webTableObject.getAgeFieldValue());
        elementMethods.clickElement(submitButton);
    }

    public void deleteEntry(){
        elementMethods.clickElement(deleteButton);
    }
}
