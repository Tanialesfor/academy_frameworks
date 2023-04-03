<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<body>

	<form:form action="processForm" modelAttribute="loginData">
	
		Login: <form:input placeholder="login" path="login" />

		<br />
		<br />
	
		Password: <form:password placeholder="password" path="password" />

		<br />
		<br />
		
		From Country:
		
		<form:select path="country">
			<form:options items="${theCountryOptions}" />
		</form:select>

		<br />
		
		Favorite Language:
		
		Java <form:radiobutton path="favoriteLanguage" value="Java" />
		C# <form:radiobutton path="favoriteLanguage" value="C#" />
		PHP <form:radiobutton path="favoriteLanguage" value="PHP" />
		Ruby <form:radiobutton path="favoriteLanguage" value="Ruby" />

		<br/><br/>

		<input type="submit" value="Submit" />

	</form:form>

	<br />
	<a href="loginPage/about"> about us</a>
</body>
</html>
