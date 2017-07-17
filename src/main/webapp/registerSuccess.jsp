<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>


<body>
	<%-- <% String info = request.getAttribute("message").toString();
	out.print(info);%> --%>
<form action="registerSuccess.do" method = "post">
	<div class="container">
		<div class="row text-center">
			<div class="col-sm-6 col-sm-offset-3">
				<br>
				<br>
				<h1 style="color: #0fad00">Registration Success</h1>
				<img src="https://www.orefauji.com/img/success.jpg">
				<h2>Dear, User</h2>
				<h4><p style="font-size: 20px; color: #5C5C5C;">Thanks for
					registering your Mobile Number and Email. We will send you text messages and emails 
					 with your details like payments, prescriptions, health reports, bills, etc,. Please keep your devices active.
					 Hope you enjoy our services. </p></h4>
				<h3><input type="submit" value="Log in" class="btn btn-success"></h3> <br>
				<br>
			</div>
		</div>
	</div>
</form>
	<!-- <form action="registerSuccess.do" method = "post">
	<a href="login.jsp">Sign In Here!</a>
	</form> -->
	<!-- http://localhost:8085/patientportal1/ -->

</body>
</html>