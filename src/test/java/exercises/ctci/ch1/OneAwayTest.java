package exercises.ctci.ch1;

import static org.junit.Assert.*;

import org.junit.Test;

public class OneAwayTest {
  @Test
  public void test() {
      assertTrue(OneAway.isOneEditDistance("pale", "bale"));
      assertTrue(OneAway.isOneEditDistance("pale", "ple"));
      assertFalse(OneAway.isOneEditDistance("pale", "bake"));
  }
}
