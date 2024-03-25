package Tests;

import ObjectData.WebTableObject;
import Pages.ElementsPage;
import Pages.HomePage;
import Pages.WebTablesPage;
import PropertyUtility.PropertyUtility;
import SharedData.SharedData;
import org.testng.annotations.Test;

public class WebTableTest extends SharedData {

    @Test
    public void metodaTest() {

        PropertyUtility propertyUtility = new PropertyUtility("WebTableData");
        WebTableObject webTableObject = new WebTableObject(propertyUtility.getAllData());

        HomePage homePage = new HomePage(getWebDriver());
        homePage.navigateToElementsPage();

        ElementsPage elementsPage = new ElementsPage(getWebDriver());
        elementsPage.navigateToWebTablePage();

        WebTablesPage webTablesPage = new WebTablesPage(getWebDriver());
        webTablesPage.addNewEntry(webTableObject);

        webTableObject.setFirstNameFieldValue("EditDoru");
        webTableObject.setAgeFieldValue("31");

        webTablesPage.editEntry(webTableObject);
        webTablesPage.deleteEntry();

    }
}
