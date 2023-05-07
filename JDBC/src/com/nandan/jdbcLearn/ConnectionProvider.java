package com.nandan.jdbcLearn;

import java.sql.Connection;
import java.sql.DriverManager;

// A Singleton Class
public class ConnectionProvider {
    private static Connection con;
    public static Connection getConnection()
    {
        try{
            if(con == null) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdcheck", "root", "nandan1133++");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

          return  con;
    }
}
