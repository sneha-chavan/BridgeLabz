package Regex.UserRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationImp implements UserRegistration{
	Scanner sc = new Scanner(System.in);
	@Override
	public void firstName() {
		// TODO Auto-generated method stub
		System.out.println("Enter First Name: ");
		String fName = sc.nextLine();
		Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,20}$");
		Matcher matcher = pattern.matcher(fName);
		if(matcher.matches()) {}
		else {
			System.out.printf("%s -> is not valid", fName);
		}
		
	}

	@Override
	public void lastName() {
		System.out.println("Enter Last Name: ");
		String lName = sc.nextLine();
		Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,20}$");
		Matcher matcher = pattern.matcher(lName);
		if(matcher.matches()) {}
		else {
			System.out.printf("%s -> is not valid", lName);
		}
		
		
	}

	@Override
	public void emailId() {
		System.out.println("Enter Email Id:");
		String email = sc.nextLine();
		Pattern pattern = Pattern.compile("^[a-zA-b0-9+_.-]+@[a-zA-Z0-9.-]+$");
		Matcher matcher = pattern.matcher(email);
		if(matcher.matches()) {}
		else {
			System.out.printf("%s -> is not valid", email);
		}
		
	}

	@Override
	public void mobileNo() {
		System.out.println("Enter your Mobile number");
		String mobile = sc.next();

		Pattern pattern = Pattern.compile("^(91){1}[0-9]{10}$");
		Matcher matcher = pattern.matcher(mobile);
		if (matcher.matches()) {
		} else {
			System.out.println("Given mobile number. is not valid");
		}
		
	}

	@Override
	public void password() {
		System.out.println("Enter your Mobile number");
		String pwd = sc.next();

		Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\\\S+$).{8, 20}$");
		Matcher matcher = pattern.matcher(pwd);
		if (matcher.matches()) {
		} else {
			System.out.println("Given mobile number. is not valid");
		}
		
	}

}
