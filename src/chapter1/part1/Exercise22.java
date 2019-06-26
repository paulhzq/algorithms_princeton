public class Exercise22 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24};
        rank(4, a);
    }

    private static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length -1, 1);
    }

    private static int rank(int key, int[] a, int lo, int hi, int depth) {
        if (lo > hi) return -1;
        for(int i = 0;i< depth; i++) System.out.print(" ");
        System.out.print(lo + " "+ hi);
        System.out.println();
        int mid = lo + (hi - lo) / 2;
        if (a[mid] > key) return rank(key, a, lo, mid-1, depth + 1);
        else if (a[mid] < key) return rank(key, a, mid + 1, hi, depth +1);
        else return mid;
    }
}