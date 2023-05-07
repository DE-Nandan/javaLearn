package com.nandan.jdbcLearn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertJDBC {
    public static void main(String[] args) {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/jdcheck";
            String username="root";
            String password="nandan1133++";
            Connection con = DriverManager.getConnection(url,username,password);

            // create a query

            String q  = "create table table1 (tId int(20) primary key auto_increment , tName varchar(200) not null,tCity varchar (400))";


            // create a statement as no parameters
            Statement stmt =  con.createStatement();
            stmt.executeUpdate(q);
            System.out.println("table Created in db");





            con.close();

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
