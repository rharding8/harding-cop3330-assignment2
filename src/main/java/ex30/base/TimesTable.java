package ex30.base;

public class TimesTable {
  public static void main(String[] args) {
    TimesTable table = new TimesTable();
    table.printTable(12);
  }

  public void printTable(int n) {
    int i;
    int j;

    for (i = 1; i <= n; i++) {
      for (j = 1; j <=n; j++) {
        System.out.printf("%7d", i * j);
      }
      System.out.printf("%n");
    }
  }
}
