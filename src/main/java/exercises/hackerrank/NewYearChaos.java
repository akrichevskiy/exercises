package exercises.hackerrank;

public class NewYearChaos {

    static void minimumBribes(int[] q) {
        int cnt = 0;
        for (int i =0; i< q.length;i++){
           int size = 0;
           for(int j = i; j < q.length  -1; j++) {
               if(q[j] > q[j+1]) {
                   size++;
                   int t = q[j];
                   q[j] = q[j+1];
                   q[j+1] = t;
               }
           }
           size--;
            if(size  > 2) {
                cnt = -1;
                break;
            } else if (size != 0){
                cnt++;
            }
        }
        if (cnt != -1) {
            System.out.println(cnt);
        } else {
            System.out.println("Too chaotic");
        }
    }
}
