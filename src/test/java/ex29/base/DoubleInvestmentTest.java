/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Harding
 */

package ex29.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleInvestmentTest {

  @Test
  void getYears_divisible() {
    DoubleInvestment invest = new DoubleInvestment();

    String actual = invest.getYears(36);

    assertEquals("It will take 2 years to double your initial investment.", actual);
  }

  @Test
  void getYears_not_divisible() {
    DoubleInvestment invest = new DoubleInvestment();

    String actual = invest.getYears(13);

    assertEquals("It will take 6 years to double your initial investment.", actual);
  }
}