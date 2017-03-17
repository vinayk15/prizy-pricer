<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List Product</title>
</head>
<body>
	

		<h1>List of Product</h1>

		<table border="5">
			<thead>
				<tr>
					<th width="4%">S.N</th>
					<th width="15%">Store</th>
					<th width="15%">Bar Code</th>
					<th width="15%">Description</th>
					<th width="15%">Price</th>
					<th width="15%">Notes</th>

				</tr>
			</thead>
			<tbody>
				<c:forEach items="${listproduct}" var="product"
					varStatus="loopconter">

					<tr>
						<td><c:out value="${loopconter.count}"></c:out></td>

						<td><c:out value="${product.store}"></c:out></td>
						<td><a href="view/${product.barcode}">${product.barcode}</a></td>
						<td><c:out value="${product.description}"></c:out></td>
						<td><c:out value="${product.price}"></c:out></td>
						<td><c:out value="${product.notes}"></c:out></td>

					</tr>

				</c:forEach>



				</tbody></table>
</body>
</html>