package com.java.day19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserDetailsValidation {

  static String regex;
  static Pattern p;
  static Matcher m;
  public static void isValidName(String name) {
    regex = "^[A-Z]{1}[a-z]{2,}$";
    p = Pattern.compile(regex);
    m = p.matcher(name);

    if (m.matches()) System.out.println("valid");
    else System.out.println("invalid");

  }

  public static void isValidEmail(String email) {
    regex = "^(\\w(.\\w)?){3,}[@][a-z]{2,5}[.][a-z]{2,3}(.[a-z]{2,3})?";
    p = Pattern.compile(regex);
    m = p.matcher(email);
    if (m.matches()) System.out.println("valid");
    else System.out.println("invalid");

  }

}
