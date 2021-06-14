/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Harding
 */

package ex35.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LotteryTest {

  @Test
  void getWinner_probabilities() {
    Lottery lotto = new Lottery();
    lotto.contestants.add("Bruce");
    lotto.contestants.add("Clark");
    lotto.contestants.add("Diana");
    lotto.contestants.add("Barry");
    lotto.contestants.add("Arthur");
    lotto.contestants.add("Victor");
    int[] counts = {0, 0, 0, 0, 0, 0};
    int i;
    for (i = 0; i < 100; i++) {
      String win = lotto.getWinner();
      switch (win) {
        case "Bruce" -> counts[0]++;
        case "Clark" -> counts[1]++;
        case "Diana" -> counts[2]++;
        case "Barry" -> counts[3]++;
        case "Arthur" -> counts[4]++;
        case "Victor" -> counts[5]++;
        default -> {
          System.out.println("PROGRAM CRASH!");
          return;
        }
      }
    }
    assertEquals(17, counts[0], 10);
    assertEquals(17, counts[1], 10);
    assertEquals(17, counts[2], 10);
    assertEquals(17, counts[3], 10);
    assertEquals(17, counts[4], 10);
    assertEquals(17, counts[5], 10);
  }
}