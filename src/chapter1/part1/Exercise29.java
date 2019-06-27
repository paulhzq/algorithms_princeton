import java.util.Arrays;

public class Exercise29 {
    // smaller than key, then take the low as result.
    // only consider a[mid] < key, then [0,low) will be the smaller than key.
    public static int rank(int key, int[] a) {
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

    public static int count(int key, int[] a) {
        int low = 0, high = a.length - 1;
        while(low <= high) {
            int mid = low + (high - low)/2;
            if(a[mid] < key) {
                low = mid + 1;
            } else if (a[mid] > key) {
                high = mid - 1;
            } else {
                //a[mid] == key
                int low_bound = mid, high_bound = mid;
                while(low_bound >= 0 && a[low_bound] == key) low_bound--;
                while(high_bound < a.length && a[high_bound] == key) high_bound++;
                return high_bound - low_bound - 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] a = {3,5,56,67,345,1,4,8,8,8,8,2,3,19,28};
        Arrays.sort(a);
        int key = 8;
        int smaller = rank(key, a);
        int equal = count(key, a);
        System.out.println(smaller + "   " + equal);
        // [smaller, smaller+equal-1]
        for(int i = smaller; i<= smaller + equal -1; i++) {
            System.out.println(a[i]);
        }
    }
}