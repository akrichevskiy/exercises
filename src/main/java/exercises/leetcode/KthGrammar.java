package exercises.leetcode;


public class KthGrammar {
    public int kthGrammar(int N, int K) {
        if (N == 1) {
            return 0;
        } else {
            double x = Math.pow(2, N - 2);
            if (K <= x) {
                return kthGrammar(N - 1, K);
            } else {
                return reverse(kthGrammar(N - 1, (int) (K - x)));
            }
        }
    }

    private int reverse(int i) {
        if (i == 1) return 0;
        else return 1;
    }
}
