package com.bz.testregex;

import com.bz.regex.UserRegistration;
import org.junit.Assert;
import org.junit.Test;

public class TestUserRegistration {
    @Test
    public void givenAEmailPatternWhenMatchedShouldReturnTrue(){
        UserRegistration user = new UserRegistration();
        boolean email = user.emailCheck("abc.zxy@yahoo.com.in");
        Assert.assertTrue(email);
    }
    @Test
    public void givenAEmailPatternWhenMatchedShouldReturnTrue2(){
        UserRegistration user = new UserRegistration();
        boolean email = user.emailCheck("abc-100@yahoo.com");
        Assert.assertTrue(email);
    }
    @Test
    public void givenAEmailPatternWhenMatchedShouldReturnTrue3(){
        UserRegistration user = new UserRegistration();
        boolean email = user.emailCheck("abc.100@yahoo.com");
        Assert.assertTrue(email);
    }
    @Test
    public void givenAEmailPatternWhenMatchedShouldReturnTrue4(){
        UserRegistration user = new UserRegistration();
        boolean email = user.emailCheck("abc111@abc.com");
        Assert.assertTrue(email);
    }
    @Test
    public void givenAEmailPatternWhenMatchedShouldReturnTrue5(){
        UserRegistration user = new UserRegistration();
        boolean email = user.emailCheck("abc-100@yahoo.net");
        Assert.assertTrue(email);
    }
    @Test
    public void givenAEmailPatternWhenMatchedShouldReturnTrue6(){
        UserRegistration user = new UserRegistration();
        boolean email = user.emailCheck("abc.100@abc.com.au");
        Assert.assertTrue(email);
    }
    @Test
    public void givenAEmailPatternWhenMatchedShouldReturnTrue7(){
        UserRegistration user = new UserRegistration();
        boolean email = user.emailCheck("abc@gmail.com.com");
        Assert.assertTrue(email);
    }

}
