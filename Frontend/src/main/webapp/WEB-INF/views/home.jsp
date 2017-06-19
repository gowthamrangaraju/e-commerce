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


<%@ include file="menu.jsp" %>


<c:if test="${isUserClickedLoginButton == 'true'}">
<%@ include file="login.jsp" %>

</c:if>


<c:if test="${isUserClickedSignupButton == 'true'}">
<%@ include file="signup.jsp" %>

</c:if>







<c:if test="${isUserClickedaddorderButton == 'true'}">
<%@ include file="order.jsp" %>
+
</c:if>



<c:if test="${isUserClickedaddcartButton == 'true'}">
<%@ include file="cart.jsp" %>

</c:if>

<c:if test="${isuserClickedLoginButton == 'true'}">
<%@ include file="login.jsp" %>
</c:if>



<c:if test="${isUserClickedvieworderButton == 'true'}">
<%@ include file="vieworder.jsp" %>
+
</c:if>




<c:if test="${isUserClickedviewcartButton == 'true'}">
<%@ include file="viewcart.jsp" %>

</c:if>



</body>
</html>