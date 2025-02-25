package HBA.HBAssignment;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import HBA.HBAssignment.Entities.Category;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	
    	Configuration config = new Configuration();
    	config.addAnnotatedClass(Category.class);
    	config.configure("hibernate.cfg.xml");
    	SessionFactory factory = config.buildSessionFactory();
    	Session session = factory.openSession();
    	session.beginTransaction();
    	session.getTransaction().commit();
    }
}
