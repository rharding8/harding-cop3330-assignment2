/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Harding
 */

// Test for the Methods included in Helper Class "PasswordValidator"

package ex25.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

  @Test
  void validatePw_strength1() {
    PasswordValidator pass = new PasswordValidator("2575");
    int strength = pass.validatePw();
    assertEquals(1, strength);
  }

  @Test
  void validatePw_strength2() {
    PasswordValidator pass = new PasswordValidator("abide");
    int strength = pass.validatePw();
    assertEquals(2, strength);
  }

  @Test
  void validatePw_strength3() {
    PasswordValidator pass = new PasswordValidator("abl3t0s3E");
    int strength = pass.validatePw();
    assertEquals(3, strength);
  }

  @Test
  void validatePw_strength4() {
    PasswordValidator pass = new PasswordValidator("abl3t0$3E!");
    int strength = pass.validatePw();
    assertEquals(4, strength);
  }
}