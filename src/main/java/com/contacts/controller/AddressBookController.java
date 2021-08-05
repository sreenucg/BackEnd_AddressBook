package com.contacts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.contacts.model.AddressBook;
import com.contacts.repository.AddressBookReposistory;

@RestController
public class AddressBookController {
	
	@Autowired
    private AddressBookReposistory addressBookReposistory;
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	@CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/addresses")
    public List<AddressBook> getAllAddresses(){
        return addressBookReposistory.findAll();
    }
	
	
	 @GetMapping("/addresses/{name}")
	    public List<AddressBook> getAllAddresses(@PathVariable(value="name") String name){
		     Query query = new Query();
		     query.addCriteria(Criteria.where("firstName").is(name));
		    return mongoTemplate.find(query, AddressBook.class);
	    }

	 
	 
	 
	 @GetMapping
	 public ResponseEntity<?> getAddressesByProperties(@RequestParam(required = false) String firstName,
	 @RequestParam(required = false) String lastName, @RequestParam(required = false) String street,
	 @RequestParam(required = false) String city, @RequestParam(required = false) String state,
	 @RequestParam String fipsCode) {
		 
	 
	 return ResponseEntity.ok().body(addressBookReposistory.findAddressByProperties(firstName, lastName, 
			 street, city, state, fipsCode));

}

}