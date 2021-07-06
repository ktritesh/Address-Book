/**
 * Ability to create Contacts in Address Book with first and last names, address, city, state, zip, phone number and email.
 * Ability to Edit Contact using first name.
 *
 * @author: Ritesh KT
 * @since: 18/06/2021
 */
package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBook {
    Contacts contact;
    static Scanner scanner = new Scanner(System.in);

    //Adding contact details of person
    public void addContacts(){
        contact = new Contacts();

        System.out.println("Enter First Name: ");
        String firstName = scanner.nextLine();
        contact.setFirstName(firstName);
        System.out.println("Enter last Name: ");
        String lastName = scanner.nextLine();
        contact.setLastName(lastName);
        System.out.println("Enter your address: ");
        String address = scanner.nextLine();
        contact.setAddress(address);
        System.out.println("Enter your city: ");
        String city = scanner.nextLine();
        contact.setCity(city);
        System.out.println("Enter your state: ");
        String state = scanner.nextLine();
        contact.setCity(city);
        System.out.println("Enter your Zip code: ");
        Long zipCode = scanner.nextLong();
        contact.setZipCode(zipCode);
        scanner.nextLine();
        System.out.println("Enter phone number: ");
        Long phoneNumber = scanner.nextLong();
        contact.setPhoneNumber(phoneNumber);
        scanner.nextLine();
        System.out.println("Enter your Email ID: ");
        String email = scanner.nextLine();
        contact.setEmail(email);
    }

    //Method to edit contact using first name
    public void editContact() {
        System.out.println("Enter the first name of person to edit contact");
        String editName = scanner.nextLine();
        if (editName.equalsIgnoreCase(contact.firstName)){
            addContacts();
        }else {
            System.out.println("Invalid Name...!!...Please enter valid First Name");
            editContact();
        }
    }

    //Method to delete contact using first name
    public void deleteContact() {
        System.out.println("Enter the first name of person to delete contact");
        String editName = scanner.nextLine();
        if (editName.equals(contact.firstName)){
            System.out.println("you are deleted "+ contact.firstName+" details from contacts");
            contact=null;
        }
    }
}


