package com.java.day19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserDetailsValidation {

  static String regex;

  public static void isValidName(String name) {
    regex = "^[A-Z]{1}[a-z]{2,}$";
    if (validate(regex, name)) System.out.println("valid");
    else System.out.println("invalid");
  }

  public static void isValidEmail(String email) {
    regex = "^(\\w(.\\w)?){3,}[@][a-z]{2,5}[.][a-z]{2,3}(.[a-z]{2,3})?";
    if (validate(regex, email)) System.out.println("valid");
    else System.out.println("invalid");
  }

  public static void isValidPhoneNumber(String phNum) {
    regex = "^[0-9]{1,3}(-[0-9]{1,3})?\\s{0,3}[6-9]{1}[0-9]{9}$";
    if (validate(regex, phNum)) System.out.println("valid");
    else System.out.println("invalid");
  }

  public static void isValidPassword(String pass) {
    regex = "^(?=.*[A-Z])\\w{8,}$";
    if (validate(regex, pass)) System.out.println("valid");
    else System.out.println("invalid");
  }

  private static boolean validate(String regex, String pattern) {
    Pattern p = Pattern.compile(regex);
    Matcher m = p.matcher(pattern);
    return m.matches();
  }

}
