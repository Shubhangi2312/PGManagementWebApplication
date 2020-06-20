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

function getRoomInfo()
{
	var tid=document.getElementById('tid').value;
	if(tid!=0)
	{
	  document.myform.action="feecollection.action";
	  document.myform.submit();
	}
	else
	{
	   alert("select Room");	
	   return false;
	}
}

function checkingform()
{

	 var confirmation=confirm('Are You Sure To Save The Details?');  
	 if(confirmation==true)
	  return true; 
	 else
      return false;
}

</script>
<body >
<s:form name="myform">
<s:hidden name="objfee.feeId"></s:hidden>
<div class="container">
<div class="col-md-6">
		<div class="input-group input-group1">
        	Tenant Info: <s:select name="intvalue1" id="tid" headerKey="0" headerValue="---Please Select Tenant---" list="availableTenantList" listKey="tenantId" listValue="name" onchange="getRoomInfo();" ></s:select>


Allocated room for Tenant:
<table class="stltable">
	<thead>
		<tr>
		<th>Sl NO</th>
		<th>Room No</th>
		<th>Room Type</th>
		<th>Tenant Name</th>
		<th>Fee</th>
		</tr>		
	</thead>
<s:if test="roomAllotmentList.size()>0">
<s:iterator value="roomAllotmentList" status="row">
	<tr>
		<td><s:property value="#row.count" /></td>
		<td><s:property value="roomInfo.roomNo" /></td>
	    <td><s:property value="roomInfo.typeOfRoom" /></td>
	    <td><s:property value="tenantInfo.name" /></td>
		<td><s:property value="roomInfo.roomCharge" /></td>
</s:iterator>
</s:if>
<s:else><tr><td colspan="7">---No List Found---</td> </tr> </s:else>
</table>

    	</div> 	
         
    	<div class="input-group input-group1">
        	Month: <s:select list="#{'0':'Select Month','jan':'jan','feb':'feb','mar':'mar'}" name="objfee.month" id="month"></s:select>
    	</div> 	
</div>
<div class="col-md-6">
		<div class="input-group input-group1">
        	Years: <s:select list="#{'0':'Select Year','2019':'2019','2020':'2020'}" name="objfee.year" id="year"></s:select>
    	</div> 	
    	
    	<div class="input-group input-group1">
        	Amount: <s:textfield name="objfee.amount" id="amount" maxlength="5"></s:textfield>
    	</div> 	
    	
    	<div class="input-group input-group1">
        	Remark: <s:textfield name="objfee.remark" id="rmk" maxlength=""></s:textfield>
    	</div> 	
         
     	
</div>

<div class="clearfix"> </div>

<div align="center" class="">
	<s:if test="objfee.feeId!=null">
		<s:submit value="Update" action="saveFee" method="saveFeeInfo" cssClass="shortcode_but small" cssStyle="color:#ffffff; background-color:#165C80;" onclick="return checkingform();"></s:submit>
		<s:reset cssClass="shortcode_but small more_btn" cssStyle="color:#ffffff; background-color:#165C80;"></s:reset>
	</s:if>
	<s:else>
		<s:submit value="Submit" action="saveFee" method="saveFeeInfo" cssClass="shortcode_but small" cssStyle="color:#ffffff; background-color:#165C80;" onclick="return checkingform();"></s:submit>
    	<s:reset cssClass="shortcode_but small more_btn" cssStyle="color:#ffffff; background-color:#165C80;"></s:reset>
	</s:else>

</div>

<div class="clearfix"> </div>
<br>

<table class="stltable">
	<thead>
		<tr>
		<th>Sl No</th>
		<th>Month</th>
		<th>Year</th>
		<th>Tenan Info</th>	
		<th>Amount</th>
		<th>Remark</th>
		</tr>		
	</thead>
<s:if test="feeCollectionList.size()>0">
<s:iterator value="feeCollectionList" status="row">
	<tr>
		<td><s:property value="#row.count" /></td>
		<td><s:property value="month" /></td>
		<td><s:property value="year" /></td>
		<td><s:property value="tenantInfo.name" /></td>
		<td><s:property value="amount" /></td>
		<td><s:property value="remark" /></td>
		
</s:iterator>
</s:if>
<s:else><tr><td colspan="7">---No List Found---</td> </tr> </s:else>
</table>
</div>
</s:form>
</body>
</html>
