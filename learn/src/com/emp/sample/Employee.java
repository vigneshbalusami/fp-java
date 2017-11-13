package com.emp.sample;

public class Employee {
	private int id;
	private String name;
	private String emailId;
	private long phone;
	private String gender;

	public Employee() {
	}

	public Employee(int id, String name, String emailId, long phone, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.emailId = emailId;
		this.phone = phone;
		this.gender = gender;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setId(int id) {
		this.id = id;
	}
}
