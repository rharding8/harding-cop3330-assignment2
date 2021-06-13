/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Harding
 */

package ex30.base;

public class TimesTable {
  public static void main(String[] args) {
    TimesTable table = new TimesTable();
    int[][] tableArr = table.makeTable(12);
    table.printTable(tableArr);
  }

  public int[][] makeTable(int n) {
    int[][] table = new int[n][n];
    int i;
    int j;

    for (i = 0; i < n; i++) {
      for (j = 0; j < n; j++) {
        table[i][j] = (i + 1) * (j + 1);
      }
    }
    return table;
  }

  public void printTable(int[][] table) {
    for (int[] row: table) {
      for (int cell: row) {
        System.out.printf("%7d", cell);
      }
      System.out.println();
    }
  }
}
