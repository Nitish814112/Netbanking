package com.netbanking.entities;

import java.util.Date;

public class User {
	private String name;
	private String fname;
	private String email;
	private String dob;
	private long phone;
	private String gender;
	private String marital;
	private String address;
	private String city;
	private String state;
	private int pincode;
	private String religion;
	private String category;
	private String income;
	 private String education;
	 private String occupation;
	 private String pan;
	 private long aadhar;
	 private String e_account;
	 private String uid;
	 private String password;
	private long balance;
	private String type;
	private Date date;
	private long amount;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String name, String fname, String email, String dob, long phone, String gender, String marital,
			String address, String city, String state, int pincode, String religion, String category, String income,
			String education, String occupation, String pan, long aadhar, String e_account, String uid, String password,
			long balance, String type, Date date, long amount) {
		super();
		this.name = name;
		this.fname = fname;
		this.email = email;
		this.dob = dob;
		this.phone = phone;
		this.gender = gender;
		this.marital = marital;
		this.address = address;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.religion = religion;
		this.category = category;
		this.income = income;
		this.education = education;
		this.occupation = occupation;
		this.pan = pan;
		this.aadhar = aadhar;
		this.e_account = e_account;
		this.uid = uid;
		this.password = password;
		this.balance = balance;
		this.type = type;
		this.date = date;
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
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
	public String getMarital() {
		return marital;
	}
	public void setMarital(String marital) {
		this.marital = marital;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getIncome() {
		return income;
	}
	public void setIncome(String income) {
		this.income = income;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public long getAadhar() {
		return aadhar;
	}
	public void setAadhar(long aadhar) {
		this.aadhar = aadhar;
	}
	public String getE_account() {
		return e_account;
	}
	public void setE_account(String e_account) {
		this.e_account = e_account;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", fname=" + fname + ", email=" + email + ", dob=" + dob + ", phone=" + phone
				+ ", gender=" + gender + ", marital=" + marital + ", address=" + address + ", city=" + city + ", state="
				+ state + ", pincode=" + pincode + ", religion=" + religion + ", category=" + category + ", income="
				+ income + ", education=" + education + ", occupation=" + occupation + ", pan=" + pan + ", aadhar="
				+ aadhar + ", e_account=" + e_account + ", uid=" + uid + ", password=" + password + ", balance="
				+ balance + ", type=" + type + ", date=" + date + ", amount=" + amount + "]";
	}
	

}
