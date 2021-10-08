package com.bz.regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public boolean checkPassword(String password){
        boolean check = Pattern.matches("[a-z]{8}", password);
        return check;
    }
}
