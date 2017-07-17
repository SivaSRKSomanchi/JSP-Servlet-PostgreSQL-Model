package patientportal1.modal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import patientportal1.patient.info.BillInfo;

public class BillRetrieval {
	Connection con = null;

	public void getConnection() {
		try {

			// Load the drive class
			Class.forName("org.postgresql.Driver");
			System.out.println("Postgresql Driver Registered for Bill");
			// Establish the connection
			con = DriverManager.getConnection(
					"jdbc:postgresql://127.0.0.1:5432/b6", "postgres",
					"sivaS123");
			System.out.println("Postgresql Driver connected for Bill");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<BillInfo> getInfo(String username) {
		List<BillInfo> billArraylist = new ArrayList<BillInfo>();
		ResultSet resultSet = null;
		PreparedStatement statement = null;
		getConnection();
		try {
			String query = "SELECT cardnumber, amount, billingaddress,email,paymentpurpose, date  FROM payment2 WHERE username = ?";
			statement = con.prepareStatement(query);
			statement.setString(1, username);
			resultSet = statement.executeQuery();
				while (resultSet.next()) {
					BillInfo billObj = new BillInfo();
					String cardnumber = resultSet.getString(1);
					String amount = resultSet.getString(2);
					String billaddress = resultSet.getString(3);
					String email = resultSet.getString(4);
					String paymentpurpose = resultSet.getString(5);
					String date = resultSet.getString(6);
					billObj.setBilladdress(billaddress);
					billObj.setAmount(amount);
					billObj.setOrderDate(date);
					billObj.setPaymentMethod(cardnumber+" "+email);
					billObj.setPaymentPurpose(paymentpurpose);
					billArraylist.add(billObj);      
					
				}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}

		return billArraylist;
	}
}
