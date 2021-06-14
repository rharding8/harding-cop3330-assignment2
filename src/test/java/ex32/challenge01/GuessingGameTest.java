/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Harding
 */

// Test for Helper Class "GuessingGame"
// GuessingApp is only the Input/Output interface for this class, all testable methods are included.

package ex32.challenge01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessingGameTest {

  @Test
  void checkNumber_too_small() {
    GuessingGame game = new GuessingGame(2);

    assertTrue(game.checkNumber(54, 25));
  }

  @Test
  void checkNumber_too_large() {
    GuessingGame game = new GuessingGame(2);

    assertTrue(game.checkNumber(54, 75));
  }

  @Test
  void checkNumber_correct_guess() {
    GuessingGame game = new GuessingGame(2);

    assertFalse(game.checkNumber(54, 54));
  }

  @Test
  void message_mind_reader() {
    GuessingGame game = new GuessingGame(2);
    String expected = "You got it in 1 guess! You're a mind reader!";
    String actual = game.message(1);
    assertEquals(expected, actual);
  }

  @Test
  void message_impressive2() {
    GuessingGame game = new GuessingGame(2);
    String expected = "You got it in 2 guesses! Most impressive.";
    String actual = game.message(2);
    assertEquals(expected, actual);
  }

  @Test
  void message_impressive3() {
    GuessingGame game = new GuessingGame(2);
    String expected = "You got it in 3 guesses! Most impressive.";
    String actual = game.message(3);
    assertEquals(expected, actual);
  }

  @Test
  void message_better4() {
    GuessingGame game = new GuessingGame(2);
    String expected = "You got it in 4 guesses! You can do better than that.";
    String actual = game.message(4);
    assertEquals(expected, actual);
  }

  @Test
  void message_better5() {
    GuessingGame game = new GuessingGame(2);
    String expected = "You got it in 5 guesses! You can do better than that.";
    String actual = game.message(5);
    assertEquals(expected, actual);
  }

  @Test
  void message_better6() {
    GuessingGame game = new GuessingGame(2);
    String expected = "You got it in 6 guesses! You can do better than that.";
    String actual = game.message(6);
    assertEquals(expected, actual);
  }

  @Test
  void message_luck() {
    GuessingGame game = new GuessingGame(2);
    String expected = "You got it in 9 guesses! Better luck next time.";
    String actual = game.message(9);
    assertEquals(expected, actual);
  }
}