<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Staff Registration</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>
	<%@ include file="navbar.jsp"%>
	<form action="RegisterServlet" method="Post">
<!-- 		Name : <input type="text" name="userName"><br> Password :
		<input type="password" name="password"><br> Email : <input
			type="text" name="email"><br> Phone : <input type="text"
			name="phone"><br> Occupation : <select name="occupation">
			<option>Admin</option>
			<option>Manager</option>
			<option>Sales Team</option>
			<option>Projects Team</option>
			<option>Operations Team</option>
		</select> <br> Language : <select name="language">
			<option>English</option>
			<option>Chinese</option>
			<option>Malay</option>
			<option>Indian</option>
		</select> <br> <input type="submit" value="Register User" /> -->
		<div class="container col-md-6">
			<div class="card">
				<div class="card-body">
				<caption>
					<h2>Add new user</h2>
					</caption>
					<fieldset class="form-group">
						<label>User Name</label> <input type="text" name="userName"
							required="required">
					</fieldset>
					<fieldset class="form-group">
						<label>Password</label> <input type="password" name="password"
							required="required">
					</fieldset>
					<fieldset class="form-group">
						<label>User Email</label> <input type="text" name="email"
							required="required">
					</fieldset>
					<fieldset class="form-group">
						<label>User phone</label> <input type="text" name="phone"
							required="required">
					</fieldset>
					<fieldset class="form-group">
						<label> Occupation</label> <select name="occupation"
						required="required">
							<option>Admin</option>
							<option>Manager</option>
							<option>Sales Team</option>
							<option>Projects Team</option>
							<option>Operations Team</option>
						</select>
					</fieldset>
					<fieldset class="form-group">
						<label> Language</label> <select name="language"
						required="required">
							<option>English</option>
							<option>Chinese</option>
							<option>Malay</option>
							<option>Indian</option>
						</select>
					</fieldset>
					<button type="submit" class="btn btn-success">Save</button>
	</form>
	</div>
	</div>
	</div>
	</form>
</body>
</html>