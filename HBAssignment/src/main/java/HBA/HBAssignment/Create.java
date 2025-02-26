package HBA.HBAssignment;

import java.time.LocalDateTime;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import HBA.HBAssignment.Entities.Category;
import HBA.HBAssignment.Entities.OrderDetails;
import HBA.HBAssignment.Entities.Orders;
import HBA.HBAssignment.Entities.Product;
import HBA.HBAssignment.Entities.UserRole;
import HBA.HBAssignment.Entities.Users;

public class Create {
	
	SessionFactory factory = null;
	public Create(SessionFactory factory) {
		this.factory=factory;
		Session session = factory.openSession();
		session.beginTransaction();
		
		Category category = new Category("Cleansers","oil based, water based");
		Product product = new Product("CeraVe FaceWash", 12.49, 6, category);
		Users user = new Users("user1", "password1","user1@user.com",UserRole.CUSTOMER);
		Orders order = new Orders(LocalDateTime.now(),58.0, user);
		OrderDetails details = new OrderDetails(2, 29.0, order, product);
		
		session.persist(category);
		session.persist(product);
		session.persist(user);
		session.persist(order);
		session.persist(details);
		
		System.out.println("Category "+category.getId());
		System.out.println("Product is added with id "+product.getId());
		System.out.println("User is added with id "+user.getId());
		System.out.println("Order is added with id "+order.getId());
		System.out.println("Order details is added with id "+details.getId());
		
		
		session.getTransaction().commit();
	}
}
