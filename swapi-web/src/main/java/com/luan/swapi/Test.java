package com.luan.swapi;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub

        PrintWriter out = resp.getWriter();
        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>Hello Servlet</TITLE>");
        out.println("</HEAD>");
        out.println("<BODY>");
        out.println("Hello Servlet");
        out.println("</BODY>");
        out.println("</HTML>");

    }
}