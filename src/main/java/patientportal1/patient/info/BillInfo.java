package patientportal1.patient.info;

public class BillInfo {
String billaddress;
String shipaddress;
String orderDate;
String paymentMethod;
String amount;
String paymentPurpose;

public BillInfo(){
	
}

public BillInfo(String billaddress, String shipaddress, String orderDate,
		String paymentMethod, String amount, String paymentPurpose) {
	super();
	this.billaddress = billaddress;
	this.shipaddress = shipaddress;
	this.orderDate = orderDate;
	this.paymentMethod = paymentMethod;
	this.amount = amount;
	this.paymentPurpose = paymentPurpose;
}
public String getBilladdress() {
	return billaddress;
}
public void setBilladdress(String billaddress) {
	this.billaddress = billaddress;
}
public String getShipaddress() {
	return shipaddress;
}
public void setShipaddress(String shipaddress) {
	this.shipaddress = shipaddress;
}
public String getOrderDate() {
	return orderDate;
}
public void setOrderDate(String orderDate) {
	this.orderDate = orderDate;
}
public String getPaymentMethod() {
	return paymentMethod;
}
public void setPaymentMethod(String paymentMethod) {
	this.paymentMethod = paymentMethod;
}
public String getAmount() {
	return amount;
}
public void setAmount(String amount) {
	this.amount = amount;
}
public String getPaymentPurpose() {
	return paymentPurpose;
}
public void setPaymentPurpose(String paymentPurpose) {
	this.paymentPurpose = paymentPurpose;
}

@Override
public String toString() {
	return "BillInfo [billaddress=" + billaddress + ", shipaddress="
			+ shipaddress + ", orderDate=" + orderDate + ", paymentMethod="
			+ paymentMethod + ", amount=" + amount + ", paymentPurpose="
			+ paymentPurpose + "]";
}


}
