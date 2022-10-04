package com.java.day19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserDetailsValidation {

  static String regex;

  public static String isValidName(String name) {
    regex = "^[A-Z]{1}[a-z]{2,}$";
    if (validate(regex, name)) return "valid";
    else return "invalid";
  }

  public static String isValidEmail(String email) {
    regex = "^[a-zA-Z]+[\\w]*([.|\\-|+][a-zA-Z0-9]+)*@[\\w]{1,5}[.][a-z]{2,3}(.[a-z]{2,3})?$";
    if (validate(regex, email)) return "valid";
    else return "invalid";
  }

  public static String isValidPhoneNumber(String phNum) {
    regex = "^[0-9]{1,3}(-[0-9]{1,3})?\\s{0,3}[6-9]{1}[0-9]{9}$";
    if (validate(regex, phNum)) return "valid";
    else return "invalid";
  }

  public static String isValidPassword(String pass) {
    regex = "^(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*])[A-Za-z0-9!@#$%^&*]{8,}$";
    if (validate(regex, pass)) return "valid";
    else return "invalid";
  }

  private static boolean validate(String regex, String pattern) {
    Pattern p = Pattern.compile(regex);
    Matcher m = p.matcher(pattern);
    return m.matches();
  }

}
