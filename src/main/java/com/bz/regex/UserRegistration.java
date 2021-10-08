package com.bz.regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public boolean emailCheck(String name){
        boolean check = Pattern.matches("([a-z]{3,})(.)([a-z]*)[@][a-z]{2}(.)([a-z]{2})(.)([in]*)",name);
        return check;
    }
}
