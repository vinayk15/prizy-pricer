<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Get Product</title>
</head>
<body>


	<h1>List of Product</h1>

	
		<h3>Barcode</h3>
		<td><c:out value="${barcode}"></c:out></td>
		
		<h3>Product description</h3>
		<td><c:out value="${desc}"></c:out>
		
			<h3>Product minimum</h3>
		<td><c:out value="${minimum}"></c:out></td>
		
		<h3>Product maximum</h3>
		<td><c:out value="${maximum}"></c:out></td>
		
		<h3>Product averageProduct</h3>
		<td><c:out value="${averageProduct}"></c:out></td>
		
		<h3>Number of prices collected</h3>

		<td><c:out value="${number}"></c:out></td>
		
		<c:if test="${barcode!=null}">
		<h3>Ideal Price.</h3>
		<td><c:out value="${idelprice}"></c:out></td>
		

	</c:if>
	<c:out value="${error }"></c:out>




</body>
</html>