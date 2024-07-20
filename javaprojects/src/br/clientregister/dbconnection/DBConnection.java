package br.clientregister.dbconnection;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
    private static Connection connection = null;

    private static final String URL = "jdbc:mysql://localhost:3308/db_cliente";
    private static final String USER = "root";
    private static final String PASSWORD = "rootpassword";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
