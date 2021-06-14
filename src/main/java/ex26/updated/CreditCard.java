/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Harding
 */

// Main Class
// Updated Version According to Constraints added after the Assignment first started.

package ex26.updated;

import java.util.Scanner;

public class CreditCard {
  Scanner input = new Scanner(System.in);
  public static void main(String[] args) {
    CreditCard payment = new CreditCard();
    PaymentCalculator payCalc = new PaymentCalculator(payment.setBal(), payment.setApr(), payment.setMonthPay());
    int n = payCalc.calculateMonthsUntilPaidOff();
    System.out.printf("It will take you %d months to pay off this credit card%n.", n);
  }

  public double setBal() {
    System.out.print("What is your balance? ");
    while (true) {
      String temp = input.nextLine();
      try {
        Double.parseDouble(temp);
      }
      catch (NumberFormatException e) {
        System.out.println("ERROR: INVALID INPUT!");
        continue;
      }
      return Double.parseDouble(temp);
    }
  }

  public double setApr() {
    System.out.print("What is the APR on this card (%)? ");
    while (true) {
      String temp = input.nextLine();
      try {
        Double.parseDouble(temp);
      }
      catch (NumberFormatException e) {
        System.out.println("ERROR: INVALID INPUT!");
        continue;
      }
      return Double.parseDouble(temp);
    }
  }

  public double setMonthPay() {
    System.out.print("What is your monthly payment? ");
    while (true) {
      String temp = input.nextLine();
      try {
        Double.parseDouble(temp);
      }
      catch (NumberFormatException e) {
        System.out.println("ERROR: INVALID INPUT!");
        continue;
      }
      return Double.parseDouble(temp);
    }
  }
}
