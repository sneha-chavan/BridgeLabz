package com.userregistration;

public class UserRegistrationMain {
    public static void main(String[] args) {
        UserIRegistrationnterface ur = new UserRegistrationImplement();
        System.out.println(ur.firstNameValidate("Sneha"));
        System.out.println(ur.lastNameValidate("Chavan"));
        System.out.println(ur.emailValidate("sneha@gmail.com"));
    }
}
