<%@ page import="java.io.*"%>
<%@ page import="java.net.*"%>
<%@ page import="java.util.*"%>
<%@ page import="patientportal1.patient.info.BillInfo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<style type="text/css">
.invoice-title h2, .invoice-title h3 {
	display: inline-block;
}

.table>tbody>tr>.no-line {
	border-top: none;
}

.table>thead>tr>.no-line {
	border-bottom: none;
}

.table>tbody>tr>.thick-line {
	border-top: 2px solid;
}
</style>
</head>


<body>


	<%

if (request.getAttribute("billArraylist") != null) {

    ArrayList<BillInfo> itemsArray = (ArrayList<BillInfo>) request.getAttribute("billArraylist");

   out.println(itemsArray);

    out.println(itemsArray.size());

 

    for (int i=0; i < itemsArray.size(); i++) {

        out.println(itemsArray.get(i));

    } 

}

else {

    out.println("no data in array");

}  

%>
<c:forEach var="asd" items="${requestScope.billArraylist}">
    <%-- This calls the getBilladdress() method on your asd object --%>
    <c:out value="${asd.getBilladdress}"/>
    <%-- This calls the getPaymentPurpose() method on your asd object --%>
    <c:out value="${asd.getPaymentPurpose}"/>
    <%-- This calls the getAmount() method on your asd object --%>
    <c:out value="${asd.getAmount}"/>
</c:forEach>

	<div class="container">
		<div class="row">
			<div class="col-xs-12">
				<div class="invoice-title">
					<h2>Invoice</h2>
					<h3 class="pull-right">Order # 12345</h3>
				</div>
				<hr>
				<div class="row">
					<div class="col-xs-6">
						<address>
							<strong>Billed To:</strong><br>
							<c:out value="${itemsArray.getBilladdress()}" />
						</address>
					</div>
					<div class="col-xs-6 text-right">
						<address>
							<strong>Shipped To:</strong><br>
							<c:out value="${billArraylist.billaddress}" />
						</address>
					</div>
				</div>
				<div class="row">
					<div class="col-xs-6">
						<address>
							<strong>Payment Method:</strong><br>
							<c:out value="${billArraylist.paymentMethod}" />
							<br>

						</address>
					</div>
					<div class="col-xs-6 text-right">
						<address>
							<strong>Order Date:</strong><br>
							<c:out value="${billArraylist.orderDate}" />
							<br> <br>
						</address>
					</div>
				</div>
			</div>
		</div>

		<div class="row">
			<div class="col-md-12">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">
							<strong>Order summary</strong>
						</h3>
					</div>
					<div class="panel-body">
						<div class="table-responsive">
							<table class="table table-condensed">
								<thead>
									<tr>
										<td class="text-center"><strong>PaymentDetails</strong></td>
										<td class="text-center"><strong>Amount</strong></td>
									</tr>
								</thead>
								<tbody>
									<!-- foreach ($order->lineItems as $line) or some such thing here -->
									<tr>
										<td class="text-center"><c:out
												value="${billArraylist.paymentpurpose}" /></td>
										<td class="text-center"><c:out
												value="${billArraylist.amount}" /></td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div> 
</body>
</html>