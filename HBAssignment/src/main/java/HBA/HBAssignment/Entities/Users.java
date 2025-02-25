package HBA.HBAssignment.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

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
	@Column(name="role")
	private String role;
	

}
