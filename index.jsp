<%@ page contentType="text/html; charset=windows-1252" language="java" import="java.sql.*" errorPage="" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@page import="com.opensymphony.xwork2.ActionContext"%>
<%@page import="java.util.Map"%>
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<link rel="icon"  href="/myinternship/resources/images/w_icon.png" />
<title>:: My Internship Program ::</title>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252" />

<meta name="viewport" content="width=device-width, initial-scale=1" />

<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>   
<link href="/myinternship/resources/adminview/css/bootstrap-3.1.1.min.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="/myinternship/resources/adminview/js/bootstrap.min.js"></script>
<!-- Custom Theme files -->
<link href="/myinternship/resources/adminview/css/style.css" rel='stylesheet' type='text/css' />
<!----font-Awesome----->
<script>
 
$(document).ready(function(){
    $(".dropdown").hover(            
        function() {
            $('.dropdown-menu', this).stop( true, true ).slideDown("fast");
            $(this).toggleClass('open');        
        },
        function() {
            $('.dropdown-menu', this).stop( true, true ).slideUp("fast");
            $(this).toggleClass('open');       
        }
    );
});
</script>
</head>
<body>
<s:form name="login">
<nav class="navbar navbar-default" role="navigation">
	<div class="container">
	    <div class="navbar-header">
	        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
		        <span class="sr-only">Toggle navigation</span>
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>
	        </button>
	        <a style="color: #fff;" href="/myinternship/">My Internship Program</a>
	    </div>
	    <!--/.navbar-header-->
	    <div class="clearfix"> </div>
	  </div>
	    <!--/.navbar-collapse-->
</nav>
<br>
	<div class="container">
    	<div class="col-md-6" style="">
    		<div class="events_box">
    					<p class="lead" style="color: orange;"><i class="fa fa-university"></i><span style="font-weight: bold;"> Welcome To My Internship Program</span></p>
						    <div class="col-md-6" style="">
						    	<a href="tenant.action" class="btn btn-primary btn-lg1 btn-block">Tenant Registration</a>
						    	<a href="roomsetup.action" class="btn btn-primary btn-lg1 btn-block">Room Setup</a>
						    	<a href="roomallotment.action" class="btn btn-primary btn-lg1 btn-block">Room Allotment</a>
						    	<a href="feecollection.action" class="btn btn-primary btn-lg1 btn-block">Fee Collection</a>

						    </div>
		    	    <div class="clearfix"></div>
			    </div>
    	</div>
    	
    <div class="clearfix"> </div>
    </div>
            

<div class="footer">
	<div class="container">
		<div class="clearfix"> </div>
		<div class="col-md-12" style="color: #fff; text-align:center;"><br>
			<p class="copyright">Developed By <a href="#" target="_blank" title="">My Self</a></p>
		</div>
		<div class="clearfix"> </div>
	 </div>
</div>
</s:form>
</body>
</html>