package ex39.base;

import java.util.ArrayList;
import java.util.Map;

public class RecordViewer {
  public static void main(String[] args) {
    RecordViewer viewer = new RecordViewer();
    RecordKeeper recordList = new RecordKeeper();
    recordList.sortRecords();
    viewer.printAllRecords(recordList.getRecords());
  }

  public void printAllRecords(ArrayList<Map<String, String>> records) {
    System.out.printf("%-20s| %-20s| %-20s%n", "Name", "Position", "Separation Date");
    System.out.println("-----------------------------------------------------------");
    int i;
    for (i = 0; i < records.size(); i++) {
      System.out.println(printRecord(records.get(i)));
    }
  }

  public String printRecord(Map<String, String> record) {
    String output = String.format("%-20s", record.get("firstName") + " " + record.get("lastName"));
    output += String.format("| %-20s", record.get("pos"));
    output += String.format("| %-20s", record.get("date"));
    return output;
  }
}
