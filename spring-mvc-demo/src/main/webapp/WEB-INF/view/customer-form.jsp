<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
	<title>Customer Registration Form</title>
	<style type="text/css">
		.error{
			color: red;
			font-family: arial
		}
	</style>
</head>

<body>

	<i>Fill out the form given below to Register. Asterisk(*) means the field is mandatory</i>
	<br> <br>
	
	<form:form action="processForm" method="GET" modelAttribute="customer">
	
		First Name: <form:input path="firstName"/>
		
		<br> <br>
		
		Last Name(*): <form:input path="lastName"/>
		<form:errors path="lastName" cssClass="error"></form:errors>
		
		<br> <br>
		<input type="submit" value="Submit" />
	
	</form:form>
</body>

</html>

