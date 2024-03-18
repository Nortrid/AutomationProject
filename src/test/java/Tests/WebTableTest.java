package Tests;

import Pages.ElementsPage;
import Pages.HomePage;
import Pages.WebTablesPage;
import SharedData.SharedData;
import org.testng.annotations.Test;

public class WebTableTest extends SharedData {

    @Test
    public void metodaTest() {

        HomePage homePage = new HomePage(getWebDriver());
        homePage.navigateToElementsPage();

        ElementsPage elementsPage = new ElementsPage(getWebDriver());
        elementsPage.navigateToWebTablePage();

        String firstNameFieldValue="Doru";
        String lastNameFieldValue="Anton";
        String userEmailFieldValue = "antondoru@gmail.com";
        String ageFieldValue= "30";
        String salaryFieldValue= "2000";
        String departmentFieldValue= "Testing";
        String firstNameModifyFieldValue = "Adoru";
        String ageModifyFieldValue = "31";

        WebTablesPage webTablesPage = new WebTablesPage(getWebDriver());
        webTablesPage.addNewEntry(firstNameFieldValue, lastNameFieldValue, userEmailFieldValue, ageFieldValue, salaryFieldValue, departmentFieldValue);
        webTablesPage.editEntry(firstNameModifyFieldValue, ageModifyFieldValue);
        webTablesPage.deleteEntry();

    }
}
