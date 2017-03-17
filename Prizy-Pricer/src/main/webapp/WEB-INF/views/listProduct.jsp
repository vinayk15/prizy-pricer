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
<form:form action="list" modelAttribute="listproduct">

<h1>List of Product</h1>

 <table>
            <thead>
               <tr>
                  <th width="4%">S.N</th>
                  <th width="15%">Store</th>
                  <th width="15%">Bar Code</th>
                  <th width="15%">Decripatin</th>
                  <th width="15%">Price</th>
                  <th width="15%">Notes</th>
                  
               </tr>
            </thead>
            <tbody>
            <c:forEach items="${listproduct}" var="product" varStatus="loopconter">
            
            <tr>
            <td><c:out value="${product.id}"></c:out></td>
            
            <td><c:out value="${product.store}"></c:out></td>
           <td> <a href="view/${product.barcode}">View</a></td>
            
            	<td><c:out value="${product.barcode}"></c:out></td>
            
            <td><c:out value="${product.description}"></c:out></td>
            <td><c:out value="${product.price}"></c:out></td>
            <td><c:out value="${product.notes}"></c:out></td>
            
            </tr>
            
            </c:forEach>



</form:form>



</body>
</html>