package patientportal1.patient.info;

public class RegisterInfo {
	private String fullname;
	private String password;
	private String username;
	private String email;
	private String telephoneNumber;
	private String age;
	private String disease;
	
	public RegisterInfo(){
		
	}
	public RegisterInfo(String fullname, String password, String username,
			String email, String telephoneNumber) {
		super();
		this.fullname = fullname;
		this.password = password;
		this.username = username;
		this.email = email;
		this.telephoneNumber = telephoneNumber;
		/*this.age = age;
		this.disease = disease;*/
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephoneNumber() {
		return telephoneNumber;
	}
	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	/*public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}*/
	
	@Override
	public String toString() {
		return "ReisterInfo [fullname=" + fullname + ", password=" + password
				+ ", username=" + username + ", email=" + email
				+ ", telephoneNumber=" + telephoneNumber + "";
	}
	
	
	
	
}
