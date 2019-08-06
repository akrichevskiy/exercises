package exercises.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PascalTriangleRec {

    public List<Integer> getRow(int rowIndex) {
        if (rowIndex <= 0){
            return Collections.singletonList(1);
        } else {
            List<Integer> prev = getRow(rowIndex - 1);
            List<Integer> result = new LinkedList<>();
            for(int i = 0; i<= rowIndex ; i++) {
                if(i==0 || i == rowIndex) {
                    result.add(1);
                } else{
                    result.add(prev.get(i) + prev.get(i-1));
                }
            }
            return result;
        }
    }

    public List<List<Integer>> generateComplete(int numRows) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        return go(numRows, result);
    }

    public List<List<Integer>> go(int numRows, List<List<Integer>> previous) {
        if (numRows == 0) {
            return previous;
        } else if (numRows == 1) {
            previous.add(Arrays.asList(1));
            return previous;
        } else {
            List<List<Integer>> newResult = go(numRows - 1, previous);
            List<Integer> row = new LinkedList<>();
            List<Integer> prevRow = newResult.get(numRows - 2);
            for (int i = 0; i < numRows; i++) {
                if (i == 0 || i == numRows - 1) {
                    row.add(1);
                } else {

                    row.add(prevRow.get(i - 1) + prevRow.get(i));
                }
            }
            newResult.add(row);
            return newResult;
        }
    }
}
