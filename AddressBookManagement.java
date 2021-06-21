/**
 * Ability to create Contacts in Address Book with first and last names, address, city, state, zip, phone number and email.
 *
 *
 * @author: Ritesh KT
 * @since: 18/06/2021
 */
package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AddressBookManagement {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Contact> listOfContacts = new ArrayList<Contact>();
    static HashMap<String, AddressBook> mapOfAddressBooks = new HashMap<String, AddressBook>();

    //main method
    public static void main(String[] args) {
        System.out.println("Welcome to address book problem");
        AddressBookManagement.mainMenu();
    }

    public static void mainMenu(){
        while (true) {
            String addressBookName = null;
            System.out.println("Select from the options below");
            System.out.println("1. Add a new contact to Address Book");
            System.out.println("2. Display contact to Address Book");
            System.out.println("3. EXIT");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 :
                    addressBookName = scanner.next();
                    AddressBookManagement.createAddressBook(addressBookName);
                    break;
                case 2 :
                    addressBookName = scanner.next();
                    //displayAddressBook(addressBookName);
                    break;
            }
            if (choice == 3)
                break;
        }
    }

    public static void createAddressBook(String addressBookName){
        AddressBook addressBook = new AddressBook(addressBookName);
        //mapOfAddressBooks.put(addressBookName, addressBook);
        addressBook.addContact();
    }
}
