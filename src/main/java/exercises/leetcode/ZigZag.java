//package exercises.leetcode;
//
//import java.util.HashMap;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Map;
//
//public class ZigZag {
//
//    public String convert(String s, int numRows) {
//        if (numRows == 1) {
//            return s;
//        }
//        Map<Integer, List<Character>> a = new HashMap<>();
//        int i = 0;
//        int curRow = 0;//row
//        boolean goingDown = false;
//
//        for (i = 0; i < numRows; i++) {
//            a.put(i, new LinkedList<>());
//        }
//
//        for (i = 0; i < s.length(); i++) {
//            List<Character> row = a.get(curRow);
//            row.add(s.charAt(i));
//
//            if (curRow == 0 || curRow == numRows - 1) goingDown = !goingDown;
//            curRow += goingDown ? 1 : -1;
//        }
//
//        StringBuilder sb = new StringBuilder();
//        a.forEach((key, v) -> {
//            v.forEach(sb::append);
//        });
//        return sb.toString();
//    }
//
//    public  String convert2(String s, int numRows) {
//        if (numRows == 1) {
//            return s;
//        }
//
//
//    }
//}
