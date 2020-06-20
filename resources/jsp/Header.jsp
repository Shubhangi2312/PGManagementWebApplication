<%@ page contentType="text/html; charset=windows-1252" language="java" import="java.sql.*" errorPage="" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@page import="com.opensymphony.xwork2.ActionContext"%>
<%@page import="java.util.Map"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>   
<link href="/myinternship/resources/adminview/css/bootstrap-3.1.1.min.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="/myinternship/resources/adminview/js/bootstrap.min.js"></script>
<!-- Custom Theme files -->
<link href="/myinternship/resources/adminview/css/style.css" rel='stylesheet' type='text/css' />
</head>
<body>
<nav class="navbar navbar-default" role="navigation">
	<div class="container">
	    <div class="navbar-header">
	        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
		        <span class="sr-only">Toggle navigation</span>
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>
	        </button>
	        <a class="" href="/myinternship" style="color: #fff;">My Internship Project</a>
	    </div>
	    <div class="navbar-collapse collapse" id="bs-example-navbar-collapse-1" style="height: 1px;">
	        <ul class="nav navbar-nav">
	        	<li class="dropdown">
		            <a href="/myinternship" title="Home"><i class="fa fa-home"></i><span>Home</span></a>
		        </li>
		         
		        <li class="dropdown">
		            <a href="tenant.action" title="Registration"><span>Tenant Registration</span></a>
		        </li>
		        
		        <li class="dropdown">
		            <a href="roomsetup.action" title="Registration"><span>Room Setup</span></a>
		        </li>
		        
		        <li class="dropdown">
		            <a href="roomallotment.action" title="Allotment"><span>Room Allotment</span></a>
		        </li>
		        
		        <li class="dropdown">
		            <a href="feecollection.action" title="Collection"><span>Fee Collection</span></a>
		        </li>
		        
		       
		        
		       
		    </ul>
	    </div>
	    <div class="clearfix"> </div>
	  </div>
</nav>
</body>
</html>