package dataBase.queries;

import dataBase.DataBaseConnection;
import loggerUtility.LoggerUtility;
import objectData.PracticeFormObject;

import java.sql.SQLException;
import java.sql.Statement;

public class PracticeFormTable {

    private DataBaseConnection dbConnection;

    public PracticeFormTable() {
        dbConnection = new DataBaseConnection();
    }

    public void insertIntoPracticeFormTable (PracticeFormObject testdata) {
        try {
            Statement statement = dbConnection.getConnection().createStatement();
            String query = "insert into practiceFormTable(firstNameField, lastNameField, emailField, mobileNoField, " +
                    "monthDateOfBirth,  year, day, filePath, hobbies, subjectField, addressField, gender, stateLoc, cityLoc) " +
                    "values('"+testdata.getFirstNameFieldValue()+"', '"+testdata.getLastNameFieldValue()+"', '"+testdata.getEmailFieldValue()+"'," +
                    " '"+testdata.getMobileNoFieldValue()+"', '"+testdata.getMonthDateOfBirthValue()+"', '"+testdata.getYearValue()+"', '"+testdata.getDayValue()+"'," +
                    " '"+testdata.getFilePath()+"', '"+testdata.getHobbies()+"', '"+testdata.getSubjectFieldValue()+"', '"+testdata.getAddressFieldValue()+"'," +
                    " '"+testdata.getGenderValue()+"', '"+testdata.getStateLoc()+"', '"+testdata.getCityLoc()+"');";
            statement.execute(query);
        } catch (SQLException e) {
            LoggerUtility.errorTest(e.getMessage());
        }
    }
}





