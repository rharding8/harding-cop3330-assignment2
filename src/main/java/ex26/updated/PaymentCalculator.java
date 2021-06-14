/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Harding
 */

// Helper Class
// Updated Version According to Constraints added after the Assignment first started.

package ex26.updated;

@SuppressWarnings("ClassCanBeRecord")
public class PaymentCalculator {
  private final double balance;
  private final double apr;
  private final double monthlyPay;

  public PaymentCalculator(double balance, double apr, double monthlyPay) {
    this.balance = balance;
    this.apr = apr;
    this.monthlyPay = monthlyPay;
  }

  public int calculateMonthsUntilPaidOff() {
    double i = (apr / 100) / 365;
    double n = -(1.0/30.0) * Math.log10(1 + balance / monthlyPay * (1 - Math.pow(1 + i, 30))) / Math.log10(1 + i);
    return (int) Math.ceil(n);
  }
}
