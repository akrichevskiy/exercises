package exercises.leetcode;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class FindAllAnagramsInAStringTest {
    @Test
    public void test() {
        FindAllAnagramsInAString findAllAnagramsInAString = new FindAllAnagramsInAString();
        List<Integer> result = findAllAnagramsInAString.findAnagrams("ababababab", "aab");
        assertEquals(Arrays.asList(0,2,4, 6), result);
    }

    @Test
    public void test2() {
        FindAllAnagramsInAString findAllAnagramsInAString = new FindAllAnagramsInAString();
        List<Integer> result = findAllAnagramsInAString.findAnagrams("cbaebabacd", "abc");
        assertEquals(Arrays.asList(0, 6), result);
    }
}
