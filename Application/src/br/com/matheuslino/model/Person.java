package br.com.matheuslino.model.bean;

import java.time.LocalDateTime;

public class Person {
	
	// Attributes
	private String name;
	private LocalDateTime birthDate;
	private Gender gender;
	private int cpf;
	private String rg;
	private int birthCertificate;
	private int phone;
	private Address address;
	private String email;
	
	// Methods
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDateTime getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDateTime birthDate) {
		this.birthDate = birthDate;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public int getBirthCertificate() {
		return birthCertificate;
	}
	public void setBirthCertificate(int birthCertificate) {
		this.birthCertificate = birthCertificate;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
