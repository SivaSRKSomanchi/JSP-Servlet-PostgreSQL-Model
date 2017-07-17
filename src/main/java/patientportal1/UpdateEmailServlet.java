package patientportal1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import patientportal1.modal.PR_Repository;

public class UpdateEmailServlet extends HttpServlet{
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PR_Repository pRepo = new PR_Repository();
		String username = req.getParameter("username");
		String newpassword = req.getParameter("newpassword");
		String newemail = req.getParameter("newemail");
		String checkbox = null;
		checkbox = req.getParameter("remember");
		if (checkbox == null) {
			checkbox = "0";
		} else {
			checkbox = "1";
		}
		pRepo.updateEmailandPassword(newemail, username);
		req.getRequestDispatcher("updateEmail.jsp").forward(req, resp);
	}

}
