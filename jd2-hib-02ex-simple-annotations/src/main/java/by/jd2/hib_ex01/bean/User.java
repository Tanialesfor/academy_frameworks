package by.jd2.hib_ex01.bean;

import java.sql.Timestamp;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id") 
	private int userId;
	
	@Column(name="name") 
	private String nameUser;
	
	@Column(name="surname") 
	private String surnameUser;
	
	@Column(name="login") 
	private String login;
		
	@Column(name="password") 
	private String password;
	
	
	@Column(name="date_registration") 
	private Timestamp dateRegistration;
	
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
