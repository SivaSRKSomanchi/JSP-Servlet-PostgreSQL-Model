<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!-- <style type="text/css">
/* Tell body leave a 40px gap at the top for the navigation when the page is scrolled to the top */
body { position: relative; padding-top: 40px; }
/* Tell the nav to stick to the top left */
nav { position: fixed; top: 0; left: 0; }
</style> -->
<!-- Latest compiled and minified CSS -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<style type="text/css">

body{
background: url(https://s-media-cache-ak0.pinimg.com/originals/ba/a3/aa/baa3aa1cca168dac8ad8fe2c20bef1f5.jpg) no-repeat center center fixed; 
  -webkit-background-size: cover;
  -moz-background-size: cover;
  -o-background-size: cover;
  background-size: cover;
}
.list{
font-size: medium;
font-weight: 700;
}

</style>

</head>
<body>

<%-- <% String info =  request.getAttribute("message").toString();
 out.print(info);%> --%>
 
 
  <nav class="navbar nav-inverse">
    <div class="container">
     <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#mobileDisplay" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a  href="#" class="navbar-brand">PPNH</a>
    </div>
    <div class="collapse navbar-collapse" id="mobileDisplay">
     <ul class="nav navbar-nav ">
      <li class = "list"><a href="about.jsp">About</a></li>
      <li class = "list"><a href="contact.jsp">Contact</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li class = "list"><a href="paymentMethod.jsp">Payments</a></li>
      <li class = "list"><a href="dummybills.jsp">Bills</a></li>
       <li class = "list"><a href="locations.jsp">Locations</a></li>
         <li class = "list"><a href="updateEmail.jsp">UpdateEmail</a></li>
      <li class = "list"><a href="login.jsp">Logoff</a></li>
    </ul>
  </div>
</div>
</nav>


<script src="https://code.jquery.com/jquery-3.2.1.js" integrity="sha256-DZAnKJ/6XZ9si04Hgrsxu/8s717jcIzLy3oi35EouyE=" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
 
 
</body>
</html>