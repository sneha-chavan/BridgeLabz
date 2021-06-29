package oops;

public class AddressBook {
	private static String firstName;
	private static String lastName;
	private static String address;
	private static String city;
	private static String state;
	private static int zip;
	private static int phoneNumber;
	
	public static void AddressBook(String fn, String ln, String add, String c, String s, int z, int pn) {
		firstName= fn;
		lastName = ln;
		address = add;
		city = c;
		state = s;
		zip = z;
		phoneNumber = pn;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Address Book Program with Object Oriented Concept");
	}

}
