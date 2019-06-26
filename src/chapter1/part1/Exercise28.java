import java.util.Arrays;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercise28 {
    public static int rank(int key, int[] a) {
        // Array must be sorted.
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi)
        { // Key is in a[lo..hi] or not present.
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }
    // % java Exercise28 tinyW.txt < tinyT.txt
    public static void main(String[] args) {
        int[] whitelist = In.readInts(args[0]);
        Arrays.sort(whitelist);
        int j=1;
        // Get rid of Dupliations in place.
        for(int i=1;i<whitelist.length;i++) {
            if (whitelist[i] != whitelist[i-1]) whitelist[j++] = whitelist[i];
        }
        int[] noDupWhitelist = Arrays.copyOfRange(whitelist,0,j);
        StdOut.println(Arrays.toString(noDupWhitelist));
        while (!StdIn.isEmpty()) {
            // Read key, print if not in whitelist.
            int key = StdIn.readInt();
            if (rank(key, noDupWhitelist) < 0) StdOut.println(key);
        }
    }
}
