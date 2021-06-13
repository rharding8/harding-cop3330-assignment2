package ex38.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListCreatorTest {

  @Test
  void listString_test1() {
    ListCreator creator = new ListCreator();

    int[] original = {1, 3, 3, 9, 27};
    String expected = "1 3 3 9 27";

    assertEquals(expected, creator.listString(original));
  }

  @Test
  void listString_test2() {
    ListCreator creator = new ListCreator();

    int[] original = {};
    String expected = "";

    assertEquals(expected, creator.listString(original));
  }
}