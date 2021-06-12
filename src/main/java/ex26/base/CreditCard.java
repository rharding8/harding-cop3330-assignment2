/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Harding
 */

package ex26.base;

import java.util.Scanner;

public class CreditCard {
  Scanner input = new Scanner(System.in);
  public static void main(String[] args) {
    CreditCard payment = new CreditCard();
    double b = payment.setBal();
    double apr = payment.setApr();
    double p = payment.setMonthPay();
    int n = payment.calculateMonthsUntilPaidOff(b, apr, p);
    System.out.printf("It will take you %d months to pay off this credit card%n.", n);
  }

  public double setBal() {
    System.out.print("What is your balance? ");
    return input.nextDouble();
  }

  public double setApr() {
    System.out.print("What is the APR on this card (%)? ");
    return input.nextDouble();
  }

  public double setMonthPay() {
    System.out.print("What is your monthly payment? ");
    return input.nextDouble();
  }

  public int calculateMonthsUntilPaidOff(double bal, double apr, double monthPay) {
    double i = (apr / 100) / 365;
    double n = -(1.0/30.0) * Math.log10(1 + bal / monthPay * (1 - Math.pow(1 + i, 30))) / Math.log10(1 + i);
    return (int) Math.ceil(n);
  }
}
