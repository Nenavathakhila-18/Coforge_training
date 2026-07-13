<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Management System</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css"> </link>
	<script src="./AjaxScript.js"></script>
</head>

<body>

	<div class="header">
		<h1 align="center">Employee Management System</h1>
	</div>

	<br>

	<form action="EmployeeServlet" method="post">

		<div class="content">

			<table align="center">

				<tr>
					<td>Employee Id</td>
					<td><input type="text" id ="eid" name="eid" class="form-control"
						onblur="getEmployeeDetails()"></td>
				</tr>

				<tr>
					<td>Employee Name</td>
					<td><input type="text" name="ename" id ="ename" class="form-control">
					</td>
				</tr>

				<tr>
					<td>Employee Salary</td>
					<td><input type="number" name="esalary" id="esalary" class="form-control">
					</td>
				</tr>

				<tr>
					<td>Department Number</td>
					<td><input type="number" name="dno" id="dno" class="form-control">
					</td>
				</tr>

			</table>

			<br>

			<div align="center">

				<input type="submit" name="emsbutton" value="Insert"
					class="btn btn-primary"> &nbsp;&nbsp; <input type="submit"
					name="emsbutton" value="Delete" class="btn btn-danger">

				&nbsp;&nbsp; <input type="submit" name="emsbutton" value="Update"
					class="btn btn-warning"> &nbsp;&nbsp; <input type="submit"
					name="emsbutton" value="Find" class="btn btn-success">

				&nbsp;&nbsp; <input type="submit" name="emsbutton" value="FindAll"
					class="btn btn-info">

			</div>

		</div>

	</form>

	<br>

	<div class="container">

		<div class="alert alert-primary" align="center">

			<b> <%
 String result = request.getParameter("result");

 if (result != null) {
 	out.print(result);
 }
 %>

			</b>

		</div>

	</div>


</body>
</html>