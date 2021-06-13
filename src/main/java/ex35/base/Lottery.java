/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Harding
 */

package ex35.base;

import java.util.ArrayList;
import java.util.Scanner;

public class Lottery {
  Scanner input = new Scanner(System.in);
  ArrayList<String> contestants = new ArrayList<>();

  public static void main(String[] args) {
    Lottery lotto = new Lottery();
    lotto.enterContest();
    lotto.outputWinner();
  }

  public void enterContest() {
    System.out.println("Welcome to the Lottery!");
    while (true) {
      System.out.print("Enter a name: ");
      String temp = input.nextLine();
      if (!temp.equalsIgnoreCase("")) {
        contestants.add(temp);
        continue;
      }
      if (contestants.size() == 0) {
        System.out.println("Please enter at least ONE name into the lottery!");
        continue;
      }
      break;
    }
  }

  public void outputWinner() {
    System.out.printf("And the winner is... [drumroll]... %s!%n", getWinner());
  }

  public String getWinner() {
    int min = 0;
    int max = contestants.size() - 1;
    int winningIndex = (int) Math.floor(Math.random() * (max - min + 1) + min);
    return contestants.get(winningIndex);
  }
}
