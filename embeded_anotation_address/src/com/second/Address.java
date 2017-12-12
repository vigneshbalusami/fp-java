package com.second;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
	@Column(name = "Door_Number", length = 8)
	private String doorNumber;
	@Column(name = "Street_Name", length = 50)
	private String streetName;
	@Column(name = "village", length = 50)
	private String village;
	@Column(name = "thaluka", length = 50)
	private String thaluka;
	@Column(name = "District", length = 50)
	private String district;
	@Column(name = "Pincode", length = 6)
	private long pincode;
	@Column(name = "PhoneNumber", length = 10)
	private long phoneNumber;

	public String getDoorNumber() {
		return doorNumber;
	}

	public void setDoorNumber(String doorNumber) {
		this.doorNumber = doorNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getThaluka() {
		return thaluka;
	}

	public void setThaluka(String thaluka) {
		this.thaluka = thaluka;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
