package patientportal1.modal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import patientportal1.patient.info.PaymentInfo;
import patientportal1.patient.info.RegisterInfo;

public class PaymentRepository {
	Connection con = null;
	public static final String CREATE_TABLE_PAYMENT = "Create table payment2(cardnumber character varying(40) NOT NULL, expiryMonth character varying(40) NOT NULL, expiryYear character varying(40) NOT NULL, cvv character varying(40) NOT NULL, nameOnCard character varying(40) NOT NULL, amount character varying(40) NOT NULL, billingaddress character varying(50) NOT NULL, email character varying(40) NOT NULL, paymentpurpose character varying(40) NOT NULL, date character varying(40) NOT NULL, username character varying(40) NOT NULL)";
	public static final String INSERT_PAYMENT = "INSERT INTO payment2 (cardnumber, expiryMonth, expiryYear, cvv, nameOnCard , amount, billingaddress, email, paymentpurpose, date, username) values(?,?,?,?,?,?,?,?,?,?,?)";

	public void getConnection() {
		try {

			// Load the drive class
			Class.forName("org.postgresql.Driver");
			System.out.println("Postgresql Driver Registered for payment3");
			// Establish the connection
			con = DriverManager.getConnection(
					"jdbc:postgresql://127.0.0.1:5432/b6", "postgres",
					"sivaS123");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean createTableforPayment() {
		boolean result = false;
		Statement stmt = null;
		Statement stmt2 = null;
		boolean isTableExsist = false;
		try {
			getConnection();
			stmt2 = con.createStatement();
			stmt = con.createStatement();
			ResultSet rs = stmt2
					.executeQuery("SELECT EXISTS ( SELECT 1  FROM   pg_tables WHERE  schemaname = 'public' AND    tablename = 'payment2')");
			while (rs.next()) {
				isTableExsist = rs.getBoolean(1);
			}
			if (!isTableExsist) {

				result = stmt.execute(CREATE_TABLE_PAYMENT);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}

	public int saveRegistraionDetails(PaymentInfo userInfo) {
		int result = 0;
		PreparedStatement ps = null;
		try {
			getConnection();
			ps = con.prepareStatement(INSERT_PAYMENT);
			ps.setString(1, userInfo.getCardnumber());
			ps.setString(2, userInfo.getExpiryMonth());
			ps.setString(3, userInfo.getExpiryYear());
			ps.setString(4, userInfo.getcVV());
			ps.setString(5, userInfo.getNameOnCard());
			ps.setString(6, userInfo.getAmount());
			ps.setString(7, userInfo.getBillingAddress());
			ps.setString(8, userInfo.getEmail());
			ps.setString(9, userInfo.getPaymentpurpose());
			ps.setString(10, userInfo.getDate());
			ps.setString(11, userInfo.getUsername());

			result = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}

}