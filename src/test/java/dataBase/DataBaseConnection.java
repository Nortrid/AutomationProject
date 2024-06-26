package dataBase;

import loggerUtility.LoggerUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
    //clasa care are ca scop sa faciliteze conexiunea cu o baza de date
    private Connection connection;


    public DataBaseConnection() {
        prepareConnection();
    }

    //metoda care face conexiunea la baza de date
    private void prepareConnection(){
        String url = "jdbc:mysql://localhost:3306/automationDB";

        try {
            connection = DriverManager.getConnection(url, "DoruAnton", "Xardas42");
            LoggerUtility.infoTest("Connected to database");
        } catch (SQLException e) {
            LoggerUtility.errorTest(e.getMessage());
        }
    }

    public void closeConnection () {
        try {
            connection.close();
            LoggerUtility.infoTest("Connection to database close");
        } catch (SQLException e) {
            LoggerUtility.errorTest(e.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
