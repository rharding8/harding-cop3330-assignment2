package ex34.base;

import java.util.Scanner;

public class EmployeeManager {
  Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    EmployeeManager manage = new EmployeeManager();
    String[] employeeList = {"Ridley Scott", "James Cameron", "Zack Snyder", "Christopher Nolan", "Sam Raimi"};
    Employee employees = new Employee(employeeList);
    employees.printList();
    String name = manage.getName();
    employees.remove(name);
    employees.printList();
  }

  public String getName() {
    System.out.print("Enter an employee name to remove: ");
    return input.nextLine();
  }
}
