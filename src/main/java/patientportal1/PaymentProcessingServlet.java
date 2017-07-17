package patientportal1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import patientportal1.modal.PR_Repository;
import patientportal1.modal.PaymentRepository;
import patientportal1.patient.info.PaymentInfo;
import patientportal1.patient.info.RegisterInfo;

public class PaymentProcessingServlet extends HttpServlet{

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String username = PatientLoginServlet.x;
		String cardnumber = req.getParameter("cardnumber");
		String expiryMonth = req.getParameter("expiryMonth");
		String expiryYear = req.getParameter("expiryYear");
		String cVV  = req.getParameter("cvv");
		String nameOnCard  = req.getParameter("nameOnCard");
		String amount = req.getParameter("amount");
		String billingAddress = req.getParameter("billingAddress");
		String email = req.getParameter("email");
		String paymentpurpose = req.getParameter("paymentpurpose");
		String todaysDay = req.getParameter("todaysDay");
		String todaysMonth = req.getParameter("todaysMonth");
		String todaysYear = req.getParameter("todaysYear");
		String date = todaysDay + " "+ todaysMonth + " " + todaysYear ;
		
		PaymentInfo ri = new PaymentInfo(cardnumber, expiryMonth, expiryYear, cVV, nameOnCard, amount , billingAddress , email , paymentpurpose , date, username);
		ri.setAmount(amount);
		ri.setCardnumber(cardnumber);
		ri.setcVV(cVV);
		ri.setExpiryMonth(expiryMonth);
		ri.setExpiryYear(expiryYear);
		ri.setNameOnCard(nameOnCard);
		ri.setBillingAddress(billingAddress);
		ri.setEmail(email);
		ri.setDate(date);
		ri.setPaymentpurpose(paymentpurpose);
		ri.setUsername(username);
		
		
		
		PaymentRepository patientRepo = new PaymentRepository();
		patientRepo.createTableforPayment();
		patientRepo.saveRegistraionDetails(ri);
		
		req.setAttribute("message", "Payment Successfully");
		RequestDispatcher rd = req.getRequestDispatcher("homepage.jsp");
		rd.forward(req, resp);
		
	}
	
}
