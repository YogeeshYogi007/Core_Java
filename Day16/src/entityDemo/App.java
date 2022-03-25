package entityDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Users.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try{
			Users user=new Users(3,"yogi","@123","y","g");
		
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		System.out.println("added successfully");
			}
		finally {
			
		session.close();
		factory.close();
			
		}
	}

}
