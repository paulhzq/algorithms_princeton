import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class Exercise2 {
    // java Exercise2 5 < Exercise2.txt
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        Interval1D[] intervals = new Interval1D[N];
        int i = 0;
        while (!StdIn.isEmpty()) {
            double min = StdIn.readDouble();
            StdOut.println(min);
            double max = StdIn.readDouble();
            StdOut.println(max);
            intervals[i++] = new Interval1D(min, max);
        }
        Arrays.sort(intervals, Interval1D.MIN_ENDPOINT_ORDER);
        Set<Interval1D> set = new HashSet<Interval1D>();
        // find the intersection.
        for(i=1;i<intervals.length;i++) {
            if(intervals[i].intersects(intervals[i-1])) {
                set.add(intervals[i-1]);
                set.add(intervals[i]);
            }
        }
        for (Interval1D interv:set) {
            StdOut.println(interv);
        }
    }
}