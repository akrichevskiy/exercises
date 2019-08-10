package exercises.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class KthGrammarTest {

    @Test
    public void test() {
        KthGrammar kthGrammar = new KthGrammar();
        assertEquals(0, kthGrammar.kthGrammar(3, 4));



        assertEquals(0, kthGrammar.kthGrammar(30, 434991989));

        assertEquals(0, kthGrammar.kthGrammar(4, 6));

        assertEquals(1, kthGrammar.kthGrammar(4, 5));
        assertEquals(0, kthGrammar.kthGrammar(1, 1));
        assertEquals(0, kthGrammar.kthGrammar(2, 1));
        assertEquals(1, kthGrammar.kthGrammar(2, 2));
    }


}
