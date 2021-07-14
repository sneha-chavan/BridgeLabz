package UserRegistration;

import com.userregistration.UserIRegistrationnterface;
import com.userregistration.UserRegistrationImplement;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserIRegistrationnterface userReg = new UserRegistrationImplement();
    @Test
    public void validFirstName_whenFirstUpperCase_returnTrue(){
        Assert.assertTrue(userReg.firstNameValidate("Sneha"));
    }
}
