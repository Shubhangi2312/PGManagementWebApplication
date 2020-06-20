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

function getTenantInfo()
{
	var rid=document.getElementById('rid').value;
	if(rid!=0)
	{
	  document.myform.action="roomallotment.action";
	  document.myform.submit();
	}
	else
	{
	   alert("select Room");	
	   return false;
	}
}

function getRoomInfo()
{
	var tid=document.getElementById('tid').value;
	if(tid!=0)
	{
	  document.myform.action="roomallotment.action";
	  document.myform.submit();
	}
	else
	{
	   alert("select Tenant");	
	   return false;
	}
}

function checkingform()
{
	var tenant=document.getElementById('tid').value;
	var room=document.getElementById('rid').value;
	
	if(tenant==0){
		alert("Kindly Select Tenant.");
		document.getElementById('tid').focus();
		return false;
		}
 		
	if(room==0){
		alert("Kindly Select Room.");
		document.getElementById('rid').focus();
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
<s:hidden name="objallot.allotmentId"></s:hidden>
<div class="container">
<div class="col-md-8">

Tenant Info: <s:select name="intvalue1" id="tid" headerKey="0" headerValue="---Please Select Tenant---" list="tenantList" listKey="tenantId" listValue="name" onchange="getRoomInfo();"></s:select>

Allocated room for Tennat:
<table class="stltable">
	<thead>
		<tr>
		<th>Sl NO</th>
		<th>Room No</th>
		<th>Room Type</th>
		<th>Tenant Name</th>
		
		</tr>		
	</thead>
<s:if test="tenantAvailableList.size()>0">
<s:iterator value="tenantAvailableList" status="row">
	<tr>
		<td><s:property value="#row.count" /></td>
		<td><s:property value="roomInfo.roomNo" /></td>
	    <td><s:property value="roomInfo.typeOfRoom" /></td>
	    <td><s:property value="tenantInfo.name" /></td>

		
</s:iterator>
</s:if>
<s:else><tr><td colspan="7">---No List Found---</td> </tr> </s:else>
</table>
<br/>

Room Info: <s:select name="intvalue2" id="rid" headerKey="0" headerValue="---Please Select Room---" list="roomSetupList" listKey="roomId" listValue="roomNo" onchange="getTenantInfo();"></s:select>

Allocated tenant for Room:
<table class="stltable">
	<thead>
		<tr>
		<th>Sl NO</th>
		<th>Room No</th>
		<th>Room Type</th>
		<th>Tenant Name</th>
		
		</tr>		
	</thead>
<s:if test="roomAvailableList.size()>0">
<s:iterator value="roomAvailableList" status="row">
	<tr>
		<td><s:property value="#row.count" /></td>
		<td><s:property value="roomInfo.roomNo" /></td>
	    <td><s:property value="roomInfo.typeOfRoom" /></td>
	    <td><s:property value="tenantInfo.name" /></td>

		
</s:iterator>
</s:if>
<s:else><tr><td colspan="7">---No List Found---</td> </tr> </s:else>
</table>

</div>

<div class="clearfix"> </div>

<div align="center" class="">
	<s:if test="objallot.allotmentId!=null">
		<s:submit value="Update" action="saveAllotment" method="saveAllotmentInfo" cssClass="shortcode_but small" cssStyle="color:#ffffff; background-color:#165C80;" onclick="return checkingform();"></s:submit>
		<s:reset cssClass="shortcode_but small more_btn" cssStyle="color:#ffffff; background-color:#165C80;"></s:reset>
	</s:if>
	<s:else>
		<s:submit value="Submit" action="saveAllotment" method="saveAllotmentInfo" cssClass="shortcode_but small" cssStyle="color:#ffffff; background-color:#165C80;" onclick="return checkingform();"></s:submit>
    	<s:reset cssClass="shortcode_but small more_btn" cssStyle="color:#ffffff; background-color:#165C80;"></s:reset>
	</s:else>
</div>




<div class="clearfix"> </div>
<br>

<table class="stltable">
	<thead>
		<tr>
		<th>Sl NO</th>
		<th>Room No</th>
		<th>ROom Type</th>
		<th>Tenant Name</th>	
		<th>Tenant Mobile</th>
		</tr>		
	</thead>
<s:if test="roomAllotmentList.size()>0">
<s:iterator value="roomAllotmentList" status="row">
	<tr>
		<td><s:property value="#row.count" /></td>
		<td><s:property value="roomInfo.roomNo" /></td>
		<td><s:property value="roomInfo.typeOfRoom" /></td>
		<td><s:property value="tenantInfo.name" /></td>
		<td><s:property value="tenantInfo.mobile" /></td>
		
		<td>
			<s:url id="edit" action="editRoomAllotment">
			  <s:param name="objallot.allotmentId" value="allotmentId"></s:param>
								</s:url>
			<font align="center" style="font-weight: bold;"><s:a title="Click To Update Tenant"  href="%{edit}">Edit</s:a></font>
		</td>
		
</s:iterator>
</s:if>
<s:else><tr><td colspan="7">---No List Found---</td> </tr> </s:else>
</table>
</div>
</s:form>
</body>
</html>