package ex26.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardTest {

  @Test
  void calculateMonthsUntilPaidOff_test1() {
    CreditCard card = new CreditCard();
    int actual = card.calculateMonthsUntilPaidOff(5000,12,100);

    assertEquals(70, actual);
  }

  @Test
  void calculateMonthsUntilPaidOff_test2() {
    CreditCard card = new CreditCard();
    int actual = card.calculateMonthsUntilPaidOff(7000,8,250);

    assertEquals(32, actual);
  }

  @Test
  void calculateMonthsUntilPaidOff_test3() {
    CreditCard card = new CreditCard();
    int actual = card.calculateMonthsUntilPaidOff(15000,5,300);

    assertEquals(57, actual);
  }
}