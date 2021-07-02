package oops;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBook {
	static Scanner sc = new Scanner(System.in);
	ArrayList<Contact> contact;
	
	public AddressBook() {
		contact = new ArrayList<>();
	}
	
	
	
	private void addContact(String firstName, String lastName, String address, String city, String state, int zip,
			int phoneNumber) {
		contact.add(new Contact(firstName,lastName,address,city,state,zip,phoneNumber));
	}
	
	private void addMultipleContacts() {
		String more;
		do {
			System.out.println("First Name: ");
			String fName=sc.nextLine();
			System.out.println("Last Name: ");
			String lName=sc.nextLine();
			System.out.println("Address: ");
			String address=sc.nextLine();
			System.out.println("City: ");
			String city=sc.nextLine();
			System.out.println("State: ");
			String state=sc.nextLine();
			System.out.println("zip: ");
			int zip=sc.nextInt();
			System.out.println("6 digit phone number: ");
			int PhNo=sc.nextInt();
			
			addContact(fName, lName, address, city, state, zip, PhNo);
			
			System.out.println("add one more? Y or N: ");
			more=sc.nextLine();
			if (more == "NO" || more == "N") {
				break;
			}
		}while(more == "Y" || more == "YES");
		
	}
	
	private void displayContacts() {
		for (int i = 0; i < contact.size(); i++) {
			
			System.out.println(i+1+")\t"+ contact.get(i).getFirstName()+"\t"+contact.get(i).getLastName()+"\t"+
					contact.get(i).getAddress()+"\t"+contact.get(i).getCity()+"\t"+contact.get(i).getState()+"\t"+
					contact.get(i).getZip()+"\t"+contact.get(i).getPhoneNumber());		}
		
	}
	
		
	private void deleteContact() {
		System.out.println("Enter your First name:");
		String fname = sc.next();
		
		Iterator<Contact> iterator = contact.listIterator();
		
		while (iterator.hasNext()) {
			Contact person = iterator.next();
			if (fname.equals(person.getFirstName())) {
				contact.remove(person);
			}
		}
	}
	
	private void editContact() {
		System.out.println("Enter your First name:");
		String fname = sc.next();

		Iterator<Contact> iterator = contact.listIterator();
		while (iterator.hasNext()) {
			Contact person = iterator.next();

			if (fname.equals(person.getFirstName())) {
				System.out.println("Choose field you want to add:");
				System.out.println("1.Last Name\t2.Phone Number ");
				switch (sc.nextInt()) {
				case 1:
					System.out.println("Re-Correct your lastname");
					person.setLastName(sc.next());
					break;
				case 2:
					System.out.println("Re-Correct your Phone Number");
					person.setPhoneNumber(sc.nextInt());
					break;
				}
			}
		}	
		displayContact(fname);
	}
	
	private void displayContact(String name) {
		Iterator<Contact> iterator = contact.listIterator();
		while (iterator.hasNext()) {
			Contact person = iterator.next();

			if (name.equals(person.getFirstName())) {
				System.out.println("updated contact ");
				System.out.println(person.getFirstName()+"\t"+person.getLastName()+"\t"+person.getPhoneNumber()+"\t"+person.getCity());
			}
		}
	}


	public static void main(String[] args) {
		AddressBook addressBook = new AddressBook();
		addressBook.addContact("Sneha", "Chavan", "Ghatkopar", "Mumbai", "Maharashtra", 400084, 986767);
		addressBook.addContact("Jagruti", "Khichi", "Lalbaugh", "Mumbai", "Maharashtra", 400001, 8451829);
		addressBook.displayContacts();
		System.out.println("Choose field you want to do:");
		System.out.println("1.Edit \t2.Delete \t3.Add Multiple Contacts \t4.Exit ");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			addressBook.editContact();
			break;
		case 2:
			addressBook.deleteContact();
		case 3:
			addressBook.addMultipleContacts();
		default:
			break;
		}
		
	}

}
