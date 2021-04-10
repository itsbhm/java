/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author KRISHNA RAJPUT
 */
public class welcome extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter pw=response.getWriter();
        String name=request.getParameter("name");
        String age=request.getParameter("age");
        String mobile=request.getParameter("mobile");
        String user=request.getParameter("id");
        String pass=request.getParameter("pass");
        pw.println("Hello"+name);
        pw.println("Hello"+age);
        pw.println("Hello"+mobile);
        pw.println("Hello"+user);
        pw.println("Hello"+pass);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
