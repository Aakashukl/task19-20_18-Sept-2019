<%@page isELIgnored="false"%>
<%@taglib prefix="frm" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
<title>ADD STUDENT</title>
</head>
<body>
	<h1>List of Student</h1>
	<p>
		<a href='showAddForm'> Add Student</a>
	</p>
	<table border="1">
		<tr>
			<th>Name</th>
			<th>Email</th>
			<th>Date of Birth</th>
			<th>Gender</th>
			<th>Hobbies</th>
			<th>City</th>
			<th>Address</th>
			<th>Action</th>
		</tr>
		
		<c:forEach items="${theStudents}" var="student">
			
			<c:url var="updateLink" value = "updateRecord">
				<c:param name="studentId" value = "${student.id}"></c:param>
			</c:url>
			<c:url var="deleteLink" value = "deleteRecord">
				<c:param name="studentId" value = "${student.id}"></c:param>
			</c:url>
			<tr>
				<td>${student.name}</td>
				<td>${student.email}</td>
				<td>${student.dateOfBirth}</td>
				<td>${student.gender}</td>
				<td>${student.hobbies}</td>
				<td>${student.city}</td>
				<td>${student.address}</td>
				<td>
				<a href = "${updateLink}">Update</a> | <a href="${deleteLink}">Delete</a>
				</td>
			</tr>
		</c:forEach>
		
	</table>
</body>
</html>
