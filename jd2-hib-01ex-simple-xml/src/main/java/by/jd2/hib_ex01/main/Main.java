package by.jd2.hib_ex01.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import by.jd2.hib_ex01.bean.User;

public class Main {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		Session session = factory.openSession();

		try {

			session.beginTransaction();

			List<User> users = (List<User>) session.createQuery("from User").getResultList();//HQL
			List<String> result = session.createQuery("select surnameUser FROM User").list();

			session.getTransaction().commit();

			for (String surnameUser : result) {
				System.out.println("-----" + surnameUser);
			}

			for (User user : users) {
				System.out.println(user.getUserId() + " " + user.getNameUser() + "  " + user.getSurnameUser() + " " + user.getDateRegistration());
			}

		} finally {
			factory.close();
		}

	}

}
