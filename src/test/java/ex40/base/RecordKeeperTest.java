package ex40.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class RecordKeeperTest {

  @Test
  void filterRecords_pushing_keeping_one() {
    ArrayList<Map<String, String>> records = new ArrayList<>();
    records.add(new HashMap<>());
    records.get(0).put("firstName", "Dave");
    records.get(0).put("lastName", "Mustang");
    records.add(new HashMap<>());
    records.get(1).put("firstName", "Darrel");
    records.get(1).put("lastName", "Adams");

    ArrayList<Map<String, String>> filteredRecords = new ArrayList<>();
    filteredRecords.add(new HashMap<>());
    filteredRecords.get(0).put("firstName", "Darrel");
    filteredRecords.get(0).put("lastName", "Adams");

    RecordKeeper keeper = new RecordKeeper(records);
    keeper.sortRecords();
    keeper.filterRecords("Dar");
    assertEquals(filteredRecords, keeper.getRecords());
  }

  @Test
  void filterRecords_keeping_multiple() {
    ArrayList<Map<String, String>> records = new ArrayList<>();
    records.add(new HashMap<>());
    records.get(0).put("firstName", "Dave");
    records.get(0).put("lastName", "Mustang");
    records.add(new HashMap<>());
    records.get(1).put("firstName", "Darrel");
    records.get(1).put("lastName", "Adams");
    records.add(new HashMap<>());
    records.get(2).put("firstName", "Beatrice");
    records.get(2).put("lastName", "Darlene");

    ArrayList<Map<String, String>> filteredRecords = new ArrayList<>();
    filteredRecords.add(new HashMap<>());
    filteredRecords.get(0).put("firstName", "Darrel");
    filteredRecords.get(0).put("lastName", "Adams");
    filteredRecords.add(new HashMap<>());
    filteredRecords.get(1).put("firstName", "Beatrice");
    filteredRecords.get(1).put("lastName", "Darlene");

    RecordKeeper keeper = new RecordKeeper(records);
    keeper.sortRecords();
    keeper.filterRecords("Dar");
    assertEquals(filteredRecords, keeper.getRecords());
  }

  @Test
  void filterRecords_keeping_none() {
    ArrayList<Map<String, String>> records = new ArrayList<>();
    records.add(new HashMap<>());
    records.get(0).put("firstName", "Dave");
    records.get(0).put("lastName", "Mustang");
    records.add(new HashMap<>());
    records.get(1).put("firstName", "Darrel");
    records.get(1).put("lastName", "Adams");
    records.add(new HashMap<>());
    records.get(2).put("firstName", "Beatrice");
    records.get(2).put("lastName", "Darlene");

    ArrayList<Map<String, String>> filteredRecords = new ArrayList<>();

    RecordKeeper keeper = new RecordKeeper(records);
    keeper.sortRecords();
    keeper.filterRecords("Bar");
    assertEquals(filteredRecords, keeper.getRecords());
  }
}