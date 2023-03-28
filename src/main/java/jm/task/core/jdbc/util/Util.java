package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String URL = "jdbc:mysql://localhost/db_java_pp";
    private static final String NAME = "user";
    private static final String PASS = "user";
    public static Connection getConnect(){
        try {
            return DriverManager.getConnection(URL,
                    NAME,
                    PASS);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
