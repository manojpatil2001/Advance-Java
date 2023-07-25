package com.jbk.First.Springboot.Project;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test_Doctor {

	ArrayList<Doctor> al = new ArrayList<>();

	public Test_Doctor() {
		al.add(new Doctor(01, "Dr.patilHRushi", "@Pune", "8308381503", "MBBS", "Male"));
		al.add(new Doctor(02, "Dr.patilGaurav", "@Nashik", "7507481503", "BDS", "Male"));

	}

	@GetMapping("all data")
	ArrayList<Doctor> allData() {
		System.out.println(al);
		return al;
	}

//	@PostMapping("insertData")
//	ArrayList<Doctor> insert(@RequestBody Doctor doctor) {
//		al.add(doctor); // insert
//		System.out.println(al);
//		return al;

//	}

	@PutMapping("updateData")
	ArrayList<Doctor> update(@RequestBody Doctor doctor) {
		al.add(doctor); // update
		System.out.println(al);
		return al;
	}
}
