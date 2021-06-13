package ex36.base;

import org.junit.jupiter.api.Test;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsTest {

  @Test
  void average() {
    Statistics stat = new Statistics();
    Collections.addAll(stat.entries, 5, 12, 28, 94, 36, 82, 43, 54, 73);

    double avg = stat.average();

    assertEquals(47.444, avg, 0.001);
  }

  @Test
  void min() {
    Statistics stat = new Statistics();
    Collections.addAll(stat.entries, 17, 86, 47, 93, 12, 22, 18, 58);

    int min = stat.min();

    assertEquals(12, min);
  }

  @Test
  void max() {
    Statistics stat = new Statistics();
    Collections.addAll(stat.entries, 1094, 2786, 785, 999, 2208, 1569, 1734, 2560);

    int max = stat.max();

    assertEquals(2786, max);
  }

  @Test
  void std() {
    Statistics stat = new Statistics();
    Collections.addAll(stat.entries, 84, 27, 108, 126, 65, 46, 78, 74);

    double avg = stat.average();
    double std = stat.std(avg);

    assertEquals(76, avg, 0.01);
    assertEquals(29.6184, std, 0.0001);
  }
}