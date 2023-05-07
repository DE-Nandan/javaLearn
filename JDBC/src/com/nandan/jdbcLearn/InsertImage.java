package com.nandan.jdbcLearn;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertImage {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/jdcheck";
            String username="root";
            String password="nandan1133++";
            Connection con = DriverManager.getConnection(url,username,password);

            String q = "insert into images(pic) values(?)";

            PreparedStatement pstmt = con.prepareStatement(q);

            // to store bytes
            FileInputStream fis = new FileInputStream("./src/com/nandan/jdbcLearn/giyu.jpg");
            pstmt.setBinaryStream(1,fis,fis.available());
            pstmt.executeUpdate();
            System.out.println("done.....");
        }
        catch(Exception e)
        {
           e.printStackTrace();
        }
    }
}
