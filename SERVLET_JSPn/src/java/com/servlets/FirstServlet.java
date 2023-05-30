/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.*;
/**
 *
 * @author Nandan
 */
public class FirstServlet implements Servlet{
    //life cycle methods
    ServletConfig conf;
    
    public void init(ServletConfig conf)
    {
        this.conf = conf;
        System.out.println("Creating obj");
    }
    
    public void service(ServletRequest req , ServletResponse resp) throws ServletException , IOException
    {
        System.out.println("Servicing");
        
        // set the content type of reponse
        
        resp.setContentType("text/html");
        PrintWriter out =   resp.getWriter();
        out.println("<h1>this is my output from ser=velt method</h1>");
         out.println("<h1>Todays date is "+ new Date().toString()+"</h1>");
        
    }
    
    public void destroy()
    {
        System.out.println("going to destroy servlet obj");
    }
    
    //non life cycle methods
    
    public ServletConfig getServletConfig()
    {
        return this.conf;
    }
    
 public String getServletInfo()
{
return "this servlet is created by nandan";
}

    
}   