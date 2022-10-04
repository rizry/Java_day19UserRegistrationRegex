package com.java.day19;

import java.util.Scanner;

public class Main {

  static Scanner SC = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.println("--Welcome to User Registration Problem--");
    checkFirstName();

  }

  public static void checkFirstName() {
    System.out.print("Enter first name: ");
    String fName = SC.next();
    UserDetailsValidation.isValidFirstName(fName);
  }

}
