/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Harding
 */

package ex33.base;

import java.util.Scanner;

public class Magic8Ball {
  Scanner input = new Scanner(System.in);
  private final String[] responses = {"Yes", "No", "Maybe", "Ask Again Later"};

  public static void main(String[] args) {
    Magic8Ball answer = new Magic8Ball();
    answer.getQuestion();
    System.out.println(answer.shake() + ".");
  }

  public void getQuestion() {
    System.out.println("What's your question?");
    while (true) {
      System.out.print("> ");
      String n = input.nextLine();
      if (n.isEmpty() || n.isBlank()) {
        System.out.println("No input detected, please try again.");
        continue;
      }
      break;
    }
  }

  public String shake() {
    System.out.println();
    int min = 0;
    int max = responses.length - 1;
    int myNum = (int) Math.floor(Math.random() * (max - min + 1) + min);
    return responses[myNum];
  }
}
