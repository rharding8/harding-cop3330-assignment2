/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Harding
 */

// Test for Helper Class "PaymentCalculator"
// Main Class "CreditCard" only has input/output methods.

package ex26.updated;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

  @Test
  void calculateMonthsUntilPaidOff_test1() {
    PaymentCalculator payCalc = new PaymentCalculator(5000,12,100);
    int actual = payCalc.calculateMonthsUntilPaidOff();

    assertEquals(70, actual);
  }

  @Test
  void calculateMonthsUntilPaidOff_test2() {
    PaymentCalculator payCalc = new PaymentCalculator(7000,8,250);
    int actual = payCalc.calculateMonthsUntilPaidOff();

    assertEquals(32, actual);
  }

  @Test
  void calculateMonthsUntilPaidOff_test3() {
    PaymentCalculator payCalc = new PaymentCalculator(15000,5,300);
    int actual = payCalc.calculateMonthsUntilPaidOff();

    assertEquals(57, actual);
  }
}