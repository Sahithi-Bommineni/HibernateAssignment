package HBA.HBAssignment.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class OrderDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="quantity",nullable=false)
	private int quantity;
	@Column(name="price of one unit",nullable=false)
	private float unitPrice;
	@ManyToOne
	@JoinColumn(name="order_id")
	private Orders order;
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;
}
