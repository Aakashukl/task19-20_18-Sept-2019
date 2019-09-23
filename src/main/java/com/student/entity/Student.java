package com.student.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.Email;

@Entity
public class Student {

	@Id
	@GeneratedValue(generator = "system-increment")
	@GenericGenerator(name="system-increment", strategy = "increment")
	private int id;
	
	@Pattern(regexp = "[a-zA-Z]*",message = "Only Alphabates Allowed")
	@Size(min=3, max = 20, message = "Your Name Is Invalid , Please Use 3-10 Chars only")
	private String name;
	
	@Email
	private String email;
	
	private String gender;
	private String dateOfBirth;
	private String hobbies;
	private String address;
	private String City;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getHobbies() {
		return hobbies;
	}
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}

	public Student(int id, String name, String email, String gender, String dateOfBirth, String hobbies, String address,
			String city) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.hobbies = hobbies;
		this.address = address;
		City = city;
	}
	public Student() {
		super();
	}
	public Student(int id) {
		super();
		this.id = id;
	}
	
	
	
}
