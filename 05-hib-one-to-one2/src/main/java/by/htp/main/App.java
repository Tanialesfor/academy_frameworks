package by.htp.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		
//		createUser();
		getQuery();
		
//		deleteUser();
	}

	public static void createUser() {
		UserDetail userDetail = new UserDetail();

		userDetail.setCity("Minsk123");
		userDetail.setStreet("MinskStreet33");

		User user = new User();

		user.setLogin("login333");
		user.setPassword("password333");
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

		int id = 30;
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

		int id = 34;
		UserDetail userDetail = session.get(UserDetail.class, id);

		session.delete(userDetail);

		session.getTransaction().commit();

		factory.close();

	}

}
