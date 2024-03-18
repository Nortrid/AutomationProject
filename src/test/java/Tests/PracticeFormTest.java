package Tests;

import HelperMethods.ElementMethods;
import Pages.FormsPage;
import Pages.HomePage;
import Pages.PracticeFormsPage;
import SharedData.SharedData;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class PracticeFormTest extends SharedData {

    @Test
    public void metodaTest() {

        HomePage homePage = new HomePage(getWebDriver());
        homePage.navigateToFormsPage();

        FormsPage formsPage = new FormsPage(getWebDriver());
        formsPage.navigateToPracticeForm();

        String firstNameFieldValue = "Doru";
        String lastNameFieldValue = "Anton";
        String emailFieldValue = "antondoru@gmail.com";
        String mobileNoFieldValue = "0123456789";
        String monthDateOfBirthValue = "November";
        String yearValue = "1993";
        String dayValue = "20";
        String filePath ="src/test/resources/testFileUpload.txt";
        List<String> hobbies = Arrays.asList("Sports", "Music");
        String subjectFieldValue = "Arts";
        String addressFieldValue = "Honolulu, street no. 20 ap. 5";
        String genderValue = "Male";
        String stateLoc = "NCR";
        String cityLoc = "Delhi";

        PracticeFormsPage practiceFormsPage = new PracticeFormsPage(getWebDriver());
        practiceFormsPage.fillEntireForm(firstNameFieldValue, lastNameFieldValue, emailFieldValue, mobileNoFieldValue, monthDateOfBirthValue,
                yearValue, dayValue, genderValue, hobbies, subjectFieldValue, filePath, addressFieldValue,
                stateLoc, cityLoc);

        practiceFormsPage.validatePracticeFormTable(firstNameFieldValue, lastNameFieldValue, emailFieldValue, genderValue, mobileNoFieldValue,
                monthDateOfBirthValue, yearValue, dayValue, subjectFieldValue, hobbies,  filePath, addressFieldValue, stateLoc, cityLoc);
    }
}


