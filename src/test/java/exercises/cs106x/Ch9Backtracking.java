//package exercises.cs106x;
//
//import java.util.Set;
//
//public class Ch9Backtracking {
//    public void placeQueens(int n) {
//        boolean[][] board = new boolean[n][n];
//        backtrack(n, board, 0, 0);
//    }
//
//    private boolean backtrack(int n,  boolean[][] board, int row, int col) {
//        int i,j;
//        if (n == 0) {
//            if (doesFit(board, row ,col )) {
//                return true;
//            } else {
//                return false;
//            }
//        } else {
//            for (i = row; i < board.length; i++){
//                for(j = 0; j < board[0].length; j++) {
//
//                }
//            }
//        }
//    }
//
//    private boolean doesFit(boolean[][] board, int row, int col) {
//        int i = 0;
//        int cnt = 0;
//        for (i = 0; i < board.length; i++) {
//            if (board[col][i]) {
//                cnt++;
//            }
//            if (cnt > 1) {
//                return false;
//            }
//        }
//
//        for (i = 0; i < board.length; i++) {
//            if (board[i][row]) {
//                cnt++;
//            }
//            if (cnt > 1) {
//                return false;
//            }
//        }
//
//
//        return true;
//    }
//}
