<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Welcome Admin!!!
<%@ include file="menu.jsp" %>

<c:if test="${isUserClickedaddcategoryButton == 'true'}">
<%@ include file="category.jsp" %>

</c:if>

<c:if test="${isUserClickedaddsupplierButton == 'true'}">
<%@ include file="supplier.jsp" %>

</c:if>
<c:if test="${isUserClickedaddproductButton == 'true'}">
<%@ include file="product.jsp" %>

</c:if>
<c:if test="${isUserClickedviewcategoryButton == 'true'}">
<%@ include file="viewcategory.jsp" %>

</c:if>


<c:if test="${isUserClickedviewproductButton == 'true'}">
<%@ include file="viewproduct.jsp" %>

</c:if>
<c:if test="${isUserClickedviewsupplierButton == 'true'}">
<%@ include file="viewsupplier.jsp" %> 

</c:if>
<c:if test="${isAdminClickedEditCategory == 'true'}">
<%@ include file="editcategory.jsp" %> 

</c:if>

<c:if test="${isAdminClickedEditProduct == 'true'}">
<%@ include file="editproduct.jsp" %>  

</c:if>

<c:if test="${isAdminClickedEditSupplier == 'true'}">
<%@ include file="editsupplier.jsp" %>  

</c:if>
</body>
</html>