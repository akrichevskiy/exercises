package exercises.hackerrank;

import java.util.List;


public class BusyDays {

    static String solve(List<List<String>> reservations) {
        int max = Integer.MIN_VALUE;
        int maxKey = 0;
        int[] A = new int[31 * 12 * 4];
        for (List<String> range : reservations) {
            int keyStart = dateToIndex(range.get(0));
            int keyEnd = dateToIndex(range.get(1));

            A[keyStart] += 1;
            A[keyEnd + 1] -= 1;

        }
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            if (sum > max) {
                maxKey = i;
                max = sum;
            }
        }

        return indexToDate(maxKey);
    }

    private static int dateToIndex(String date) {
        String[] bits = date.split("-");
        return (Integer.parseInt(bits[0]) - 2018) * 31 * 12 + (Integer.parseInt(bits[1]) - 1) * 31 + (Integer.parseInt(bits[2]) - 1);
    }

    private static String indexToDate(int index) {
        int year = (index / (12 * 31)) + 2018;
        index = index % (12 * 31);
        int month = 1 + index / 31;
        int day =1 +  index % 31;
        StringBuilder sb = new StringBuilder();
        sb.append(year).append("-");
        if (month < 10) {
            sb.append("0").append(month);
        } else {
            sb.append(month);
        }
        sb.append("-");
        if (day < 10) {
            sb.append("0").append(day);
        } else {
            sb.append(day);
        }
        return sb.toString();
    }
}
