package Tests;

import HelperMethods.ElementMethods;
import SharedData.SharedData;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableTest extends SharedData {


    @Test
    public void metodaTest()
    {
//        //deschidem un browser de chrome
//        webDriver=new ChromeDriver();
//        //accessam un URL
//        webDriver.get("https://demoqa.com/");
//
//        //maximizarea ferestrei (mai bine maximize de cat fullscreen)
//        webDriver.manage().window().maximize();

        //facem un scroll la pagina

        ElementMethods elementMethods = new ElementMethods(getWebDriver
                ());

        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("window.scrollBy(0,450)", "");

        //identificam un element
        WebElement consentField= getWebDriver().findElement(By.className("fc-button-label"));
        elementMethods.clickElement(consentField);

        WebElement elementsField = getWebDriver().findElement(By.xpath("//h5[text()='Elements']"));
        elementMethods.clickElement(elementsField);

        WebElement WebTablesField = getWebDriver().findElement(By.xpath("//span[text()='Web Tables']"));
        elementMethods.clickElement(WebTablesField);

        WebElement addField = getWebDriver().findElement(By.id("addNewRecordButton"));
        elementMethods.clickElement(addField);

        WebElement firstnameField= getWebDriver().findElement(By.id("firstName"));
        String firstnameValue="Doru";
        elementMethods.fillElement(firstnameField, firstnameValue);

        WebElement lastnameField = getWebDriver().findElement(By.id("lastName"));
        String lastnameValue="Anton";
        elementMethods.fillElement(lastnameField, lastnameValue);

        WebElement emailField = getWebDriver().findElement(By.id("userEmail"));
        String useremailValue = "antondoru@gmail.com";
        elementMethods.fillElement(emailField, useremailValue);

        WebElement ageField = getWebDriver().findElement(By.id("age"));
        //selenium nu diferentiaza integer de string, functioneaza ca metoda doar cu string
        String ageValue= "30";
        elementMethods.fillElement(ageField, ageValue);

        WebElement salaryField = getWebDriver().findElement(By.id("salary"));
        String salaryValue= "2000";
        elementMethods.fillElement(salaryField, salaryValue);

        WebElement departmentField = getWebDriver().findElement(By.id("department"));
        String departmentValue= "Testing";
        elementMethods.fillElement(departmentField, departmentValue);

        WebElement submitButton = getWebDriver().findElement(By.id("submit"));
        elementMethods.clickElement(submitButton);


        //modificam entry-ul adaugat mai sus

        WebElement editField = getWebDriver().findElement((By.id("edit-record-4")));
        elementMethods.clickElement(editField);

        WebElement firstnameModifyField = getWebDriver().findElement(By.id("firstName"));
        String firstnameModifyValue="Nortrid";
        elementMethods.refillElement(firstnameModifyField, firstnameModifyValue);


        WebElement ageModifyField = getWebDriver().findElement(By.id("age"));
        String ageModifyValue= "31";
        elementMethods.refillElement(ageModifyField, ageModifyValue);

        WebElement submitModifyButton= getWebDriver().findElement(By.id("submit"));
        elementMethods.clickElement(submitModifyButton);

        //stergem noul entry
        WebElement deleteField= getWebDriver().findElement(By.id("delete-record-4"));
        elementMethods.clickElement(deleteField);

        //inchide un browser = quit
        //inchide un tab = close
    }
}
