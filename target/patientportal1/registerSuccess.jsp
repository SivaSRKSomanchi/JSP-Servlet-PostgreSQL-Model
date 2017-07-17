<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>


<body>
<% String info = request.getAttribute("message").toString();
	out.print(info);%>
	
	<form action="registerSuccess.do" method = "post">
	<a href="login.jsp">Sign In Here!</a>
	</form>
	<!-- http://localhost:8085/patientportal1/ -->
	
</body>
</html>