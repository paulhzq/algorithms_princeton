public class Exercise7 {
    public static void main(String[] args) {
        double t = 9.0;
        while (Math.abs(t - 9.0/t) > .001)
            t = (9.0/t + t) / 2.0;
        // sqrt of t.
        System.out.printf("%.5f\n", t);

        int sum = 0;
        for (int i = 1; i < 1000; i++)
            for (int j = 0; j < i; j++)
                sum++;
        // 1 + 2 + 3 +... + 999
        System.out.println(sum);

        sum = 0;
        for (int i = 1; i < 1000; i *= 2)
            for (int j = 0; j < 1000; j++)
                sum++;
        // [2^0, 2^10) total 10 times for i
        // foreach i   j will run 1000 times.
        System.out.println(sum);

    }
}