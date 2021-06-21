/**
 * Ability to create Contacts in Address Book with first and last names, address, city, state, zip, phone number and email.
 *
 *
 * @author: Ritesh KT
 * @since: 18/06/2021
 */

package com.bridgelabz.addressbook;

//Creating a class for Address Book
public class AddressBook {

    //Instance variable
    String first_name;
    String last_name;
    String address;
    String city;
    String state;
    int zip;
    String phone_number;
    String email;

    //Creating a parametrized constructor to initialize instance variable
    public AddressBook(String first_name, String last_name, String address, String city, String state, int zip, String phone_number, String email) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone_number = phone_number;
        this.email = email;
    }

    public void displayContactInfo(){
        System.out.println("First Name : " +first_name);
        System.out.println("Last Name : "+ last_name);
        System.out.println("Address : "+ address);
        System.out.println("City : "+ city);
        System.out.println("State : "+ state);
        System.out.println("Zip : "+ zip);
        System.out.println("Phone Number : "+ phone_number);
        System.out.println("Email : "+ email);
    }

    //main method
    public static void main(String[] args) {
        System.out.println("Welcome to address book problem");

        //Creating object and passing the value
        AddressBook addressBook = new AddressBook("Ritesh", "KT", "co-operative coloney", "Ara", "Bihar", 802301, "7066086690","ktritesh7@gmail.com");

        //Calling displayContactInfo method
        addressBook.displayContactInfo();
    }
}


