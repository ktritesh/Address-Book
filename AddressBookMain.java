/**
 * Ability to create Contacts in Address Book with first and last names, address, city, state, zip, phone number and email.
 *
 *
 * @author: Ritesh KT
 * @since: 18/06/2021
 */
package com.bridgelabz.addressbook;

public class AddressBookMain {

    //main method
    public static void main(String[] args) {
        System.out.println("Welcome to address book problem");
        AddressBook addressBook = new AddressBook();
        addressBook.addContacts();
    }
}
