/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package epos2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
    // Database URL, username, and password (customize these)
    private static final String URL = "jdbc:mysql://localhost:3306/epos";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    // Method to establish a database connection
    public static Connection getConnection() throws SQLException {
      
            return DriverManager.getConnection(URL, USER, PASSWORD);
            
    }
}
