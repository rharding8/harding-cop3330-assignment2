package ex38.base;

import java.util.Arrays;
import java.util.Scanner;

public class ListCreator {
  Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    ListCreator newList = new ListCreator();
    int[] numbers = newList.getList();
    ListFilter filter = new ListFilter();
    System.out.println(newList.listString(filter.filterEvenNumbers(numbers)));
  }

  public int[] getList() {
    System.out.print("Enter a list of numbers, only a space between each: ");
    String n = input.nextLine();
    return Arrays.stream(n.split(" ")).mapToInt(Integer::parseInt).toArray();
  }

  public String listString(int[] list) {
    int i;
    if (list.length == 0) {
      return "";
    }
    String output = "" + list[0] ;
    for (i = 1; i < list.length; i++) {
      output += " " + list[i];
    }
    return output;
  }
}
