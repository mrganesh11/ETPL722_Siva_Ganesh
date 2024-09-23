package com.evergent.corejava.studentapplication4;
import java.sql.*;

public class StudentDB {
    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/evergentdb",
                "root",
                "root");
        return conn;
    }
}
