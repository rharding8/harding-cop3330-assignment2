/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Harding
 */

// Main Class

package ex34.base;

import java.util.Scanner;

public class EmployeeManager {
  Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    EmployeeManager manage = new EmployeeManager();
    String[] employeeList = {"Ridley Scott", "James Cameron", "Zack Snyder", "Christopher Nolan", "Sam Raimi"};
    Employee employees = new Employee(employeeList);
    manage.printList(employees.getList());
    String name = manage.getName();
    employees.remove(name);
    manage.printList(employees.getList());
  }

  public String getName() {
    System.out.print("Enter an employee name to remove: ");
    return input.nextLine();
  }

  public void printList(String[] list) {
    System.out.printf("There are %d employees:%n", list.length);
    int i;
    for (i = 0; i < list.length; i++) {
      System.out.printf("%s%n", list[i]);
    }
    System.out.println();
  }
}
