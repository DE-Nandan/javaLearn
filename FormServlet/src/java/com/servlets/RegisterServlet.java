/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Nandan
 */
public class RegisterServlet extends HttpServlet{
    public void doPost(HttpServletRequest request , HttpServletResponse response) throws ServletException , IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.println("<h2>Welcome to Register Servlet</h2>");
        
        String name = request.getParameter("user_name");
        String password = request.getParameter("user_password");
        String email = request.getParameter("user_email");
        String gender = request.getParameter("user_gender");
        String course = request.getParameter("user_course");
        
        String cond = request.getParameter("condition");
       // System.out.println("i m groot"+name);
        System.out.println(cond);
        
        if(cond != null)
        {
           if(cond.equals("checked"))
           {out.println("<h2>Name :" + name + "</h2>") ;
           out.println("<h2>Password :" + password + "</h2>") ;
           out.println("<h2>Email :" + email  + "</h2>");
           out.println("<h2>Gender :" + gender  + "</h2>");
           out.println("<h2>Course :" + course  + "</h2>");
           }
           else
           {
                out.println("<h2>You have not accepted termas and condition<h2>");
           }
           
           //jdbc to save data
           
           
           // saved to db .........
           
          RequestDispatcher rd = request.getRequestDispatcher("success");
          rd.forward(request,response);
        }
        else
        {
            out.println("<h2>You have not accepted termas and condition<h2>");
            
            // i want to include output of inex.html
            
            //get the object of req dispatcher
            
            
            RequestDispatcher rd  = request.getRequestDispatcher("index.html");
            // if we would have needed output of another servlet then we would have passed url pattern of that servlet
            
            //include method
            
            rd.include(request,response);
          
        }
        
    }
}
