package JFS.HQL_Query;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Details {
	@Id
	private int id;
	private String name;
	public Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Details(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
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
	@Override
	public String toString() {
		return "Details [id=" + id + ", name=" + name + "]";
	}

	
	
}
