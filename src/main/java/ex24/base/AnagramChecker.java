/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Harding
 */

package ex24.base;

import java.util.Scanner;

public class AnagramChecker {
  Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    AnagramChecker anagram = new AnagramChecker();
    System.out.println("Enter two strings, and I shall tell you if they are anagrams.");
    String wordA = anagram.getFirst();
    String wordB = anagram.getSecond();
    System.out.print("\"" + wordA + "\" and \"" + wordB + "\" are ");
    if (!anagram.isAnagram(wordA, wordB)) {
      System.out.print("not ");
    }
    System.out.println("anagrams.");
  }

  public String getFirst() {
    System.out.print("Enter the first string: ");
    return input.nextLine();
  }

  public String getSecond() {
    System.out.print("Enter the second string: ");
    return input.nextLine();
  }

  public boolean isAnagram(String wordA, String wordB) {
    int i;
    if (wordA.length() != wordB.length()) {
      return false;
    }

    for (i = 0; i < wordA.length(); i++) {
      if (!wordB.contains(""+wordA.charAt(i))) {
        return false;
      }
    }
    return true;
  }
}
