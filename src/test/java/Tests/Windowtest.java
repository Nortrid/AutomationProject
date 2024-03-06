package Tests;

import HelperMethods.ElementMethods;
import HelperMethods.WindowMethods;
import SharedData.SharedData;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Windowtest extends SharedData {


    @Test
    public void windowMethod(){

        ElementMethods elementMethods = new ElementMethods(getWebDriver());
        WindowMethods windowMethods = new WindowMethods(getWebDriver());

        elementMethods.scrollElementByPixel(0, 450);

        WebElement consentField = getWebDriver().findElement(By.className("fc-button-label"));
        elementMethods.clickElement(consentField);

        WebElement windowField = getWebDriver().findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        elementMethods.clickElement(windowField);

        WebElement browserWindowField = getWebDriver().findElement(By.xpath("//span[text()='Browser Windows']"));
        elementMethods.clickElement(browserWindowField);

        WebElement newTabButton = getWebDriver().findElement(By.id("tabButton"));
        elementMethods.clickElement(newTabButton);

        //trebuie sa identificam numarul de taburi deschise

        // actiunea este facuta de un obiect now
        windowMethods.switchSpecificTabWindow(1);
//        List<String> tabsOpened = new ArrayList<>(webDriver.getWindowHandles());
//        System.out.println("Tab-ul curent are URL-ul " + webDriver.getCurrentUrl());
//        webDriver.switchTo().window(tabsOpened.get(1));
//        System.out.println("Tab-ul curent are URL-ul " + webDriver.getCurrentUrl());

        //ca sa inchidem tab-ul current = close;
        //ca sa inchidem browserul = quit;
        windowMethods.closeCurrentTabWindow();
//        webDriver.close();

        windowMethods.switchSpecificTabWindow(0);
//
//        webDriver.switchTo().window(tabsOpened.get(0));
//        System.out.println("Tab-ul curent are URL-ul " + webDriver.getCurrentUrl());

        WebElement newWindowButton = getWebDriver().findElement(By.id("windowButton"));
        elementMethods.clickElement(newWindowButton);
//
//        js.executeScript("arguments[0].click();", newWindowButton);

        windowMethods.switchSpecificTabWindow(1);
        windowMethods.closeCurrentTabWindow();
        windowMethods.switchSpecificTabWindow(0);
//
//        List<String> windowOpened = new ArrayList<>(webDriver.getWindowHandles());
//        System.out.println("Window-ul curent are URL-ul " + webDriver.getCurrentUrl());
//        webDriver.switchTo().window(windowOpened.get(1));
//        System.out.println("Window-ul curent are URL-ul " + webDriver.getCurrentUrl());

//        webDriver.close();
//        webDriver.switchTo().window(windowOpened.get(0));
//        System.out.println("Window-ul curent are URL-ul " + webDriver.getCurrentUrl());
    }
}
