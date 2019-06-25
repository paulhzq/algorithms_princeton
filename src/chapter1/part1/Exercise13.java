public class Exercise13 {
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5,6}};
        int[][] trans = transposition(array);
        printTransArray(trans);
    }
    private static int[][] transposition(int[][] array) {
        int m = array.length, n = array[0].length;
        int[][] trans = new int[n][m];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                trans[j][i] = array[i][j];
            }
        }
        return trans;
    }
    private static void printTransArray(int[][] trans) {
        int n = trans.length, m = trans[0].length;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }
    }
}