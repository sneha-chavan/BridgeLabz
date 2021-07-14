package Regex.UserRegistration;

public class UserRegistrationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserRegistration newUser = new UserRegistrationImp();
		System.out.println(newUser.firstNameValidate("Sneha"));
		System.out.println(newUser.lastNameValidate("Chavan"));
		
	}

}
