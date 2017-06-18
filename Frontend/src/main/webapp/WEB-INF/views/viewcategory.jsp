<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<style>
@import url(https://fonts.googleapis.com/css?family=Open+Sans:400,600);

*, *:before, *:after {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}

body {
  background: #105469;
  font-family: 'Open Sans', sans-serif;
}
table {
  background: #012B39;
  border-radius: 0.25em;
  border-collapse: collapse;
  margin: 1em;
}
th {
  border-bottom: 1px solid #364043;
  color: #E2B842;
  font-size: 0.85em;
  font-weight: 600;
  padding: 0.5em 1em;
  text-align: left;
}
td {
  color: #fff;
  font-weight: 400;
  padding: 0.65em 1em;
}
.disabled td {
  color: #4F5F64;
}
tbody tr {
  transition: background 0.25s ease;
}
tbody tr:hover {
  background: #014055;
}


</style>
</head>
<body>

<h1 style="float:center">CATEGORY TABLE</h1>
<table>  
    <tr>
    <th>S.No</th>
      <th>categoryId</th>
      <th>categoryName</th>
	  <th>categoryDesc</th>
      <th>Edit</th>
      <th>Delete</th>
  </tr>
  <c:forEach items="${categoryList}" var="category" varStatus="status">
    <tr>
      <td>${status.count}</td>
      <td>${category.categoryId}</td>
        <td>${category.categoryName}</td>
         <td>${category.categoryDesc}</td>
      <td><a href="editCategory?categoryId=${category.categoryId}">Edit</a></td>
      <td><a href="deleteCategory?categoryId=${category.categoryId}">Delete</a></td>
      </tr>
  </c:forEach>
 
</table>
</body>
</html>