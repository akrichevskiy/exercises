package exercises.ctci;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayListTest {
    @Test
    public void test() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);


        assertEquals(5, arrayList.get(4));
    }

}
