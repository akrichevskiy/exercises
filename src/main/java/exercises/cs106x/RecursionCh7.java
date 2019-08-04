package exercises.cs106x;

//CS106X
public class RecursionCh7 {

    /*
    t(0) and t(1) given
     t(k) = t(k-1) + t(k - 2 )

     retun nth member of the sequence
     */
    public int additiveSequenceMember(int n, int t0, int t1) {
        if (n==0) return t0;
        return additiveSequenceMember(n - 1, t1, t0 + t1);
    }

    /*
      1,4,9,16, 25
      n - height of the pyramid, return total nr of canonballs in the pyramid
     */
    public int canonballs(int height) {
        if(height == 0 ) return 0;
        if(height ==1) return 1;
        return (height * height) + canonballs(height - 1);
    }

    public int raiseToPower(int n, int k) {
        if (k==0) return 1;
        return n * raiseToPower(n, k - 1);
    }

    public int getTitiusBodeDistance(int k) {
        if(k == 0 ) return 0;
        if (k == 1) return 1;
        if (k == 2) return 3;
        return 2 * getTitiusBodeDistance(k - 1);
    }

    public int planetDistance(int k) {
        return (4 + getTitiusBodeDistance(k));
    }

    public  int gcd(int n, int k) {
        if(n ==0 || k == 0) return 0;
        if(n % k == 0 ) return k;
        return gcd(k, n % k );
    }

    public int digitSum(int n) {
        if(n < 10) return n;
        int digit = n % 10;
        return  digit + digitSum(n / 10);
    }

    public int digitRoot(int n) {
        if (n < 10) return n;
        return digitRoot(digitSum(n));
    }

    public int comb(int n, int k) {
        if(k ==0 )return 1;
        if(n == k )return 1;
        return comb(n - 1, k -1) + comb(n - 1, k);
    }

    public String reverse(String s) {
        if (s.length() <=1) return s;
        return s.substring(s.length() -1) + reverse(s.substring(0, s.length() -1));
    }

    public String integerToString(int n) {
        if( n < 10) return String.valueOf(n);
        int digit = n % 10;
        return integerToString(n / 10) +  String.valueOf(digit);
    }
}
