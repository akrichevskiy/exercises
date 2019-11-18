package exercises.hackerrank;

import org.junit.Test;

public class NewYearChaosTest {

  @Test
  public void test() {
    int[] a = {2, 1, 5, 3, 4};
    //        int [] a= {2, 5, 1, 3, 4};
    NewYearChaos.minimumBribes2(a);
  }

  @Test
  public void test2() {
//    int[] a = {2, 1, 5, 3, 4};
            int [] a= {2, 5, 1, 3, 4};
    NewYearChaos.minimumBribes(a);
  }
}
