package exercises.ctci.ch1;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromePermutationsTest {

    @Test
    public void test() {
        PalindromePermutations palindromePermutations = new PalindromePermutations();
        assertTrue(palindromePermutations.isPalindrome("Tact Coa"));
        assertTrue(palindromePermutations.isPalindrome("TT"));
        assertTrue(palindromePermutations.isPalindrome("T"));
    }

}
