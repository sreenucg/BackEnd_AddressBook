package com.contacts.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.contacts.model.AddressBook;

public class AddressCustomRepositoryImpl  implements AddressCustomRepository{
	
	@Autowired
	MongoTemplate mongoTemplate;

	@Override
	public List<AddressBook> findStudentsByProperties(String firstName, String lastName, String street, String city,
			String state, String fipsCode) {
		
		final Query  query = new Query();
		
		final List<Criteria> criteria = new ArrayList<>();
		if (firstName != null && !firstName.isEmpty())
		     criteria.add(Criteria.where("firstname").is(firstName));
		if (lastName != null && !lastName.isEmpty())
		     criteria.add(Criteria.where("lastName").is(lastName));
		if (street != null && !street.isEmpty())
		     criteria.add(Criteria.where("street").in(street)); 
	    if (city != null && !city.isEmpty())
	     criteria.add(Criteria.where("city").is(city));
	    
	    if (state != null && !state.isEmpty())
	     criteria.add(Criteria.where("state").is(state));
	    
	    if (fipsCode != null && !fipsCode.isEmpty())
	     criteria.add(Criteria.where("fipsCode").is(fipsCode));
	    if (!criteria.isEmpty())
	    	query.addCriteria(new Criteria().andOperator(criteria.toArray(new Criteria[criteria.size()])));
	    
		return mongoTemplate.find(query, AddressBook.class);
	}
	
	

}
