public class Exercise19 {
    public static long F(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return F(N-1) + F(N-2);
    }
    public static void main(String[] args) {
        long[] a = new long[100];
        for (int N = 0; N < 100; N++)
            System.out.println(N + " " + F2(N,a));
    }

    // use array to as the memization to reduce the redundancy calculation.
    public static long F2(int N, long[] a) {
        if(a[N] != 0) return a[N];
        if (N==0) {
            a[N] = 0;
            return 0;
        }
        if (N==1) {
            a[N] = 1;
            return 1;
        }
        a[N] = F2(N-1,a) + F2(N-2,a);
        return a[N];
    }

}