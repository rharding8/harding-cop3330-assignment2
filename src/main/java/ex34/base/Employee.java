/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Harding
 */

// Helper Class

package ex34.base;

import java.util.ArrayList;
import java.util.Collections;

public class Employee {
  private final ArrayList<String> list = new ArrayList<>();

  public Employee(String[] list) {
    Collections.addAll(this.list, list);
  }

  public void remove(String name) {
    int i;
    for (i = 0; i < list.size(); i++) {
      if (list.get(i).equalsIgnoreCase(name)) {
        list.remove(i);
        return;
      }
    }
    System.out.println("ERROR: Name not found!");
  }

  public String[] getList() {
    return list.toArray(new String[0]);
  }
}
