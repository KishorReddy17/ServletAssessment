package com.webApp;

public class RegistrationModel {
	private String name;
	private String email;
	private String mobileNumber;
	private String password;

	public RegistrationModel() {
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

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public RegistrationModel(String name, String email, String mobileNumber, String password) {
		super();
		this.name = name;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.password = password;
	}

	

}
