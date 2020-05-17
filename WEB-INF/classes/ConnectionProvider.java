package bean;

import java.sql.*;

public class ConnectionProvider {
    private static String DRIVER = "com.mysql.jdbc.Driver";
    private static String CONNECTION_URL = "jdbc:mysql://localhost:3306/hris_db";
    private static String USERNAME = "root";
    private static String PASSWORD = "surajh";
    private static Connection con = null;
    
    static {
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(CONNECTION_URL, USERNAME, PASSWORD);
        } catch (Exception e) { }
    }

    public static Connection getConnection() {
        return con;
    }
}