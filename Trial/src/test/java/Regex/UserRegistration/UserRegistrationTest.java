package Regex.UserRegistration;

import org.junit.Test;

import junit.framework.Assert;

public class UserRegistrationTest {
	UserRegistration userRegistration = new UserRegistrationImp();
	
	@Test
	public void givenFirstName_WhenFirstLetterUpperCase_ReturnTrue() {
		 Assert.assertTrue(userRegistration.firstNameValidate("Sneha"));
	}
	
	@Test
	public void givenFirstName_WhenAnyLetterUpperCase_ReturnFalse() {
		 Assert.assertFalse(userRegistration.firstNameValidate("sNeha"));
	}

	@Test
	public void givenLastName_WhenFirstUpperCase_ReturnTrue() {
		 Assert.assertTrue(userRegistration.lastNameValidate("Chavan"));
	}
	
	@Test
	public void giveLastName_WhenAnyLetterUpperCase_ReturnFalse() {
		 Assert.assertFalse(userRegistration.lastNameValidate("chYavhs"));
	}
	
	@Test
	public void givenEmailId_Proper_ReturnTrue() {
		Assert.assertTrue(userRegistration.emailValidate("sneha-chavan98@email.com"));
	}
	
	@Test
	public void givenEmailId_Incorrect_ReturnFalse() {
		Assert.assertFalse(userRegistration.emailValidate("sneha@chavan.h@email.com"));
	}
}
