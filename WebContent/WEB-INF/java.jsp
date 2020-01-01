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
<body class="container">
<center><h3>Z-TechQuiz</h3>
<a href="indexpage">Home</a>
<a href="Loginpage">Login</a>
<a href="AboutUspage">AboutUs</a>
<a href="Contactpage">Contact</a>
</center><hr>
<h1>java</h1>

<h2>Quiz</h2>
<h5>Question no. ${Q_NO} ${que}</h5>
<form action="janswer">
<p><input type="radio" name="ans" value="${ans1}">${ans1}</p>
<p><input type="radio" name="ans" value="${ans2}">${ans2}</p>
<p><input type="radio" name="ans" value="${ans3}">${ans3}</p>
<p><input type="radio" name="ans" value="${ans4}">${ans4}</p>
 
<input type="submit" class="btn btn-primary" value="save">
<a href="java_page"  ><button type="button" class="btn btn-primary">Next</button></a>

 

</form>
${msg}
<p6>${ans5}</p6>
</body>
</html>