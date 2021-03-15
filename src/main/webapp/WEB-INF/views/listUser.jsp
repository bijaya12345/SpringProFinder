<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User List</title>
<%@include file="header.jsp" %>
</head>
<body>
	<div>
		<header>
			<h1>User List</h1>
		</header>
	</div>
	<div>
		<a href="add_user">Add User</a>
	</div>
	<c:if test="${!empty users}">
		<div>
			<table class ="table table-stripped">
				<thead>
					<tr>
						<th>SN</th>
						<th>ID</th>
						<th>Username</th>
						<th>Password</th>
						<th>DOB</th>
						<th>Mobile No</th>
						<th>Gender</th>
						<th>Actions</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${users}" var="user" varStatus="i">
						<tr>
							<td>${i.count}</td>
							<td>${user.id}</td>
							<td>${user.username}</td>
							<td>${user.password}</td>
							<td>${user.dob}</td>
							<td>${user.mobileNo}</td>
							<td>${user.gender}</td>
							<td><a href="edit_user?id=${user.id}">Edit</a> <a href="delete_user?id=${user.id}">Delete</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</c:if>

</body>
</html>