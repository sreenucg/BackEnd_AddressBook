package com.contacts;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.contacts.model.AddressBook;
import com.contacts.repository.AddressBookReposistory;

@Component
public class InitializationComponent {
	
	@Autowired
    private AddressBookReposistory addressBookReposistory;

    @PostConstruct
    private void init(){
        

        AddressBook addressBook = new AddressBook();
        addressBook.setFirstName("boba1");
        addressBook.setLastName("rock1");
        addressBook.setStreet("234 2nd Ave.");
        addressBook.setCity("Tacoma");
        addressBook.setState("WA");
        addressBook.setFipsCode("26");
        addressBookReposistory.save(addressBook);
        
        
        
        
        AddressBook addressBook1 = new AddressBook();
        addressBook1.setFirstName("Tomna");
        addressBook1.setLastName("Bambodillaa");
        addressBook1.setStreet("1212 Mapple Street.");
        addressBook1.setCity("Arizonaa");
        addressBook1.setState("ALa");
        addressBook1.setFipsCode("520");
        addressBookReposistory.save(addressBook1);
        
        
        AddressBook addressBook2 = new AddressBook();
        addressBook2.setFirstName("Karola");
        addressBook2.setLastName("Gymsons");
        addressBook2.setStreet("568 2nd Ave.");
        addressBook2.setCity("Alaska");
        addressBook2.setState("KA");
        addressBook2.setFipsCode("47");
        addressBookReposistory.save(addressBook2);
        
        
        AddressBook addressBook3 = new AddressBook();
        addressBook3.setFirstName("zombia");
        addressBook3.setLastName("reddyd");
        addressBook3.setStreet("82 pined Street.");
        addressBook3.setCity("Alabama");
        addressBook3.setState("AL");
        addressBook3.setFipsCode("87");
        addressBookReposistory.save(addressBook3);
        
        AddressBook addressBook4 = new AddressBook();
        addressBook4.setFirstName("Rockyd");
        addressBook4.setLastName("Jees");
        addressBook4.setStreet("54 apple Street.");
        addressBook4.setCity("Barbour");
        addressBook4.setState("LA");
        addressBook4.setFipsCode("12");
        addressBookReposistory.save(addressBook4);
        
        
        
    }

}
