package exercises.hackerrank;

import java.util.*;

/*
Forming a Magic Square
 */
public class FormingAMagicSquare {
    int formingMagicSquare(int[][] s) {
        int minCost = Integer.MAX_VALUE;
        Set<List<Integer>> matrixes = perms(new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9)));
        int[][] m;
        for (List<Integer> list : matrixes) {
            m = listToMatrix(list);
            if (isMagic(m)) {
//                printSquare(m);
                minCost = Math.min(cost(s, m), minCost);

            }
        }
        return minCost;
    }

    public Set<List<Integer>> perms(List<Integer> in) {
        Set<List<Integer>> result = new HashSet<>();
        if (in.isEmpty()) {
            return result;
        } else if (in.size() == 1) {
            result.add(in);
            return result;
        }
        for (int i = 0; i < in.size(); i++) {
            int value = in.get(i);
            List<Integer> rest = new ArrayList<>(in.subList(0, i));
            rest.addAll(in.subList(i + 1, in.size()));

            for (List<Integer> perm : perms(rest)) {
                List<Integer> newResult = new ArrayList<>(Collections.singletonList(value));
                newResult.addAll(perm);
                result.add(newResult);
            }
        }
        return result;
    }

    private void printSquare(int[][] s) {
        System.out.println("---");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(s[i][j] + " ");
            }
            System.out.println();
        }

    }

    private int[][] listToMatrix(List<Integer> list) {
        int[][] result = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = list.get(3 * i + j);
            }
        }
        return result;
    }

    private int cost(int[][] orig, int[][] dest) {
        int cost = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cost += Math.abs(orig[i][j] - dest[i][j]);
            }
        }
        return cost;
    }

    private boolean isMagic(int[][] s) {
        // rows
        int s1 = 0, s2 = 0, s3 = 0;
        for (int j = 0; j < 3; j++) {
            s1 += s[0][j];
        }

        for (int j = 0; j < 3; j++) {
            s2 += s[1][j];
        }
        if (s1 != s2) return false;

        for (int j = 0; j < 3; j++) {
            s3 += s[2][j];
        }
        if (s3 != s1) return false;

        //cols
        int c1 = 0, c2 = 0, c3 = 0;
        for (int i = 0; i < 3; i++) {
            c1 += s[i][0];
        }
        if (c1 != s1) return false;

        for (int i = 0; i < 3; i++) {
            c2 += s[i][1];
        }
        if (c2 != s1) return false;

        for (int i = 0; i < 3; i++) {
            c3 += s[i][2];
        }
        if (c3 != s1) return false;

        int diag = s[0][0] + s[1][1] + s[2][2];
        if (diag != s1) return false;

        int diag2 = s[0][2] + s[1][1] + s[2][0];
        if (diag2 != s1) return false;

        return true;
    }

}
