<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<html>
<head>
<title>Card Setup</title>
<link href="/myinternship/resources/adminview/css/style.css" rel="stylesheet" type="text/css">
</head>
<s:head theme="ajax"/>
<script type="text/javascript">
function checkingform()
{
	var name=document.getElementById('name').value;
	var mob=document.getElementById('mob').value;
	var address=document.getElementById('address').value;
	var parentno=document.getElementById('parentno').value;
	var aadhar=document.getElementById('aadhar').value;
	var advpayment=document.getElementById('advpayment').value;
	var date=document.getElementsByName('strDate')[0].focus();
	
	if(name=="" || name==null)
	{
		alert("Kindly Enter The name.");
		document.getElementById('name').focus();
		return false;
	}
	
	if(mob=="" || mob==null)
	{
		alert("Kindly Enter The mobile.");
		document.getElementById('mob').focus();
		return false;
	}
	
	if(address=="" || address==null)
	{
		alert("Kindly Enter The address.");
		document.getElementById('address').focus();
		return false;
	}
	
	if(parentno=="" || parentno==null)
	{
		alert("Kindly Enter The parent no.");
		document.getElementById('parentno').focus();
		return false;
	}
	
	if(aadhar=="" || aadhar==null)
	{
		alert("Kindly Enter The aadhar.");
		document.getElementById('aadhar').focus();
		return false;
	}
	
	if(advpayment=="" || advpayment==null)
	{
		alert("Kindly Enter The payment.");
		document.getElementById('advpayment').focus();
		return false;
	}
	
	 if(date=="" || document.getElementsByName('strDate')[0].value==false){
			alert("Kindly Select The Date Of Birth.");
			document.getElementsByName('strDate')[0].focus();
			return false;
	 }
	
	 var confirmation=confirm('Are You Sure To Save The Details?');  
	 if(confirmation==true)
	  return true; 
	 else
      return false;
}
</script>
<body >
<s:form name="myform">
<s:hidden name="objTenant.tenantId"></s:hidden>
<div class="container">
<div class="col-md-6">
		<div class="input-group input-group1">
        	Name: <s:textfield name="objTenant.name" id="name" maxlength="100"></s:textfield>
    	</div> 	
         
    	<div class="input-group input-group1">
        	Mobile: <s:textfield name="objTenant.mobile" id="mob" maxlength="100"></s:textfield>
    	</div> 	
</div>
<div class="col-md-6">
		<div class="input-group input-group1">
        	Address: <s:textfield name="objTenant.address" id="address" maxlength="100"></s:textfield>
    	</div> 	
         
    	<div class="input-group input-group1">
        	Parent No: <s:textfield name="objTenant.parentno" id="parentno" maxlength="100"></s:textfield>
    	</div> 	
</div>
<div class="clearfix"> </div>
<div class="col-md-6">
		<div class="input-group input-group1">
        	Adhaar: <s:textfield name="objTenant.aadhar" id="aadhar" maxlength="100"></s:textfield>
    	</div> 	
         
    	<div class="input-group input-group1">
        	Advance Payment: <s:textfield name="objTenant.payment" id="advpayment" maxlength="100"></s:textfield>
    	</div> 	
</div>
<div class="col-md-6">
		<div class="input-group input-group1">
        	Admission Date: <s:datetimepicker name="strDate" displayFormat="dd-MM-yyyy"></s:datetimepicker>
    	</div>
    	
    	
</div>
<div class="clearfix"> </div>

<div align="center" class="">
	<s:if test="objTenant.tenantId!=null">
		<s:submit value="Update" action="saveTenant" method="saveTenantInfo" cssClass="shortcode_but small" cssStyle="color:#ffffff; background-color:#165C80;" onclick="return checkingform();"></s:submit>
		<s:reset cssClass="shortcode_but small more_btn" cssStyle="color:#ffffff; background-color:#165C80;"></s:reset>
	</s:if>
	<s:else>
		<s:submit value="Submit" action="saveTenant" method="saveTenantInfo" cssClass="shortcode_but small" cssStyle="color:#ffffff; background-color:#165C80;" onclick="return checkingform();"></s:submit>
    	<s:reset cssClass="shortcode_but small more_btn" cssStyle="color:#ffffff; background-color:#165C80;"></s:reset>
	</s:else>
</div>
<div class="clearfix"> </div>
<br>

<table class="stltable">
	<thead>
		<tr>
			<th>SL No</th>	
			<th>Name</th>
			<th>Mobile No</th>
			<th>Address</th>
			<th>Aadhaar</th>
			<th>Advance Payment</th>
			<th>Parent NO</th>
			<th>Date</th>
			<th>Tenant Status</th>
			<th>Update</th>
			
		</tr>		
	</thead>
<s:if test="tenantList.size()>0">
<s:iterator value="tenantList" status="row">
	<tr>
		<td><s:property value="#row.count" /></td>
		<td><s:property value="name" /></td>
		<td><s:property value="mobile" /></td>
		<td><s:property value="address" /></td>
		<td><s:property value="aadhar" /></td>
		<td><s:property value="payment" /></td>
		<td><s:property value="parentno"/></td>
		<td><s:date name="admissiondate" format="dd-MM-yyyy"/> </td>
		<td>
		<s:if test='tenantStatus.equals("A")'>
		<s:url id="leave" action="leaveTenant">
				<s:param name="objTenant.tenantId" value="tenantId"></s:param>
		</s:url>
		<s:a title="click to mark tenant as leaved" cssStyle="font-weight: bold; color:green" href="%{leave}"> Present</s:a>
		</s:if>
		<s:else><font color="red"><b>Leaved</b></font></s:else></td>
		<td>
			<s:url id="edit" action="editTenant">
				<s:param name="objTenant.tenantId" value="tenantId"></s:param>
			</s:url>
			<font align="center" style="font-weight: bold;"><s:a title="Click To Update Tenant"  href="%{edit}">Edit</s:a></font>
		</td>
		
		</tr>
</s:iterator>
</s:if>
<s:else><tr><td colspan="9">---No List Found---</td> </tr> </s:else>
</table>
</div>
</s:form>
</body>
</html>
