
package MyPakage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class SessionLogin extends HttpServlet {

    

    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        String uname=request.getParameter("id");
        String upass=request.getParameter("pass");
        if(uname.equals("admin")&& upass.equals("123"))
        {
            HttpSession session=request.getSession();
            session.setAttribute("id", uname);
            session.setAttribute("pass", upass);
            response.sendRedirect("welcome");
           session.setMaxInactiveInterval(5);
        }
        else
        {
            PrintWriter pw=response.getWriter();
            pw.println("Login Failed");
            
            
            
        
    }

    
}
}
