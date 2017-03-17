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



	<h1>List of Products for the Given Barcode & Ideal Price</h1>


	<table border="5">
		<thead>
			<tr>
				<th width="4%">S.No</th>
				<th width="15%">Store</th>
				<th width="15%">Bar Code</th>
				<th width="15%">Description</th>
				<th width="15%">Price</th>
				<th width="15%">Notes</th>

			</tr>
		</thead>
		<tbody>
			<c:forEach items="${listproduct}" var="product"
				varStatus="loopcounter">

				<tr>
					<td width="4%"><c:out value="${loopcounter.count}"></c:out></td>

					<td width="15%"><c:out value="${product.store}"></c:out></td>


					<td width="15%"><c:out value="${product.barcode}"></c:out></td>

					<td width="15%"><c:out value="${product.description}"></c:out></td>
					<td width="15%"><c:out value="${product.price}"></c:out></td>
					<td width="15%"><c:out value="${product.notes}"></c:out></td>

				</tr>

			</c:forEach>

		</tbody>
	</table>




	<h4>Barcode:${barcode}</h4>

	<h3>Product description:${desc}</h3>
	

	<h3>Product minimum:${minimum}</h3>
	

	<h3>Product maximum: ${maximum}</h3>
	


	<h3>averageProduct:${averageProduct}</h3>
	

	<h3>Number of prices collected:${number}</h3>

	

	<c:if test="${barcode!=null}">
		<h3>Ideal Price:${idealprice}</h3>
		


	</c:if>
	<c:out value="${error }"></c:out>




</body>
</html>