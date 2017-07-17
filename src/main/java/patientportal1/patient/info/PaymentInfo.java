package patientportal1.patient.info;

public class PaymentInfo {
	String cardnumber;
	String expiryMonth;
	String expiryYear;
	String cVV;
	String nameOnCard;
	String amount;
	String billingaddress ;
	String email ;
	String paymentpurpose ;
	String date;
	String username;
	
	public PaymentInfo(String cardnumber, String expiryMonth,
			String expiryYear, String cVV, String nameOnCard, String amount,
			String billingAddress, String email, String paymentpurpose,
			String date, String username) {
		super();
		this.cardnumber = cardnumber;
		this.expiryMonth = expiryMonth;
		this.expiryYear = expiryYear;
		this.cVV = cVV;
		this.nameOnCard = nameOnCard;
		this.amount = amount;
		this.billingaddress = billingAddress;
		this.email = email;
		this.paymentpurpose = paymentpurpose;
		this.date = date;
		this.username = username;
	}
	public String getBillingaddress() {
		return billingaddress;
	}
	public void setBillingaddress(String billingaddress) {
		this.billingaddress = billingaddress;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getBillingAddress() {
		return billingaddress;
	}
	public void setBillingAddress(String billingAddress) {
		this.billingaddress = billingAddress;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPaymentpurpose() {
		return paymentpurpose;
	}
	public void setPaymentpurpose(String paymentpurpose) {
		this.paymentpurpose = paymentpurpose;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getCardnumber() {
		return cardnumber;
	}
	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}
	public String getExpiryMonth() {
		return expiryMonth;
	}
	public void setExpiryMonth(String expiryMonth) {
		this.expiryMonth = expiryMonth;
	}
	public String getExpiryYear() {
		return expiryYear;
	}
	public void setExpiryYear(String expiryYear) {
		this.expiryYear = expiryYear;
	}
	public String getcVV() {
		return cVV;
	}
	public void setcVV(String cVV) {
		this.cVV = cVV;
	}
	public String getNameOnCard() {
		return nameOnCard;
	}
	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "PaymentInfo [cardnumber=" + cardnumber + ", expiryMonth="
				+ expiryMonth + ", expiryYear=" + expiryYear + ", cVV=" + cVV
				+ ", nameOnCard=" + nameOnCard + ", amount=" + amount
				+ ", billingaddress=" + billingaddress + ", email=" + email
				+ ", paymentpurpose=" + paymentpurpose + ", date=" + date
				+ ", username=" + username + "]";
	}
	
	
	
	
}
