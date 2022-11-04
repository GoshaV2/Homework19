package model;

import exception.WrongLoginException;
import exception.WrongPasswordException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    public static boolean checkForm(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if(checkLogin(login) && checkPassword(password,confirmPassword)){
            return true;
        }
        return false;
    }


    private static boolean checkLogin(String login) throws WrongLoginException {
        if(login!=null && login.length()>=1 && login.length()<=20 && login.matches("[a-zA-Z0-9\\_]+")){
            return true;
        }
        throw new WrongLoginException();
    }

    private static boolean checkPassword(String password,String confirmPassword) throws WrongPasswordException {
        if(password!=null && password.length()>=1 && password.length()<=20 && password.matches("[a-zA-Z0-9\\_]+")){
            if(password.equals(confirmPassword)){
                return true;
            }
            throw new WrongPasswordException("Пароли не совпадают!");
        }
        throw new WrongPasswordException("Неправильные символы в пароле!");
    }
}
