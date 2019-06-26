public class Exercise29 {
    //
    public static void rank(int key, int[] a) {
        // a must be sort.
        int low = 0, high = a.length -1;
        while (low <= high) {
            int mid = low + (high - low)/2;
            if (a[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static void count(int key, int[] a) {

    }
}