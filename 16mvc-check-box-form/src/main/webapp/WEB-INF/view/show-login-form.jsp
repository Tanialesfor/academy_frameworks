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
		
     <form:radiobuttons path="favoriteLanguage"
			items="${loginData.favoriteLanguageOptions}" />
		<br />
		<br />
		
		Operating Systems:
		
		Linux <form:checkbox path="operatingSystems" value="Linux" />
		Mac OS <form:checkbox path="operatingSystems" value="Mac OS" />
		MS Windows <form:checkbox path="operatingSystems" value="MS Window" />


		<input type="submit" value="Submit" />

	</form:form>

	<br />
	<a href="loginPage/about"> about us</a>
</body>
</html>
