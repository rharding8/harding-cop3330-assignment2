/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Harding
 */

// Main Class

package ex25.base;

import java.util.Scanner;

public class PasswordStrength {
  static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    String pw = enterPw();
    PasswordValidator pVal = new PasswordValidator(pw);
    System.out.println(getStrength(pVal.validatePw(), pw));
  }

  public static String enterPw() {
    System.out.print("Enter the password you wish to evaluate: ");
    return input.next();
  }

  public static String getStrength(int level, String pw) {
    String output = "The password '" + pw + "' is a ";
    switch (level) {
      case 0 -> output += "Impossibly Stupid ";
      case 1 -> output += "very weak ";
      case 2 -> output += "weak ";
      case 3 -> output += "strong ";
      default -> output += "very strong ";
    }
    output += "password.";
    return output;
  }
}
