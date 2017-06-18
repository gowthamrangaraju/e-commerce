<html>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
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
var supplierName = document.getElementById('supplierName');

var supplierphno = document.getElementById('supplierphno');

var supplierAddress = document.getElementById('supplierAddress');


if (notEmpty(supplierName, "supplierName Should not be empty")) {
	
	if (isAlphabet(supplierName, "Please enter only letters for supplierName")) {
		
		if (notEmpty(supplierphno, "phone Number Should not be empty")) {
			
			if (isNumeric(supplierphno, "Please enter only Numbers for Phone Number")) {
				
				if (notEmpty(supplierAddress, "supplierAddress Should not be empty")) {
						
						return true;
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



	
</script>

</head>
<body>
 
 <div class="container-fluid">
                <div class="row-fluid" >
                    <div class="col-md-offset-4 col-md-4" id="box">
                      <h2>SUPPLIER FORM</h2>
                         <hr>
                             <form class="form-horizontal" action="newsupplier" method="post" id="contact_form" onsubmit="return formRegister()">
                                    <fieldset>
                                        <!-- Form Name -->


                                        <!-- Text input-->

                                        <div class="form-group">

                                            <div class="col-md-12">
                                                <div class="input-group">
                                                    <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                                    <input name="supplierName" placeholder="supplierName" class="form-control" id="supplierName" type="text">
                                                </div>
                                            </div>
                                        </div>



                                        <!-- Text input-->

                                        <div class="form-group">

                                            <div class="col-md-12">
                                                <div class="input-group">
                                                    <span class="input-group-addon"><i class="glyphicon glyphicon-earphone"></i></span>
                                                    <input name="supplierphno" placeholder="+91-" class="form-control" id="supplierphno" type="text">
                                                </div>
                                            </div>
                                        </div>

                                        <!-- Text input-->

                                        <div class="form-group">

                                            <div class="col-md-12 inputGroupContainer">
                                                <div class="input-group">
                                                    <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
                                                    <textarea class="form-control" name="supplierAddress" placeholder="supplierAddress" id="supplierAddress"></textarea>
                                                </div>
                                            </div>
                                        </div>

                                        <div class="form-group">
                                        ${message}
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
