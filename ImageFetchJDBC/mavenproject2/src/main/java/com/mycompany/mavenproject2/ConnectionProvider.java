package com.mycompany.mavenproject2;
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
                System.out.println("succ");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

          return  con;
    }
}
