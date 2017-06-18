<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<head>

<style>


.dropbtn {
    background-color: #ff5722;
    color: white;
    padding: 16px;
    font-size: 16px;
    border: none;
    cursor: pointer;
}

.dropdown {
    position: relative;
    display: inline-block;
}

.dropdown-content {
    display: none;
    position: absolute;
    background-color: #ff5722;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
    z-index: 1;
}

.dropdown-content a {
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
}

.dropdown-content a:hover {

}

.dropdown:hover .dropdown-content {
    display: block;
}

.dropdown:hover .dropbtn {
   
}



html, body
{
    margin: 0px 0px 0px 0px;
   
}


div.container
{
    font-family: Raleway;
    margin: 0 auto;
     width:100%;
	padding: 2em 1em;
	text-align: right-side;
}

div.container a
{
    color: #FFF;
    text-decoration: none;
    font: 15px Raleway;
    margin: 0px 10px;
    padding: 10px 10px;
    position: relative;
    z-index: 0;
    cursor: pointer;
}


.deepOrange
{
    background: #ff5722;
}


div.pullRightLeft a:before, div.pullRightLeft a:after
{
    position: absolute;
    width: 2px;
    height: 100%;
    top: 0px;
    content: '';
    background: #FFF;
    opacity: 0.3;
    transition: all 0.3s;
}

div.pullRightLeft a:before
{
    left: 0px;
} 

div.pullRightLeft a:after
{
    right: 0px;
}

div.pullRightLeft a:hover:before, div.pullRightLeft a:hover:after
{
    width: 100%;
}




div.highlightTextIn a
{
    color: rgba(0, 0, 0, 0.4); 
}

div.highlightTextIn a:before
{
    transform: scale(1.2);
} 


</style>
</head>
<body>

<div class="container deepOrange pullRightLeft">






  <a>HOME <span class="glyphicon glyphicon-home"></span> </a> 
  
  <c:if test="${isAdminLoggedIn == 'true'}">
  
<div class="dropdown">
  <a class="dropbtn">CATEGORY  <span class="glyphicon glyphicon-menu-down"></span></a>
  <div class="dropdown-content">
    <a href="categoryPage">AddCategory</a>
    <a href="viewcategoryPage">ViewCategory</a>
    
  </div>
</div>


<div class="dropdown">
  <a class="dropbtn">PRODUCT  <span class="glyphicon glyphicon-menu-down"></span> </a>
  <div class="dropdown-content">
    <a href="productPage">AddProduct</a>
    <a href="viewproductPage">ViewProduct</a>
    
  </div>
</div>  
  
  
 <div class="dropdown">
  <a class="dropbtn">ORDER <span class="glyphicon glyphicon-menu-down"></span> </a>
  <div class="dropdown-content">
    <a href="orderPage">AddOrder</a>
    <a href="vieworderPage">ViewOrder</a>
    
  </div>
 </div>
  

<div class="dropdown">
  <a class="dropbtn">SUPPLIER  <span class="glyphicon glyphicon-menu-down"></span> </a>
  <div class="dropdown-content">
    <a href="supplierPage">AddSupplier</a>
    <a href="viewsupplierPage">ViewSupplier</a>
    
  </div>
</div>

</c:if>

<c:if test="${isUserLoggedIn == 'true'}">
<div class="dropdown">
  <a class="dropbtn">CART  <span class="glyphicon glyphicon-shopping-cart"></span> </a>
  <div class="dropdown-content">
    <a href="cartPage">AddCart</a>
    <a href="viewcartPage">ViewCart</a>
    
  </div>
</div>

 </c:if>
 
  <input type="search" name="search" placeholder="Search..">
   <input id="search-button" name="search_submit" type="submit" value="Search!">
 
      
	  <c:if test="${pageContext.request.userPrincipal.name != null}">
   <a href="logoutPage" style="float:right"><span class="glyphicon glyphicon-log-out"></span>LOGOUT</a>
   
   </c:if>
   
   
     <c:if test="${pageContext.request.userPrincipal.name == null}">
   <a href="signupPage" style="float:right"><span class="glyphicon glyphicon-user"></span>SIGNUP</a> 
    <a href="loginPage" style="float:right"><span class="glyphicon glyphicon-log-in"></span>LOGIN</a>
     </c:if>
   
   
   
     
</div>
     

</body>
</html> 
