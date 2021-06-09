/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Harding
 */

// This is just the base (Constraints only) version of the program.

package ex28.base;

import java.util.Scanner;

public class Addition {
  Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    Addition add = new Addition();
    System.out.println("The total is: " + add.sum(5));
  }

  public int sum(int n) {
    int sum = 0;
    int i;
    for (i = 0; i < n; i++) {
      System.out.print("Enter a number: ");
      sum += input.nextInt();
    }
    return sum;
  }
}
