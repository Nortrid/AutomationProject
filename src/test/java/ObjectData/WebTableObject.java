package ObjectData;

import java.util.Map;

public class WebTableObject {

    private String firstNameFieldValue;
    private String lastNameFieldValue;
    private String userEmailFieldValue;
    private String ageFieldValue;
    private String salaryFieldValue;
    private String departmentFieldValue;

    //facem o metoda care sa mapeze datele din fisierul de resursa cu reprezentarea acestui obiect

    public WebTableObject (Map<String, String> testData){
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
                case  "userEmailFieldValue":
                    setUserEmailFieldValue(testData.get(key));
                    break;
                case "ageFieldValue":
                    setAgeFieldValue(testData.get(key));
                    break;
                case "salaryFieldValue":
                    setSalaryFieldValue(testData.get(key));
                    break;
                case "departmentFieldValue":
                    setDepartmentFieldValue(testData.get(key));
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

    public String getUserEmailFieldValue() {
        return userEmailFieldValue;
    }

    public String getAgeFieldValue() {
        return ageFieldValue;
    }

    public String getSalaryFieldValue() {
        return salaryFieldValue;
    }

    public String getDepartmentFieldValue() {
        return departmentFieldValue;
    }

    public void setFirstNameFieldValue(String firstNameFieldValue) {
        this.firstNameFieldValue = firstNameFieldValue;
    }

    public void setLastNameFieldValue(String lastNameFieldValue) {
        this.lastNameFieldValue = lastNameFieldValue;
    }

    public void setUserEmailFieldValue(String userEmailFieldValue) {
        this.userEmailFieldValue = userEmailFieldValue;
    }

    public void setAgeFieldValue(String ageFieldValue) {
        this.ageFieldValue = ageFieldValue;
    }

    public void setSalaryFieldValue(String salaryFieldValue) {
        this.salaryFieldValue = salaryFieldValue;
    }

    public void setDepartmentFieldValue(String departmentFieldValue) {
        this.departmentFieldValue = departmentFieldValue;
    }
}
