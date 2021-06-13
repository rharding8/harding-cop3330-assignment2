/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Harding
 */

// Helper Class

package ex39.base;

import java.util.*;

public class RecordKeeper {
  private final ArrayList<Map<String, String>> records;

  public RecordKeeper(ArrayList<Map<String, String>> records) {
    this.records = new ArrayList<>(records);
  }

  public RecordKeeper() {
    records = new ArrayList<>();
    records.add(new HashMap<>());
    records.get(0).put("firstName", "John");
    records.get(0).put("lastName", "Johnson");
    records.get(0).put("pos", "Manager");
    records.get(0).put("date", "2016-12-31");

    records.add(new HashMap<>());
    records.get(1).put("firstName", "Tou");
    records.get(1).put("lastName", "Xiong");
    records.get(1).put("pos", "Software Engineer");
    records.get(1).put("date", "2016-10-05");

    records.add(new HashMap<>());
    records.get(2).put("firstName", "Michaela");
    records.get(2).put("lastName", "Michaelson");
    records.get(2).put("pos", "District Manager");
    records.get(2).put("date", "2015-12-19");

    records.add(new HashMap<>());
    records.get(3).put("firstName", "Jake");
    records.get(3).put("lastName", "Jacobson");
    records.get(3).put("pos", "Programmer");
    records.get(3).put("date", "");

    records.add(new HashMap<>());
    records.get(4).put("firstName", "Jacquelyn");
    records.get(4).put("lastName", "Jackson");
    records.get(4).put("pos", "DBA");
    records.get(4).put("date", "");

    records.add(new HashMap<>());
    records.get(5).put("firstName", "Sally");
    records.get(5).put("lastName", "Webber");
    records.get(5).put("pos", "Web Developer");
    records.get(5).put("date", "2015-12-18");
  }

  public void sortRecords() {
    records.sort(Comparator.comparing(o -> o.get("lastName")));
  }

  public ArrayList<Map<String, String>> getRecords() {
    return records;
  }
}
