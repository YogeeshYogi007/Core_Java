package demo;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App {
	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Users.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try{
		 session.beginTransaction();
		// List<Users> users = session.createQuery("from users where lastname='g'").getResultList();
	    	session.createQuery("delete users  where firstname ='R' ").executeUpdate();
		 	
			/*
			 * for(Users temp:users) { System.out.println(temp); }
			 */
		//commit transaction
		//session.getTransaction().commit();
		}
		finally 
		{
			
		session.close();
		factory.close();
			
		}
	}
}
