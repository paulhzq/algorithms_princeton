import edu.princeton.cs.algs4.StdOut;
import java.util.Arrays;

public class Exercise27 {
    static long times = 0L;

    // Time complexity O(2^min(N,K))
    // T(N,K) = T(N-1,k) + T(N-1,K-1)  (almost the same as recursion fibonacci)
    // T(N,K) = 2*T(N-1,k-1)  ~   T(n,k) = 2 ^ (min(n,k)/2)
    public static double binomial(int N, int k, double p) {
        times++;
        if ((N == 0) || (k < 0)) return 1.0;
        return (1.0 - p)*binomial(N-1, k, p) + p*binomial(N-1, k-1, p);
    }


    // using memory two-dimensional array.
    public static double betterBinomial(int N, int k, double p) {
     double[][] mem = new double[N+1][k+2];
     Arrays.fill(mem[0],1.0);
     for(int i=0;i<N+1;i++) mem[i][0] = 1.0;
     for (int i=1;i<N+1;i++) {
         for (int j=1;j<k+2;j++) {
             mem[i][j] = (1.0-p) * mem[i-1][j] + p * mem[i-1][j-1];
         }
     }
     return mem[N][k+1];
    }

    public static void main(String[] args) {
        double result1 = binomial(10,5,0.3);
        StdOut.println(result1);
        double result2 = betterBinomial(10,5,0.3);
        StdOut.println(result2);
    }

}