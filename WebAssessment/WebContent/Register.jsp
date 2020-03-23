<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>body {
  background-color: #D8BFD8;
}</style>
<script> 
          
           //Form Validation
            function checkPassword(form) { 
            	password1 = form.password1.value; 
                password2 = form.password2.value; 
            	validname=form.name.value;
            	 var letters = /^[A-Za-z]+$/;
                 if(!validname.match(letters))
                 {
                 alert("Enter alphabets only for Your Name");
                 return false;
               
                 
                 }
                
                
  
                // If password not entered 
                else if (password1 == '') 
                    alert ("Please enter Password"); 
                      
                // If confirm password not entered 
                else if (password2 == '') 
                    alert ("Please enter confirm password"); 
                      
                // If Not same return False.     
                else if (password1 != password2) { 
                    alert ("\nPassword did not match: Please try again...") 
                    return false; 
                } 
                
  
             
                 
               
            } 
        </script> 
</head>
<body >

<div class="container">
<h5 class ="text-success text-center"">Register Here </h5>

<form action =RegisterServlet  onSubmit = "return checkPassword(this)">
<div class="form-group">
    
   Name: <input type="text" class="form-control" placeholder="Enter Name" name="name" required>
  </div>
  <div class="form-group">
    
   Email: <input type="email" class="form-control" placeholder="Enter email" name="email" required>
  </div>
  <div class="form-group">
    
   Mobile Number: <input type="number"  class="form-control" placeholder="Enter Mobile Number" name="number" required>
  </div>
  <div class="form-group">
    <label for="pwd">Password:</label>
    <input type="password" class="form-control" placeholder="Enter Password" name="password1" required>
  </div>
  <div class="form-group">
   
   ReType PassWord <input type="password" class="form-control" placeholder="Enter password" name="password2" required>
  </div>
  
 
<div class="text-center"> 
             
            <button type="submit" class="btn btn-lg btn-primary">Register</button>
 </div> 
 </br>
 <div class="text-center"> 
             
             <a href="login.jsp" class="btn btn-lg btn-info" role="button">SignIn</a>
        </div> 
</form>

</div>

</body>
</html>