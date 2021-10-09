package com.bz.testregex;

import com.bz.regex.UserRegistration;
import org.junit.Assert;
import org.junit.Test;

public class TestUserRegistration {
    @Test
    public void givenAPasswordPatternWhenMatchedShouldReturnTrue(){
        UserRegistration user = new UserRegistration();
        boolean password = user.checkPassword("Xxxxxxx9");
        Assert.assertTrue(password);
    }
}
