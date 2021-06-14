/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Harding
 */

// Test for Helper Class "Employee"
// Main Class EmployeeManager only uses input and output, not needing specific testing.

package ex34.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

  @Test
  void remove_first_element() {
    String[] names = {"Clark Kent", "Bruce Wayne", "Diana Prince", "Barry Allen", "Arthur Curry", "Victor Stone"};
    Employee emp = new Employee(names);
    String[] list = emp.getList();
    assertArrayEquals(names, list);
    String[] newNames = {"Bruce Wayne", "Diana Prince", "Barry Allen", "Arthur Curry", "Victor Stone"};
    emp.remove("clark kent");
    list = emp.getList();
    assertArrayEquals(newNames, list);
  }

  @Test
  void remove_last_element() {
    String[] names = {"Clark Kent", "Bruce Wayne", "Diana Prince", "Barry Allen", "Arthur Curry", "Victor Stone"};
    Employee emp = new Employee(names);
    String[] list = emp.getList();
    assertArrayEquals(names, list);
    String[] newNames = {"Clark Kent", "Bruce Wayne", "Diana Prince", "Barry Allen", "Arthur Curry"};
    emp.remove("victor stone");
    list = emp.getList();
    assertArrayEquals(newNames, list);
  }

  @Test
  void remove_in_between_element() {
    String[] names = {"Clark Kent", "Bruce Wayne", "Diana Prince", "Barry Allen", "Arthur Curry", "Victor Stone"};
    Employee emp = new Employee(names);
    String[] list = emp.getList();
    assertArrayEquals(names, list);
    String[] newNames = {"Clark Kent", "Bruce Wayne", "Diana Prince", "Arthur Curry", "Victor Stone"};
    emp.remove("barry allen");
    list = emp.getList();
    assertArrayEquals(newNames, list);
  }

  @Test
  void remove_multiple_elements() {
    String[] names = {"Clark Kent", "Bruce Wayne", "Diana Prince", "Barry Allen", "Arthur Curry", "Victor Stone"};
    Employee emp = new Employee(names);
    String[] list = emp.getList();
    assertArrayEquals(names, list);
    String[] newNames = {"Clark Kent", "Bruce Wayne", "Diana Prince"};
    emp.remove("barry allen");
    emp.remove("arthur curry");
    emp.remove("victor stone");
    list = emp.getList();
    assertArrayEquals(newNames, list);
  }

  @Test
  void remove_nonexistent_element() {
    String[] names = {"Clark Kent", "Bruce Wayne", "Diana Prince", "Barry Allen", "Arthur Curry", "Victor Stone"};
    Employee emp = new Employee(names);
    String[] list = emp.getList();
    assertArrayEquals(names, list);
    emp.remove("peter parker");
    list = emp.getList();
    assertArrayEquals(names, list);
  }

  @Test
  void getList_basis_check() {
    String[] names = {"Clark Kent", "Bruce Wayne", "Diana Prince", "Barry Allen", "Arthur Curry", "Victor Stone"};
    Employee emp = new Employee(names);
    String[] list = emp.getList();
    assertArrayEquals(names, list);
  }
}