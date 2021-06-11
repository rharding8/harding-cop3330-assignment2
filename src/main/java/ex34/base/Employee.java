package ex34.base;

public class Employee {
  private String[] list;

  public Employee(String[] list) {
    this.list = list;
  }

  public void printList() {
    System.out.printf("There are %d employees:%n", list.length);
    int i;
    for (i = 0; i < list.length; i++) {
      if (!list[i].equalsIgnoreCase("")) {
        System.out.printf("%s%n", list[i]);
      }
    }
    System.out.println();
  }

  public void remove(String name) {
    int i = 0;
    int j = 0;
    while (!list[i].equalsIgnoreCase(name)) {
      i++;
      if (i == list.length) {
        System.out.println("Name not found.");
        return;
      }
    }
    list[i] = "";
    String[] temp = new String[list.length - 1];
    for (i = 0; i < list.length; i++) {
      if (!list[i].equalsIgnoreCase("")) {
        temp[j] = list[i];
        j++;
      }
    }
    list = temp;
  }
}
