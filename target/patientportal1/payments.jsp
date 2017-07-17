<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
.credit-card-div  span {
	padding-top: 10px;
}

.credit-card-div img {
	padding-top: 30px;
}

.credit-card-div .small-font {
	font-size: 9px;
}

.credit-card-div .pad-adjust {
	padding-top: 10px;
}
</style>
</head>
<body>

	<form action="pay.do" method="post">
		<div class="container">
			<div class="row">
				<div class="col-md-12 text-center">
					<h2>Welcome to Nationals Payment Page</h2>
					<h6>Pay your bills here with your credit/debit card.</h6>
					<br />
				</div>
			</div>
			<div class="row">
				<div class="col-md-4 col-md-offset-4">
					<div class="credit-card-div">
						<div class="panel panel-default">
							<div class="panel-heading">

								<div class="row">
									<div class="col-md-12 col-sm-12 col-xs-12">
										<h5 class="text-muted">Credit Card Number</h5>
									</div>
									<div class="col-md-12 pad-adjust">
										<input type="text" class="form-control" placeholder="0000 0000 0000 0000"
											name="cardnumber" />
									</div>
								</div>
								<div class="row ">
									<div class="col-md-3 col-sm-3 col-xs-3">
										<span class="help-block text-muted small-font"> Expiry
											Month</span> <input type="text" class="form-control"
											placeholder="MM" name="expiryMonth" />
									</div>
									<div class="col-md-3 col-sm-3 col-xs-3">
										<span class="help-block text-muted small-font"> Expiry
											Year</span> <input type="text" class="form-control" placeholder="YY"
											name="expiryYear">
									</div>
									<div class="col-md-3 col-sm-3 col-xs-3">
										<span class="help-block text-muted small-font"> CVV</span> <input
											type="text" class="form-control" placeholder="CVV" name="cvv" />
									</div>
									<div class="col-md-3 col-sm-3 col-xs-3">
										<img
											src="data:image/png;base64,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"
											class="img-rounded" />
									</div>
								</div>
								<div class="row ">
									<div class="col-md-12 pad-adjust">

										<input type="text" class="form-control"
											placeholder="Name On The Card" name="nameOnCard" />
									</div>
								</div>
								<div class="row ">
									<div class="col-md-12 pad-adjust">

										<input type="text" class="form-control"
											placeholder="Enter Your Amount Here" name="amount" />
									</div>
								</div>
								<div class="row ">
									<div class="col-md-12 pad-adjust">
										<input type="text" class="form-control"
											placeholder="enter your address here" name=billingAddress>
									</div>
								</div>
								<div class="row ">
									<div class="col-md-12 pad-adjust">
										<input type="email" class="form-control"
											placeholder="enter your email address here" name=email>
									</div>
								</div>
								<div class="row ">
									<div class="col-md-12 pad-adjust">
										<input type="text" class="form-control"
											placeholder="cuaue for payment" name=paymentpurpose>
									</div>
								</div>
								<div class="row ">
									<div class="col-md-4 col-sm-4 col-xs-4">
										<span class="help-block text-muted small-font"> Today
											Day</span> <input type="text" class="form-control"
											placeholder="DD" name="todaysDay" />
									</div>
									<div class="col-md-4 col-sm-4 col-xs-4">
										<span class="help-block text-muted small-font"> Today
											Month</span> <input type="text" class="form-control"
											placeholder="MM" name="todaysMonth" />
									</div>
									<div class="col-md-4 col-sm-4 col-xs-4">
										<span class="help-block text-muted small-font"> Today
											Year</span> <input type="text" class="form-control" placeholder="YY"
											name="todaysYear">
									</div>
								<div class="row ">
									<div class="col-md-6 col-sm-6 col-xs-6 pad-adjust">
										<input type="submit" class="btn btn-danger" value="CANCEL" />
									</div>
									<div class="col-md-6 col-sm-6 col-xs-6 pad-adjust">
										<input type="submit" class="btn btn-warning btn-block"
											value="PAY NOW" />
									</div>
								</div>

							</div>
						</div>
					</div>
					<!-- CREDIT CARD DIV END -->
				</div>
			</div>
		</div>
	</form>



</body>
</html>