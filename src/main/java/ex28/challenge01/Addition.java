/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Harding
 */

// This is the version rolling in the first challenge onto the base version of the program.

package ex28.challenge01;

import java.util.Scanner;

public class Addition {
  Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    Addition add = new Addition();
    int[] num = add.numbers(add.howMany());
    System.out.println("The total is: " + add.sum(num));
  }

  public int[] numbers(int n) {
    int[] num = new int[n];
    int i;
    for (i = 0; i < n; i++) {
      System.out.print("Enter a number: ");
      num[i] = input.nextInt();
    }
    return num;
  }

  public int howMany() {
    System.out.print("How many numbers would you like to add? ");
    String n = input.nextLine();
    try {
      Integer.parseInt(n);
    }
    catch (NumberFormatException e) {
      System.out.println("ERROR: INVALID INPUT DETECTED! SYSTEM WILL SELF-DETONATE IF YOU DO NOT ENTER A VALID INPUT!");
      return howMany();
    }
    return Integer.parseInt(n);
  }

  public int sum(int[] numbers) {
    int sum = 0;
    int i;
    for (i = 0; i < numbers.length; i++) {
      sum += numbers[i];
    }
    return sum;
  }
}
