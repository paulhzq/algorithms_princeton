public class Exercise9 {
    public static void main(String[] args) {
        printBinaryOfInteger(9);
    }
    private static void printBinaryOfInteger(int n) {
        String s = "";
        while(n>0) {
            s = n%2 + s;
            n /=2;
        }
        System.out.println(s);
    }
}