/**
 * Ability to create Contacts in Address Book with first and last names, address, city, state, zip, phone number and email.
 * Ability to Edit Contact using first name.
 *
 * @author: Ritesh KT
 * @since: 18/06/2021
 */
package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBookMain {
    static Scanner scanner = new Scanner(System.in);

    //main method
    public static void main(String[] args) {
        System.out.println("Welcome to address book problem");
        AddressBook addressBook = new AddressBook();

        addressBook.addContacts();
        System.out.println("You have entered the following data");
        System.out.println(addressBook.contact);

        System.out.println("Enter Y/y to edit ");
        String option = scanner.nextLine();
        if(option.equals("y") || option.equals("Y")){
            addressBook.editContact();
            System.out.println("You have entered the following data");
            System.out.println(addressBook.contact);
            System.out.println("Thank for Using Address book");
        }else {
            System.out.println("Thanks for using ");
        }
    }
}
