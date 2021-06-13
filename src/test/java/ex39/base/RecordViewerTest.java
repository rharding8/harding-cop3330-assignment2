package ex39.base;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class RecordViewerTest {

  @Test
  void printRecord_test() {
    RecordViewer viewer = new RecordViewer();
    Map<String, String> testingMap = new HashMap<>();
    testingMap.put("firstName", "Zack");
    testingMap.put("lastName", "Snyder");
    testingMap.put("pos", "Director");
    testingMap.put("date", "2021-03-18");

    String output = String.format("%-20s", testingMap.get("firstName") + " " + testingMap.get("lastName"));
    output += String.format("| %-20s", testingMap.get("pos"));
    output += String.format("| %-20s", testingMap.get("date"));

    assertEquals(output, viewer.printRecord(testingMap));
  }
}