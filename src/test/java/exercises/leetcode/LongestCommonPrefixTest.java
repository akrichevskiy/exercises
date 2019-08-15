package exercises.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestCommonPrefixTest {
    private LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

    @Test
    public void test() {
        String[] strs = {
                "aac",
                "abd"
        };
        assertEquals("a", longestCommonPrefix.longestCommonPrefix(strs));
    }

    @Test
    public void test2() {
        String[] strs = {
                "abc",
                "abd"
        };
        assertEquals("ab", longestCommonPrefix.longestCommonPrefix(strs));
    }

    @Test
    public void test3() {
        String[] strs = {
                "",
                "b"
        };
        assertEquals("", longestCommonPrefix.longestCommonPrefix(strs));
    }

    @Test
    public void test4() {
        String[] strs = {
                "a"
        };
        assertEquals("a", longestCommonPrefix.longestCommonPrefix(strs));
    }
}
