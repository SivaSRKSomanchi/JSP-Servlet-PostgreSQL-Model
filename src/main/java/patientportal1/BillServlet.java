package patientportal1;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.*;

import patientportal1.modal.BillRetrieval;
import patientportal1.patient.info.BillInfo;

public class BillServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Inside Bill Retieval Servlet");
		BillRetrieval billREPO = new BillRetrieval();
		List<BillInfo> billArraylist = billREPO.getInfo(PatientLoginServlet.x);
		request.setAttribute("billArraylist", billArraylist); // Will be available as billArraylist // in JSP
		request.getRequestDispatcher("bills.jsp").forward(request, response);
		
	}

}
