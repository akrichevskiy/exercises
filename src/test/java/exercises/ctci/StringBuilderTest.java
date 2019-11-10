package exercises.ctci;

import static org.junit.Assert.*;

import exercises.ctci.ch1.StringBuilder;
import org.junit.Test;

public class StringBuilderTest {
  @Test
  public void test() {
    StringBuilder stringBuilder = new StringBuilder();

    stringBuilder.append("Hello ").append("world!");

    assertEquals("Hello world!", stringBuilder.toString());
  }
}
