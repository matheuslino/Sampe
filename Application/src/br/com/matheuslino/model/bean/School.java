package br.com.matheuslino.model.bean;

public class School {
	
	// Attributes
	private String name;
	private int phone;
	private Address address;
	
	// Methods
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
}
