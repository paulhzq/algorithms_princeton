import edu.princeton.cs.algs4.Interval2D;
import edu.princeton.cs.algs4.Interval1D;
import java.util.Map;
import java.util.HashMap;

public class Exercise3 {
    private static Map<Interval2D, Interval1D[]> intervalMap = new HashMap<>();
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double min = Double.parseDouble(args[1]);
        double max = Double.parseDouble(args[2]);
        Interval2D[] intervals = new Interval2D[N];
        drawAndCreateIntervals(intervals, min, max);
        int countsIntersect = genCountsIntersect(intervals);
        int countsContain = genCountsContain(intervals);
    }
    private static void drawAndCreateIntervals(Interval2D[] intervals, double min, double max) {
        StdDraw.setCanvasSize(10, 10);
        StdDraw.setPenRadius(.015);
        StdDraw.setXscale(min, max);
        StdDraw.setYscale(min, max);
        for (int i = 0; i < intervals.length; i++) {
            Interval1D width = generateInterval1D(min, max);
            Interval1D height = generateInterval1D(min, max);
            Interval2D interval = new Interval2D(width, height);
            interval.draw();
            intervals[i] = interval;
            intervalMap.put(interval, new Interval1D[]{width, height});
        }
    }

    private static Interval1D generateInterval1D(double min, double max) {
        double left = StdRandom.uniform(min, max);
        double right = StdRandom.uniform(min, max);

        if (left > right) {
            double tmp = left;
            left = right;
            right = tmp;
        }
        Interval1D interval = new Interval1D(left, right);
        return interval;
    }

    // could create customize comparator to compare intervals by intervalsX first, and then intervalsY.
    private static int genCountsIntersect(Interval2D[] intervals) {
        int count = 0;
        for (int i = 0 ; i < intervals.length-1; i++) {
            for( int j = i + 1; j < intervals.length; j++) {
                if (intervals[i].intersects(intervals[j])) count++;
            }
        }
        return count;
    }

    private static int genCountsContain(Interval2D[] intervals) {
        int count = 0;
        for (int i = 0 ; i < intervals.length-1; i++) {
            for( int j = i + 1; j < intervals.length; j++) {
                if (intervals[i].intersects(intervals[j])) continue;
                if (isContains(intervals[i], intervals[j])) count++;
            }
        }
        return count;
    }

    private static boolean isContains(Interval2D interval1, Interval2D interval2) {
        Interval1D[] interval1D1 = intervalMap.get(interval1);
        Interval1D[] interval1D2 = intervalMap.get(interval2);
        if ( (interval1D1[0].contains(interval1D2[0].min()) && interval1D1[0].contains(interval1D2[0].max())
                && interval1D1[1].contains(interval1D2[1].min()) && interval1D1[1].contains(interval1D2[1].max())) ||
                (interval1D2[0].contains(interval1D1[0].min()) && interval1D2[0].contains(interval1D1[0].max())
                        && interval1D2[1].contains(interval1D1[1].min()) && interval1D2[1].contains(interval1D1[1].max())) )
            return true;

        return false;
    }
}