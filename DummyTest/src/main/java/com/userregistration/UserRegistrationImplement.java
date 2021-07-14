package com.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationImplement  implements  UserIRegistrationnterface{
    private static final String FIRST_NAME = "^[A-Z]{1}[a-z]{2,20}$";
    private static final String LAST_NAME = "^[A-Z]{1}[a-z]{2,20}$";
    private static final String EMAIL = "^[a-zA-b0-9+_.-]+@[a-zA-Z0-9.-]+$";
    private  static final String PASSWORD = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\\\S+$).{8, 20}$";

    private boolean returnResult(String input, String pattern){
        Pattern p = Pattern.compile(pattern);
        Matcher matcher = p.matcher(input);
        if(matcher.matches()) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public boolean firstNameValidate(String fName) {
        return returnResult(fName,FIRST_NAME);
    }

    @Override
    public boolean lastNameValidate(String lName) {
        return returnResult(lName,LAST_NAME);
    }

    @Override
    public boolean emailValidate(String email) {
        return returnResult(email,EMAIL);
    }
}
