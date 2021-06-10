package ex32.challenge01;

import java.util.Scanner;

public class GuessingGame {
  Scanner input = new Scanner(System.in);
  private int difficulty;

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
    System.out.print("You got it in " + count + " guesses! ");
    switch (count) {
      case 1 -> System.out.println("You're a mind reader!");
      case 2, 3 -> System.out.println("Most impressive.");
      case 4, 5, 6 -> System.out.println("You can do better than that.");
      default -> System.out.println("Better luck next time.");
    }
  }

  public void setDifficulty(int difficulty) {
    this.difficulty = difficulty;
  }
}
