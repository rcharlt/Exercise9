package com.company;
/* Rylee Charlton, 3/12/19, Exercise 9---
Create an abstract class for contacts that stores a contact's name and defines an abstract method contact().
Create one class that makes use of the abstract contact class that stores an email address and implements the contact()
method using the email address and another class that stores a phone number and implements the contact() method using
the phone number. The implementation of the contact() method should simply print a string with the appropriate
information like "Emailing aneuman1@cscc.edu" or "Calling 123-456-7890".*/
public class Main {

    public static void main(String[] args) {
	    Email email = new Email("aneuman1@cscc.edu");
	    PhoneNumber phone = new PhoneNumber("123-456-7890");

	    email.contact();
	    phone.contact();
    }
}
