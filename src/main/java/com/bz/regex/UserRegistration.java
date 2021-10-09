package com.bz.regex;
import java.util.regex.*;

public class UserRegistration {

    public boolean checkPassword(String password){
        boolean check = Pattern.matches("^(?=.*[A-Z])(?=.*[0-9])[A-Za-z0-9]{8,}$", password);
        return check;
    }
}
