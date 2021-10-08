package com.bz.testregex;

import com.bz.regex.UserRegistration;
import org.junit.Assert;
import org.junit.Test;

public class TestUserRegistration {
    @Test
    public void givenAEmailPatternWhenMatchedShouldReturnTrue(){
        UserRegistration user = new UserRegistration();
        boolean email = user.emailCheck("abc.xyz@bl.co.in");
        Assert.assertTrue(email);
    }
}
