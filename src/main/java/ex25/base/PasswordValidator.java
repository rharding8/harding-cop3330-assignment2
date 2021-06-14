/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Harding
 */

// Helper Class

package ex25.base;

@SuppressWarnings("ClassCanBeRecord")
public class PasswordValidator {
  private final String pw;

  public PasswordValidator(String pw) {
    this.pw = pw;
  }

  public int validatePw() {
    int i;
    int strength = 0;

    for (i = 0; i < pw.length(); i++) {
      if (Character.isDigit(pw.charAt(i))) {
        strength = 1;
        break;
      }
    }
    for (i = 0; i < pw.length(); i++) {
      if (Character.isLetter(pw.charAt(i))) {
        strength = 2;
        break;
      }
    }
    for (i = 0; i < pw.length(); i++) {
      if (!Character.isLetterOrDigit(pw.charAt(i))) {
        strength++;
        break;
      }
    }
    if (pw.length() >= 8) {
      strength++;
    }

    return strength;
  }
}
