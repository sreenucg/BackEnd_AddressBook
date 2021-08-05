# BackEnd_AddressBookService
Backend Addressbook

#Goal

 

Implement a microservice that manages an address book lookup

 

 

 

## Requirements

 

1. The application itself should manage information such as, first name, surname, phone number, address and email of an individual.

2. It should allow consumers of the API to create, read, update and delete any of these entries.

 

## Model(s)

 

An address book is essentially a list of contacts, each containing a first name and surname, along with other pieces of information, such street,city,stateCode,stateFipsCode.

 

public class AddressBook {
             private String id;
             private String firstname;

              private String surname;

              private String street;

              private String city;

              private String stateCode;

              private int stateFipsCode;

}

 

## Database setup
 

The preferable choose here would be some form of a NoSQL database because,

1) it will allow for a fast mock up,

2) a NoSQL(MongoDB) database would be well suited to this type of application's requirements.

 
### Build

 
To build the project,  we have to choose [Maven](https://maven.apache.org/).

 

mvn clean install

 

After the project has been built, a target directory will be created containing the executable jar.
