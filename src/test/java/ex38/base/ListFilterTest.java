package ex38.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListFilterTest {

  @Test
  void filterEvenNumbers_test1() {
    ListFilter filter = new ListFilter();
    int[] original = {2, 5, 8, 12, 13, 16, 23};
    int[] expected = {2, 8, 12, 16};
    int[] actual = filter.filterEvenNumbers(original);

    assertArrayEquals(expected, actual);
  }

  @Test
  void filterEvenNumbers_test2() {
    ListFilter filter = new ListFilter();
    int[] original = {2, 4, 8, 32};
    int[] expected = {2, 4, 8, 32};
    int[] actual = filter.filterEvenNumbers(original);

    assertArrayEquals(expected, actual);
  }

  @Test
  void filterEvenNumbers_test3() {
    ListFilter filter = new ListFilter();
    int[] original = {13, 21, 33, 45};
    int[] expected = {};
    int[] actual = filter.filterEvenNumbers(original);

    assertArrayEquals(expected, actual);
  }
}