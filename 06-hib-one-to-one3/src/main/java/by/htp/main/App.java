package by.htp.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		//createUser();
		getQuery();
		
		//deleteUser();
	}

	public static void createUser() {
		UserDetail userDetail = new UserDetail();

		userDetail.setCity("Gomel111");
		userDetail.setStreet("GomelStreet111");

		User user = new User();

		user.setLogin("login1111");
		user.setPassword("password1111");
		user.setRole("student");
		user.setUserDetail(userDetail);

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class)
				.addAnnotatedClass(UserDetail.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		session.beginTransaction();

		session.save(user);

		session.getTransaction().commit();

		factory.close();

	}

	public static void getQuery() {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class)
				.addAnnotatedClass(UserDetail.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		session.beginTransaction();

		int id = 29;
		UserDetail userDetail = session.get(UserDetail.class, id);

		System.out.println(userDetail.getCity());
		System.out.println(userDetail.getCity() + " - " + userDetail.getUser().getLogin());

		session.getTransaction().commit();

		factory.close();
	}

	public static void deleteUser() {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class)
				.addAnnotatedClass(UserDetail.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		session.beginTransaction();

		int id = 31;
		UserDetail userDetail = session.get(UserDetail.class, id);
		
		userDetail.getUser().setUserDetail(null);

		session.delete(userDetail);

		session.getTransaction().commit();

		factory.close();

	}

}
