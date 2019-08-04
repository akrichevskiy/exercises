package exercises.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class FloodFill733Test {

    @Test
    public void test() {
        FloodFill733 floodFill733 = new FloodFill733();
        int[][] image = {
                {0, 0, 0},
                {0, 1, 1}
        };
        int[][] actual = floodFill733.floodFill(image, 1, 1, 1);
        int[][] expected = {
                {0, 0, 0},
                {0, 1, 1}
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        FloodFill733 floodFill733 = new FloodFill733();
        int[][] image = {
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };
        int[][] actual = floodFill733.floodFill(image, 1, 1, 2);

        int[][] expected = {
                {2, 2, 2},
                {2, 2, 0},
                {2, 0, 1}
        };
        assertArrayEquals(expected, actual);
    }
}
