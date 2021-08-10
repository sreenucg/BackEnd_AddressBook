package com.contacts.repository;

import java.util.List;

import com.contacts.model.AddressBook;

public interface AddressCustomRepository {

	public List<AddressBook> findStudentsByProperties(String firstName, String lastName, String street, String city,
			String state, String fipsCode);
}