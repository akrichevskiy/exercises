package exercises.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class BrickWallTest {
    @Test
    public void test() {
        BrickWall brickWall = new BrickWall();
        List<List<Integer>> bricks = Arrays.asList(
          Arrays.asList(1,2,2,1),
          Arrays.asList(3,1,2),
          Arrays.asList(1,3,2),
          Arrays.asList(2,4),
          Arrays.asList(3,1,2),
          Arrays.asList(1,3,1,1)
        );
        assertEquals(2,brickWall.leastBricks(bricks));
    }

    @Test
    public void test2() {
        BrickWall brickWall = new BrickWall();
        List<List<Integer>> bricks = Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(1),
                Arrays.asList(1)
        );
        assertEquals(3,brickWall.leastBricks(bricks));
    }

    @Test
    public void test3() {
        BrickWall brickWall = new BrickWall();
        List<List<Integer>> bricks = Arrays.asList(
                Arrays.asList(100000000),
                Arrays.asList(100000000),
                Arrays.asList(100000000)
        );
        assertEquals(3,brickWall.leastBricks(bricks));
    }
}
