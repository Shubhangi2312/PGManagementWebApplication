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
	var rno=document.getElementById('rno').value;
	var roomid=document.getElementById('roomid').value;
	var statusid=document.getElementById('statusid').value;
	var rcharge=document.getElementById('rcharge').value;
	
	if(rno=="" || rno==null){
		alert("Kindly Enter The Room no.");
		document.getElementById('rno').focus();
		return false;
		}
	
	if(roomid==0){
		alert("Kindly Select Type Of Room.");
		document.getElementById('roomid').focus();
		return false;
		}
	
	if(statusid==0)
		{
		alert("Kindly Select Room Status");
		document.getElementById('statusid').focus();
		return false;
		}
	
	if(rcharge=="" || rcharge==null)
		{
		alert("Kindly Enter The Room charge.");
		document.getElementById('rcharge').focus();
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
<s:hidden name="objroom.roomId"></s:hidden>
<div class="container">
<div class="col-md-6">
		<div class="input-group input-group1">
        	Room No: <s:textfield name="objroom.roomNo" id="rno" maxlength="100"></s:textfield>
    	</div> 	
         
    	<div class="input-group input-group1">
        	Type of Room: 
			<s:select list="#{'0':'Select Type Of Room','Single':'Single','2 Sharimg':'2 Sharing','3 Sharing':'3 Sharing'}" name="objroom.typeOfRoom" id="roomid"></s:select>
    	</div> 	
</div>
<div class="col-md-6">
			
         
    	<div class="input-group input-group1">
        	Room Charge: <s:textfield name="objroom.roomCharge" id="rcharge" maxlength="100"></s:textfield>
    	</div> 	
</div>


<div align="center" class="">
	<s:if test="objroom.roomId!=null">
		<s:submit value="Update" action="saveRoom" method="saveRoomInfo" cssClass="shortcode_but small" cssStyle="color:#ffffff; background-color:#165C80;" onclick="return checkingform();"></s:submit>
		<s:reset cssClass="shortcode_but small more_btn" cssStyle="color:#ffffff; background-color:#165C80;"></s:reset>
	</s:if>
	<s:else>
		<s:submit value="Submit" action="saveRoom" method="saveRoomInfo" cssClass="shortcode_but small" cssStyle="color:#ffffff; background-color:#165C80;" onclick="return checkingform();"></s:submit>
    	<s:reset cssClass="shortcode_but small more_btn" cssStyle="color:#ffffff; background-color:#165C80;"></s:reset>
	</s:else>
</div>
<div class="clearfix"> </div>
<br>

<table class="stltable">
	<thead>
		<tr>
		<th>SL No</th>
			<th>Room No</th>	
			<th>Type of Room</th>
			<th>Room Status</th>
			<th>Room Charge</th>
		</tr>		
	</thead>
<s:if test="roomSetupList.size()>0">
<s:iterator value="roomSetupList" status="row">
	<tr>
		<td><s:property value="#row.count" /></td>
		<td><s:property value="roomNo" /></td>
		<td><s:property value="typeOfRoom" /></td>
		<td>
			<s:if test='roomStatus.equals("A")'>
				<font color="green"><b>Available</b></font>
			</s:if>
			<s:else><font color="red"><b>Booked</b></font></s:else>
		</td>
		<td><s:property value="roomCharge" /></td>
		<td>
			<s:url id="edit" action="editRoom">
				<s:param name="objroom.roomId" value="roomId"></s:param>
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
