package HibernateTest;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Employeee {
	
	@Id	
	int id;
	String name;
	int age;
	String city;
	int per;
	String gender;
	public Employeee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employeee(int id, String name, int age, String city, int per, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.city = city;
		this.per = per;
		this.gender = gender;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPer() {
		return per;
	}
	public void setPer(int per) {
		this.per = per;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Employeee [id=" + id + ", name=" + name + ", age=" + age + ", city=" + city + ", per=" + per
				+ ", gender=" + gender + "]";
	}
}	
	