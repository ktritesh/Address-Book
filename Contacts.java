/*
 * Ability to add a new contact to address book
 * Using console to add person details from address book main class
 * Ability to Edit Contact using first name.
 * Ability to Delete contact using first name.
 *
 * @author: Ritesh KT
 * @since: 18/06/2021
 */

package com.bridgelabz.addressbook;

public class Contacts {

    //Instance variable
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    long zipCode;
    long phoneNumber;
    String email;

    public Contacts() {
    }

    public Contacts(String firstName, String lastName, String address, String city, String state, long zipCode, long phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode=" + zipCode +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }

    // Creating getter and setter method
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
