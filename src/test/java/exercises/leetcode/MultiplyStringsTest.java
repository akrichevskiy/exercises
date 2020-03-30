package exercises.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplyStringsTest {

  @Test
  public void test5() {
    MultiplyStrings multiplyStrings = new MultiplyStrings();
    assertEquals("6",multiplyStrings.multiply2("2", "3") );
    assertEquals("81",multiplyStrings.multiply2("9", "9") );
    assertEquals("0",multiplyStrings.multiply2("0", "9") );
    assertEquals("56088",multiplyStrings.multiply2("123", "456") );
    assertEquals("121932631112635269",multiplyStrings.multiply2("123456789", "987654321") );
  }

  @Test
  public void test4() {
    MultiplyStrings multiplyStrings = new MultiplyStrings();
    String product = multiplyStrings.multiply("123456789", "987654321");
    assertEquals("121932631112635269", product);
  }

  @Test
  public void test3() {
    MultiplyStrings multiplyStrings = new MultiplyStrings();
    String product = multiplyStrings.multiply("9", "9");
    assertEquals("81", product);
  }

  @Test
  public void test() {
    MultiplyStrings multiplyStrings = new MultiplyStrings();
    String product = multiplyStrings.multiply("123", "456");
    assertEquals("56088", product);
  }

  @Test
  public void test2() {
    MultiplyStrings multiplyStrings = new MultiplyStrings();
    String product = multiplyStrings.multiply("2", "3");
    assertEquals("6", product);
  }
}
