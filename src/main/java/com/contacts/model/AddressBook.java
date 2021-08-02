package com.contacts.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="Address")
public class AddressBook {
	@Id
	private String id;
	private String firstName;
	private String lastName;
	private String street;
	private String city;
	private String state;
	private String fipsCode;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
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
	public String getFipsCode() {
		return fipsCode;
	}
	public void setFipsCode(String fipsCode) {
		this.fipsCode = fipsCode;
	}
	@Override
	public String toString() {
		return "AddressBook [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", street=" + street
				+ ", city=" + city + ", state=" + state + ", fipsCode=" + fipsCode + "]";
	}
	

}
