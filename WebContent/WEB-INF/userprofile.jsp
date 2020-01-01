<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
 <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

<meta charset="ISO-8859-1">
<title>Z-TechQuiz</title>
</head>
<body  class="container">
<center><h3>Z-TechQuiz</h3>
<a href="indexpage">Home</a>
<a href="Loginpage">Login</a>
<a href="AboutUspage">AboutUs</a>
<a href="Contactpage">Contact</a>
</center><hr>
 		 
 		
Name                  <p3>${user.name}</p3><br>
Email                 <p3>${user.email_id}</p3><br>
City                  <p3>${user.city}</p3><br>
C quiz                <p3>${user.c_quiz}</p3><br>
C++ quiz              <p3>${user.cpp_quiz}</p3><br>
Java quiz             <p3>${user.java_quiz}</p3><br>
Data Structure quiz   <p3>${user.data_structure_quiz}</p3>
</body>
</html>