<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Login Page</h1>
	
	<form class="style" method="post" action="StudentController">
		<div>
			<label for="rollno">Roll No.</label>
			<input type="text" placeholder="Ex.B123888" name="rollno" pattern="[a-zA-Z][a-zA-Z0-9]{9}" required>
			
			<button type="submit">Submit</button>
		</div>
	</form>
</body>
</html>