package ex38.base;

import java.util.Arrays;
import java.util.Scanner;

public class ListCreator {
  Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    ListCreator newList = new ListCreator();
    int[] numbers = newList.getList();
    ListFilter filter = new ListFilter();
    newList.printList(filter.filterEvenNumbers(numbers));
  }

  public int[] getList() {
    System.out.print("Enter a list of numbers, only a space between each: ");
    String n = input.nextLine();
    return Arrays.stream(n.split(" ")).mapToInt(Integer::parseInt).toArray();
  }

  public void printList(int[] list) {
    int i;
    System.out.print(list[0]);
    for (i = 1; i < list.length; i++) {
      System.out.print(" " + list[i]);
    }
    System.out.println();
  }
}
