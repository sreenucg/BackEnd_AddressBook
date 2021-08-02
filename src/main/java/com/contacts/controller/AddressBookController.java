package com.contacts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contacts.model.AddressBook;
import com.contacts.repository.AddressBookReposistory;

@RestController
public class AddressBookController {
	
	@Autowired
    private AddressBookReposistory addressBookReposistory;
	
	@CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/addresses")
    public List<AddressBook> getAllAddresses(){
        return addressBookReposistory.findAll();
    }

}
