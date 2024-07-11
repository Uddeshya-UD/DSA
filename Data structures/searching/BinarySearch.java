package searching;

public class BinarySearch {


    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 8, 9, 11, 14, 16};
        int element = 9;
        System.out.println(binarySearch(arr, element));
    }

    private static int binarySearch(int[] arr, int e) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == e) {
                return mid;
            } else if (e < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
