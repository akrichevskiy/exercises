package exercises;

import org.junit.Test;


public class StringPermsTest {

    @Test
    public void testPerms() {
        StringPerms stringPerms = new StringPerms();
        stringPerms.perms("ABC");
    }

    @Test
    public void testPerms2() {
        StringPerms stringPerms = new StringPerms();
        stringPerms.perms("AB");
    }
}
