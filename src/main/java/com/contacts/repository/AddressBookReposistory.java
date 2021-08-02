package com.contacts.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.contacts.model.AddressBook;

@RepositoryRestResource(collectionResourceRel = "addressdata", 
path = "addressdata")
public interface AddressBookReposistory extends MongoRepository<AddressBook,Integer> {

}
