<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>

</head>
<body>

<c:forEach items="${productList}" var="prod">
<img alt="" src="resources/images/product/${prod.productId}.jpg">
</c:forEach>

</body>
</html>