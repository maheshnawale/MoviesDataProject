<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<div class="container">
<form class="main-form" action="Final_BWM" method="get">
<div class="row">
		                           <div class="col-md-9">
		                              <div class="row">
		                                 <div class="col-xl-4 col-lg-4 col-md-4 col-sm-6 col-12">
Enter Movie Id<input type="text" name="id"></div>
<div class="col-xl-4 col-lg-4 col-md-4 col-sm-6 col-12">
Enter colom name for change <input type="text" name="cn"></div>
<div class="col-xl-4 col-lg-4 col-md-4 col-sm-6 col-12">
Enter value for updation<input type="text" name="v"></div>
<div class="col-xl-8 col-lg-8 col-md-8 col-sm-6 col-9">
<input type="submit" name="a" value="update"style="background-color:black;color:white;width: 100px;padding: 2px;transition:1.5s;font-family: poppins;
 border: 5px solid #15f4ee;border-radius: 100px"></div></div></div></div>
</form>
<a href="movieshome.jsp">click for home page</a>
</body>
</html>