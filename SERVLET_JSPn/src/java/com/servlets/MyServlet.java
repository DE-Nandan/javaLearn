/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Nandan
 */
public class MyServlet extends HttpServlet{
    public void doGet(HttpServletRequest req , HttpServletResponse res) throws ServletException,IOException
    {
        System.out.println("this is get method");
        
        res.setContentType("text/html");
        
        PrintWriter out = res.getWriter();
        out.print("<h1>this is get</h1>");
        out.print(new Date().toString());
    }
            
  }
