package HBA.HBAssignment;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import HBA.HBAssignment.Entities.OrderDetails;

public class ReadCategory {
	SessionFactory factory = null;
	public ReadCategory(SessionFactory factory) {
		this.factory=factory;
		Session session = factory.openSession();
		session.beginTransaction();
		
		List<OrderDetails> orderDetails=session.createQuery(
										"from OrderDetails od"+
										"join fetch od.order o"+
										"join fetch o.user u"+
										"join fetch od.product p"+
										"join fetch p.category c",
										OrderDetails.class
										).getResultList();
		System.out.println("Number of orders retrieved: " + orderDetails.size());
		for(OrderDetails details:orderDetails) {
			System.out.println("---Order Details---");
			System.out.println("Order ID -> "+details.getOrder().getId());
			System.out.println("User -> "+ details.getOrder().getUser().getUsername());
			System.out.println("Product -> "+details.getProduct().getName());
			System.out.println("Category -> "+details.getProduct().getCategory().getName());
			System.out.println("Quantity -> "+details.getQuantity());
			System.out.println("Total Price -> "+details.getOrder().getTotalAmount());
		}
		
		session.getTransaction().commit();
		session.close();
	}
}
