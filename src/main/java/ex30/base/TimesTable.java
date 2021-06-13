package ex30.base;

public class TimesTable {
  public static void main(String[] args) {
    TimesTable table = new TimesTable();
    System.out.println(table.getTable(12));
  }

  public String getTable(int n) {
    int i;
    int j;
    String output = "";

    for (i = 1; i <= n; i++) {
      for (j = 1; j <=n; j++) {
        output += String.format("%7d", i * j);
      }
      output += String.format("%n");
    }

    return output;
  }
}
