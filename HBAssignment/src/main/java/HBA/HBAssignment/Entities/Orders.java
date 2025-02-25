package HBA.HBAssignment.Entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Orders {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="date of the order",nullable=false)
	private Date orderDate;
	@Column(name="amount",nullable=false)
	private float totalAmount;
	@ManyToOne
	@JoinColumn(name="user_id",nullable=false)
	private Users user;
	@OneToMany(mappedBy="OrderDetails")
	private List<OrderDetails> order_details;
	

}
