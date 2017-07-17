package patientportal1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import patientportal1.modal.PR_Repository;
import patientportal1.patient.info.RegisterInfo;

public class PatientLoginServlet extends HttpServlet {
	
	String registrationContact = "";
	String hosName = "";
	static String x ="";
	public void init(ServletConfig sc) {
		registrationContact = sc.getInitParameter("Log-contact");
		ServletContext serContext = sc.getServletContext();
		hosName = serContext.getInitParameter("hosital-name");
	}
	

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException
    {
    	
    	String username = req.getParameter("username");
    	String password = req.getParameter("password");
    	x=username;
    	PR_Repository pRepo = new PR_Repository();
    	boolean result = pRepo.successfullLogin(username, password);
    	System.out.println(result);
    	if(result){
    		req.setAttribute("message", "Hey "+username+" , You're logged in!");
    		RequestDispatcher rd = req.getRequestDispatcher("homepage.jsp");
    		rd.forward(req, resp);
    	}else{
    		req.setAttribute("message", "Hey, "+username+" Invalid Password or Username. Please Try Again! Thank You! ");
    		RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
    		rd.forward(req, resp);
    	}
    	
    	
    }
	
	

	
	
}
