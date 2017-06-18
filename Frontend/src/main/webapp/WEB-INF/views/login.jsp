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
</head>

<body>
 
 <div class="container-fluid">
                <div class="row-fluid" >
                    <div class="col-md-offset-4 col-md-4" id="box">
                      <h2>LOGIN FORM!</h2>
                         <hr>
                             <form class="form-horizontal" action="signin" method="post" id="contact_form">
                                    
                                        <!-- Form Name -->

                                        <!-- Text input-->
                                        <div class="form-group">

                                            <div class="col-md-12">
                                                <div class="input-group">
                                                    <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
                                                    <input name="customerEmail" placeholder="E-Mail Address" class="form-control" type="text">
                                                </div>
                                            </div>
                                        </div>
										
										<!-- Text input-->

                                        <div class="form-group">

                                            <div class="col-md-12">
                                                <div class="input-group">
                                                    <span class="input-group-addon"><i class="fa fa-key"></i></span>
                                                    <input name="password" placeholder="Password" class="form-control" type="password">
                                                </div>
                                            </div>
                                        </div>


                                        <div class="form-group">

                                            <div class="col-md-12">
                                                <button type="submit" name="login" class="btn btn-warning pull-right" value="Submit Form" >login  <span class="glyphicon glyphicon-send"></span></button>
                                            </div>
                                        </div>

                                    
                                </form>
                    </div> 
</div>
</body>

</html>
