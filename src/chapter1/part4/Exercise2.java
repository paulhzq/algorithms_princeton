import java.math.BigInteger;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class Exercise2 {
    public static void main(String[] args) {
        In in = new In(args[0]);
        int[] a = in.readAllInts();
        StdOut.println(count(a));
    }
    private static int count(int[] a) {
        int n = a.length;
        int cnt = 0;
        BigInteger bigInteger;
        for (int i=0; i < n; i++) {
            for (int j=i+1; j<n;j++) {
                for (int k = j+1; k<n;k++) {
                    bigInteger = BigInteger.valueOf(a[i]);
                    bigInteger = bigInteger.add(BigInteger.valueOf(a[j]));
                    bigInteger = bigInteger.add(BigInteger.valueOf(a[k]));
                    if (bigInteger.intValue() == 0) {
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}