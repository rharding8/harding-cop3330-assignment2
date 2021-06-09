package ex29.base;

import java.util.Scanner;

public class DoubleInvestment {
  Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    DoubleInvestment investment = new DoubleInvestment();
    double rate = investment.getRate();
    System.out.println(investment.getYears(rate));
  }

  public double getRate() {
    String n;
    while (true) {
      System.out.print("What is the rate of return? ");
      n = input.nextLine();
      try {
        Double.parseDouble(n);
      }
      catch (NumberFormatException e) {
        System.out.println("ERROR: Invalid input. Try Again!");
        continue;
      }
      if (Double.parseDouble(n) == 0) {
        System.out.println("DIVISION BY ZERO IS ILLEGAL. TRY AGAIN OR HAL-9000 WILL FIND YOU.");
        continue;
      }
      return Double.parseDouble(n);
    }
  }

  public String getYears(double rate) {
    double years = Math.ceil(72 / rate);
    return String.format("It will take %.0f years to double your initial investment.", years);
  }

}
