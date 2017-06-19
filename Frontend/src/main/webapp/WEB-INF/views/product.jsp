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
var productName = document.getElementById('productName');

var productsupplier = document.getElementById('productsupplier');

var productprice = document.getElementById('productprice');

var productstock = document.getElementById('productstock');

var productoffers = document.getElementById('productoffers');

var productdes = document.getElementById('productdes');

var productreview = document.getElementById('productreview');


if (notEmpty(productName, "ProductName Should not be empty")) {
	
	if (isAlphabet(productName, "Please enter only letters for productName")) {
		
		if (notEmpty(productsupplier, "productsupplier Should not be empty")) {
			
			if (isAlphabet(productsupplier, "Please enter only Letters for productsupplier")) {
				
				if (notEmpty(productprice, "productprice Should not be empty")) {
					
					if (isNumeric(productprice, "please Enter only Numbers productprice")) {
						
						if (notEmpty(productstock, "productstock Should not be empty")) {
							
							if (isNumeric(productstock, "please Enter only Letters for productstock")) {
								
								if (notEmpty(productoffers, "productoffers Should not be empty")) {
									
									if (isAlphanumeric(productoffers, "please Enter a valid productoffers")) {
										
										if (notEmpty(productdes, "productdes Should not be empty")) {

											if (isAlphabet(productdes, "Please enter only Letters for productdes")) {
												
												if (notEmpty(productreview, "productreview Should not be empty")) {
													
													if (isAlphabet(productreview, "Please enter only Letters for productreview")) {
									
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

function isAlphanumeric(elem, helperMsg) {
	var alphaExp = /^[0-9 %]+$/;
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
                      <h2>PRODUCT FORM</h2>
                         <hr>
                             <form class="form-horizontal" action="newproduct" method="post" id="contact_form" onsubmit="return formRegister()" enctype="multipart/form-data">
                                    <fieldset>
                                        <!-- Form Name -->


                                        <!-- Text input-->

                                        <div class="form-group">

                                            <div class="col-md-12">
                                                <div class="input-group">
                                                    <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                                    <input name="productName" placeholder="productName" class="form-control" id="productName" type="text">
                                                </div>
                                            </div>
                                        </div>
										
										<div class="form-group">

                                            <div class="col-md-12">
                                                <div class="input-group">
                                                    <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                                    <input name="productsupplier" placeholder="productsupplier" class="form-control" id="productsupplier" type="text">
                                                </div>
                                            </div>
                                        </div>
										
										<div class="form-group">

                                            <div class="col-md-12">
                                                <div class="input-group">
                                                    <span class="input-group-addon"><i class="glyphicon glyphicon-euro"></i></span>
                                                    <input name="productprice" placeholder="productprice" class="form-control" id="productprice" type="text">
                                                </div>
                                            </div>
                                        </div>
										
										<div class="form-group">

                                            <div class="col-md-12">
                                                <div class="input-group">
                                                    <span class="input-group-addon"><i class="glyphicon glyphicon-pencil"></i></span>
                                                    <input name="productstock" placeholder="productstock" class="form-control" id="productstock" type="text">
                                                </div>
                                            </div>
                                        </div>
										
										<div class="form-group">

                                            <div class="col-md-12">
                                                <div class="input-group">
                                                    <span class="input-group-addon"><i class="glyphicon glyphicon-pencil"></i></span>
                                                    <input name="productoffers" placeholder="productoffers" class="form-control" id="productoffers" type="text">
                                                </div>
                                            </div>
                                        </div>

                                        <!-- Text input-->

                                        <div class="form-group">

                                            <div class="col-md-12 inputGroupContainer">
                                                <div class="input-group">
                                                    <span class="input-group-addon"><i class="glyphicon glyphicon-pencil"></i></span>
                                                    <textarea class="form-control" name="productdes" placeholder="productdes" id="productdes"></textarea>
                                                </div>
                                            </div>
                                        </div>
										
										<div class="form-group">

                                            <div class="col-md-12 inputGroupContainer">
                                                <div class="input-group">
                                                    <span class="input-group-addon"><i class="glyphicon glyphicon-pencil"></i></span>
                                                    <textarea class="form-control" name="productreview" placeholder="productreview" id="productreview"></textarea>
                                                </div>
                                            </div>
                                        </div>
                                        
                                        <div class="form-group">

                                            <div class="col-md-12">
                                                <div class="input-group">
                                                    <span class="input-group-addon"><i class="glyphicon glyphicon-euro"></i></span>
                                                    <input name="image" placeholder="upload-image" class="form-control" id="image" type="file">
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
