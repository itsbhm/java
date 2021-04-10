
package MyPakage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class welcome extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     PrintWriter pw=response.getWriter();
     pw.println("Login Successfully");
     HttpSession session=request.getSession();
     String uname=(String) session.getAttribute("id");
     String pass=(String) session.getAttribute("pass");
     pw.println("Username is :"+uname);
     pw.println("Password is:"+pass);
     pw.println("<div style=text-align:center><a href=\"index.html\"><h2>Logout</h2></a></div>");
     
     
     
    }

   
}
