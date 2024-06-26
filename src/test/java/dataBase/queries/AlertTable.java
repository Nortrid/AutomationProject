package dataBase.queries;

import dataBase.DataBaseConnection;
import loggerUtility.LoggerUtility;
import objectData.AlertObject;

import java.sql.SQLException;
import java.sql.Statement;

public class AlertTable {
    //clasa care reprezinta un tabel specific
    private DataBaseConnection dbConnection;

    public AlertTable() {
        dbConnection = new DataBaseConnection();
    }

    //definim metode pentru interactiunea cu un tabel
    public void insertIntoAlert (AlertObject testdata) {
        try {
            Statement statement = dbConnection.getConnection().createStatement();
            String query = "insert into alertTable(alertPrompt, entryDate)\n" +
                    "values('"+testdata.getAlertValue()+"', 'luni, 17 iunie');";
            statement.execute(query);
        } catch (SQLException e) {
            LoggerUtility.errorTest(e.getMessage());
        }
    }
}
