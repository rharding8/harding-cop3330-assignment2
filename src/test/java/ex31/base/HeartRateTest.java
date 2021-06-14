/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Harding
 */

package ex31.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeartRateTest {

  @Test
  void getTargetRate_young_adult() {
    HeartRate heart = new HeartRate();

    int actual = heart.getTargetRate(20, 75, 60);

    assertEquals(150, actual);
  }

  @Test
  void getTargetRate_middle_aged() {
    HeartRate heart = new HeartRate();

    int actual = heart.getTargetRate(55, 64, 80);

    assertEquals(145, actual);
  }

  @Test
  void getTargetRate_old() {
    HeartRate heart = new HeartRate();

    int actual = heart.getTargetRate(93, 60, 55);

    assertEquals(97, actual);
  }
}