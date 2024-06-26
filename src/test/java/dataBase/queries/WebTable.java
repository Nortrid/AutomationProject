package dataBase.queries;

import dataBase.DataBaseConnection;
import loggerUtility.LoggerUtility;
import objectData.WebTableObject;

import java.sql.SQLException;
import java.sql.Statement;

public class WebTable {
        //clasa care reprezinta un tabel specific
        private DataBaseConnection dbConnection;

    public WebTable() {
        dbConnection = new DataBaseConnection();
    }

    public void insertIntoWebTable (WebTableObject testdata) {
        try {
            Statement statement = dbConnection.getConnection().createStatement();
            String query = "insert into webTable(firstNameField, lastNameField, userEmailField, ageField, salaryField, departmentField) " +
                    "values('"+testdata.getFirstNameFieldValue()+"', '"+testdata.getLastNameFieldValue()+"', '"+testdata.getUserEmailFieldValue()+"','"
                    +testdata.getAgeFieldValue()+"', '"+testdata.getSalaryFieldValue()+"', '"+testdata.getDepartmentFieldValue()+"');";
            statement.execute(query);
        } catch (SQLException e) {
            LoggerUtility.errorTest(e.getMessage());
        }
    }
}
