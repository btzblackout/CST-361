<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile</title>
</head>
<body>
<h2>Profile</h2>
<table>
	<c:forEach var="tempProfile" items="${profile_list}">
	<tr>
		<td><h3>Username: </h3><td> 
		<td><c:out value="${tempProfile.userName}"></c:out></td>
	</tr>
	<tr>
		<td><h3>First Name: </h3><td> 
		<td><c:out value="${tempProfile.firstName}"></c:out></td>
	</tr>
	<tr>
		<td><h3>Last Name: </h3><td> 
		<td><c:out value="${tempProfile.lastName}"></c:out></td>
	</tr>
	<tr>
		<td><h3>Bio: </h3><td> 
		<td><c:out value="${tempProfile.bio}"></c:out></td>
	</tr>
	<tr>
		<td><h3>Date Joined: </h3><td> 
		<td><c:out value="${tempProfile.monthJoined}"></c:out>/<c:out value="${tempProfile.yearJoined}"></c:out></td>
	</tr>
	</c:forEach>
</table>
</body>
</html>