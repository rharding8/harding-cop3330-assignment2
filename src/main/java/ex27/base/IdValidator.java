/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Harding
 */

package ex27.base;

public class IdValidator {
  private String firstName;
  private String lastName;
  private String zipCode;
  private String empID;

  public IdValidator(String firstName, String lastName, String zipCode, String empID) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.zipCode = zipCode;
    this.empID = empID;
  }

  public String validateInput() {
    String msg = validateFirstName() + validateLastName() + validateZip() + validateEmp();
    if (msg.equalsIgnoreCase("")) {
      return "There were no errors found.";
    }
    return msg;
  }

  public String validateFirstName() {
    if (firstName.equalsIgnoreCase("")) {
      return String.format("The first name must be filled in.%n");
    }
    if (firstName.length() < 2) {
      return String.format("\"%s\" is not a valid first name, it is too short.%n", firstName);
    }
    return "";
  }

  public String validateLastName() {
    if (lastName.equalsIgnoreCase("")) {
      return String.format("The last name must be filled in.%n");
    }
    if (lastName.length() < 2) {
      return String.format("\"%s\" is not a valid last name, it is too short.%n", lastName);
    }
    return "";
  }

  public String validateZip() {
    try {
      Integer.parseInt(zipCode);
    }
    catch (NumberFormatException e) {
      return String.format("The ZIP Code must be numeric.%n");
    }
    return "";
  }

  public String validateEmp() {
    int i = 0;
    while (i < 2) {
      if (!Character.isLetter(empID.charAt(i))) {
        return String.format("%s is not a valid ID.%n", empID);
      }
      i++;
    }
    if (empID.charAt(i) != '-') {
      return String.format("%s is not a valid ID.%n", empID);
    }
    i++;
    while (i < empID.length()) {
      if (!Character.isDigit(empID.charAt(i))) {
        return String.format("%s is not a valid ID.%n", empID);
      }
      i++;
    }

    return "";
  }
}
