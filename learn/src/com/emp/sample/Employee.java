package com.emp.sample;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Employee {
	@Id
	@Column(name = "Employee_Id")
	private int id;
	@Column(name = "name", length = 250, nullable = false)
	private String name;
	@Column(name = "Email_Id", length = 50, nullable = false, unique = true)
	private String emailId;
	@Column(name = "Phone_number")
	private long phone;
	@Column(name = "Basic_salary")
	private float basicSalary;
	@Column(name = "DA")
	private float dearnessAllovance;
	@Column(name = "HRA")
	private float houseRentAllowance;
	@Column(name = "TA")
	private float travelAllovance;
	@Column(name = "PF")
	private float providFund;
	@Transient
	private boolean gender;

	public Employee() {
	}

	public Employee(int id, String name, String emailId, long phone) {
		super();
		this.id = id;
		this.name = name;
		this.emailId = emailId;
		this.phone = phone;

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public void setId(int id) {
		this.id = id;
	}
}
