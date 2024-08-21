package utils;

import models.Account;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Helper {
    public static Account my_account = null;

    public static Account getAccount() {
        return my_account;
    }

    public static void setAccount(Account my_account) {
        Helper.my_account = my_account;
    }

    public static Statement getStmt(){
        Connection conn = null;
        Statement stmt = null;
        // Register the PostgreSQL driver
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // Connect to the database
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://34.122.21.19:5432/mydb", "postgres", "postgres");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Create a statement object
        try {
            stmt = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return stmt;
    }
}
