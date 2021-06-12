package ex38.base;

import java.util.ArrayList;

public class ListFilter {

  public int[] filterEvenNumbers(int[] numbers) {
    ArrayList<Integer> results = new ArrayList<>();
    int i;
    for (i = 0; i < numbers.length; i++) {
      if (numbers[i] % 2 == 0) {
        results.add(numbers[i]);
      }
    }
    return results.stream().mapToInt(j -> j).toArray();
  }

}
