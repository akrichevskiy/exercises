package exercises.ctci;

import static org.junit.Assert.*;

import exercises.ctci.ch1.MyHashMap;
import org.junit.Test;

public class HashMapTest {

    @Test
    public void test () {
        MyHashMap hashMap = new MyHashMap<String, String>();

        assertNull(hashMap.get("key"));

        hashMap.put("key", "value");

        assertEquals("value", hashMap.get("key"));
    }

}
