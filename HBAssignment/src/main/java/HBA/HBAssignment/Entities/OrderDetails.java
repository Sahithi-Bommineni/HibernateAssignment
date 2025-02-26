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
	private double unitPrice;
	@ManyToOne
	@JoinColumn(name="order_id")
	private Orders order;
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;
	
	public OrderDetails() {
		this.id=0;
		this.quantity=0;
		this.unitPrice=0.0;
	}
	
	public OrderDetails(int quantity, double unitPrice, Orders order, Product product) {
		super();
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.order = order;
		this.product = product;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public Orders getOrder() {
		return order;
	}
	public void setOrder(Orders order) {
		this.order = order;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "OrderDetails [id=" + id + ", quantity=" + quantity + ", unitPrice=" + unitPrice + ", order=" + order
				+ ", product=" + product + "]";
	}
	
	
}
