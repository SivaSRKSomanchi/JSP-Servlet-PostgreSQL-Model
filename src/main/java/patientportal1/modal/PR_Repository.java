package patientportal1.modal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import patientportal1.patient.info.RegisterInfo;




public class PR_Repository {

	Connection con = null;
	public static final String CREATE_TABLE = "Create table register3(fullname character varying(40) NOT NULL, email character varying(40) NOT NULL, username character varying(40) NOT NULL, password character varying(40) NOT NULL, telephoneNumber character varying(40) NOT NULL)";
	
	public static final String INSERT_REGISTER = "INSERT INTO register3 (fullname, email, username, password, telephoneNumber) values(?,?,?,?,?)";
	public static final String SELECT_USER_INFO = "select * from register3 where username=? AND password=?";
	public static final String UPDATE_EMAIL = "UPDATE register3 set email=? where username=?";
	
	public void getConnection(){
		try {
		
		//Load the drive class
		Class.forName("org.postgresql.Driver");
		System.out.println("Postgresql Driver Registered");
		//Establish the connection
		con = DriverManager.getConnection(
				"jdbc:postgresql://127.0.0.1:5432/b6", "postgres",
				"sivaS123");
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean createRegistration(){
		boolean result = false;
		Statement stmt = null;
		Statement stmt2 = null;
		boolean isTableExsist=false;
		try{
			getConnection();
			stmt2 = con.createStatement();
			stmt = con.createStatement();
			ResultSet rs = stmt2.executeQuery("SELECT EXISTS ( SELECT 1  FROM   pg_tables WHERE  schemaname = 'public' AND    tablename = 'register3')");
			while(rs.next()){
				isTableExsist = rs.getBoolean(1);
			}			
			if(!isTableExsist){
				
				result = stmt.execute(CREATE_TABLE);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}
	
	public int saveRegistraionDetails(RegisterInfo userInfo){
		int result =0;
		PreparedStatement ps = null;
		try{
			getConnection();
			ps = con.prepareStatement(INSERT_REGISTER);
			ps.setString(1,  userInfo.getFullname());
			ps.setString(2, userInfo.getEmail());
			ps.setString(3, userInfo.getUsername());
			ps.setString(4, userInfo.getPassword());
//			ps.setString(5, userInfo.getAge());
//			ps.setString(6, userInfo.getDisease());
			ps.setString(5, userInfo.getTelephoneNumber());
			result =ps.executeUpdate();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}
	
	public boolean successfullLogin(String username, String password) {
		// TODO Auto-generated method stub
		boolean result = false;
		PreparedStatement ps = null;
		System.out.println("Connecting to PostgreSQL DB to perform SELECTION Operation.");
		getConnection();
		try {
			ps = con.prepareStatement(SELECT_USER_INFO);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				String nameHere = rs.getString(1);
				String passwordHere = rs.getString(2);
				System.out.println(nameHere + passwordHere);
				result = true;
			}
			if(result){
				System.out.println("Matched!");
			}
		} catch (SQLException e) {
			System.out.println(e);
		}

		return result;
	}
	
	public void updateEmailandPassword(String email, String username){
		PreparedStatement ps =null;
		try{
			getConnection();
			ps =con.prepareStatement(UPDATE_EMAIL);
			ps.setString(1, email);
			//ps.setString(2, password);
			ps.setString(2, username);
			
			ps.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
}
