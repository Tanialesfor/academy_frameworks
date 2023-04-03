<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
	
	<%
		response.sendRedirect("login/showLoginForm");
	%>

	<%-- <form:form action="loginPage/loginForm" modelAttribute="loginData">
	
		First name: <form:input placeholder="What's your login?"  path="login" />
		
		<br><br>
	
		Last name: <form:password placeholder="What's your login?" path="password" />
		
		<br/><br/>
	
		<input type="submit" value="Submit" />
	
	</form:form>
	
	<br/>
	<a href="loginPage/about"> about us</a> --%>
</body>
</html>
