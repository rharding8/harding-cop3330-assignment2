/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Harding
 */

// Test for Helper Class "PasswordGen"
// Main Class "PasswordApp" is only input/output.

package ex37.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PasswordGenTest {

  @Test
  void getPass_all_letters() {
    PasswordGen pwd = new PasswordGen(8, 0,0);
    int i;
    boolean flag = true;
    String pass = pwd.getPass();
    for (i = 0; i < pass.length(); i++) {
      if (!Character.isLetter(pass.charAt(i))) {
        flag = false;
        break;
      }
    }
    assertTrue(flag);
  }

  @Test
  void getPass_all_letters_and_numbers() {
    PasswordGen pwd = new PasswordGen(8, 0,2);
    int i;
    boolean flag = true;
    String pass = pwd.getPass();
    for (i = 0; i < pass.length(); i++) {
      if (!Character.isLetterOrDigit(pass.charAt(i))) {
        flag = false;
        break;
      }
    }
    assertTrue(flag);
  }

  @Test
  void getPass_ensure_more_letters() {
    PasswordGen pwd = new PasswordGen(8, 2,3);
    int i;
    int letCount = 0;
    String pass = pwd.getPass();
    for (i = 0; i < pass.length(); i++) {
      if (Character.isLetter(pass.charAt(i))) {
        letCount++;
      }
    }
    assertTrue(letCount >= 5);
  }

  @Test
  void getPass_ensure_random() {
    PasswordGen pwd = new PasswordGen(8, 1,2);

    String pass1 = pwd.getPass();
    String pass2 = pwd.getPass();

    assertNotEquals(pass1, pass2);
  }

  @Test
  void getString_basis() {
    PasswordGen pwd = new PasswordGen(0, 0, 0);
    String expected = "Testing, Testing, Testing";
    ArrayList<Character> charList = new ArrayList<>();
    int i;
    for (i = 0; i < expected.length(); i++) {
      charList.add(expected.charAt(i));
    }
    String actual = pwd.getString(charList);
    assertEquals(expected, actual);
  }
}