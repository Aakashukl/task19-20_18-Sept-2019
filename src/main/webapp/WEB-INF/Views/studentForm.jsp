<%@page isELIgnored="false"%>
<%@taglib prefix="frm" uri="http://www.springframework.org/tags/form"%>


<html>
<head>
<title>ADD STUDENT</title>
</head>
<body>
	<h3>Student-Entry-Form</h3>
	<frm:form action="saveProcess" modelAttribute="studentObj">
		<table border="1">
			<frm:hidden path="id"/>
			
			<tr>
				<td>Name</td>
				<td><frm:input path="name" /> <frm:errors path="name" /> </td>
			</tr>

			<tr>
				<td>Email</td>
				<td><frm:input path="email" /> <frm:errors path="email" /></td>
			</tr>

			<tr>
				<td>Date of Birth</td>
				<td><frm:input  path="dateOfBirth" type="date"/></td>
			</tr>

			<tr>
				<td>Gender</td>
				<td><frm:radiobutton path="gender" value="Male" />Male <frm:radiobutton
						path="gender" value="Female" />Female</td>
			</tr>

			<tr>
				<td>Hobbies</td>
				<td><frm:checkbox path="hobbies" value="Cricket" />Cricket <frm:checkbox
						path="hobbies" value="Football" />Football <frm:checkbox
						path="hobbies" value="Vollyball" />Vollyball <frm:checkbox
						path="hobbies" value="Hockey" />Hockey</td>
			</tr>

			<tr>
				<td><b>City:</b></td>
				<td><frm:select path="city">
						<frm:option value="0">--Select--</frm:option>
						<frm:option value="Indore">Indore</frm:option>
						<frm:option value="Banglore">Banglore</frm:option>
						<frm:option value="Rewa">Rewa</frm:option>
						<frm:option value="Bhopal">Bhopal</frm:option>
						<frm:option value="Pune">Pune</frm:option>
					</frm:select></td>
			</tr>

			<tr>
				<td>Address</td>
				<td><frm:input path="address" /> <frm:errors path="address" /></td>
			</tr> 

			<tr>
				<td></td>
				<td><input type="submit" value="Save" /><input type="reset"
					value="Reset" /></td>
			</tr>



		</table>
	</frm:form>
	<a href='listStudent'> List of Students</a>
</body>
</html>
