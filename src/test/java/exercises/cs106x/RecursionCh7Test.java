package exercises.cs106x;

import org.junit.Test;

import static org.junit.Assert.*;

public class RecursionCh7Test {
    private RecursionCh7 recursionCh7 = new RecursionCh7();
    @Test
    public void testadditiveSequenceMember(){
        assertEquals(7, recursionCh7.additiveSequenceMember(3, 1,3));
        assertEquals(3, recursionCh7.additiveSequenceMember(1, 1,3));
        assertEquals(1, recursionCh7.additiveSequenceMember(0, 1,3));
    }

    @Test
    public void canonballs() {
        assertEquals(14, recursionCh7.canonballs(3));
        assertEquals(1, recursionCh7.canonballs(1));
        assertEquals(0, recursionCh7.canonballs(0));
        assertEquals(30, recursionCh7.canonballs(4));
    }

    @Test
    public void raiseToPower() {
        assertEquals(25, recursionCh7.raiseToPower(5,2));
        assertEquals(1, recursionCh7.raiseToPower(1,20));
        assertEquals(32, recursionCh7.raiseToPower(2,5));
    }

    @Test
    public void getTitiusBodeDistance() {
        assertEquals(1, recursionCh7.getTitiusBodeDistance(1));
        assertEquals(3, recursionCh7.getTitiusBodeDistance(2));
        assertEquals(6, recursionCh7.getTitiusBodeDistance(3));
        assertEquals(12, recursionCh7.getTitiusBodeDistance(4));

        assertEquals(5, recursionCh7.planetDistance(1));
        assertEquals(16, recursionCh7.planetDistance(4));
    }

    @Test
    public void gcd() {
        assertEquals(1, recursionCh7.gcd(171, 1));
        assertEquals(6, recursionCh7.gcd(36, 6));
        assertEquals(2, recursionCh7.gcd(10, 4));

    }

    @Test
    public void digitSum() {
        assertEquals(19, recursionCh7.digitSum(1729));
        assertEquals(33, recursionCh7.digitSum(456783));
    }

    @Test
    public void digitRoot() {
        assertEquals(1, recursionCh7.digitRoot(1729));
        assertEquals(1, recursionCh7.digitRoot(1234));
        assertEquals(5, recursionCh7.digitRoot(23));
    }

    @Test
    public void combinations() {
        assertEquals(10, recursionCh7.comb(5, 3));
        assertEquals(1, recursionCh7.comb(5, 5));
        assertEquals(10, recursionCh7.comb(5, 2));
    }

    @Test
    public void reverse() {
        assertEquals("cba", recursionCh7.reverse("abc"));
        assertEquals("a", recursionCh7.reverse("a"));
        assertEquals("edcba", recursionCh7.reverse("abcde"));
    }

    @Test
    public void integerToString() {
        assertEquals("1235", recursionCh7.integerToString(1235));
        assertEquals("123", recursionCh7.integerToString(123));
        assertEquals("12", recursionCh7.integerToString(12));
        assertEquals("1", recursionCh7.integerToString(1));
    }
}
