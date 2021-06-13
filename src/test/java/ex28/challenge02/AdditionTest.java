package ex28.challenge02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {

  @Test
  void sum_with_five_numbers() {
    Addition add = new Addition();

    int[] numbers = {3, 6, 17, 4, 6};
    int actual = add.sum(numbers);

    assertEquals(36, actual);
  }

  @Test
  void sum_with_ten_numbers() {
    Addition add = new Addition();

    int[] numbers = {3, 6, 17, 4, 6, 23, 7, 19, 11, 4};
    int actual = add.sum(numbers);

    assertEquals(100, actual);
  }

  @Test
  void sum_using_hundred_factorial() {
    Addition add = new Addition();

    int[] numbers = new int[100];
    int i;
    for (i = 0; i < 100; i++) {
      numbers[i] = i + 1;
    }
    int actual = add.sum(numbers);

    assertEquals(5050, actual);
  }
}