/**
 * Ability to create Contacts in Address Book with first and last names, address, city, state, zip, phone number and email.
 *
 *
 * @author: Ritesh KT
 * @since: 18/06/2021
 */
package com.bridgelabz.addressbook;

import java.util.HashMap;
import java.util.Scanner;

public class AddressBook {

    static Scanner scanner = new Scanner(System.in);
    static HashMap<String, Contact> mapOfContact = new HashMap<String, Contact>();
    String addressBookName;

    public AddressBook(String addressBookName) {
        this.addressBookName = addressBookName;
    }

    public void addContact(){
        Contact contact = new Contact();
        System.out.print("Enter your First Name : ");
        contact.setFirst_name(scanner.nextLine());
        System.out.print("Enter your Last Name : ");
        contact.setLast_name(scanner.nextLine());
        System.out.print("Enter your Address : ");
        contact.setAddress(scanner.nextLine());
        System.out.print("Enter your City Name : ");
        contact.setCity(scanner.nextLine());
        System.out.print("Enter your State : ");
        contact.setState(scanner.nextLine());
        System.out.print("Enter your Zip Code : ");
        contact.setZip(scanner.nextInt());
        System.out.print("Enter your Phone Number : ");
        contact.setPhone_number(scanner.next());
        System.out.print("Enter your Email Address : ");
        contact.setEmail(scanner.next());
        mapOfContact.put(contact.getFirst_name(), contact);
    }
}


