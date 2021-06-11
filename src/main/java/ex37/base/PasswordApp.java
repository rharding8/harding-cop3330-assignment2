package ex37.base;

import java.util.Scanner;

public class PasswordApp {
  Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    PasswordApp app = new PasswordApp();
    int len = app.getLen();
    int s = app.getSpecial();
    int n = app.getNum();
    PasswordGen gen = new PasswordGen(len, s, n);
    System.out.println(gen.getPass());
  }

  public int getLen() {
    while (true) {
      System.out.print("What's the minimum length? ");
      String temp = input.nextLine();
      try {
        Integer.parseInt(temp);
      }
      catch (NumberFormatException e) {
        System.out.println("ERROR: INVALID INPUT DETECTED!");
        continue;
      }
      return Integer.parseInt(temp);
    }
  }

  public int getSpecial() {
    while (true) {
      System.out.print("How many special characters? ");
      String temp = input.nextLine();
      try {
        Integer.parseInt(temp);
      }
      catch (NumberFormatException e) {
        System.out.println("ERROR: INVALID INPUT DETECTED!");
        continue;
      }
      return Integer.parseInt(temp);
    }
  }

  public int getNum() {
    while (true) {
      System.out.print("How many numbers? ");
      String temp = input.nextLine();
      try {
        Integer.parseInt(temp);
      }
      catch (NumberFormatException e) {
        System.out.println("ERROR: INVALID INPUT DETECTED!");
        continue;
      }
      return Integer.parseInt(temp);
    }
  }
}
