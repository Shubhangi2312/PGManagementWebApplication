<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    	
       
        <title><tiles:insertAttribute name="title" ignore="true" /></title>
    <!--[if IE 5]>
    <link rel="stylesheet" type="text/css" href="<s:url value="/resources/style/wimsstyle-ie.css"/>" />
    <![endif]-->
     <!--[if IE 6]>
    <link rel="stylesheet" type="text/css" href="<s:url value="/resources/style/wimsstyle-ie.css"/>" />
    <![endif]-->
     <!--[if gte IE 6]>
    <link rel="stylesheet" type="text/css" href="<s:url value="/resources/style/wimsstyle-ie.css"/>" />
    <![endif]--> 
    
    <link rel="icon"  href="/myinternship/resources/images/Star.png" />
</head>

<body >
       <table class="head" align="center" cellpadding="0" cellspacing="0">
	       
	           <tr><td><tiles:insertAttribute name="header" /></td></tr>
	          
	           <tr><td style="background-color: #fff;">&nbsp;&nbsp; <tiles:insertAttribute name="body" />&nbsp;&nbsp;</td></tr>
	           
	           <tr><td><tiles:insertAttribute name="footer" /></td></tr>
	   </table>
</body>
</html>


