/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Harding
 */

package ex31.base;

import java.util.Scanner;

public class HeartRate {
  Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    HeartRate heartCalc = new HeartRate();
    int age = heartCalc.getAge();
    int restRate = heartCalc.getRestingRate();
    heartCalc.printTable(age, restRate);
  }

  public int getAge() {
    System.out.print("What is your age? ");
    String n;
    while (true) {
      n = input.nextLine();
      try {
        Integer.parseInt(n);
      }
      catch (NumberFormatException e) {
        System.out.println("Ya need to enter a number, ya dummy!");
        continue;
      }
      return Integer.parseInt(n);
    }
  }

  public int getRestingRate() {
    System.out.print("What is your resting heart rate? ");
    String n;
    while (true) {
      n = input.nextLine();
      try {
        Integer.parseInt(n);
      }
      catch (NumberFormatException e) {
        System.out.println("Ya need to enter a number, I mean it this time!");
        continue;
      }
      return Integer.parseInt(n);
    }
  }

  public void printTable(int age, int rate) {
    System.out.printf("Resting Pulse: %d        Age: %d%n", rate, age);
    System.out.format("%-11s%-15s%n", "Intensity", "| Rate");
    System.out.println("---------------------");
    int i;
    for (i = 55; i < 100; i += 5) {
      System.out.format("%-11s%-11s%n", i + "%", "| " + getTargetRate(age, rate, i) +" bpm");
    }
  }

  public int getTargetRate(int age, int rate, int i) {
    double intensity = i / 100.0;
    return (int) Math.round((((220 - age) - rate) * intensity) + rate);
  }
}
