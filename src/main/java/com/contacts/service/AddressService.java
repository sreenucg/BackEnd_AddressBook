package com.contacts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.contacts.model.AddressBook;
import com.contacts.repository.AddressBookReposistory;

@Service
public class AddressService {
@Autowired
private AddressBookReposistory addressBookReposistory;

public List<AddressBook> fetchAddressByProperties(String firstName, String lastName, String street,
String city,String state, String fipsCode) {
return addressBookReposistory.findAddressByProperties(firstName, lastName, street, city,state,fipsCode);

 }
}
