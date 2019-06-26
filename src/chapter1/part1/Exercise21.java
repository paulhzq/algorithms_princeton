import java.util.Scanner;

public class Exercise21 {
    // java Exercise21 < Exercise21.txt      or      cat Exercise21 | java Exercise21
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("%7s %7s %7s %7s", "Names", "Number1", "Number2", " Result\n");
        while (input.hasNextLine()) {
            String cur = input.nextLine();
            String[] line = cur.split(" ");
            double result = Double.parseDouble(line[1]) / Double.parseDouble(line[2]);
            System.out.printf("%7s %7s %7s %7.3f", line[0], line[1], line[2], result);
            System.out.println();
        }
    }
}