package exercises.hackerrank;

public class NewYearChaos {

  static void minimumBribes2(int[] q) {
    int cnt = 0;
    int i, j;
    for (i = 0; i < q.length; i++) {
      int br = 0;
      j = i + 1;
      while (j < q.length) {
        if (q[i] > q[j]) {
          br++;
        }
        j++;
      }
      if (br > 2) {
        cnt = -1;
        break;
      }
      cnt += br;
    }
    if (cnt != -1) {
      System.out.println(cnt);
    } else {
      System.out.println("Too chaotic");
    }
  }

  static void minimumBribes(int[] q) {
    int cnt = 0;
    int i;
    for (i = q.length - 1; i >= 1; i--) {
      if (q[i] == i + 1) {
        continue;
      } else if (q[i - 1] == i + 1) {
        cnt++;
        int t = q[i - 1];
        q[i - 1] = q[i];
        q[i] = t;
      } else if (i >= 2 && q[i - 2] == i + 1) {
          cnt += 2;
          q[i - 2] = q[i - 1];
          q[i - 1] = q[i];
          q[i] = i + 1;
      } else {
        cnt = -1;
        break;
      }
    }
    if (cnt != -1) {
      System.out.println(cnt);
    } else {
      System.out.println("Too chaotic");
    }
  }
}
