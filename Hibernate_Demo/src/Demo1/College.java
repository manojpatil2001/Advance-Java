package Demo1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class College {
	@Id
	int id;
	String clg_name;
	String location;
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	public College(int id, String clg_name, String location) {
		super();
		this.id = id;
		this.clg_name = clg_name;
		this.location = location;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClg_name() {
		return clg_name;
	}
	public void setClg_name(String clg_name) {
		this.clg_name = clg_name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "College [id=" + id + ", clg_name=" + clg_name + ", location=" + location + "]";
	}
	
	

}
