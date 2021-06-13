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
    filter.printFilteredRecords(recordList.getRecords(), search);
  }

  private String getSearch() {
    System.out.print("Enter a search string: ");
    return input.next();
  }

  public void printFilteredRecords(ArrayList<Map<String, String>> records, String search) {
    System.out.println("Results:");
    System.out.printf("%-20s| %-20s| %-20s%n", "Name", "Position", "Separation Date");
    System.out.println("-----------------------------------------------------------");
    int i;
    for (i = 0; i < records.size(); i++) {
      if (records.get(i).get("firstName").toLowerCase().contains(search.toLowerCase())) {
        System.out.println(printRecord(records.get(i)));
      }
      else if (records.get(i).get("lastName").toLowerCase().contains(search.toLowerCase())) {
        System.out.println(printRecord(records.get(i)));
      }
    }
  }

  public String printRecord(Map<String, String> record) {
    String output = String.format("%-20s", record.get("firstName") + " " + record.get("lastName"));
    output += String.format("| %-20s", record.get("pos"));
    output += String.format("| %-20s", record.get("date"));
    return output;
  }
}
