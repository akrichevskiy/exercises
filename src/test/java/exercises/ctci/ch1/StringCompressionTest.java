package exercises.ctci.ch1;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCompressionTest {

  @Test
  public void test() {
    StringCompression stringCompression = new StringCompression();
    assertEquals("ab", stringCompression.compress("ab"));
    assertEquals("aab", stringCompression.compress("aab"));
    assertEquals("a3b3", stringCompression.compress("aaabbb"));
  }
}
