package exercises.ctci;

import static org.junit.Assert.*;

import org.junit.Test;

public class HashMapTest {

    @Test
    public void test () {
        HashMap hashMap = new HashMap<String, String>();

        assertNull(hashMap.get("key"));

        hashMap.put("key", "value");

        assertEquals("value", hashMap.get("key"));
    }

}
