<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<style>body {
  background-color: #D8BFD8;
}</style>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign In</title>
<style>body {
  background-color: #D8BFD8;
}</style>
</head>
<body>
</br>
</br></br><h5 class ="text-success text-center">Sign Here </h5></br></br></br></br>

<form action=LoginServlet>
<div class="container">
  <div class="form-group">
    
   Email: <input type="email" class="form-control" id="exampleInputEmail1" name="email" aria-describedby="emailHelp" placeholder="Enter email" required>
    </div>
  <div class="form-group">
    
    Password:<input type="password" class="form-control" id="exampleInputPassword1" name= "password" placeholder="Password" required>
  </div>
  
</div>

    
  </div>

  
  

</br>

<div class="text-center"> 
             
            <button type="submit" class="btn btn-lg btn-primary">Sign In</button>
        </div> 
        
        
       </form>
        </br>
        

<div class="text-center"> 
             
             <a href="Register.jsp" class="btn btn-lg btn-info" role="button">Register</a>
        </div> 

</div>


</body>
</html>