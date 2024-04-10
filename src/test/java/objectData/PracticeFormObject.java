package objectData;

import java.util.List;
import java.util.Map;

public class PracticeFormObject extends GeneralObject{
    private String firstNameFieldValue;
    private String lastNameFieldValue;
    private String emailFieldValue;
    private String mobileNoFieldValue;
    private String monthDateOfBirthValue;
    private String yearValue;
    private String dayValue;
    private String filePath;
    private List<String> hobbies;
    private String subjectFieldValue;
    private String addressFieldValue;
    private String genderValue;
    private String stateLoc;
    private String cityLoc;

    public PracticeFormObject (Map<String, String> testData){
        prepareObject(testData);
    }

    private void prepareObject(Map<String, String> testData){
        for (String key: testData.keySet()){
            switch (key){
                case "firstNameFieldValue":
                    setFirstNameFieldValue(testData.get(key));
                    break;
                case "lastNameFieldValue":
                    setLastNameFieldValue(testData.get(key));
                    break;
                case  "emailFieldValue":
                    setEmailFieldValue(testData.get(key));
                    break;
                case "mobileNoFieldValue":
                    setMobileNoFieldValue(testData.get(key));
                    break;
                case "monthDateOfBirthValue":
                    setMonthDateOfBirthValue(testData.get(key));
                    break;
                case "yearValue":
                    setYearValue(testData.get(key));
                    break;
                case "dayValue":
                    setDayValue(testData.get(key));
                    break;
                case "filePath":
                    setFilePath(testData.get(key));
                    break;
                case "hobbies":
                    hobbies = getPreparedValue(testData.get(key));
                    break;
                case "subjectFieldValue":
                    setSubjectFieldValue(testData.get(key));
                    break;
                case "addressFieldValue":
                    setAddressFieldValue(testData.get(key));
                    break;
                    case "genderValue":
                    setGenderValue(testData.get(key));
                    break;
                case "stateLoc":
                    setStateLoc(testData.get(key));
                    break;
                case "cityLoc":
                    setCityLoc(testData.get(key));
                    break;
            }
        }
    }

    public String getFirstNameFieldValue() {
        return firstNameFieldValue;
    }

    public String getLastNameFieldValue() {
        return lastNameFieldValue;
    }

    public String getEmailFieldValue() {
        return emailFieldValue;
    }

    public String getMobileNoFieldValue() {
        return mobileNoFieldValue;
    }

    public String getMonthDateOfBirthValue() {
        return monthDateOfBirthValue;
    }

    public String getYearValue() {
        return yearValue;
    }

    public String getDayValue() {
        return dayValue;
    }

    public String getFilePath() {
        return filePath;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public String getSubjectFieldValue() {
        return subjectFieldValue;
    }

    public String getAddressFieldValue() {
        return addressFieldValue;
    }

    public String getGenderValue() {
        return genderValue;
    }

    public String getStateLoc() {
        return stateLoc;
    }

    public String getCityLoc() {
        return cityLoc;
    }

    public void setFirstNameFieldValue(String firstNameFieldValue) {
        this.firstNameFieldValue = firstNameFieldValue;
    }

    public void setLastNameFieldValue(String lastNameFieldValue) {
        this.lastNameFieldValue = lastNameFieldValue;
    }

    public void setEmailFieldValue(String emailFieldValue) {
        this.emailFieldValue = emailFieldValue;
    }

    public void setMobileNoFieldValue(String mobileNoFieldValue) {
        this.mobileNoFieldValue = mobileNoFieldValue;
    }

    public void setMonthDateOfBirthValue(String monthDateOfBirthValue) {
        this.monthDateOfBirthValue = monthDateOfBirthValue;
    }

    public void setYearValue(String yearValue) {
        this.yearValue = yearValue;
    }

    public void setDayValue(String dayValue) {
        this.dayValue = dayValue;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public void setSubjectFieldValue(String subjectFieldValue) {
        this.subjectFieldValue = subjectFieldValue;
    }

    public void setAddressFieldValue(String addressFieldValue) {
        this.addressFieldValue = addressFieldValue;
    }

    public void setGenderValue(String genderValue) {
        this.genderValue = genderValue;
    }

    public void setStateLoc(String stateLoc) {
        this.stateLoc = stateLoc;
    }

    public void setCityLoc(String cityLoc) {
        this.cityLoc = cityLoc;
    }
}
