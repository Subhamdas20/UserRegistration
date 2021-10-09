package com.bz.regex;
import java.util.regex.*;

public class UserRegistration {

    public boolean checkPassword(String password){
        boolean check = Pattern.matches("^(?=.*[A-Z])[A-Za-z]{8,}$", password);
        return check;
    }
}
