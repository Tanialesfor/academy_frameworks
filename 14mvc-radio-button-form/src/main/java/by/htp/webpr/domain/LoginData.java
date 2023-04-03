package by.htp.webpr.domain;

import java.util.LinkedList;

public class LoginData {

	private String login;
	private String password;

	private String country;
	
	private String favoriteLanguage;
	
	private LinkedList<String> favoriteLanguageOptions;

	public LoginData() {
        favoriteLanguageOptions = new LinkedList<String>();

        favoriteLanguageOptions.add("Java");
        favoriteLanguageOptions.add("C#");
        favoriteLanguageOptions.add("PHP");
        favoriteLanguageOptions.add("Ruby");   

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
	
	 public LinkedList<String> getFavoriteLanguageOptions() {
	        return favoriteLanguageOptions;
	    }

}
