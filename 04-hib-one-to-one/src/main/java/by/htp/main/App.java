package by.htp.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
/*		UserDetail userDetail = new UserDetail();

		userDetail.setCity("Minsk");
		userDetail.setStreet("MinskStreet");

		User user = new User();

		user.setLogin("login77");
		user.setPassword("password77");
		user.setRole("aspirant");
		user.setUserDetail(userDetail);

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class)
				.addAnnotatedClass(UserDetail.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		session.beginTransaction();

		session.save(user);

		session.getTransaction().commit();

		factory.close();*/

		getQuery();
		
		
		//deleteUser();
	}

	public static void getQuery() {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class)
				.addAnnotatedClass(UserDetail.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		session.beginTransaction();

		int id = 39;
		User user = session.get(User.class, id);
		
		System.out.println(user.getLogin() + " - " + user.getUserDetail().getStreet());

		session.getTransaction().commit();

		factory.close();
	}
	
	public static void deleteUser() {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class)
				.addAnnotatedClass(UserDetail.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		session.beginTransaction();

		int id = 35;
		User user = session.get(User.class, id);
		
		if (user != null)
			session.delete(user);

		session.getTransaction().commit();

		factory.close();
		
		
	}

}
