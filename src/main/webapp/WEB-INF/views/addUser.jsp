<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
<%@include file="header.jsp" %>
</head>
<body>
	<div class="container">
		<div class="panel">
			<div class="panel-body">
			
			<div class="row col-md-12">
			<div class="col-md-2"></div>
			<div class="col-md-8 jumbotron">
			<form action="save_user" method="post" class="form-horizontal">
			<fieldset>
			<legend>User Registration Form</legend>
				<div class="form-group">
					<label>UserName</label>
					<input type = "text" name="username" class="form-control" />
				</div>
			
				<div class="form-group">
					<label>Password</label>
					<input type = "password" name="password" class="form-control" />
				</div>
			
				<div class="form-group">
					<label>DOB</label>
					<input type = "date" name="dob" class="form-control" />
				</div>
			
				<div class="form-group">
					<label>Mobil No</label>
					<input type = "number" name="mobileNo" class="form-control" />
				</div>
			
				<div class="form-group">
					<label>Gender</label>
					<input type = "radio" name="gender" value="Male" />Male
					<input type = "radio" name="gender" value="Female" />Female
				</div>
			
				<div class="form-group">
					<label>Submit</label>
					<input type = "submit" value="Submit" class="btn btn-danger" />
				</div>
				</fieldset>
			
			</form>
			</div>
	</div>
	</div>
	<div class="col-md-2"></div>
	</div>
	</div>
</body>
</html>