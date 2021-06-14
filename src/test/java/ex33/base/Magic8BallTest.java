/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Harding
 */

package ex33.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Magic8BallTest {
  @Test
  void shake_probability_count() {
    Magic8Ball ball = new Magic8Ball();
    int i;
    int[] counts = {0, 0, 0, 0};

    for (i = 0; i < 100; i++) {
      String n = ball.shake();
      switch (n) {
        case "Yes" -> counts[0]++;
        case "No" -> counts[1]++;
        case "Maybe" -> counts[2]++;
        case "Ask Again Later" -> counts[3]++;
        default -> System.out.println("PROGRAM CRASH!");
      }
    }

    assertEquals(25, counts[0], 15);
    assertEquals(25, counts[1], 15);
    assertEquals(25, counts[2], 15);
    assertEquals(25, counts[3], 15);
    assertEquals(100, counts[0] + counts[1] + counts[2] + counts[3]);
  }
}