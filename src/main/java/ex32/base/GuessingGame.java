/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Harding
 */

// Helper Class

package ex32.base;

import java.util.Scanner;

public class GuessingGame {
  Scanner input = new Scanner(System.in);
  private int difficulty;

  public GuessingGame(int difficulty) {
    this.difficulty = difficulty;
  }

  public void play() {
    int min = 1;
    int max = (int) Math.pow(10, difficulty);
    int count = 0;
    int guess;
    int myNum = (int) Math.floor(Math.random() * (max - min + 1) + min);
    String response;
    System.out.print("I have my number. What's your guess? ");
    while (true) {
      response = input.nextLine();
      count++;
      try {
        Integer.parseInt(response);
      }
      catch (NumberFormatException e) {
        System.out.print("Invalid Guess, try again! ");
        continue;
      }
      guess = Integer.parseInt(response);
      if (guess < myNum) {
        System.out.print("Too low, guess again: ");
      }
      else if (guess > myNum) {
        System.out.print("Too high, guess again: ");
      }
      else {
        break;
      }
    }
    System.out.println("You got it in " + count + " guesses!");
  }

}
