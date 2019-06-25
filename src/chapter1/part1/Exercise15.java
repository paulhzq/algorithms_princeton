import java.util.Arrays;

public class Exercise15 {
    public static void main(String[] args) {
        int[] a = {1,1,2,3,4,5,6,3,5,6,5,5};
        System.out.println(Arrays.toString(histogram(a,7)));
    }
    private static int[] histogram(int[] a, int M) {
        int[] hist = new int[M];
        for(int i=0; i<a.length; i++) {
            // Be careful about the index!
            if(a[i] < M) hist[a[i]]++;
        }
        return hist;
    }
}