<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home page</title>
</head>
<body>
</br>
<!-- Just an image -->
<nav class="navbar navbar-light bg-light">
  <a class="navbar-brand" href="#">
    <img src="download.png" width="130" height="100" alt="">
  </a>
  <%String name=(String)session.getAttribute("user");%>
<div class="welcome"><%out.println("<h2 style='color:blue'> "+name+"</h2>");%></div>
  
   <div class="text-right"> 
            
              <a href="login.jsp" class="btn btn-lg btn-info" role="button">Logout</a>
        </div> 
</nav>



<nav class="navbar navbar-fixed-top navbar-light bg-faded">
    <div class='container'>
        <ul class="nav navbar-nav">
            <li class='nav-item'>
                <a href="site.jsp" class=nav-link  routerLinkActive="active">Home</a>
            </li>
            <li class='nav-item'>
                <a href=Register.jsp class='nav-link'  routerLinkActive="active">User</a>
            </li>
            <li class='nav-item'>
                <a href="roles.jsp" class='nav-link'  routerLinkActive="active">Product</a>
            </li>
            <li class='nav-item'>
                <a href="roles.jsp" class='nav-link'  routerLinkActive="active">Roles</a>
            </li>
        </ul>
    </div>
</nav>

</body>
</html>