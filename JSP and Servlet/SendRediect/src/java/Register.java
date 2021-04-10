
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Register extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String name=request.getParameter("name");
        String age=request.getParameter("age");
        String mobile=request.getParameter("mobile");
        String user=request.getParameter("id");
        String pass=request.getParameter("pass");
        if(name.equals("name")&& age.equals("age") && mobile.equals("mobile") && user.equals("id")&& pass.equals("pass"))
        {
            RequestDispatcher rd=request.getRequestDispatcher("welcome");
            rd.forward(request,response);
        
    }
        else
        {
            PrintWriter out=response.getWriter();
        
             
            RequestDispatcher rd= request.getRequestDispatcher("welcome");
            rd.include(request,response);
        }
    }
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
