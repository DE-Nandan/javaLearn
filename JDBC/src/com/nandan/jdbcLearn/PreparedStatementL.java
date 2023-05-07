package com.nandan.jdbcLearn;
import  java.sql.*;
import java.util.Scanner;

public class PreparedStatementL {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/jdcheck";
            String username="root";
            String password="nandan1133++";
            Connection con = DriverManager.getConnection(url,username,password);

            // create a query

            String q = "insert into table1(tName,tCity) values (?,?)";

            //get the PreparedStatemnt

            PreparedStatement pstmt =  con.prepareStatement(q);

          // set the values to query

            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < 3; i++) {

                String name,place;
                name = sc.nextLine();
                place = sc.nextLine();

                pstmt.setString(1,name);
                pstmt.setString(2,place);

                pstmt.executeUpdate();

            }


              // no need to pass query again in case of prep statement
//            pstmt.executeUpdate();


            System.out.println("Inserted");

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
