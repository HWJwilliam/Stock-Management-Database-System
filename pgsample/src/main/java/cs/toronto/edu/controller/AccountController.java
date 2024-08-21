package controller;

import models.Account;
import utils.Helper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountController {

    public static boolean register(String username, String passwd)  {
        Statement stmt = Helper.getStmt();
        String sqlSelect = "SELECT Username FROM account WHERE Username = '" + username + "';";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sqlSelect);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (!rs.next()) {
                String sqlInsert = "INSERT INTO account (Username, Password) " +
                        "VALUES ('" + username + "', '" + passwd + "');";
                stmt.executeUpdate(sqlInsert);
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean login(String username, String passwd)  {
        Statement stmt = Helper.getStmt();
        String sqlSelect = "SELECT * FROM account WHERE Username = '" + username + "' and Password = '" + passwd + "';";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sqlSelect);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (rs.next()) {
                System.out.println("Login Success");
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean sendRequest(String receive_username)  {
        Account my_account = Helper.getAccount();
        Statement stmt = Helper.getStmt();
        String sqlInsert = "INSERT INTO Friend_request (Request_username, Receive_username) " +
                "VALUES ('" + my_account.getUsername() + "', '" + receive_username + "');";
        try {
            stmt.executeUpdate(sqlInsert);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
