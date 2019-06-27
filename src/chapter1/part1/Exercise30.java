public class Exercise30 {
    public static void main(String[] args) {
        int N = 10;
        boolean[][] a = new boolean[N][N];
        for(int i=1;i<N;i++) {
            for(int j=1;j<N;j++) {
                if (gcd(i,j)==1) a[i][j] = true;
            }
        }
        for (int i=0;i<N;i++) {
            for(int j=0;j<N;j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int gcd(int p ,int q) {
        if (q == 0) return p;
        return gcd(q, p%q);
    }
}