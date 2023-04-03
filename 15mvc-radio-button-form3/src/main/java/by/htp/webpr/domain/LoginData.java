package by.htp.webpr.domain;

import java.util.LinkedHashMap;

public class LoginData {

	private String login;
	private String password;

	private String country;
	
	private String favoriteLanguage;
	
	private LinkedHashMap<String, String> favoriteLanguageOptions;

	public LoginData() {
        favoriteLanguageOptions = new LinkedHashMap<String, String>();

        favoriteLanguageOptions.put("Java","Java Language");
        favoriteLanguageOptions.put("C#","C# Language");
        favoriteLanguageOptions.put("PHP","PHP Language");
        favoriteLanguageOptions.put("Ruby","Ruby Language");   

	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
	
	 public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
	        return favoriteLanguageOptions;
	    }

}
