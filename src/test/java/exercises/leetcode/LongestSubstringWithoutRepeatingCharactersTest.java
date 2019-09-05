package exercises.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    public void test() {
        LongestSubstringWithoutRepeatingCharacters sut = new LongestSubstringWithoutRepeatingCharacters();
        assertEquals(3, sut.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(3, sut.lengthOfLongestSubstring("pwwkew"));
        assertEquals(1, sut.lengthOfLongestSubstring(" "));
        assertEquals(3, sut.lengthOfLongestSubstring("dvdf"));
    }

}
