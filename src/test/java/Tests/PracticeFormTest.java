package Tests;

import HelperMethods.ElementMethods;
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

        ElementMethods elementMethods = new ElementMethods(getWebDriver
                ());

        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("window.scrollBy(0,450)", "");

        WebElement consentField= getWebDriver().findElement(By.className("fc-button-label"));
        elementMethods.clickElement(consentField);

        WebElement formsField= getWebDriver().findElement(By.xpath("//h5[text()='Forms']"));
        elementMethods.clickElement(formsField);

        WebElement webForm= getWebDriver().findElement(By.xpath("//span[text()='Practice Form']"));
        elementMethods.clickElement(webForm);

        WebElement firstName= getWebDriver().findElement(By.id("firstName"));
        String firstNameValue="Doru";
        elementMethods.fillElement(firstName, firstNameValue);

        WebElement lastName= getWebDriver().findElement(By.cssSelector("input[placeholder='Last Name']"));
        String lastNameValue="Anton";
        elementMethods.fillElement(lastName, lastNameValue);

        WebElement userEmail= getWebDriver().findElement((By.id("userEmail")));
        String userEmailValue="antondoru@gmail.com";
        elementMethods.fillElement(userEmail, userEmailValue);

        WebElement userMobileNumber= getWebDriver().findElement(By.cssSelector("input[placeholder='Mobile Number'"));
        String userMobileNumberValue="0123456789";
        elementMethods.fillElement(userMobileNumber, userMobileNumberValue);

        WebElement dateOfBirthField= getWebDriver().findElement(By.cssSelector(".react-datepicker__input-container"));
        elementMethods.clickElement(dateOfBirthField);

        WebElement monthField= getWebDriver().findElement(By.cssSelector(".react-datepicker__month-select"));
        String monthDateOfBirthValue = "November";
        elementMethods.selectTextElement(monthField, monthDateOfBirthValue);

        WebElement yearField= getWebDriver().findElement(By.cssSelector(".react-datepicker__year-select"));
        String yearValue = "1993";
        elementMethods.selectValueElement(yearField, yearValue);

        List<WebElement> dayDateOfBirthFields= getWebDriver().findElements(
                By.xpath("div[not(contains(@class, 'outside-month')) and contains(@class, 'react-datepicker__day react-datepicker__day')]"));
        String dayValue= "17";
        for (Integer i = 0; i < dayDateOfBirthFields.size(); i++){
            if (dayDateOfBirthFields.get(i).getText().equals(dayValue)){
                dayDateOfBirthFields.get(i).click();
                break;
            }
        }


        ////div[not(contains(@class, 'outside-month')) and contains(@class, 'react-datepicker__day react-datepicker__day')]

//        WebElement userGender= webDriver.findElement(By.cssSelector("label[for='gender-radio-1']"));
//        userGender.click();

        //facem un algoritm care sa imi selecteze valorile pe care i le specific

        List<String> Hobbies= Arrays.asList("Sports", "Music", "Reading");
        List<WebElement> HobbiesList = getWebDriver().findElements(By.xpath("//div[@id='hobbiesWrapper']//label[@class='custom-control-label']"));
        for (Integer index=0; index<HobbiesList.size(); index++){
            String currentElementText= HobbiesList.get(index).getText();
            if (Hobbies.contains(currentElementText)){
//                HobbiesList.get(index).click();
                js.executeScript("arguments[0].click();", HobbiesList.get(index));
            }
        }

//        WebElement userHobbies= webDriver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
//        userHobbies.click();

        String genderValue="Male";
        genderOption(genderValue);


        String subjectFieldValue="Economics";
        WebElement subjectsField= getWebDriver().findElement((By.id("subjectsInput")));
        elementMethods.fillPressElement(subjectsField, subjectFieldValue, Keys.ENTER);

        WebElement pictureField= getWebDriver().findElement(By.id("uploadPicture"));
        String filePath="src/test/resources/testFileUpload.txt";
        elementMethods.fillElement(pictureField, new File(filePath).getAbsolutePath());

        String addressFieldValue="Honolulu, street no. 20 ap. 5";
        WebElement addressField= getWebDriver().findElement(By.cssSelector("textarea[placeholder='Current Address']"));
        elementMethods.fillElement(addressField, addressFieldValue);

        elementMethods.scrollElementByPixel(0, 450);

//        WebElement stateField = getWebDriver().findElement(By.xpath("//div[text()='Select State']"));

        WebElement stateInputField = getWebDriver().findElement((By.id("react-select-3-input")));
        js.executeScript("arguments[0].click();", stateInputField);
        String stateInputValue="NCR";
        elementMethods.fillPressElement(stateInputField, stateInputValue, Keys.ENTER);

//        WebElement cityField = getWebDriver().findElement(By.xpath("//div[text()='Select City']"));
//        js.executeScript("arguments[0].click();", cityField);

        String cityValue="Delhi";
        WebElement cityField = getWebDriver().findElement(By.id("react-select-4-input"));
        elementMethods.fillPressElement(cityField, cityValue, Keys.ENTER);


        WebElement submit = getWebDriver().findElement(By.id("submit"));
        elementMethods.clickElement(submit);

        //Validam tabelul cu valori

        List<WebElement> labelFields = getWebDriver().findElements(By.xpath("//table/tbody/tr/td[1]"));
        List<WebElement> valueFields = getWebDriver().findElements(By.xpath("//table/tbody/tr/td[2]"));

        Assert.assertEquals(labelFields.get(0).getText(),"Student Name");
        Assert.assertEquals(valueFields.get(0).getText(), firstNameValue + " " + lastNameValue);

        Assert.assertEquals(labelFields.get(1).getText(), "Student Email");
        Assert.assertEquals(valueFields.get(1).getText(), userEmailValue);

        Assert.assertEquals(labelFields.get(2).getText(), "Gender");
        Assert.assertEquals(valueFields.get(2).getText(), genderValue);

        Assert.assertEquals(labelFields.get(3).getText(), "Mobile");
        Assert.assertEquals(valueFields.get(3).getText(), userMobileNumberValue);

//        Assert.assertEquals(labelFields.get(4).getText(), "Date of Birth");
//        Assert.assertEquals(valueFields.get(4).getText(), );


        Assert.assertEquals(labelFields.get(5).getText(), "Subjects");
        Assert.assertEquals(valueFields.get(5).getText(), subjectFieldValue);

        Assert.assertEquals(labelFields.get(6).getText(), "Hobbies");
        for (Integer index = 0; index < Hobbies.size(); index ++) {
            Assert.assertTrue(valueFields.get(6).getText().contains(Hobbies.get(index)));
        }

        Assert.assertEquals(labelFields.get(7).getText(), "Picture");
        String[] arrayFile=filePath.split("/");
        Integer desiredIndex=arrayFile.length -1;
        Assert.assertEquals(valueFields.get(7).getText(), arrayFile[desiredIndex]);

        Assert.assertEquals(labelFields.get(8).getText(), "Address");
        Assert.assertEquals(valueFields.get(8).getText(), addressFieldValue);

        Assert.assertEquals(labelFields.get(9).getText(), "State and City");
        Assert.assertEquals(valueFields.get(9).getText(),stateInputValue + " " + cityValue);



    }
//    public void metodatestGender(){
//        genderOption("Male");
//        genderOption("Female");
//        genderOption("Other");
//    }
public void genderOption(String genderSelection) {

    ElementMethods elementMethods = new ElementMethods(getWebDriver
            ());

    if (Objects.equals(genderSelection, "Male")) {
        WebElement userGender = getWebDriver().findElement(By.cssSelector("label[for='gender-radio-1']"));
        elementMethods.clickElement(userGender);
    }
    else if (Objects.equals(genderSelection, "Female")){
        WebElement userGender = getWebDriver().findElement(By.cssSelector("label[for='gender-radio-2']"));
        elementMethods.clickElement(userGender);
    }
    else if (Objects.equals(genderSelection, "Other")){
        WebElement userGender = getWebDriver().findElement(By.cssSelector("label[for='gender-radio-3']"));
        elementMethods.clickElement(userGender);
    }
}


}


