package patientportal1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import patientportal1.patient.info.RegisterInfo;

/**
 * Servlet implementation class RegisterSuccessServlet
 */
public class RegisterSuccessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public RegisterSuccessServlet() {
       
    }
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    		throws ServletException, IOException
    	    {
    	RegisterInfo ri = new RegisterInfo();
		RequestDispatcher rd1 = req.getRequestDispatcher("login.jsp");
		rd1.forward(req, resp);
    	
    	    }
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
