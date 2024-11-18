<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome to My JSP Page</title>
</head>
<body>
    <h1>Student Registration Form!</h1>
	<h3>${message}</h3>
	<form:form action="save" modelAttribute="student" method="post">
		<table>
			<tr>
				<td>name:</td>
				<td><form:input path="name"/></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><form:input path="email"/></td>
			</tr>
			<tr>
				<td>Gender:</td>
				<td>
					<form:radiobutton path="sex" value="male"/>male
					<form:radiobutton path="sex" value="female"/>female
				</td>
			</tr>
			<tr>
				<td>course:</td>
				<td>
					<form:select path="course">
						<form:option value="">-select-</form:option>
						<form:options items="${courses}"/>
					</form:select>
				</td>
			</tr>
			<tr>
				<td>timings:</td>
				<td>
					<form:checkboxes items="${timings}" path ="timings"/>
				</td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="save"/>
				</td>
			</tr>	
	</form:form>

</body>
</html>
