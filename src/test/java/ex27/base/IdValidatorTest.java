package ex27.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IdValidatorTest {

  @Test
  void validateInput_with_valid_input() {
    IdValidator id = new IdValidator("John", "Doe", "32816", "AB-1234");
    String actual = id.validateInput();
    assertEquals("There were no errors found.", actual);
  }

  @Test
  void validateInput_with_totally_invalid_input() {
    IdValidator id = new IdValidator("J", "", "LV426", "A12-7B4A");
    String actual = id.validateInput();
    String expected = id.validateFirstName() + id.validateLastName() + id.validateZip() + id.validateEmp();
    assertEquals(expected, actual);
  }

  @Test
  void validateFirstName_with_valid_input() {
    IdValidator id = new IdValidator("John", "Doe", "32816", "AB-1234");
    String actual = id.validateFirstName();
    assertEquals("", actual);
  }

  @Test
  void validateFirstName_with_invalid_input_unfilled() {
    IdValidator id = new IdValidator("", "Doe", "32816", "AB-1234");
    String actual = id.validateFirstName();
    assertEquals(String.format("The first name must be filled in.%n"), actual);
  }

  @Test
  void validateFirstName_with_invalid_input() {
    IdValidator id = new IdValidator("J", "Doe", "32816", "AB-1234");
    String actual = id.validateFirstName();
    assertEquals(String.format("\"%s\" is not a valid first name, it is too short.%n", "J"), actual);
  }

  @Test
  void validateLastName_with_valid_input() {
    IdValidator id = new IdValidator("John", "Doe", "32816", "AB-1234");
    String actual = id.validateLastName();
    assertEquals("", actual);
  }

  @Test
  void validateLastName_with_invalid_input_unfilled() {
    IdValidator id = new IdValidator("John", "", "32816", "AB-1234");
    String actual = id.validateLastName();
    assertEquals(String.format("The last name must be filled in.%n"), actual);
  }

  @Test
  void validateLastName_with_invalid_input() {
    IdValidator id = new IdValidator("John", "A", "32816", "AB-1234");
    String actual = id.validateLastName();
    assertEquals(String.format("\"%s\" is not a valid last name, it is too short.%n", "A"), actual);
  }

  @Test
  void validateZip_with_valid_input() {
    IdValidator id = new IdValidator("John", "Doe", "32816", "AB-1234");
    String actual = id.validateZip();
    assertEquals("", actual);
  }

  @Test
  void validateZip_with_invalid_input() {
    IdValidator id = new IdValidator("John", "Doe", "AB.34#", "AB-1234");
    String actual = id.validateZip();
    assertEquals(String.format("The ZIP Code must be numeric.%n"), actual);
  }

  @Test
  void validateEmp_with_valid_input() {
    IdValidator id = new IdValidator("John", "Doe", "32816", "AB-1234");
    String actual = id.validateEmp();
    assertEquals("", actual);
  }

  @Test
  void validateEmp_with_invalid_input_too_long() {
    IdValidator id = new IdValidator("John", "Doe", "32816", "AB-12345");
    String actual = id.validateEmp();
    assertEquals(String.format("%s is not a valid ID.%n", "AB-12345"), actual);
  }

  @Test
  void validateEmp_with_invalid_input_letter_fail() {
    IdValidator id = new IdValidator("John", "Doe", "32816", "A12-1234");
    String actual = id.validateEmp();
    assertEquals(String.format("%s is not a valid ID.%n", "A12-1234"), actual);
  }

  @Test
  void validateEmp_with_invalid_input_hyphen_fail() {
    IdValidator id = new IdValidator("John", "Doe", "32816", "AB.1234");
    String actual = id.validateEmp();
    assertEquals(String.format("%s is not a valid ID.%n", "AB.1234"), actual);
  }

  @Test
  void validateEmp_with_invalid_input_number_fail() {
    IdValidator id = new IdValidator("John", "Doe", "32816", "AB-1B7Y");
    String actual = id.validateEmp();
    assertEquals(String.format("%s is not a valid ID.%n", "AB-1B7Y"), actual);
  }
}