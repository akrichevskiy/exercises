package exercises.hackerrank;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClimbingLeaderBoardTest {
    @Test
    public void test() {
        int[] scores = {100, 100, 50, 40, 40, 20, 10};
        int[] alice = {5, 25, 50, 120};
        int[] expected = {6, 4, 2, 1};
        assertArrayEquals(expected, ClimbingLeaderBoard.climbingLeaderboard(scores, alice));
    }

    @Test
    public void test2() {
        int[] scores = {1};
        int[] alice = {1,1};
        int[] expected = {1,1};
        assertArrayEquals(expected, ClimbingLeaderBoard.climbingLeaderboard(scores, alice));
    }

}
