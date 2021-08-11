<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
      <!-- style css -->
      <link rel="stylesheet" href="css/style.css">
      <!-- Responsive-->
      <link rel="stylesheet" href="css/responsive.css">
      <!-- fevicon -->
      <link rel="icon" href="images/fevicon.png" type="image/gif" />
      <!-- Scrollbar Custom CSS -->
      <link rel="stylesheet" href="css/jquery.mCustomScrollbar.min.css">
      <!-- Tweaks for older IEs-->
      <!-- owl stylesheets --> 
      <link rel="stylesheet" href="css/owl.carousel.min.css">
      <link rel="stylesheet" href="css/owl.theme.default.min.css">
</head>
<body>
<%
ArrayList Al=(ArrayList)session.getAttribute("mylist");

out.println(Al);
%>

<h1>data from database</h1>
<div><table class="table table-striped table-dark table-bordered table-hover">
<tr class="table-danger">
<th>Movie Id</th>
<th>Movie Name</th>
<th>Actors Name</th>
<th>Actresses Name</th>
<th>Movie Rating</th>
</tr>

<%
for(int i=0;i<Al.size();i++)
{
ArrayList al=(ArrayList)Al.get(i);
%>

<tr>
<td><%=al.get(0) %></td>
<td><%=al.get(1) %></td>
<td><%=al.get(2) %></td>
<td><%=al.get(3) %></td>
<td><%=al.get(4) %></td>
</tr>	
<%}%>

</table></div>
</body>
</html>