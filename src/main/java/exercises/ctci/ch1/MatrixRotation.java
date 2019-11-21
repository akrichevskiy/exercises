package exercises.ctci.ch1;

public class MatrixRotation {

public static int[][] rotate(int[][] a) {
    int len = a.length;
    for (int i = 0; i < a.length / 2; i++) {
        for (int j = 0; j < len-1; j++) {
            int tmp = a[i][i + j];
            a[i][i + j] = a[len - 1 + i - j][i];
            a[len - 1 + i - j][i] = a[len + i - 1][len + i - j - 1];
            a[len + i - 1][len + i - j - 1] = a[i + j][len + i - 1];
            a[i + j][len + i - 1] = tmp;
        }
        len = len - 2;
    }
    return a;
}
}
