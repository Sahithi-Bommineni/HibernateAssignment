package HBA.HBAssignment;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class UpdateCategory {
	SessionFactory factory = null;
	public UpdateCategory(SessionFactory factory) {
		this.factory=factory;
		Session session = factory.openSession();
		session.beginTransaction();
	}
}
