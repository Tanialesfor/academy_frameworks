package by.jd2.hib_ex01.bean;

import java.sql.Timestamp;
import java.util.Objects;

public class User {
	private int userId;
	private String nameUser;
	private String surnameUser;
	private String login;
	private String password;
	private Timestamp dateRegistration;
	
//	private String firstName;
//	private String lastName;
//	private String email;
//	private Timestamp lastUpdate;
//	private String password;
//	private Timestamp lastUpdate;
	
	public User() {}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getNameUser() {
		return nameUser;
	}

	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}

	public String getSurnameUser() {
		return surnameUser;
	}

	public void setSurnameUser(String surnameUser) {
		this.surnameUser = surnameUser;
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

	public Timestamp getDateRegistration() {
		return dateRegistration;
	}

	public void setDateRegistration(Timestamp dateRegistration) {
		this.dateRegistration = dateRegistration;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dateRegistration, login, nameUser, password, surnameUser, userId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(dateRegistration, other.dateRegistration) && Objects.equals(login, other.login)
				&& Objects.equals(nameUser, other.nameUser) && Objects.equals(password, other.password)
				&& Objects.equals(surnameUser, other.surnameUser) && userId == other.userId;
	}

	
	
	

}
