package Regex.UserRegistration;

public interface UserRegistration {
	public boolean firstNameValidate(String fName);
    public boolean lastNameValidate(String lName);
    public boolean emailValidate(String email);
	public boolean  mobileNo(String number);
	public boolean  password(String pwd);

}
