<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Your User Detail</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>Id</th>
				<th>Username</th>
				<th>Password</th>
				<th>Gender</th>
				<th>PhoneNumber</th>
				<th>DOB</th>
				<th>Actions</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${users}" var="user" varStatus="i">
						<tr>
							<td>${user.id }</td>
							<td>${user.username}</td>
							<td>${user.password}</td>
							<td>${user.gender}</td>
							<td>${user.mobileNo}</td>
							<td>${user.dob}</td>
							<td><a href="edit_user?id=${user.id}">Edit</a></td>
						</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>