package com.java.day19;

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

  }

  public static void checkFirstName() {
    System.out.print("Enter first name: ");
    String fName = SC.next();
    UserDetailsValidation.isValidName(fName);
  }

  public static void checkLastName() {
    System.out.print("Enter last name: ");
    String lName = SC.next();
    UserDetailsValidation.isValidName(lName);
  }

  public static void checkEmail() {
    System.out.print("Enter an email: ");
    String email = SC.next();
    UserDetailsValidation.isValidEmail(email);
  }

  public static void checkPhoneNumber() {
    System.out.print("Enter a phone number: ");
    SC.nextLine();
    String phNum = SC.nextLine();
    UserDetailsValidation.isValidPhoneNumber(phNum);
  }

  public static void checkPassword() {
    System.out.print("Enter password: ");
    String password = SC.next();
    UserDetailsValidation.isValidPassword(password);
  }
}
