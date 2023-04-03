package by.htp.webpr.domain;

import java.util.LinkedList;

public class LoginData {

	private String login;
	private String password;

	private String country;

	private LinkedList<String> countryOptions;

	public LoginData() {

		countryOptions = new LinkedList<String>();

		countryOptions.add("BR");
		countryOptions.add("FR");
		countryOptions.add("DE");
		countryOptions.add("IN");
		countryOptions.add("US");

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

	public LinkedList<String> getCountryOptions() {
		return countryOptions;
	}

}
