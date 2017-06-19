<html>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<head>


<style>
body{
background-image: linear-gradient(#79a06d, #79a06d); 
}
#box{
    border: 1px solid rgb(200, 200, 200);
    box-shadow: rgba(0, 0, 0, 0.1) 0px 5px 5px 2px;
    background: rgba(200, 200, 200, 0.1);
    border-radius: 4px;
    top:50px;
}
h2{
    text-align:center;
    color:#fff;
}

</style>

<script type="text/javascript">
function formRegister() {
var customerName = document.getElementById('customerName');

var customerphno = document.getElementById('customerphno');

var customerEmail = document.getElementById('customerEmail');

var password = document.getElementById('password');

var customeraddress = document.getElementById('customeraddress');

var customershippingaddress = document.getElementById('customershippingaddress');

var zipcode = document.getElementById('zipcode');



if (notEmpty(customerName, "Name Should not be empty")) {
	
	if (isAlphabet(customerName, "Please enter only letters for Name")) {
		
		if (notEmpty(customerphno, "phone Number Should not be empty")) {
			
			if (isNumeric(customerphno, "Please enter only Numbers for Phone Number")) {
				
				if (notEmpty(customerEmail, "emailID Should not be empty")) {
					
					if (emailValidator(customerEmail, "please Enter a valid Email Id")) {
						
						if (notEmpty(password, "password Should not be empty")) {
							
							if (isAlphanumeric(password, "please Enter a valid password")) {
								
								if (notEmpty(customeraddress, "customeraddress Should not be empty")) {
									
									if (notEmpty(customershippingaddress, "customershippingaddress Should not be empty")) {
										
										if (notEmpty(zipcode, "zipcode Should not be empty")) {
											
											if (isNumeric(zipcode, "Please enter only Numbers for zipcode")) {
						return true;
											}
										}
									}
								}
							}
						}	
					}
				}
			}
		}
	}
}
return false;
}
function notEmpty(elem, helperMsg) {
	if (elem.value.length == 0) {
		alert(helperMsg);
		elem.focus(); // set the focus to this input
		return false;
	}
	return true;
}
function isAlphabet(elem, helperMsg) {
	var alphaExp = /^[a-z A-Z]+$/;
	if (elem.value.match(alphaExp)) {
		return true;
	} else {
		alert(helperMsg);
		elem.focus();
		return false;
	}
}

function isNumeric(elem, helperMsg) {
	var numericExpression = /^[0-9]+$/;
	if (elem.value.match(numericExpression)) {
		return true;
	} else {
		alert(helperMsg);
		elem.focus();
		return false;
	}
}

function emailValidator(elem, helperMsg) {
	var emailExp = /^[\w\-\.\+]+\@[a-zA-Z0-9\.\-]+\.[a-zA-z0-9]{2,4}$/;
	if (elem.value.match(emailExp)) {
		return true;
	} else {
		alert(helperMsg);
		elem.focus();
		return false;
	}
}
function isAlphanumeric(elem, helperMsg) {
	var alphaExp = /^[0-9a-zA-Z]+$/;
	if (elem.value.match(alphaExp)) {
		return true;
	} else {
		alert(helperMsg);
		elem.focus();
		return false;
	}
}

</script>

</head>

<body>
 
 <div class="container-fluid">
                <div class="row-fluid" >
                    <div class="col-md-offset-4 col-md-4" id="box">
                      <h2>SIGNUP FORM</h2>
                         <hr>
                             <form class="form-horizontal" action="newcustomer" method="post" onsubmit="return formRegister()">
                                    <fieldset>
                                        <!-- Form Name -->


                                        <!-- Text input-->

                                        <div class="form-group">

                                            <div class="col-md-12">
                                                <div class="input-group">
                                                    <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                                    <input name="customerName" placeholder="Name" class="form-control" id="customerName" type="text">
                                                </div>
                                            </div>
                                        </div>
										
										
										<!-- Text input-->

                                        <div class="form-group">

                                            <div class="col-md-12">
                                                <div class="input-group">
                                                    <span class="input-group-addon"><i class="glyphicon glyphicon-earphone"></i></span>
                                                    <input name="customerphno" placeholder="+91-   " class="form-control" id="customerphno" type="text">
                                                </div>
                                            </div>
                                        </div>



                                  
                                        <!-- Text input-->
                                        <div class="form-group">

                                            <div class="col-md-12">
                                                <div class="input-group">
                                                    <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
                                                    <input name="customerEmail" placeholder="E-Mail Address" class="form-control" id="customerEmail" type="email">
                                                </div>
                                            </div>
                                        </div>
                                        
                                        <div class="form-group">

                                            <div class="col-md-12">
                                                <div class="input-group">
                                                    <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
                                                    <input name="password" placeholder="password" class="form-control" id="password" type="password">
                                                </div>
                                            </div>
                                        </div>


                                        
                                        <!-- Text input-->

                                        <div class="form-group">

                                            <div class="col-md-12 inputGroupContainer">
                                                <div class="input-group">
                                                    <span class="input-group-addon"><i class="glyphicon glyphicon-pencil"></i></span>
                                                    <textarea class="customeraddress" name="customeraddress" placeholder="ADDRESS" id="customeraddress"></textarea>
                                                </div>
                                            </div>
                                        </div>
                                        
                                        
										
										<div class="form-group">

                                            <div class="col-md-12 inputGroupContainer">
                                                <div class="input-group">
                                                    <span class="input-group-addon"><i class="fa fa-home"></i></span>
                                                    <textarea class="form-control" name="customershippingaddress" placeholder="SHIPPINGADDRESS" id="customershippingaddress"></textarea>
                                                </div>
                                            </div>
                                        </div>
                                        
                                        <div class="form-group">

                                            <div class="col-md-12 inputGroupContainer">
                                                <div class="input-group">
                                                    <span class="input-group-addon"><i class="fa fa-ship"></i></span>
                                                    <input class="form-control" name="zipcode" placeholder="zipcode" id="zipcode">
                                                </div>
                                            </div>
                                        </div>

                                        <div class="form-group">

                                            <div class="col-md-12">
                                            
                                                <button type="submit" name="Submit" class="btn btn-warning pull-right" value="Submit Form" >SUBMIT  <span class="glyphicon glyphicon-send"></span></button>
                                            </div>
                                        </div>

                                    </fieldset>
                                </form>
                    </div> 
</div>
</body>

</html>
