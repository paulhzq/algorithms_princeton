import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdRandom;
import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        Point2D[] points = new Point2D[N];
        genPoints(points);
        System.out.println(closestPairOfPoints(points));
    }

    private static void genPoints(Point2D[] points) {
        int n = points.length;
        for (int i=0; i<n;i++) {
            double x = StdRandom.uniform();
            double y = StdRandom.uniform();
            Point2D point = new Point2D(x,y);
            points[i] = point;
        }
    }

    private static double closestPairOfPoints(Point2D[] points) {
        Arrays.sort(points, points[0].distanceToOrder());
        double minDist = Double.MAX_VALUE;
        for(int i = 1; i< points.length; i++) {
            if (points[i].distanceTo(points[i-1]) < minDist) minDist = points[i].distanceTo(points[i-1]);
        }
        return minDist;
    }
}