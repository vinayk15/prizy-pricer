<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Product Add</title>
</head>
<body>
<form:form action="saveproduct" modelAttribute="product" method="Post">

<table>
			<tr>
				<td>Store</td>
				<td><form:input path="store" /></td>
			</tr>

			<tr>
				<td>Bar Code</td>
				<td><form:input path="barcode" /></td>
			</tr>
			<tr>
				<td>Description</td>
				<td><form:input path="description" /></td>
			</tr>
			<tr>
				<td>Price</td>
				<td><form:input path="price" /></td>
			</tr>
			<tr>
				<td>Note</td>
				<td><form:input path="notes" /></td>
			</tr>


		</table>
		<input type="submit" name="Add">
		</form:form>

</body>
</html>