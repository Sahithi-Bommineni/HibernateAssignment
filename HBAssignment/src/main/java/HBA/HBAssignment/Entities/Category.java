package HBA.HBAssignment.Entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="category")
public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="name",length=25,nullable=false,unique=true)
	private String name;
	@Column(name="description",length=100)
	private String description;
	//@OneToMany(mappedBy="category",cascade = CascadeType.ALL)
	//private List<Product> product;
	
	public Category() {
		this.id=0;
		this.name=null;
		this.description=null;
	}
	
	public Category(String name, String description){//List<Product> product) {
		super();
		this.name = name;
		this.description = description;
		//this.product = product;
	}
//	public List<Product> getProduct() {
//		return product;
//	}
//	public void setProduct(List<Product> product) {
//		this.product = product;
//	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
	
	
}
