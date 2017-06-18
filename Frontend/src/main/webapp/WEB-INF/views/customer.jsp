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
</head>

<body>
 
 <div class="container-fluid">
                <div class="row-fluid" >
                    <div class="col-md-offset-4 col-md-4" id="box">
                      <h2>CUSTOMER</h2>
                         <hr>
                             <form class="form-horizontal" action="newcustomer" method="post" id="contact_form">
                                    <fieldset>

                                        <div class="form-group">

                                            <div class="col-md-12">
                                                <div class="input-group">
                                                    <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                                    <input name="password" placeholder="password" class="form-control" type="password">
                                                </div>
                                            </div>
                                        </div>

                                        <div class="form-group">

                                            <div class="col-md-12">
                                                <div class="input-group">
                                                    <span class="input-group-addon"><i class="glyphicon glyphicon-earphone"></i></span>
                                                    <input name="customerphno" placeholder="+91-   " class="form-control" type="text">
                                                </div>
                                            </div>
                                        </div>

                                        <div class="form-group">

                                            <div class="col-md-12">
                                                <div class="input-group">
                                                    <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
                                                    <input name="customerEmail" placeholder="E-Mail Address" class="form-control" type="email">
                                                </div>
                                            </div>
                                        </div>
                                        
                                        <div class="col-md-12">
                                                <div class="input-group">
                                                    <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
                                                    <input name="password" placeholder="password" class="form-control" type="password">
                                                </div>
                                            </div>
                                        </div>

                                        <div class="form-group">

                                            <div class="col-md-12 inputGroupContainer">
                                                <div class="input-group">
                                                    <span class="input-group-addon"><i class="glyphicon glyphicon-pencil"></i></span>
                                                    <textarea class="form-control" name="customeraddress" placeholder="ADDRESS"></textarea>
                                                </div>
                                            </div>
                                        </div>
										
										<div class="form-group">

                                            <div class="col-md-12 inputGroupContainer">
                                                <div class="input-group">
                                                    <span class="input-group-addon"><i class="glyphicon glyphicon-pencil"></i></span>
                                                    <textarea class="form-control" name="customershippingaddressss" placeholder="SHIPPINGADDRESS"></textarea>
                                                </div>
                                            </div>
                                        </div>
                                        
                                        <div class="col-md-12">
                                                <div class="input-group">
                                                    <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
                                                    <input name="zipcode" placeholder="zipcode" class="form-control" type="text">
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
