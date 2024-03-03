<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.List" %>
    <%@ page import="readxml.StateDTO" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Save">
<table bgcolor="yellow" align="center" border="4">
<tr><td>State Code </td><td>State Name </td><td>State Short Name </td></tr>

<%
List<StateDTO> list=(List<StateDTO>)request.getAttribute("lst");
   for(StateDTO p : list)
   {

%>
<tr>   <td ><input type="text"  size="4"  readonly="readonly" name="stCode" value="<%=p.getStCode() %>">     </td>
<td bgcolor="red"><input type="text" readonly="readonly" name="stName" value="<%=p.getStName() %>"> 
<td align="right"><input type="text" readonly="readonly" name="stShortName" value="<%=p.getStShortName() %>"> 

</tr>

<% 
   }	   
   %>
<tr><td><input type="submit"></td></tr>
</table>
</form>
</body>
</html>