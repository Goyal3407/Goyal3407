package Sql;
import java.sql.*;
public class Connectiondb {
   
    public static Connection getConnection() throws SQLException {
    

        // Create a connection object.
        Connection connection = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/Rbu", "root", "Goyal@3407"
        );

        // Return the connection object.
        return connection;
    }
}

