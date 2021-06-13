/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Harding
 */

// Main Class

package ex40.base;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class RecordFilter {
  Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    RecordFilter filter = new RecordFilter();
    RecordKeeper recordList = new RecordKeeper();
    recordList.sortRecords();
    String search = filter.getSearch();
    recordList.filterRecords(search);
    filter.printAllRecords(recordList.getRecords());
  }

  private String getSearch() {
    System.out.print("Enter a search string: ");
    return input.next();
  }

  public String printRecord(Map<String, String> record) {
    String output = String.format("%-20s", record.get("firstName") + " " + record.get("lastName"));
    output += String.format("| %-20s", record.get("pos"));
    output += String.format("| %-20s", record.get("date"));
    return output;
  }

  public void printAllRecords(ArrayList<Map<String, String>> records) {
    System.out.printf("%-20s| %-20s| %-20s%n", "Name", "Position", "Separation Date");
    System.out.println("-----------------------------------------------------------");
    int i;
    for (i = 0; i < records.size(); i++) {
      System.out.println(printRecord(records.get(i)));
    }
  }
}
