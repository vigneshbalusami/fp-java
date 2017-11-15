package com.emp.sample;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

public class Employee {
	private int id;
	private String name;
	private String emailId;
	private long phone;
	private float basicSalary;
	private float houseRentAllowance;
	private float travelAllowance;
	private float dearnessAllowance;
	private float providentFund;
	private Date date;
	
	public int getId() {
		return id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
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
	public float getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}
	public float getHouseRentAllowance() {
		return houseRentAllowance;
	}
	public void setHouseRentAllowance(float houseRentAllowance) {
		this.houseRentAllowance = houseRentAllowance;
	}
	public float getTravelAllowance() {
		return travelAllowance;
	}
	public void setTravelAllowance(float travelAllowance) {
		this.travelAllowance = travelAllowance;
	}
	public float getDearnessAllowance() {
		return dearnessAllowance;
	}
	public void setDearnessAllowance(float dearnessAllowance) {
		this.dearnessAllowance = dearnessAllowance;
	}
	public float getProvidentFund() {
		return providentFund;
	}
	public void setProvidentFund(float providentFund) {
		this.providentFund = providentFund;
	}
	

}
