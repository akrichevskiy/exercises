package exercises.cs106x;

import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertEquals;


public class ListMnemonicsTest {

    private ListMnemonics listMnemonics = new ListMnemonics();

    @Test
    public void test() {
        List<String> result = listMnemonics.listMnemonics("123");

        for (String s : result) {
            System.out.println(s);
        }
    }

    @Test
    public void test2() {
        List<String> result = listMnemonics.listMnemonics("723");

        assertEquals(36, result.size());
        for (String s : result) {
            System.out.println(s);
        }
    }

}
