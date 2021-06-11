package ex36.base;

import java.util.ArrayList;
import java.util.Scanner;

public class Statistics {
  Scanner input = new Scanner(System.in);
  ArrayList<Integer> entries = new ArrayList<>();

  public static void main(String[] args) {
    Statistics stat = new Statistics();
    stat.fillEntries();
    stat.printEntries();
    stat.printStatistics();
  }

  public void fillEntries() {
    while (true) {
      System.out.print("Enter a number: ");
      String temp = input.nextLine();
      if (temp.equalsIgnoreCase("done")) {
        break;
      }
      try {
        Integer.parseInt(temp);
      }
      catch (NumberFormatException e) {
        System.out.println("ERROR: INVALID INPUT!");
        continue;
      }
      entries.add(Integer.parseInt(temp));
    }
  }

  public void printEntries() {
    int i;
    System.out.printf("Numbers: %d", entries.get(0));
    for (i = 1; i < entries.size(); i++) {
      System.out.printf(", %d", entries.get(i));
    }
    System.out.println();
  }

  public void printStatistics() {
    double avg = average();
    System.out.printf("The average is %.1f%n", avg);
    System.out.println("The minimum is " + min());
    System.out.println("The maximum is " + max());
    System.out.printf("The standard deviation is %.2f%n", std(avg));
  }

  public double average() {
    double sum = 0.0;
    int i;
    for (i = 0; i < entries.size(); i++) {
      sum += entries.get(i);
    }
    return sum / entries.size();
  }

  public int min() {
    int min = entries.get(0);
    int i;
    for (i = 1; i < entries.size(); i++) {
      if (entries.get(i) < min) {
        min = entries.get(i);
      }
    }
    return min;
  }

  public int max() {
    int max = entries.get(0);
    int i;
    for (i = 1; i < entries.size(); i++) {
      if (entries.get(i) > max) {
        max = entries.get(i);
      }
    }
    return max;
  }

  public double std(double avg) {
    double deviation = 0.0;
    int i;
    for (i = 0; i < entries.size(); i++) {
      deviation += Math.pow((entries.get(i) - avg), 2);
    }
    deviation = Math.sqrt(deviation / entries.size());
    return deviation;
  }

}
