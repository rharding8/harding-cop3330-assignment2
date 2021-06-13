package ex32.challenge01;

import java.util.Scanner;

public class GuessingGame {
  Scanner input = new Scanner(System.in);
  private final int difficulty;

  public GuessingGame(int difficulty) {
    this.difficulty = difficulty;
  }

  public void play() {
    int min = 1;
    int max = (int) Math.pow(10, difficulty);
    int count = 0;
    int guess = 0;
    int myNum = (int) Math.floor(Math.random() * (max - min + 1) + min);
    String response;
    System.out.print("I have my number. What's your guess? ");
    do {
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
    } while (checkNumber(myNum, guess));
    System.out.println(message(count));
  }

  public boolean checkNumber(int actualNum, int guessNum) {
    if (guessNum < actualNum) {
      System.out.print("Too low, guess again: ");
      return true;
    }
    else if (guessNum > actualNum) {
      System.out.print("Too high, guess again: ");
      return true;
    }
    else {
      return false;
    }
  }

  public String message(int count) {
    String output = "You got it in " + count + " guesses! ";
    switch (count) {
      case 1 -> output += "You're a mind reader!";
      case 2, 3 -> output += "Most impressive.";
      case 4, 5, 6 -> output += "You can do better than that.";
      default -> output += "Better luck next time.";
    }
    return output;
  }
}
