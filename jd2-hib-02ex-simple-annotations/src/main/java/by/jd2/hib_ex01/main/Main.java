package by.jd2.hib_ex01.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import by.jd2.hib_ex01.bean.User;

public class Main {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(User.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {

			session.beginTransaction();

			List<User> theUsers = session.createQuery("from User").getResultList();

			displayUsers(theUsers);
			
			theUsers = session.createQuery("from User u where u.login='admin'").getResultList();

//			theUsers = session.createQuery("from User u where u.lastName='Miroshnichenko'").getResultList();

			displayUsers(theUsers);
			
			theUsers = session.createQuery("from User u where" + " u.login='admin' OR u.login='editor'")
					.getResultList();

//			theUsers = session.createQuery("from User u where" + " u.lastName='Miroshnichenko' OR u.firstName='Sergei'")
//					.getResultList();


			displayUsers(theUsers);

			//theUsers = session.createQuery("from User u where" + " u.email LIKE '%mail.com%'").getResultList();

			//displayUsers(theUsers);

			session.getTransaction().commit();

			System.out.println("Done!");
		} finally {
			factory.close();
		}
	}

	private static void displayUsers(List<User> theUsers) {
		for (User tempUser : theUsers) {
			System.out.println(tempUser.getNameUser()+ " " + tempUser.getSurnameUser());
		}
	}

}
