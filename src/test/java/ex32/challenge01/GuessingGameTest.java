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
  void message() {
    // Come Back To This!!
  }
}