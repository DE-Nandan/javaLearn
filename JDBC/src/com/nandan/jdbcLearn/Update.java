package com.nandan.jdbcLearn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Update {
    public static void main(String[] args) {
        try {


            String q = "update table1 set tname=? , tCity =? where tid =?";

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter new name");
            String name = br.readLine();

            System.out.println("Enter new city name : ");
            String city = br.readLine();

            System.out.println("Enter the student id : ");
            int id = Integer.parseInt(br.readLine());

         //   PreparedStatement pstmt = con.pre;



        }
        catch (Exception e)
        {
         e.printStackTrace();
        }
    }
}
