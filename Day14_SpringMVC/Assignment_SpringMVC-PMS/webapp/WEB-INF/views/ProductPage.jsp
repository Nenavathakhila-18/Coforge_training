<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Management System</title>
<link href="EMSStyle.css" rel="stylesheet"></link>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<script type="text/javascript">
	let pid = document.getElementById("pid").value;
	let pname = document.getElementById("pname").value;
	let pprice = document.getElementById("pprice").value;
	let pquantity = document.getElementById("pqunatity").value;
	
	if(pid==""){
		alert("product Id cannot be empty");
		return false;
	}
	
	</script>
</head>
<body>
	<div class="header">
		<h1>Employee Management System</h1>
		<br>
		
	<form action="product" method="post">
	</div>
	<br>
	<div class="content">
		<table>
			<tr>
				<td>Product Id</td>
				<td><input type="text" name="pid"></input></td>
			</tr>

			<tr>
				<td>Product Name</td>
				<td><input type="text" name="pname"> </input></td>
			</tr>
			<tr>
				<td>Product Price</td>
				<td><input type="number" name="pprice"> </input></td>
			</tr>
			<tr>
				<td>Product Quantity</td>
				<td><input type="number" name="pquantity"> </input></td>
			</tr>

		</table>

		<br> <input type="submit" name ="ProductRegistration" value="ProductRegistration" class="btn-primary"></input>
		&nbsp; &nbsp; <input type="submit" value="DeleteProduct" name ="DeleteProduct" class="btn-danger"></input>
		&nbsp; &nbsp; <input type="submit" value="UpdateProduct" name ="UpdateProduct" class="btn-warning"></input>
		&nbsp; &nbsp; <input type="submit" value="SearchProductByID"   name ="SearchProductByID" class="btn-success"></input>
		&nbsp; &nbsp; <input type="submit" value="SearchProduct" name ="SearchProduct" class="btn-info"></input>
		<br>

	</div>
	</form>
	<br/>
	<div>
	<!-- Expression language  -->
		<b>${result}</b>
	</div>
</body>
</html>