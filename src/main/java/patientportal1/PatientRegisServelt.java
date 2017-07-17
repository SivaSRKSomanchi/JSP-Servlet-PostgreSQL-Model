package patientportal1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import patientportal1.modal.PR_Repository;
import patientportal1.patient.info.RegisterInfo;
import patientportal1.patient.info.RegisterInfo;


public class PatientRegisServelt extends HttpServlet {
	String registrationContact = "";
	String hosName = "";

	public void init(ServletConfig sc) {
		registrationContact = sc.getInitParameter("Reg-contact");
		ServletContext serContext = sc.getServletContext();
		hosName = serContext.getInitParameter("hosital-name");
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String fullname = req.getParameter("Fullname");
		String email = req.getParameter("Email");
		String username = req.getParameter("Username");
		String password  = req.getParameter("Password");
		String telephoneNumber  = req.getParameter("telephoneNumber");
//		String age = req.getParameter("age");
//		String disease = req.getParameter("disease");
		
		RegisterInfo ri = new RegisterInfo(fullname, password, username, email, telephoneNumber);
		ri.setEmail(email);
		ri.setFullname(fullname);
		ri.setPassword(password);
		ri.setUsername(username);
//		ri.setAge(age);
//		ri.setDisease(disease);
		ri.setTelephoneNumber(telephoneNumber);
		
		PR_Repository patientRepo = new PR_Repository();
		patientRepo.createRegistration();
		patientRepo.saveRegistraionDetails(ri);
		
		req.setAttribute("message", "Register Successfully");
		RequestDispatcher rd = req.getRequestDispatcher("registerSuccess.jsp");
		rd.forward(req, resp);
		
	}
	

	
	
	
	
}
