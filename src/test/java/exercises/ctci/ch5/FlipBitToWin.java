package exercises.ctci.ch5;

public class FlipBitToWin {
  public int longestSequenceOfOnes(int n) {
    int maxLen = 1;
    int prevSequence = 0;
    int curSequence = 0;
//    System.out.println(Integer.toBinaryString(n));
    while (n != 0) {
      if ((n & 1) == 1) {
        curSequence++;
      } else {
        // if next after current symbol is also '0', prevSequence length is 0
        prevSequence = (n & 2) == 0 ? 0 : curSequence;
        curSequence = 0;
      }
      maxLen = Math.max(prevSequence + curSequence + 1, maxLen);
      n = n >>> 1;
    }
    return maxLen;
  }
}
