package com.jbk.First.Springboot.Project;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Doctor {

	@Id
	int id;
	String name;
	String address;
	String phone_no;
	String qualification;
	String gender;

	public Doctor() {
		super();

	}

	public Doctor(int id, String name, String address, String phone_no, String qualification, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone_no = phone_no;
		this.qualification = qualification;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", address=" + address + ", phone_no=" + phone_no
				+ ", qualification=" + qualification + ", gender=" + gender + "]";
	}
	
	

}
