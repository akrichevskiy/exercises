package exercises.cs106x;

import exercises.cs106x.StringPerms;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class StringPermsTest {
    private StringPerms stringPerms = new StringPerms();

    @Test
    public void testPerms() {
        stringPerms.perms("ABC");
        stringPerms.perms("AB");
    }

    @Test
    public void testPerm2() {
        System.out.println(stringPerms.perms2("abc"));
        assertEquals(6, stringPerms.perms2("abc").size());
    }
}
