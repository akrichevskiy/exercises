package exercises.hackerrank;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static junit.framework.TestCase.assertEquals;


public class FormingAMagicSquareTest {

    private FormingAMagicSquare formingAMagicSquare = new FormingAMagicSquare();

//    @Test
    public void testPermsWithIndex() {
        Set<List<Integer>> result = formingAMagicSquare.permsWithIndex(Arrays.asList(1, 2, 3));
        for (List<Integer> r : result) {
            for (int i = 0; i < r.size(); i++) {
                System.out.print(r.get(i) + ",");
            }
            System.out.println();
        }

    }

    //    @Test
    public void testPerms() {
        Set<List<Integer>> result = formingAMagicSquare.perms(Arrays.asList(1, 2, 3));
        for (List<Integer> r : result) {
            for (int i = 0; i < r.size(); i++) {
                System.out.print(r.get(i) + ",");
            }
            System.out.println();
        }
    }

    @Test
    public void test() {
        int[][] s = new int[][]{
                {4, 8, 2},
                {4, 5, 7},
                {6, 1, 6},
        };
        assertEquals(4, formingAMagicSquare.formingMagicSquare(s));
    }

    @Test
    public void test2() {
        int[][] s = new int[][]{
                {2, 9, 8},
                {4, 2, 7},
                {5, 6, 7},
        };
        assertEquals(21, formingAMagicSquare.formingMagicSquare(s));
    }

    @Test
    public void test3() {
        int[][] s = new int[][]{
                {4, 5, 8},
                {2, 4, 1},
                {1, 9, 7},
        };
        assertEquals(14, formingAMagicSquare.formingMagicSquare(s));
    }

}
