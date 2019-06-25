public class Exercise14 {
    public static void main(String[] args) {
        System.out.println(lg(4));
        System.out.println(lg(5));
        System.out.println(lg(15));
        System.out.println(lg(16));

    }
    private static int lg(int N) {
        // Time O(lgN)
        int num = 0;
//        while(N>0) {
//            num++;
//            N /=2;
//        }
//        return num-1;
        while(num*num <=N) {
            num++;
        }
        return num-1;
    }
}