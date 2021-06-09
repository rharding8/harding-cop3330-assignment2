/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Harding
 */

// This is version rolling BOTH challenges into the program, using challenge01 as a base.
// As such, this is the final iteration of the program.

package ex28.challenge02;

import java.util.Scanner;

public class Addition {
  Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    Addition add = new Addition();
    System.out.println("The total is: " + add.sum(add.howMany()));
  }

  public int sum(int n) {
    int sum = 0;
    String temp;
    int i;
    for (i = 0; i < n; i++) {
      System.out.print("Enter a number: ");
      temp = input.nextLine();
      try {
        Integer.parseInt(temp);
      }
      catch (NumberFormatException e) {
        continue;
      }
      sum += Integer.parseInt(temp);
    }
    return sum;
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
}
