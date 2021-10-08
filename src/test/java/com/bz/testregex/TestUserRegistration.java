package com.bz.testregex;

import com.bz.regex.UserRegistration;
import org.junit.Assert;
import org.junit.Test;

public class TestUserRegistration {
    @Test
    public void givenAPatternWhenMatchedShouldReturnTrue(){
        UserRegistration user = new UserRegistration();
        boolean lastName = user.lastName("Das");
        Assert.assertTrue(lastName);
    }
}
