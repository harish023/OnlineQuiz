<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>${msg} Quiz</h2>
<h3>Question no. ${Q_NO} ${que}</h3>
<form action="">

<h4><input type="radio" name="ans">${ans1}</h4>
<h4><input type="radio" name="ans">${ans2}</h4>
<h4><input type="radio" name="ans">${ans3}</h4>
<h4><input type="radio" name="ans">${ans4}</h4>
<input type="submit" value="save">
</form>
<a href="quiz"><button>Next</button></a>
</body>
</html>