package by.htp.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
//	    createUser();
		
//		createCourses();
		
//		getUserCourses();
		
		deleteCourse();

	}

	public static void createUser() {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(User.class)
				.addAnnotatedClass(UserDetail.class)
				.addAnnotatedClass(Course.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {

			UserDetail userDetail = new UserDetail();

			userDetail.setCity("NewYork");
			userDetail.setStreet("NYStreet");

			User user = new User();

			user.setLogin("kkk567");
			user.setPassword("fff345");
			user.setRole("student");
			user.setUserDetail(userDetail);

			session.beginTransaction();

			session.save(user);

			session.getTransaction().commit();

		} finally {
			session.close();
			factory.close();
		}
	}
	
	public static void createCourses() {

		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(User.class)
								.addAnnotatedClass(UserDetail.class)
								.addAnnotatedClass(Course.class)
								.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {			

			session.beginTransaction();
			
			int theId = 6;
			User user = session.get(User.class, theId);		
			
			Course course1 = new Course();
			Course course2 = new Course();
			
			course1.setTitle("C++2");
			course2.setTitle("Java2");
			
			user.addCourse(course1);
			user.addCourse(course2);
			
			session.save(course1);
			session.save(course2);
			
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			
			session.close();
			
			factory.close();
		}
	}
	
	
	public static void getUserCourses() {

		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(User.class)
								.addAnnotatedClass(UserDetail.class)
								.addAnnotatedClass(Course.class)
								.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {			
			
			session.beginTransaction();
			
			int theId = 6;
			User user= session.get(User.class, theId);		
			
			System.out.println("User: " + user.getUserDetail().getCity());
			
			List<Course> cources = user.getCourses();
			
			for(Course c : cources) {
				System.out.println(c.getTitle());
			}
			
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			
			// add clean up code
			session.close();
			
			factory.close();
		}
	}

	public static void deleteCourse() {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(User.class)
								.addAnnotatedClass(UserDetail.class)
								.addAnnotatedClass(Course.class)
								.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {			

			session.beginTransaction();
			
			int theId = 15;
			Course tempCourse = session.get(Course.class, theId);
			
			session.delete(tempCourse);

			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			session.close();
			factory.close();
		}
	}
}
