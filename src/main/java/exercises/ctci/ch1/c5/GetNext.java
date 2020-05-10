package exercises.ctci.ch1.c5;

public class GetNext {

  public int[] getNext(int num) {
    int smaller = smaller(num);
    int bigger = bigger(num);
    System.out.println(
        String.format(
            "number %d, %s\nsmaller %d, %s\nbigger %d, %s\n",
            num,
            Integer.toBinaryString(num),
            smaller,
            Integer.toBinaryString(smaller),
            bigger,
            Integer.toBinaryString(bigger)));
    return new int[] {smaller, bigger};
  }
  private int bigger(int num) {
      int n = num;
      int c1 = 0;
      int c0 = 0;
      while((n & 1) == 0 && n != 0) {
          c0++;
          n = n >> 1;
      }

      while((n & 1) == 1 && n != 0) {
          c1++;
          n = n >> 1;
      }

      // p is the position of the first nontrailing zero
      int p = c0 + c1;
      if (p > 31) {
          return -1;
      }

      int flipMask = 1 << p;
      num = num | flipMask;

      //insert c0 zeros on the left of p by nulling everything on the right of p
      int zeroMask = ~(flipMask - 1);
      num = num & zeroMask;

      //insert c1-1 ones after the block of c0 zeros
      int oneMask = (1 << (c1 -1)) - 1;
      num = num | oneMask;
      return num;
  }

  private int smaller(int num) {
      int n = num;
      int c0 = 0;
      int c1 = 0;

      while (n > 0 && ((n & 1) ==1)) {
          c1++;
          n = n >> 1;
      }
      if (n == 0) {
          return -1;
      }

      while (n > 0 && ((n & 1) ==0)) {
          c0++;
          n = n >> 1;
      }

      int p = c0 + c1;

      // clear p and all bits on its right to 0
      int zeroMask = ~((1 << (p+1)) - 1);
      num = num & zeroMask;

      //insert c1 + 1   ones from the right from p. This will give c1 + 1 ones one the right of p followed by c0 - 1 zeros
      int oneMask = (1 << (c1+1)) - 1;
      int shiftedOneMask = oneMask << (c0 - 1);
      return num | shiftedOneMask;

  }
}
