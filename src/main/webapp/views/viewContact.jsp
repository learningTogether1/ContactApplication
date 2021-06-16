<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ContactApp</title>
</head>
<body>
<h3>ViewContact</h3>

<a href="/loadform">+Add New Contacts</a>
<table>
<thead>
<tr>

<th>s.no</th>
<th>Name</th>
<th>Email</th>
<th>Number</th>
<th>Action</th>
</tr> 
</thead>
<tbody>
<c:forEach items="${contactEtity}" var="c" varStatus="count"></c:forEach>
<tr>
<td>${count.index+1}</td>
<td>${c.contactName}</td>
<td>${c.contactEmail}</td>
<td>${c.contactNumber }</td>
<td><a href="/viewContact">Edit</a> &nbsp; <a href="/loadform">Delete</a></td>
</tr>

</tbody>
</body>
</html>