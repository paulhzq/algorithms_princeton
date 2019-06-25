public class Exercise20 {
    public static void main(String[] args) {
        System.out.println(In(5));
    }
    private static double In(int n) {
        if(n < 0) throw new IllegalArgumentException();
        if(n == 0) return Math.log(1);
        return In(n-1) + Math.log(n);
    }
}