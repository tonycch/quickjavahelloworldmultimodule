package org.purplejacket.multimodule;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final String p = "123456"; // hard-coded credential


    public static void getConn(String url, String v, String q) throws SQLException {
        DriverManager.getConnection(url, v, q); // sensitive call
    }
    
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost/test";
        String u = "admin"; // hard-coded credential

        getConn(url, u, p);
    }

}


