
package com.emp.sample;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="test")
public class Employee {
	@Id
	@Column(name = "IRCTC_ID", nullable = false, unique = true, length = 20)
	private String userId;
	@Column(name = "IRCTC_Password", nullable = false)
	private String password;
	@Column(name = "Security_Question", nullable = false)
	private String securityQuestion[];
	@Column(name = "Security_Answer", nullable = false)
	private String securityAnswer;
	@Column(name = "first_name", nullable = false)
	private String firstName;
	private String middleName;
	private String lastName;
	@Column(name = "Gender_type", nullable = false)
	private String gender[] = { "Male", "Female", "Other" };
	@Column(name = "Marital_status", nullable = false)
	private String maritalStatus[] = { "Married", "Single" };
	@Column(name = "DOB", nullable = false)
	private String dob;
	@Column(name = "Occupation", nullable = false)
	private String[] occupation = { "Goverment", "Public", "Private", "Professional", "SelfEmployee", "studets",
			"Others" };
	@Column(name = "aadhar_Number", nullable = true)
	private long aadharNO;
	@Column(name = "Pan_Card_Number", nullable = true)
	private long pan;
	@Column(name = "Country_Name", nullable = false)
	private String country[];
	@Column(name = "gmail", nullable = false, unique = true)
	private String mail;

	public String getUserId() {
		return userId;
	}

	public Employee(String userId, String password, String[] securityQuestion, String securityAnswer, String firstName,
			String middleName, String lastName, String[] maritalStatus, String dob, long aadharNO, long pan,
			String[] country, String mail) {
		super();
		this.userId = userId;
		this.password = password;
		this.securityQuestion = securityQuestion;
		this.securityAnswer = securityAnswer;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.maritalStatus = maritalStatus;
		this.dob = dob;
		this.aadharNO = aadharNO;
		this.pan = pan;
		this.country = country;
		this.mail = mail;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String[] getSecurityQuestion() {
		return securityQuestion;
	}

	public void setSecurityQuestion(String[] securityQuestion) {
		this.securityQuestion = securityQuestion;
	}

	public String getSecurityAnswer() {
		return securityAnswer;
	}

	public void setSecurityAnswer(String securityAnswer) {
		this.securityAnswer = securityAnswer;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String[] getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String[] maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public long getAadharNO() {
		return aadharNO;
	}

	public void setAadharNO(long aadharNO) {
		this.aadharNO = aadharNO;
	}

	public long getPan() {
		return pan;
	}

	public void setPan(long pan) {
		this.pan = pan;
	}

	public String[] getCountry() {
		return country;
	}

	public void setCountry(String[] country) {
		this.country = country;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String[] getGender() {
		return gender;
	}

	public void setGender(String[] gender) {
		this.gender = gender;
	}

	public String[] getOccupation() {
		return occupation;
	}

	public void setOccupation(String[] occupation) {
		this.occupation = occupation;
	}

}
