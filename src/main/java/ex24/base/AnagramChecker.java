/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Harding
 */

package ex24.base;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
  Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    AnagramChecker anagram = new AnagramChecker();
    System.out.println("Enter two strings, and I shall tell you if they are anagrams.");
    String wordA = anagram.getFirst();
    String wordB = anagram.getSecond();
    System.out.println(anagram.result(wordA, wordB));
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
    // Creates versions of the strings without spaces and uniform lower case letters. This ensures sentence anagrams
    // such as the Tom Riddle case shown in class can still count, while not altering single word anagrams at all.

    String tempA = wordA.toLowerCase().replace(" ", "");
    String tempB = wordB.toLowerCase().replace(" ", "");

    if (tempA.length() != tempB.length()) {
      return false;
    }

    char[] chA = tempA.toCharArray();
    char[] chB = tempB.toCharArray();

    Arrays.sort(chA);
    Arrays.sort(chB);

    return Arrays.equals(chA, chB);
  }

  public String result(String wordA, String wordB) {
    String output = "\"" + wordA + "\" and \"" + wordB + "\" are ";
    if (!isAnagram(wordA, wordB)) {
      output += "not ";
    }
    return output + "anagrams.";
  }
}
