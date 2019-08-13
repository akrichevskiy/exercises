package exercises.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class UniqueBinarySearchTreesTest {

    @Test
    public void test() {
        UniqueBinarySearchTrees uniqueBinarySearchTrees = new UniqueBinarySearchTrees();
        assertEquals(2, uniqueBinarySearchTrees.generateTrees(2).size());
        assertEquals(5, uniqueBinarySearchTrees.generateTrees(3).size());

    }

}
