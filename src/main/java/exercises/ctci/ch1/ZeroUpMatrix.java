package exercises.ctci.ch1;

public class ZeroUpMatrix {
    public void zeroUp(int a[][]) {
        if (a.length < 1) {
            return;
        }
        boolean[] row = new boolean[a.length];
        boolean[] col = new boolean[a[0].length];
        for(int i = 0; i < a.length;i++) {
            for(int j = 0; j < a[0].length; j++) {
                if (a[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for(int i = 0; i < a.length;i++) {
            for(int j = 0; j < a[0].length; j++) {
                if (row[i] || col[j]) {
                    a[i][j] = 0;
                }
            }
        }
    }

}
