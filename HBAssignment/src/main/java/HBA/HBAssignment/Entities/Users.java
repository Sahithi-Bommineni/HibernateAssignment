package HBA.HBAssignment.Entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="username",length=10,nullable=false,unique = true)
	private String username;
	@Column(name="password",nullable=false)
	private String password;
	@Column(name="email",nullable=false,unique = true)
	private String email;
	@Enumerated(EnumType.STRING)
	@Column(name="role")
	private UserRole role;
	@OneToMany(mappedBy="user",cascade=CascadeType.ALL)
	private List<Orders> order;
	
	public Users() {
		this.id=0;
		this.username=null;
		this.password=null;
		this.email=null;
		this.role=null;
	}
	
	public Users(String username, String password, String email, UserRole role) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.role = role;
		//this.order = order;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public UserRole getRole() {
		return role;
	}
	public void setRole(UserRole role) {
		this.role = role;
	}
	public List<Orders> getOrder() {
		return order;
	}
	public void setOrder(List<Orders> order) {
		this.order = order;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + ", role="
				+ role + ", order=" + order + "]";
	}
	
	

}
