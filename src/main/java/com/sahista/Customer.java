package com.sahista;

public class Customer {
	private int userId;
	private String customerName;
	private String gender;
	private String address;
	private String age;
	private String mobileNumber;
	private String email;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Customer(int userId, String customerName, String gender, String address, String age, String mobileNumber,
			String email) {
		super();
		this.userId = userId;
		this.customerName = customerName;
		this.gender = gender;
		this.address = address;
		this.age = age;
		this.mobileNumber = mobileNumber;
		this.email = email;
	}
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [userId=" + userId + ", customerName=" + customerName + ", gender=" + gender + ", address="
				+ address + ", age=" + age + ", mobileNumber=" + mobileNumber + ", email=" + email + "]";
	}
	
	}
