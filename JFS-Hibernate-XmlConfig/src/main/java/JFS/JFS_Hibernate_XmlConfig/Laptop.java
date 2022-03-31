package JFS.JFS_Hibernate_XmlConfig;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {
	
	@Id
	private int lid;
	private String brand;
	private int price;
    
//	@ManyToMany
//	private Person person;
//	
//	public List<Person> getPerson() {
//		return person;
//	}
//	public void setPerson(List<Person> person) {
//		this.person = person;
//	}
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(int lid, String brand, int price,Person person) {
		super();
		this.lid = lid;
		this.brand = brand;
		this.price = price;
//		this.person=person;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
//	@Override
//	public String toString() {
//		return "Laptop [lid=" + lid + ", brand=" + brand + ", price=" + price + ", person=" + person + "]";
//	}

	
	

}
