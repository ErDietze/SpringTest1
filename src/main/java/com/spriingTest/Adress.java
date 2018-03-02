package com.spriingTest;

public class Adress {

	private String street;
	private String zip;
	


	public Adress(String street, String zip) {
		super();
		this.street = street;
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Adress [street=" + street + ", zip=" + zip + "]";
	}

}
