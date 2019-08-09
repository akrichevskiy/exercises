package exercises.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClimbingStairsTest {

    @Test
    public void test(){
        ClimbingStairs climbingStairs = new ClimbingStairs();
        assertEquals(2, climbingStairs.climbStairs(2));
    }

    @Test
    public void test2(){
        ClimbingStairs climbingStairs = new ClimbingStairs();
        assertEquals(3, climbingStairs.climbStairs(3));
    }

    @Test
    public void test3(){
        ClimbingStairs climbingStairs = new ClimbingStairs();
        assertEquals(13, climbingStairs.climbStairs(6));
    }
}
