package br.com.matheuslino.model.bean;

public class Address {
	
	// Attributes
	private String street;
	private String neighborhood;
	private int number;
	private String complement;
	private int postCode;
	private static final String city = "Pedralva";
	private static final String state = "Minas Gerais";
	private static final String country = "Brasil";
	

	// Methods
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getNeighborhood() {
		return neighborhood;
	}
	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getComplement() {
		return complement;
	}
	public void setComplement(String complement) {
		this.complement = complement;
	}
	public int getPostCode() {
		return postCode;
	}
	public void setPostCode(int postCode) {
		this.postCode = postCode;
	}
	public static String getCity() {
		return city;
	}
	public static String getState() {
		return state;
	}
	public static String getCountry() {
		return country;
	}
}
