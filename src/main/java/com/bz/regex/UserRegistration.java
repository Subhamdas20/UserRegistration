package com.bz.regex;
import java.util.regex.*;

public class UserRegistration {

    public boolean emailCheck(String name){
        boolean check = Pattern.matches("([a-zA-Z0-9.-_]{3,})[a-zA-Z0-9.-_]*[@][a-zA-Z0-9.-_]*[a-zA-Z0-9.-_]{3,}[a-zA-Z0-9.-_]*",name);
        return check;
    }
}
