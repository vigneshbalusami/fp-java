package com.emp.sample;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "Employee_Detail")
public class Employee {

	@Id
	@GeneratedValue
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

	public Employee(int id, String name, String emailId, long phone, float basicSalary, float dearnessAllovance,
			float houseRentAllowance, float travelAllovance, float providFund, boolean gender) {
		super();
		this.id = id;
		this.name = name;
		this.emailId = emailId;
		this.phone = phone;
		this.basicSalary = basicSalary;
		this.dearnessAllovance = dearnessAllovance;
		this.houseRentAllowance = houseRentAllowance;
		this.travelAllovance = travelAllovance;
		this.providFund = providFund;
		this.gender = gender;
	}

	public float getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}

	public float getDearnessAllovance() {
		return dearnessAllovance;
	}

	public void setDearnessAllovance(float dearnessAllovance) {
		this.dearnessAllovance = dearnessAllovance;
	}

	public float getHouseRentAllowance() {
		return houseRentAllowance;
	}

	public void setHouseRentAllowance(float houseRentAllowance) {
		this.houseRentAllowance = houseRentAllowance;
	}

	public float getTravelAllovance() {
		return travelAllovance;
	}

	public void setTravelAllovance(float travelAllovance) {
		this.travelAllovance = travelAllovance;
	}

	public float getProvidFund() {
		return providFund;
	}

	public void setProvidFund(float providFund) {
		this.providFund = providFund;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public Employee() {
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
