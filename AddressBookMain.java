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
    static AddressBook addressBook = new AddressBook();

    //main method
    public static void main(String[] args) {
        System.out.println("Welcome to address book problem");
        mainMenu();
    }

    public static void mainMenu(){

        boolean flag = true;
        while (flag) {
            System.out.println("Enter \n 1 . ADD CONTACT \n 2 . EDIT CONTACT \n 3 . TO DELETE CONTACT \n 4 . PRESS ANY KEY TO EXIT");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    addressBook.addContacts();
                    System.out.println("You have entered the following data");
                    System.out.println(addressBook.contact);
                    break;
                case 2:
                    addressBook.editContact();
                    System.out.println("You have Entered following data");
                    System.out.println(addressBook.contact);
                    System.out.println("Thank for Using Address book");
                    break;
                case 3:
                    addressBook.deleteContact();
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("Incorrect Option");
                    break;
            }
        }
    }
}
