package tests;

import objectData.WebTableObject;
import pages.ElementsPage;
import pages.HomePage;
import pages.WebTablesPage;
import propertyUtility.PropertyUtility;
import sharedData.Hooks;
import org.testng.annotations.Test;

public class WebTableTest extends Hooks {

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
