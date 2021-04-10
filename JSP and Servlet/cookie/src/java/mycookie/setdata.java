/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycookie;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrator
 */
public class setdata extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
        String username=req.getParameter("name");
        Cookie c1=new Cookie("cookieid", username);
        c1.setMaxAge(3600); //changing the maximum age to 3600 seconds  
        resp.addCookie(c1); //send cookie to browser
        PrintWriter pr=resp.getWriter();
        pr.println("Cookie Set Successfully!");
    }
    
}
