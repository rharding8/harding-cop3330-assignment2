/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Harding
 */

// Main Class

package ex27.base;

import java.util.Scanner;

public class Identification {
  Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    Identification id = new Identification();

    String firstName = id.getFirstName();
    String lastName = id.getLastName();
    String zipCode = id.getZip();
    String empID = id.getEmpID();

    IdValidator valid = new IdValidator(firstName, lastName, zipCode, empID);
    System.out.print(valid.validateInput());
  }

  private String getFirstName() {
    System.out.print("Please enter a first name: ");
    return input.nextLine();
  }

  private String getLastName() {
    System.out.print("Please enter a last name: ");
    return input.nextLine();
  }

  private String getZip() {
    System.out.print("Please enter the ZIP code: ");
    return input.nextLine();
  }

  private String getEmpID() {
    System.out.print("Please enter the employee's ID: ");
    return input.nextLine();
  }
}
