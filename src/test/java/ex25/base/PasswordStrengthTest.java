/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Harding
 */

// Test for Methods included in Main Class "PasswordStrength"

package ex25.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordStrengthTest {

  @Test
  void getStrength_noPwd() {
    String pw = "";
    PasswordValidator pass = new PasswordValidator(pw);
    PasswordStrength strength = new PasswordStrength();
    int level = pass.validatePw();
    String actual = strength.getStrength(level, pw);

    assertEquals("The password '' is a Ridiculously Stupid password.", actual);
  }

  @Test
  void getStrength_veryWeakPwd() {
    String pw = "1234";
    PasswordValidator pass = new PasswordValidator(pw);
    PasswordStrength strength = new PasswordStrength();
    int level = pass.validatePw();
    String actual = strength.getStrength(level, pw);

    assertEquals("The password '1234' is a very weak password.", actual);
  }

  @Test
  void getStrength_weakPwd() {
    String pw = "abide";
    PasswordValidator pass = new PasswordValidator(pw);
    PasswordStrength strength = new PasswordStrength();
    int level = pass.validatePw();
    String actual = strength.getStrength(level, pw);

    assertEquals("The password 'abide' is a weak password.", actual);
  }

  @Test
  void getStrength_strongPwd() {
    String pw = "ab1de739";
    PasswordValidator pass = new PasswordValidator(pw);
    PasswordStrength strength = new PasswordStrength();
    int level = pass.validatePw();
    String actual = strength.getStrength(level, pw);

    assertEquals("The password 'ab1de739' is a strong password.", actual);
  }

  @Test
  void getStrength_veryStrongPwd() {
    String pw = "ab1de739$!";
    PasswordValidator pass = new PasswordValidator(pw);
    PasswordStrength strength = new PasswordStrength();
    int level = pass.validatePw();
    String actual = strength.getStrength(level, pw);

    assertEquals("The password 'ab1de739$!' is a very strong password.", actual);
  }
}