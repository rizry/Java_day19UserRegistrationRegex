package com.java.day19;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  static Scanner SC = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.println("--Welcome to User Registration Problem--");
    checkFirstName();
    checkLastName();
    checkEmail();
    checkPhoneNumber();
    checkPassword();
    testValidEmails();

  }

  public static void checkFirstName() {
    System.out.print("Enter first name: ");
    String fName = SC.next();
    System.out.println(UserDetailsValidation.isValidName(fName));
  }

  public static void checkLastName() {
    System.out.print("Enter last name: ");
    String lName = SC.next();
    System.out.println(UserDetailsValidation.isValidName(lName));
  }

  public static void checkEmail() {
    System.out.print("Enter an email: ");
    String email = SC.next();
    System.out.println(UserDetailsValidation.isValidEmail(email));
  }

  public static void checkPhoneNumber() {
    System.out.print("Enter a phone number: ");
    SC.nextLine();
    String phNum = SC.nextLine();
    System.out.println(UserDetailsValidation.isValidPhoneNumber(phNum));
  }

  public static void checkPassword() {
    System.out.print("Enter password: ");
    String password = SC.next();
    System.out.println(UserDetailsValidation.isValidPassword(password));
  }

  public static void testValidEmails() {
    ArrayList<String> emails = new ArrayList<>();
    // Valid emails
    emails.add("abc@yahoo.com");
    emails.add("abc-100@yahoo.com");
    emails.add("abc.100@yahoo.com");
    emails.add("abc111@abc.com");
    emails.add("abc-100@abc.net");
    emails.add("abc.100@abc.com.au");
    emails.add("abc@1.com");
    emails.add("abc@gmail.com.com");
    emails.add("abc+100@gmail.com");

    // Invalid emails
    emails.add("\n");
    emails.add("abc");
    emails.add("abc@.com.my");
    emails.add("abc123@gmail.a");
    emails.add("abc123@.com");
    emails.add("abc123@.com.com");
    emails.add(".abc@abc.com");
    emails.add("abc()*@gmail.com");
    emails.add("abc@%*.com");
    emails.add("abc..2002@gmail.com");
    emails.add("abc.@gmail.com");
    emails.add("abc@abc@gmail.com");
    emails.add("abc@gmail.com.1a");
    emails.add("abc@gmail.com.aa.au");

    for (String email : emails) {
      System.out.println(email + " : " + UserDetailsValidation.isValidEmail(email));
    }
  }

}
