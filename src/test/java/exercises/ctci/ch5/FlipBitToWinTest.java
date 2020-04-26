package exercises.ctci.ch5;

import org.junit.Test;

import static org.junit.Assert.*;

public class FlipBitToWinTest {

  @Test
  public void test() {
    FlipBitToWin flipBitToWin = new FlipBitToWin();
    assertEquals(8, flipBitToWin.longestSequenceOfOnes(1775));
  }
}
