<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>contactEtity</title>
</head>
<body>
<h3>Save Contact Here</h3>
<p><font color='green'>${sucMsg}</font></p>
<p><font color='red'>${errMsg}</font></p>
<form:form action="saveContact" modelAttribute="contactEtity" method="POST">
<table>
<tr>
<td>Contact Name </td>
<td><form:input path="ContactName"/></td>
</tr>

tr>
<td>Contact Number </td>
<td><form:input path="ContactNumber"/></td>
</tr>

tr>
<td>Contact Email </td>
<td><form:input path="ContactEmail"/></td>
</tr>

tr>
<td> </td>
<td><input type="submit" value="save"/></td>
</tr>
</table>
</form:form>
<a href="viewContact">View All Contacts</a>
</body>
</html>