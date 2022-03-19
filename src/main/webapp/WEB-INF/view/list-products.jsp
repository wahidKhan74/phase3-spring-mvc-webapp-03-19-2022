<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Products</title>
</head>
<body>
	<h1>List all products</h1>
	<core:forEach var="product" items="${list}">
		${product.getId()} - ${product.getName()}  - ${product.getPrice()}  -  ${product.getCreatedAt()} <br><br>
	</core:forEach>
</body>
</html>