package com.greatlearning.lab6spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="student")
public class Student {

	// define fields

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;


	@Column(name="name")
	private String name;





	@Column(name="department")
	private String department;
	
	@Column(name="country")
	private String country;

	public Student()
	{
		
	}
	
	public Student(String name, String department, String country) {
		
		this.name = name;
		
		this.department = department;
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}




	public String getdepartment() {
		return department;
	}

	public void setdepartment(String department) {
		this.department = department;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", department=" + department
				+ ", country=" + country + "]";
	}
		

}