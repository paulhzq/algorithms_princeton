import edu.princeton.cs.algs4.StdOut;

public class Exercise26 {
    public static void main(String[] args) {
        int a = 78, b = 34, c = 10;
        int t;
        if (a > b) { t = a; a = b; b = t; }
        if (a > c) { t = a; a = c; c = t; }
        if (b > c) { t = b; b = c; c = t; }
        StdOut.println("a " + a);
        StdOut.println("b " + b);
        StdOut.println("c " + c);
    }
}