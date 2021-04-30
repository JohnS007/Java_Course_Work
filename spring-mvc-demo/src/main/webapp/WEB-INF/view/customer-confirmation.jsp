<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>Customer Confirmation Page</title>
</head>

<body>
	
	<p>The Customer is confirmed: ${customer.firstName} ${customer.lastName}</p>
	
	<p>Free Passes: ${customer.freePasses}</p>
	
	<p>Postal Code: ${customer.postalCode}</p>
	
</body>

</html>