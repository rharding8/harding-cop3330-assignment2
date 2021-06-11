package ex24.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramCheckerTest {

  @Test
  void isAnagram_true_for_same_word() {
    // Given:
    AnagramChecker checker = new AnagramChecker();

    // When:
    boolean actual = checker.isAnagram("Note", "Note");

    // Then:
    assertTrue(actual);
  }

  @Test
  void isAnagram_true_for_anagrams() {
    // Given:
    AnagramChecker checker = new AnagramChecker();

    // When:
    boolean actual = checker.isAnagram("Note", "tOne");

    // Then:
    assertTrue(actual);
  }

  @Test
  void isAnagram_true_for__long_anagrams() {
    // Given:
    AnagramChecker checker = new AnagramChecker();

    // When:
    boolean actual = checker.isAnagram("Tom Marvolo Riddle", "I Am Lord Voldemort");

    // Then:
    assertTrue(actual);
  }

  @Test
  void isAnagram_false_for_non_anagrams() {
    // Given:
    AnagramChecker checker = new AnagramChecker();

    // When:
    boolean actual = checker.isAnagram("Note", "Suit");

    // Then:
    assertFalse(actual);
  }

  @Test
  void isAnagram_false_different_length() {
    // Given:
    AnagramChecker checker = new AnagramChecker();

    // When:
    boolean actual = checker.isAnagram("Note", "eNote");

    // Then:
    assertFalse(actual);
  }

  @Test
  void isAnagram_false_for_non_anagrams_with_same_letters() {
    // Given:
    AnagramChecker checker = new AnagramChecker();

    // When:
    boolean actual = checker.isAnagram("metallica", "metalicaa");

    // Then:
    assertFalse(actual);
  }

  @Test
  void result_does_not_contain_not_for_anagrams() {
    // Given:
    AnagramChecker checker = new AnagramChecker();

    // When:
    String actual = checker.result("Acer", "Acre");
    String expected = "\"Acer\" and \"Acre\" are anagrams.";

    // Then:
    assertEquals(expected, actual);
  }

  @Test
  void result_does_contain_not_for_non_anagrams() {
    // Given:
    AnagramChecker checker = new AnagramChecker();

    // When:
    String actual = checker.result("Acer", "Ankle");
    String expected = "\"Acer\" and \"Ankle\" are not anagrams.";

    // Then:
    assertEquals(expected, actual);
  }

  @Test
  void result_true_for_multi_word() {
    // Given:
    AnagramChecker checker = new AnagramChecker();

    // When:
    String actual = checker.result("Race Car", "Car Race");
    String expected = "\"Race Car\" and \"Car Race\" are anagrams.";

    // Then:
    assertEquals(expected, actual);
  }

  @Test
  void result_not_true_for_multi_word() {
    // Given:
    AnagramChecker checker = new AnagramChecker();

    // When:
    String actual = checker.result("Justice League", "Justice Society");
    String expected = "\"Justice League\" and \"Justice Society\" are not anagrams.";

    // Then:
    assertEquals(expected, actual);
  }
}