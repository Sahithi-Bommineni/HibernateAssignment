package HBA.HBAssignment;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import HBA.HBAssignment.Entities.Category;
import HBA.HBAssignment.Entities.OrderDetails;
import HBA.HBAssignment.Entities.Orders;
import HBA.HBAssignment.Entities.Product;
import HBA.HBAssignment.Entities.Users;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	
    	Configuration config = new Configuration();
    	config.addAnnotatedClass(Category.class);
    	config.addAnnotatedClass(Product.class);
    	config.addAnnotatedClass(Users.class);
    	config.addAnnotatedClass(Orders.class);
    	config.addAnnotatedClass(OrderDetails.class);
    	config.configure("hibernate.cfg.xml");
    	SessionFactory factory = config.buildSessionFactory();
    	//Session session = factory.openSession();
    	//session.beginTransaction();
    	//session.getTransaction().commit();
    	
    	new Create(factory);
    	new ReadCategory(factory);
    }
}
