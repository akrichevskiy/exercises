package exercises.hackerrank;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;


public class BusyDaysTest {

    @Test
    public void test() {
        List<List<String>> input = Arrays.asList(
                Arrays.asList("2020-02-29", "2020-02-29"),
                Arrays.asList("2020-02-28", "2020-03-05"),

                Arrays.asList("2018-01-01", "2020-02-29"),
                Arrays.asList("2020-02-29", "2020-12-31"),
                Arrays.asList("2020-06-10", "2020-07-20")
        );

        assertEquals("2020-02-29", BusyDays.solve(input));
    }


    @Test
    public void test2() {
        List<List<String>> input = Arrays.asList(
                Arrays.asList("2018-01-01", "2018-01-03"),
                Arrays.asList("2018-01-02", "2018-01-05"),

                Arrays.asList("2018-01-03", "2018-01-06")
        );

        assertEquals("2018-01-03", BusyDays.solve(input));
    }

    @Test
    public void test3() {
        List<List<String>> input = Arrays.asList(
                Arrays.asList("2020-02-29", "2020-02-29"),
                Arrays.asList("2020-02-28", "2020-03-05")

        );

        assertEquals("2020-02-29", BusyDays.solve(input));
    }

    @Test
    public void test4() {
        List<List<String>> input = Arrays.asList(
                Arrays.asList("2018-01-01", "2020-05-05"),
                Arrays.asList("2018-01-01", "2020-05-05"),
                Arrays.asList("2020-05-05", "2020-05-05"),
                Arrays.asList("2020-12-31", "2020-12-31"),
                Arrays.asList("2020-12-31", "2020-12-31"),
                Arrays.asList("2020-12-31", "2020-12-31")
        );

        assertEquals("2020-05-05", BusyDays.solve(input));
    }


}
