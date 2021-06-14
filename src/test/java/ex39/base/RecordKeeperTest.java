/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Harding
 */

// Test of Methods in Helper Class "RecordKeeper" used in ex39 and ex40

package ex39.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class RecordKeeperTest {

  @Test
  void sortRecords_from_already_sorted() {
    ArrayList<Map<String, String>> records = new ArrayList<>();
    records.add(new HashMap<>());
    records.get(0).put("firstName", "Dave");
    records.get(0).put("lastName", "Mustang");
    records.add(new HashMap<>());
    records.get(1).put("firstName", "Darrel");
    records.get(1).put("lastName", "Sanders");

    RecordKeeper keeper = new RecordKeeper(records);
    keeper.sortRecords();
    assertEquals(records, keeper.getRecords());
  }

  @Test
  void sortRecords_from_unsorted() {
    ArrayList<Map<String, String>> records = new ArrayList<>();
    records.add(new HashMap<>());
    records.get(0).put("firstName", "Dave");
    records.get(0).put("lastName", "Mustang");
    records.add(new HashMap<>());
    records.get(1).put("firstName", "Darrel");
    records.get(1).put("lastName", "Adams");

    ArrayList<Map<String, String>> sortedRecords = new ArrayList<>(records);
    sortedRecords.get(0).put("firstName", "Darrel");
    sortedRecords.get(0).put("lastName", "Adams");
    sortedRecords.get(1).put("firstName", "Dave");
    sortedRecords.get(1).put("lastName", "Mustang");

    RecordKeeper keeper = new RecordKeeper(records);
    keeper.sortRecords();
    assertEquals(sortedRecords, keeper.getRecords());
  }

  @Test
  void getRecords_basis() {
    ArrayList<Map<String, String>> records = new ArrayList<>();
    records.add(new HashMap<>());
    records.get(0).put("firstName", "Dave");
    records.get(0).put("lastName", "Mustang");

    RecordKeeper keeper = new RecordKeeper(records);
    assertEquals(records, keeper.getRecords());
  }
}