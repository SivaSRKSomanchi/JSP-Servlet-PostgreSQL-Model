<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">
div {
	border: 10px solid #f1f1f1;
}
</style>


</head>
<body>
	<h2>Welcome to Patient Portal at Nationals..</h2>
	<div>
		<form action="reg.do" method="post">
			<label>Full Name: <input type="text" title="fullname"
				placeholder="fullname" name="Fullname" /></label></br> <label>Email id:
				<input type="email" title="email" placeholder="email" name="Email" />
			</label></br> <label>Username:<input type="text" title="username"
				placeholder="username" name="Username" /></label></br> <label>Password:<input
				type="password" title="password" placeholder="password"
				name="Password" /></label></br> <label>Telephone Number:<input
				type="text" title="telephoneNumber" placeholder="telephoneNumber"
				name="telephoneNumber" /></label></br> <select name="age" id="ageSelect1">
				<option>AGE</option>
				<option>1-5</option>
				<option>6-10</option>
				<option>11-20</option>
				<option>20-30</option>
				<option>30+</option>
				<option>55+</option>
			</select> <select name="disease" id="ageSelect1">
				<option>DISEASE/CONDITION</option>
				<option>Thyroid Disease</option>
				<option>Kideney Disease</option>
				<option>Retinal Disease</option>
				<option>High Blood Plessure</option>
				<option>Fever,Cough,Cold</option>
				<option>Nerves Weakness</option>
				<option>Nerves Weakness</option>
			</select> </br> <label>Do you drink alcohol?</label> <label for="agreed">Yes<input
				type="checkbox" id=agreed name="agreed"></label> <label
				for="disagreed">No<input type="checkbox" id=disagreed
				name="disagreed"></label> </br> <label>Do you use tobacco
				products?</label> <label for="agreed">Yes<input type="checkbox"
				id=agreed name="agreed"></label> <label for="disagreed">No<input
				type="checkbox" id=disagreed name="disagreed"></label> </br> <label>Do
				you use illegal drugs?</label> <label for="agreed">Yes<input
				type="checkbox" id=agreed name="agreed"></label> <label
				for="disagreed">No<input type="checkbox" id=disagreed
				name="disagreed"></label> </br>
			<button type="submit" class="btn">Register</button>
			<button type="reset" name="Clear">Clear</button>
			</br>
		</form>
	</div>

	

	



</body>
</html>