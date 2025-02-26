package HBA.HBAssignment.Entities;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
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
	private LocalDateTime orderDate;
	@Column(name="amount",nullable=false)
	private double totalAmount;
	@ManyToOne
	@JoinColumn(name="user_id")
	private Users user;
	@OneToMany(mappedBy="order",cascade = CascadeType.ALL)
	private List<OrderDetails> order_details;
	
	public Orders() {
		this.id=0;
		this.orderDate=null;
		this.totalAmount=0.0;
	}
	
	
	public Orders(LocalDateTime orderDate, double totalAmount, Users user) {
		super();
		this.orderDate = orderDate;
		this.totalAmount = totalAmount;
		this.user = user;
		//this.order_details = order_details;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public LocalDateTime getOrderDate() {
		return orderDate;
	}


	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}


	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public List<OrderDetails> getOrder_details() {
		return order_details;
	}
	public void setOrder_details(List<OrderDetails> order_details) {
		this.order_details = order_details;
	}
	@Override
	public String toString() {
		return "Orders [id=" + id + ", orderDate=" + orderDate + ", totalAmount=" + totalAmount + ", user=" + user
				+ ", order_details=" + order_details + "]";
	}
	
	
}
