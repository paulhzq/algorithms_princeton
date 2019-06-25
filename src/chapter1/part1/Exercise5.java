public class Exercise5 {
    private static boolean isBetween1And2(double a, double b) {
        if (a > 0 && a < 1 && b > 0 && b < 1) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        if (isBetween1And2(0.1, 0.5)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}