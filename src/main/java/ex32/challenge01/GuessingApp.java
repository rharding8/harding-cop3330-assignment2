/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Harding
 */

// Main Class
// In Addition to challenge01, this version of the program is also more easily testable, so it is the basis for
// The Test Cases

package ex32.challenge01;

import java.util.Scanner;

public class GuessingApp {
  Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Let's play Guess the Number!");
    GuessingApp app = new GuessingApp();
    boolean flag = true;
    while (flag) {
      GuessingGame game = new GuessingGame(app.getDiff());
      game.play();
      flag = app.playAgain();
    }
  }

  public int getDiff() {
    String n;
    while (true) {
      System.out.print("Enter the Difficulty Level (1, 2, or 3): ");
      n = input.nextLine();
      try {
        Integer.parseInt(n);
      }
      catch (NumberFormatException e) {
        System.out.println("INVALID DIFFICULTY!");
        continue;
      }
      if (Integer.parseInt(n) < 1 || Integer.parseInt(n) > 3) {
        System.out.println("TOO HIGH OR TOO LOW! TRY AGAIN");
        continue;
      }
      return Integer.parseInt(n);
    }
  }

  public boolean playAgain() {
    while (true) {
      System.out.print("Do you wish to play again (Y/N)? ");
      String n = input.nextLine();
      if (n.equalsIgnoreCase("y")) {
        return true;
      }
      else if (n.equalsIgnoreCase("n")) {
        return false;
      }
      else {
        System.out.println("Sorry, didn't catch that, can you try again?");
      }
    }
  }
}
