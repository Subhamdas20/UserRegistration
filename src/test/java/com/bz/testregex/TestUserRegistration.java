package com.bz.testregex;

import com.bz.regex.UserRegistration;
import org.junit.Assert;
import org.junit.Test;

public class TestUserRegistration {
    @Test
    public void givenAEmailPatternWhenMatchedShouldReturnTrue(){
        UserRegistration user = new UserRegistration();
        boolean number = user.numberCheck("91 7003321213");
        Assert.assertTrue(number);
    }
}
