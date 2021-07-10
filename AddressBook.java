/**
 * Ability to create Contacts in Address Book with first and last names, address, city, state, zip, phone number and email.
 * Ability to Edit Contact using first name.
 * Ability to Delete contact using first name.
 *
 * @author: Ritesh KT
 * @since: 18/06/2021
 */
package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    static Scanner scanner = new Scanner(System.in);
    Contacts contact = new Contacts();
    ArrayList<Contacts> contactArrayList = new ArrayList<Contacts>();

    //Adding contact details of person
    public void addContacts(){
        System.out.print("Enter the first name : ");
        String firstName = scanner.nextLine();
        System.out.print("Enter the last name : ");
        String lastName = scanner.nextLine();
        System.out.print("Enter the address : ");
        String address = scanner.nextLine();
        System.out.print("Enter the city : ");
        String city = scanner.nextLine();
        System.out.print("Enter the state : ");
        String state = scanner.nextLine();
        System.out.print("Enter the Zip code : ");
        Long zipCode = scanner.nextLong();
        scanner.nextLine();
        System.out.print("Enter the phone number : ");
        Long phoneNumber = scanner.nextLong();
        scanner.nextLine();
        System.out.print("Enter the email ID : ");
        String email = scanner.nextLine();
        contactArrayList.add(new Contacts(firstName,lastName,address,city,state,zipCode,phoneNumber,email));
    }

    //Method to edit contact using first name
    public void editContact() {
        System.out.println("Enter the first name of person to edit contact");
        String editName = scanner.next();
        if (contactArrayList.isEmpty()){
            System.out.println("!!! Address Book Is Empty !!!");
        }else {
            for (int i = 0; i<contactArrayList.size(); i++){
                String matcher = contactArrayList.get(i).getFirstName();
                if (matcher.equalsIgnoreCase(editName)){
                    System.out.print("Enter the first name : ");
                    String firstName = scanner.next();
                    System.out.print("Enter the last name : ");
                    String lastName = scanner.next();
                    System.out.print("Enter the address : ");
                    String address = scanner.next();
                    System.out.print("Enter the city : ");
                    String city = scanner.next();
                    System.out.print("Enter the state : ");
                    String state = scanner.next();
                    System.out.print("Enter the zip code : ");
                    Long zipCode = scanner.nextLong();
                    scanner.nextLine();
                    System.out.print("Enter the mobile number : ");
                    Long phoneNum = scanner.nextLong();
                    scanner.nextLine();
                    System.out.print("Enter the email id : ");
                    String email = scanner.nextLine();
                    contactArrayList.get(i).setFirstName(firstName);
                    contactArrayList.get(i).setLastName(lastName);
                    contactArrayList.get(i).setAddress(address);
                    contactArrayList.get(i).setCity(city);
                    contactArrayList.get(i).setState(state);
                    contactArrayList.get(i).setZipCode(zipCode);
                    contactArrayList.get(i).setPhoneNumber(phoneNum);
                    contactArrayList.get(i).setZipCode(zipCode);
                    System.out.println("Contact Update");
                }
                else {
                    System.out.println("!!!...Name not found try again...!!!");
                }
            }
        }
    }

    //Method to delete contact using first name
    public void deleteContact() {
        System.out.println("Enter the first name of person for delete contact");
        String deleteName = scanner.next();
        if (contactArrayList.isEmpty()){
            System.out.println("!....The AddressBook is Empty....!");
        }else {
            for (int i = 0; i < contactArrayList.size(); i++){
                String matcher = contactArrayList.get(i).getFirstName();
                if (matcher.equalsIgnoreCase(deleteName)){
                    contactArrayList.remove(i);
                    System.out.println("Contact Deleted Successfully...");
                }else {
                    System.out.println("!!!...Name Not Found...!!!");
                }
            }
        }
    }

    public void showContact(){
        System.out.println("Number of contacts is stored in directory: " + contactArrayList.size());
        System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        if (contactArrayList.isEmpty()){
            System.out.println("There no contacts available for show...");
        }else {
            System.out.println("Sr No." + " First Name\t\t\tLast Name\t\t\tAddress\t\t\t\tCity\t\t\t\tZip Code\t\t\t\tMobile Number\t\t\t\t\tEmail Id ");

            for (int i = 0; i < contactArrayList.size(); i++) {
                System.out.print((i + 1) + "\t\t" +
                        contactArrayList.get(i).getFirstName() + "\t\t\t\t" +
                        contactArrayList.get(i).getLastName() +"\t\t\t\t"+
                        contactArrayList.get(i).getAddress() +"\t\t\t\t"+
                        contactArrayList.get(i).getCity() +"\t\t\t\t\t"+
                        contactArrayList.get(i).getZipCode() +"\t\t\t\t\t"+
                        contactArrayList.get(i).getPhoneNumber() +"\t\t\t\t\t"+
                        contactArrayList.get(i).getEmail());
                System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            }
        }
    }

    public void getMenu() {
        boolean exit = false;
        do{
            System.out.println("Choose option from below \n1. ADD CONTACTS \n2. EDIT CONTACTS \n3. DELETE CONTACTS \n4. VIEW CONTACTS \n5. EXIT");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option){
                case 1:
                    addContacts();
                    System.out.println("!!!...Contact added successfully...!!!");
                    break;
                case 2:
                    editContact();
                    System.out.println("!!!...Contact edited successfully...!!!");
                    break;
                case 3:
                    deleteContact();
                    break;
                case 4:
                    showContact();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.print("Please choose right option: ");
                    break;
            }
        }while(!exit);
    }
}


