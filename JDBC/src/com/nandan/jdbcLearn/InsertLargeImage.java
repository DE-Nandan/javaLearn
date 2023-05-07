package com.nandan.jdbcLearn;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertLargeImage {
    public static void main(String[] args) {

        try {
            Connection c = ConnectionProvider.getConnection();

            String q = "insert into images (pic) values (?)";

            PreparedStatement pstmt = c.prepareStatement(q);

            //for getting a dynamic image input
            JFileChooser jfc = new JFileChooser();
            jfc.showOpenDialog(null);

            File file = jfc.getSelectedFile();

            FileInputStream fis  = new FileInputStream(file);

            pstmt.setBinaryStream(1,fis,fis.available());
            pstmt.executeUpdate();

        //    System.out.println("done....");
            JOptionPane.showMessageDialog(null,"success");


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
