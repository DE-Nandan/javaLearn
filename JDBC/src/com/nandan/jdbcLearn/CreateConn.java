package com.nandan.jdbcLearn;

import java.sql.*;
public class CreateConn {
    public static void main(String[] args) {
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/jdcheck";
            String username="root";
            String password="nandan1133++";
            Connection con = DriverManager.getConnection(url,username,password);

            if(con.isClosed())
            {
                System.out.println("closed conn");
            }
            else
            {
                System.out.println("Conn created");
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}