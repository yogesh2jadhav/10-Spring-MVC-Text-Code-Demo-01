<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring MVC for Text field form</title>
</head>
<body>
	<form:form action="processedForm" modelAttribute="student">
	 
		Name Entered = <form:input path="firstName"/> - ${student.lastName}
		 
	</form:form>
</body>
</html>